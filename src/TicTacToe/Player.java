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
        System.out.println("Player " + Player.validatePlayerTurn(cellValues) + " make a move");
            int inputCell = input.nextInt();
                ticTacToe.validateBoardCellRange(inputCell);
                ticTacToe.pickCell(inputCell, CellValues.X);
                ticTacToe.displayBoardCells();
                ticTacToe.isAWin();
        }


    public String getName(){
        return name;
    }

    public static CellValues validatePlayerTurn(CellValues cellValues) {
        if (cellValues == CellValues.X) {
            return CellValues.X;
        } else {
            return CellValues.O;
        }
    }
}
