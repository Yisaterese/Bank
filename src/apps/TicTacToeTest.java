package apps;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TicTacToeTest {
    @Test
    public void lengthOfArrayIs3by3Test(){
        TicTacToe ticTacToe = new TicTacToe();
        assertEquals(3,ticTacToe.getLengthOfGame());
    }


    @Test
    public void checkIfTicTacToeIsEmpty(){
        TicTacToe ticTacToe = new TicTacToe();
        assertEquals(0,ticTacToe);
    }
    @Test
    public void checkIfBoardCellsAreEmptyTest(){
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.populateBoardCells();
        assertEquals(CellValues.EMPTY,ticTacToe.getValueOfBoardCells());
    }
}
