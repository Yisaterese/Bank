package TicTacToe;

import apps.CellValues;



public class Player {
    private String name;
    public Player(String name){
        this.name = name;
    }
    static TicTacToe ticTacToe = new TicTacToe();
    static CellValues cellValues = CellValues.X;
    static java.util.Scanner input = new java.util.Scanner(System.in);
    public boolean makeAMove(int pickACell, CellValues cellValues){
        ticTacToe.pickCell(pickACell, cellValues);
        ticTacToe.isAWin();
        return false;
    }

    public  static void validateInputCatchException() {
        System.out.println("    GAME START");
        System.out.println("Player " + ticTacToe.validatePlayerTurn(cellValues) + " make a move");
        int inputCell = input.nextInt();
        ticTacToe.validateBoardCellRange(inputCell);
        ticTacToe.pickCell(inputCell, CellValues.X);
        ticTacToe.displayBoardCells();
    }

    public String getName(){
        return name;
    }
}
