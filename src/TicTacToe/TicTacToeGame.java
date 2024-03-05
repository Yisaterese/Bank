package TicTacToe;

import apps.CellValues;
public class TicTacToeGame {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        TicTacToe game = new TicTacToe();

        Player playerX = new Player("X");
        Player playerO = new Player("O");
        Player currentPlayer = new Player("CurrentPlayer");
        currentPlayer = playerX;


        System.out.println(currentPlayer.getName() + " make a move");
        int inputCell = input.nextInt();
        currentPlayer.makeAMove(inputCell);
        game.displayBoardCells();

        boolean hasWon = game.hasWonByColumn() || game.hasWonByRow() || game.hasWonByDiagonal();
        while (!hasWon) {
            if (hasWon) {System.out.println(currentPlayer.getName() + "has won");
                break;
            }
            if (currentPlayer == playerX) currentPlayer = playerO;
            if (currentPlayer == playerO) currentPlayer = playerX;
        }
    }
}

























//
//     game.displayBoardCells();
//        System.out.println("""
//
//                """);
//        game.pickCell(0, 0, CellValues.X);
//        game.displayBoardCells();
//        System.out.println("""
//
//                """);
//        game.pickCell(1, 0, CellValues.O);
//        System.out.println("""
//
//                """);
//        game.displayBoardCells();
//        game.pickCell(0, 1, CellValues.X);
//        System.out.println("""
//
//                """);
//        game.displayBoardCells();
//        game.pickCell(1, 1, CellValues.O);
//        System.out.println("""
//
//                """);
//        game.displayBoardCells();
//        game.pickCell(0, 2, CellValues.X);
//        System.out.println("""
//
//                """);
//        game.displayBoardCells();
//
//}
