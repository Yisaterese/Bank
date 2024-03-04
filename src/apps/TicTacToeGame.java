package apps;

public class TicTacToeGame {
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.printBoardCells();
        System.out.println("""
                
                """);
        game.pickCell(0,0, CellValues.X);
        game.printBoardCells();
        System.out.println("""
                
                """);
        game.pickCell(0,1, CellValues.O);
        System.out.println("""
                
                """);
        game.printBoardCells();

        Player player1 = new Player("Bukumi");
        Player player2 = new Player("Dayo Akpan");

    }
}
