package apps;

import InvalidCellRepresentationException.InvalidCellRepresentationException;
import InvalidPasswordException.InvalidPasswordException;

import static apps.CellValues.X;

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

    public int getLengthOfGame() {
        return boardCells.length;
    }

    public void printBoardCells() {
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
        if(!isValidRowAndColumn(row, col, cellValues)) {
            throw new IndexOutOfBoundsException("index out of bound");
        }
    }

    private boolean isValidRowAndColumn(int row, int col, CellValues cellValues) {
        if (row >= 0 && row < 2 && col >= 0 && col < 2){
            boardCells[row][col] = cellValues;
        return true;
    }
        throw new IndexOutOfBoundsException("Out of bound index exception");
    }


}