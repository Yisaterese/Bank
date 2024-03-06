package TicTacToe;

import InvalidBoardCellException.InvalidBoardCellException;
import apps.CellValues;
import org.junit.jupiter.api.Test;

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
    public void checkIfPlayerEnterOutOfBoundIndex_throwIndexOutOfBoundTest(){
        TicTacToe ticTacToe = new TicTacToe();
         assertThrows(IndexOutOfBoundsException.class,()->ticTacToe.pickCell(10));
    }

   @Test
    public void checkIfCurrentIndexPicked_equalsTheValueOfTheEnumTypeTest(){
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.pickCell(2);
        assertEquals(CellValues.X, ticTacToe.getValueOfBoardCells()[0][1]);
    }


    @Test
    public void checkWinByDiagonal_itsValidWinTest(){
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.pickCell(1);
        ticTacToe.pickCell(2);
        ticTacToe.pickCell(5);
        ticTacToe.pickCell(3);
        ticTacToe.pickCell(9);
        assertTrue(ticTacToe.isWinByRow());

    }

   @Test
    public void checkWinByColumn_getWinTest(){
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.pickCell(1);
        ticTacToe.pickCell(2);
        ticTacToe.pickCell(4);
        ticTacToe.pickCell(3);
        ticTacToe.pickCell(7);
        assertTrue(ticTacToe.isWinByColumn());
    }

    @Test
    public void checkWinByRow_getWinTest(){
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.pickCell(1);
        ticTacToe.pickCell(4);
        ticTacToe.pickCell(2);
        ticTacToe.pickCell(5);
        ticTacToe.pickCell(9);
        ticTacToe.pickCell(6);
        assertTrue(ticTacToe.isWinByDiagonal());
    }

    @Test
    public void checkDrawGame_Test(){
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.pickCell(1);
        ticTacToe.pickCell(4);
        ticTacToe.pickCell(2);
        ticTacToe.pickCell(5);
        ticTacToe.pickCell(9);
        ticTacToe.pickCell(7);
        ticTacToe.pickCell(3);
        ticTacToe.pickCell(8);
        assertTrue(ticTacToe.isADrawGame());
    }

    @Test
    public void checkBoardCantBePickedTwice_throwInvalidBoardCellExceptionTest(){
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.pickCell(1);
        assertThrows(InvalidBoardCellException.class, ()-> ticTacToe.pickCell(1));
    }



}
