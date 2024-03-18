package Turtlegraphics;

import static Turtlegraphics.Direction.EAST;
public class Turtle {
    private Direction direction = EAST;
    public void turnLeft(){
        direction = direction.turnLeft();
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
        direction = direction.turnRight();
    }

    public void moveForward(int numberOfPositions){
        switch (direction){
            case EAST -> moveForwardEast();

        }
    }

    private void moveForwardEast() {
        //currentPosition.setCollumn(currentPosition.getCollumn() + numberOfSteps -1);
    }
}
