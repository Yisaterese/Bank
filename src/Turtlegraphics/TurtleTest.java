package Turtlegraphics;

import org.junit.jupiter.api.Test;

import static Turtlegraphics.Direction.*;
import static org.junit.jupiter.api.Assertions.*;


public class TurtleTest {

    @Test
    public void penIsUpTest(){
        Turtle turtle = new Turtle();
        assertFalse(turtle.isPenUp());

    }

    @Test
    public void penIsDownTest(){
        Turtle turtle = new Turtle();
        turtle.isPenUp();
        assertTrue(turtle.isPenDown());

    }

    @Test
    public void penIsUp_penDownTest(){
        Turtle turtle = new Turtle();
        turtle.isPenUp();
        assertTrue(turtle.isPenDown());
    }

    @Test
    public void penIsDown_PenIsUPTest(){
        Turtle turtle = new Turtle();
        turtle.isPenUp();
        turtle.isPenDown();
        assertTrue(turtle.isPenUp());
    }

    @Test
    public void  turtleTurnLeftOnBordFloorTest(){
        Turtle turtle = new Turtle();
        assertEquals(EAST,turtle.getCurrentPosition());
        turtle.turnLeft();
        assertEquals(NORTH,turtle.getCurrentPosition());

    }
    @Test
    public void  turtleTurnLeftAgainOnBordFloorTest(){
        Turtle turtle = new Turtle();
        assertEquals(EAST,turtle.getCurrentPosition());
        turtle.turnLeft();
        turtle.turnLeft();
        turtle.turnLeft();
        assertEquals(SOUTH,turtle.getCurrentPosition());

    }

    @Test
    public void  turtleTurnRightOnBordFloorTest(){
        Turtle turtle = new Turtle();
        assertEquals(EAST,turtle.getCurrentPosition());
        turtle.turnRight();
        turtle.turnRight();
        turtle.turnRight();
        assertEquals(NORTH, turtle.getCurrentPosition());

    }

    @Test
    public void  turtleTurnRightTwiceAndLeftOnBordFloorTest(){
        Turtle turtle = new Turtle();
        assertEquals(EAST,turtle.getCurrentPosition());
        turtle.turnRight();
        turtle.turnRight();
        turtle.turnLeft();
        assertEquals(SOUTH,turtle.getCurrentPosition());

    }
    @Test
    public void  turtleTurnLeftTwiceAndRightOnBordFloorTest(){
        Turtle turtle = new Turtle();
        assertEquals(EAST,turtle.getCurrentPosition());
        turtle.turnLeft();
        turtle.turnLeft();
        turtle.turnRight();
        assertEquals(NORTH,turtle.getCurrentPosition());
    }

    @Test
    public void  initialPositionOfTurtleOnBordFloorIsEastTest(){
        Turtle turtle = new Turtle();
        assertEquals(EAST,turtle.getCurrentPosition());
        turtle.moveForward(5);
        Board board = new Board();
        board.displayBoardFloor();
        //assertEquals(, turtle.getPosition(0,0));

    }


}