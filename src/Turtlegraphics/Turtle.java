package Turtlegraphics;

import static Turtlegraphics.Direction.EAST;
import static Turtlegraphics.Direction.NORTH;
public class Turtle {
    private Direction direction = EAST;
    public void turnLeft(){
        direction = EAST;
    }
    private Board board;
    private boolean isPenUp;
    public boolean isPenUp() {
        return isPenUp;
    }

    public boolean isPenDown() {
        return isPenUp = true;
    }

    public Direction getCurrentPosition() {
        return direction;
    }

    public int[][] getPosition(int prow, int col) {
        return board.getBoardFloor();
    }

    public void turnRight() {

    }
}
