package TicTacToe;

import apps.CellValues;
public class TicTacToeGame {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        TicTacToe game = new TicTacToe();

        Player playerX = new Player("X");
        Player playerO = new Player("O");
        Player currentPlayer = new Player("CurrentPlayer");
        currentPlayer =  playerX;
        currentPlayer.makeAMove();
        game.displayBoardCells();



    }


























     game.displayBoardCells();
        System.out.println("""

                """);
        game.pickCell(0, 0, CellValues.X);
        game.displayBoardCells();
        System.out.println("""

                """);
        game.pickCell(1, 0, CellValues.O);
        System.out.println("""

                """);
        game.displayBoardCells();
        game.pickCell(0, 1, CellValues.X);
        System.out.println("""

                """);
        game.displayBoardCells();
        game.pickCell(1, 1, CellValues.O);
        System.out.println("""

                """);
        game.displayBoardCells();
        game.pickCell(0, 2, CellValues.X);
        System.out.println("""

                """);
        game.displayBoardCells();

}
