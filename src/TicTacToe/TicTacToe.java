package TicTacToe;

import InvalidMoveException.InvalidMoveException;
import apps.CellValues;

public class TicTacToe {
    private final CellValues[][] boardCells = new CellValues[3][3];

    public TicTacToe() {
        populateBoardCells();
    }

    public void populateBoardCells() {
        for (int row = 0; row < boardCells.length; row++) {
            for (int col = 0; col < boardCells[row].length; col++) {
                boardCells[row][col] = CellValues.EMPTY;
            }
        }
    }

    public int getLengthOfBoardCells() {
        return boardCells.length;
    }

    public void displayBoardCells() {
        System.out.println("Welcome to TIC TAC TOE game");
        System.out.println("------------------------");
        for (int row = 0; row < boardCells.length; row++) {
            System.out.print("|");
            for (int col = 0; col < boardCells[row].length; col++) {
                System.out.print(boardCells[row][col] + " | ");
            }
            System.out.println();
            System.out.println("------------------------");
        }
    }

    public CellValues[][] getValueOfBoardCells() {
        return boardCells;
    }

    public void pickCell(int row, int col, CellValues cellValues) {
        boardCells[row][col] = cellValues;
        if (!isValidRowAndColumn(row, col, cellValues)) {
            throw new IndexOutOfBoundsException("index out of bound");
        }
        if(!isValidMove(row, col)) throw new InvalidMoveException("Make a valid move");
        boardCells[row][col] = cellValues;

    }

    private boolean isValidMove(int row, int col) {
        return boardCells[row][col].equals(CellValues.EMPTY);
    }

    public boolean hasWonByRow() {
        for (int row = 0; row < boardCells.length; row++) {
            boolean isWonByRow = boardCells[row][0] == boardCells[row][1] && boardCells[row][1] == boardCells[row][2];
            if (isWonByRow) {
                return true;
            }
        }
        return false;
    }
//
//        CellValues[][] newBoardCells = new CellValues[boardCells.length][boardCells.length];
//        int counter = 0;
//        for (int row = 0; row < boardCells.length; row++) {
//            if (boardCells[row][0] == boardCells[row][1] && boardCells[row][1] == boardCells[row][2]) {
//                for (int col = 0; col < boardCells[row].length; col++) {
//                    newBoardCells[counter][col] = boardCells[row][col];
//                }
//            }
//            counter++;
//        }
//        return newBoardCells;
//
//
//       }
    private boolean isValidRowAndColumn(int row, int col, CellValues cellValues) {
        if (row >= 0 && row <= 2 && col >= 0 && col <= 2) {
            boardCells[row][col] = cellValues;
            return true;
        }
        throw new IndexOutOfBoundsException("Out of bound index exception");
    }


    public boolean hasWonByColumn() {
        for (int col = 0; col < boardCells.length; col++) {
            boolean isWonByColumn =boardCells[col][0] == boardCells[col][1] && boardCells[col][1] == boardCells[col][2];
            if (isWonByColumn) {
                return true;
            }
        }
        return false;
    }

    public boolean hasWonByDiagonal() {
        for(int index = 0; index < boardCells.length; index++){
            boolean isWonDiagonaly = boardCells[0][2] == boardCells[1][1] && boardCells[1][1] == boardCells[2][0] || boardCells[0][0] == boardCells[1][1] && boardCells[1][1] == boardCells[2][2];
            if(isWonDiagonaly)
                return true;
        }
        return false;
    }
}