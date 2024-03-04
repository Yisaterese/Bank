package apps;

public class TicTacToeGame {
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.printBoardCells();
        game.pickCell(0,0, CellValues.X);
        game.printBoardCells();
        game.pickCell(0,1, CellValues.O);
        game.printBoardCells();

    }
}
