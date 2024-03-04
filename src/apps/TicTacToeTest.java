package apps;

import org.junit.jupiter.api.Test;

import static apps.CellValues.EMPTY;
import static apps.CellValues.X;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TicTacToeTest {
    @Test
    public void lengthOfArrayIs3by3Test() {
        TicTacToe ticTacToe = new TicTacToe();
        assertEquals(3, ticTacToe.getLengthOfGame());
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
        assertEquals(CellValues.X, ticTacToe.getValueOfBoardCells());
    }
}
