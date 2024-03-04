package apps;

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
        boardCells[row][col] = cellValues;
        if (!isValidRowAndColumn(row, col, cellValues)) {
            throw new IndexOutOfBoundsException("index out of bound");
        }
    }

    public CellValues[][] getWinByRow() {

        CellValues[][] newBoardCells = new CellValues[boardCells.length][boardCells.length];
        int counter = 0;
        for (int row = 0; row < boardCells.length; row++) {
            if (boardCells[row][0] == boardCells[row][1] && boardCells[row][1] == boardCells[row][2]) {
                for (int col = 0; col < boardCells[row].length; col++) {
                    newBoardCells[counter][col] = boardCells[row][col];
                }
            }
            counter++;
        }
        return newBoardCells;
    }

    private boolean isValidRowAndColumn(int row, int col, CellValues cellValues) {
        if (row >= 0 && row <= 2 && col >= 0 && col <= 2) {
            boardCells[row][col] = cellValues;
            return true;
        }
        throw new IndexOutOfBoundsException("Out of bound index exception");
    }


    public boolean hasWonByColumn() {
        for (int col = 0; col < boardCells.length; col++) {
            if (boardCells[col][0] == boardCells[col][1] && boardCells[col][1] == boardCells[col][2]) {
                return true;
            }
        }
        return false;
    }

    public boolean hasWonByDiagonal() {
        for(int index = 0; index < boardCells.length; index++){
            if(boardCells[0][2] == boardCells[1][1] && boardCells[1][1] == boardCells[2][0])
                return true;
        }
        return false;
    }
}