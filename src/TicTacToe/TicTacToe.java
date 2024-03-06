package TicTacToe;

import InvalidBoardCellException.InvalidBoardCellException;
import apps.CellValues;

import java.util.Arrays;

public class TicTacToe {
    private final CellValues[][] boardCells = new CellValues[3][3];
    CellValues winner = CellValues.X;
    public TicTacToe() {
        populateBoardCells();
    }

    public void populateBoardCells() {
        for (CellValues[] boardCell : boardCells) {
            Arrays.fill(boardCell, CellValues.EMPTY);
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

    public void pickCell(int selectCell, CellValues cellValues) {
        validateBoardCellRange(selectCell);
        validateEmptyCellOnBoard(selectCell, cellValues);


    }

    private void validateBoardCellRange(int inputCell) {
        if (inputCell >= 1 && inputCell <= 9) return;
        throw new IndexOutOfBoundsException("input cells should be between 1 and 9.");
    }

    private void validateEmptyCellOnBoard(int inputCell, CellValues cellValues) {
        int row = (inputCell - 1) / 3;
        int col = (inputCell - 1) % 3;
        if (boardCells[row][col] == CellValues.EMPTY) {
            boardCells[row][col] = cellValues;
        } else {
            throw new InvalidBoardCellException("Board cell is already picked");
        }
    }

    private void validatePlayerTurn(CellValues cellValues) {
        if (cellValues == CellValues.X)
            cellValues = CellValues.O;
        cellValues = CellValues.X;
    }

    private boolean isValidMove(int row, int col) {
        return boardCells[row][col].equals(CellValues.EMPTY);
    }

    public CellValues isWinByRow() {
            boolean isWinByFirstRow = boardCells[0][0] == boardCells[0][1] && boardCells[0][1] == boardCells[0][2];
            boolean isWinBySecondRow = boardCells[1][0] == boardCells[1][1] && boardCells[1][1] == boardCells[1][2];
            boolean isWinByThirdRow = boardCells[2][0] == boardCells[2][1] && boardCells[2][1] == boardCells[2][2];
            if (isWinByFirstRow || isWinBySecondRow || isWinByThirdRow) {
                return CellValues.X;
            }
        return CellValues.O;
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


    public CellValues isWinByColumn() {
            boolean isWonByFirstColumn = boardCells[0][0] == boardCells[1][0] && boardCells[1][0]  == boardCells[2][0];
            boolean isWonBySecondColumn = boardCells[0][1] == boardCells[1][1] && boardCells[1][1] == boardCells[2][1];
            boolean isWonByThirdColumn = boardCells[0][2] == boardCells[1][2] && boardCells[1][2] == boardCells[2][2];
            if (isWonByFirstColumn || isWonBySecondColumn || isWonByThirdColumn) {
                return CellValues.X;
            }
        return CellValues.O;
    }

    public CellValues isWinByDiagonal() {
        for (int index = 0; index < boardCells.length; index++) {
            boolean isWonDiagonaly = boardCells[0][2] == boardCells[1][1] && boardCells[1][1] == boardCells[2][0] || boardCells[0][0] == boardCells[1][1] && boardCells[1][1] == boardCells[2][2];
            if (isWonDiagonaly)
                return CellValues.X;
        }
        return CellValues.O;
    }

//    public boolean isADrawGame() {
//        if (!isWinByColumn() && isWinByDiagonal() && isWinByRow()) {
//            return false;
//        }
//        return true;
//    }
//
//     public CellValues isAWin(CellValues winner) {
//        if(isWinByRow() )return true;
//        if(isWinByColumn())return winner;
//        if(isWinByDiagonal())return true;
//        return false;
//            boolean isAWinner = boardCells[row][0] == boardCells[row][1] && boardCells[row][0] == boardCells[row][2];
//            if (isAWinner) {
//                if (boardCells[row][0] == CellValues.X) {
//                    return CellValues.X;
//                } else {
//                    return CellValues.O;
//                }
//            }
//





}