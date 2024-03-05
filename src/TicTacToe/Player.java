package TicTacToe;

import TicTacToe.TicTacToe;
import apps.CellValues;

public class Player {
    private String name;
    public Player(String name){
        this.name = name;
    }

    public void makeAMove(int  row, int col, CellValues cellValues){
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.pickCell(row,col,cellValues);
    }
    public String getName(){
        return name;
    }
}
