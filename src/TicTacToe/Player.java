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

    public  static void validateInputCatchExceptionForX() {
        System.out.println("Player " + Player.validatePlayerXTurn(cellValues) + " make a move");
            int inputCell = input.nextInt();
                ticTacToe.validateBoardCellRange(inputCell);
                ticTacToe.pickCell(inputCell, CellValues.X);
                ticTacToe.displayBoardCells();
                ticTacToe.isAWin();
        }
    public  static void validateInputCatchExceptionForO() {
        System.out.println("Player " + Player.validatePlayerOTurn(cellValues) + " make a move");
        int inputCell = input.nextInt();
        ticTacToe.validateBoardCellRange(inputCell);
        ticTacToe.pickCell(inputCell, CellValues.O);
        ticTacToe.displayBoardCells();
        ticTacToe.isAWin();
    }


    public String getName(){
        return name;
    }

    public static CellValues validatePlayerXTurn(CellValues inputCellValue) {

        if (inputCellValue == CellValues.X) {
            return CellValues.X;
        } else {
            return CellValues.O;
        }
    }
    public static CellValues validatePlayerOTurn(CellValues inputCellValue) {

        if (inputCellValue == CellValues.O) {
            return CellValues.O;
        } else {
            return CellValues.X;
        }
    }
}
