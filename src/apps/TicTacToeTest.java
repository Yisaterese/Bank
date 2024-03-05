package apps;

import org.junit.jupiter.api.Test;

import static apps.CellValues.X;
import static org.junit.jupiter.api.Assertions.*;

public class TicTacToeTest {
    @Test
    public void lengthOfArrayIs3by3Test() {
        TicTacToe ticTacToe = new TicTacToe();
        assertEquals(3, ticTacToe.getLengthOfBoardCells());
    }

    @Test
    public void checkIfBoardCellsAreEmptyTest() {
        TicTacToe ticTacToe = new TicTacToe();
        CellValues[][] cells = ticTacToe.getValueOfBoardCells();
        assertEquals(cells, ticTacToe.getValueOfBoardCells());
    }

    @Test
    public void checkIfPlayerEnterOutOfBoundIndex_throwIndexOutOfBound(){
        TicTacToe ticTacToe = new TicTacToe();
         assertThrows(IndexOutOfBoundsException.class,()->ticTacToe.pickCell(3,2,CellValues.X));
    }

    @Test
    public void checkIfCurrentIndexPicked_equalsTheValueOfTheEnumType(){
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.pickCell(1,2,X);
        assertEquals(CellValues.X, ticTacToe.getValueOfBoardCells()[1][2]);
    }


    @Test
    public void checkWinByRow_itsValidWin(){
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.pickCell(1,0, X);
        ticTacToe.pickCell(2,0, CellValues.O);
        ticTacToe.pickCell(1,1, X);
        ticTacToe.pickCell(2,1, CellValues.O);
        ticTacToe.pickCell(1,2, X);
        for(int row = 0;  row < 3; row ++) {
            for(int col = 0; col < 3; col++) {
                assertEquals(CellValues.O, ticTacToe.getWinByRow()[row][col]);
            }
        }

    }

    @Test
    public void checkWinByColumn_getWin(){
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.pickCell(1,0, X);
        ticTacToe.pickCell(2,0, CellValues.O);
        ticTacToe.pickCell(1,1, X);
        ticTacToe.pickCell(2,1, CellValues.O);
        ticTacToe.pickCell(1,2, X);
        assertTrue(ticTacToe.hasWonByColumn());

    }

    @Test
    public void checkWinDiagonalyOnCellBoard_getWin(){
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.pickCell(0,0, CellValues.O);
        ticTacToe.pickCell(1,1, X);
        ticTacToe.pickCell(1,1, CellValues.O);
        ticTacToe.pickCell(2,0, X);
        ticTacToe.pickCell(2,2, CellValues.O);
        assertTrue(ticTacToe.hasWonByDiagonal());

    }


}
