package TicTacToe;

import apps.CellValues;

public class Player {
    private String name;
    public Player(String name){
        this.name = name;
    }
    TicTacToe ticTacToe = new TicTacToe();
    public boolean makeAMove(int pickACell, CellValues cellValues){
        ticTacToe.pickCell(pickACell, cellValues);
        ticTacToe.isAWin();
        return false;
    }

    public String getName(){
        return name;
    }
}
