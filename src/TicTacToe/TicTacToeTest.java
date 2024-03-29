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
    public void checkForOutOfRangeBoardCell_throwIndexOutOfBoundTest(){
        TicTacToe ticTacToe = new TicTacToe();
         assertThrows(IndexOutOfBoundsException.class,()->ticTacToe.pickCell(11, CellValues.X));
    }

   @Test
    public void checkIfCurrentIndexPicked_equalsTheValueOfTheEnumTypeTest(){
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.pickCell(2, CellValues.X);
        assertEquals(CellValues.X, ticTacToe.getValueOfBoardCells()[0][1]);
    }


    @Test
    public void checkWinByDiagonal_itsValidWinTest() {
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.pickCell(1, CellValues.X);
        ticTacToe.pickCell(2, CellValues.O);
        ticTacToe.pickCell(5, CellValues.X);
        ticTacToe.pickCell(3, CellValues.O);
        ticTacToe.pickCell(9, CellValues.X);
        assertEquals(CellValues.X,ticTacToe.isWinByDiagonal());

    }

   @Test
    public void checkWinByColumn_getWinTest(){
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.pickCell(1, CellValues.X);
        ticTacToe.pickCell(2, CellValues.O);
        ticTacToe.pickCell(4, CellValues.X);
        ticTacToe.pickCell(3, CellValues.O);
        ticTacToe.pickCell(7, CellValues.X);
        assertEquals(CellValues.X, ticTacToe.isWinByColumn());
        ticTacToe.displayBoardCells();
    }


    @Test
    public void checkWinByRow_getWinTest(){
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.pickCell(1, CellValues.X);
        ticTacToe.pickCell(7, CellValues.O);
        ticTacToe.pickCell(4, CellValues.X);
        ticTacToe.pickCell(8, CellValues.O);
        ticTacToe.pickCell(3, CellValues.X);
        ticTacToe.pickCell(9, CellValues.O);
        ticTacToe.displayBoardCells();
        assertEquals(CellValues.O,ticTacToe.isWinByRow());

    }

    @Test
    public void checkDrawGame_Test(){
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.pickCell(1, CellValues.X);
        ticTacToe.pickCell(4, CellValues.O);
        ticTacToe.pickCell(2, CellValues.X);
        ticTacToe.pickCell(5, CellValues.O);
        ticTacToe.pickCell(9, CellValues.X);
        ticTacToe.pickCell(7, CellValues.O);
        ticTacToe.pickCell(3, CellValues.X);
        ticTacToe.pickCell(8, CellValues.O);
        assertEquals(ticTacToe.getValueOfBoardCells(),ticTacToe.isADrawGame());
    }

    @Test
    public void checkBoardCantBePickedTwice_throwInvalidBoardCellExceptionTest(){
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.pickCell(1, CellValues.X);
        assertThrows(InvalidBoardCellException.class, ()-> ticTacToe.pickCell(1, CellValues.X));
    }

    @Test
    public void checkWin_getWin(){
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.pickCell(3, CellValues.X);
        ticTacToe.pickCell(2, CellValues.O);
        ticTacToe.pickCell(4, CellValues.X);
        ticTacToe.pickCell(5, CellValues.O);
        ticTacToe.pickCell(7, CellValues.X);
        ticTacToe.pickCell(8, CellValues.O);
        ticTacToe.displayBoardCells();
        assertEquals(CellValues.O, ticTacToe.isAWin());

    }

}