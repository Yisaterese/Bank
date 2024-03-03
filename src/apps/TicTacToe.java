package apps;

public class TicTacToe {
    private CellValues[][] board = new CellValues[3][3];
    public TicTacToe(){
        this.board = populateBoardCells();
    }

    public CellValues[][] populateBoardCells(){
            for (int row = 0; row < 3; row++) {
                for (int col = 0; col < 3; col++) {
                    board[row][col] = CellValues.EMPTY;
                }
            }
            return board;
    }

    public int getLengthOfGame() {
        return board.length;
    }
}
