package TicTacToe;
import apps.CellValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PlayerTest {
    @Test
    public void checkIfMoveIsNotValid_throwIndexOutOfBoundException() {
        Player player = new Player("Okpe");
        assertThrows(IndexOutOfBoundsException.class, () -> player.makeAMove(10, CellValues.X));
    }

    @Test
    public void checkWinner_XWon() {
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.pickCell(1, CellValues.X);
        ticTacToe.pickCell(2, CellValues.O);
        ticTacToe.pickCell(5, CellValues.X);
        ticTacToe.pickCell(3, CellValues.O);
        ticTacToe.pickCell(9, CellValues.X);
        //assertEquals(CellValues.X, ticTacToe.isAWin());
    }
}