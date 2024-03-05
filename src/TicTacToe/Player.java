package TicTacToe;

import TicTacToe.TicTacToe;
import apps.CellValues;

public class Player {
    private String name;
    public Player(String name){
        this.name = name;
    }

    public void makeAMove(int pickACell){
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.pickCell(pickACell);
    }
    public String getName(){
        return name;
    }
}
