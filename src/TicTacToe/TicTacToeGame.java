package TicTacToe;

import apps.CellValues;

public class TicTacToeGame {
    public static void main(String[] args) {

        TicTacToe ticTacGame = new TicTacToe();
        Player playerX = new Player("X");
        Player playerO = new Player("O");
        Player currentPlayer = playerX;
        System.out.println("    GAME START");
        while(true) {

            try {
                Player.validateInputCatchExceptionForO();
            }catch (IndexOutOfBoundsException e){
                Player.validateInputCatchExceptionForO();
                System.out.println(e.getMessage());
            }
            try {
               Player.validateInputCatchExceptionForX();
            }catch (IndexOutOfBoundsException e){
                Player.validateInputCatchExceptionForX();
                System.out.println(e.getMessage());
            }


        }


    }


}