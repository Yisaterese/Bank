package Turtlegraphics;

import static Turtlegraphics.Direction.EAST;

public class Board {
    private final int[][] boardFloor = new int[20][20];


    public int[][] getBoardFloor(){
        int[][] newBoard = new int[boardFloor.length][boardFloor.length];
        for(int row = 0; row < boardFloor.length; row++){
            for (int col = 0; col < boardFloor.length; col++) {
                newBoard[row][col] = boardFloor[row][col];
            }
        }
        return newBoard;
    }


}
