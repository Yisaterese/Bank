package TicTacToe;

import apps.CellValues;
public class TicTacToeGame {
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
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

        Player player1 = new Player("Bukumi");
        Player player2 = new Player("Dayo Akpan");
        java.util.Scanner input = new java.util.Scanner(System.in);

        player1.makeAMove(row,col,);
        while(){
            System.out.print("player pick a row");
            int row = input.nextInt();
            System.out.print("player pick a row");
            int col = input.nextInt();
        }

    }
}
