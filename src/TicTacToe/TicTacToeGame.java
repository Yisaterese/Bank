package TicTacToe;

import InvalidBoardCellException.InvalidBoardCellException;
import apps.CellValues;

import static TicTacToe.Player.cellValues;

public class TicTacToeGame {
    public static void main(String[] args) {

        TicTacToe ticTacGame = new TicTacToe();
        Player playerX = new Player("X");
        Player playerO = new Player("O");
        Player currentPlayer = new Player("CurrentPlayer");
        currentPlayer = playerX;

        System.out.println("    GAME START");
        while(true) {
//            System.out.println("    GAME START");
//            System.out.println("Player " + ticTacGame.validatePlayerTurn(cellValues) + " make a move");
//            int inputCell = input.nextInt();
            try {
               Player.validateInputCatchException();
            }catch (IndexOutOfBoundsException e){
                Player.validateInputCatchException();
                System.out.println(e.getMessage());
            }
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
