package Turtlegraphics;

import org.junit.jupiter.api.Test;

import static Turtlegraphics.Direction.NORTH;
import static Turtlegraphics.Direction.SOUTH;
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
    public void  initialPositionOfTurtleOnBordFloorIsEastTest(){
        Turtle turtle = new Turtle();
        assertEquals(Direction.EAST,turtle.getCurrentPosition());
        assertEquals(turtle.getCurrentPosition(), turtle.getPosition(0,0));

    }

    @Test
    public void  turtleTurnLeftOnBordFloorTest(){
        Turtle turtle = new Turtle();
        assertEquals(Direction.EAST,turtle.getCurrentPosition());
        turtle.turnLeft();
        assertEquals(NORTH,turtle.getCurrentPosition());

    }
    @Test
    public void  turtleTurnRightOnBordFloorTest(){
        Turtle turtle = new Turtle();
       // assertEquals(Direction.EAST,turtle.getCurrentPosition());
        turtle.turnLeft();
        turtle.turnRight();
        turtle.turnRight();
        assertEquals(SOUTH,turtle.getCurrentPosition());

    }


}