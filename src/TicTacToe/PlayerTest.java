package TicTacToe;
import apps.CellValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PlayerTest {
    @Test
    public void checkIfMoveIsNotValid_throwIndexOutOfBoundException() {
        Player player = new Player("Okpe");
        assertThrows(IndexOutOfBoundsException.class, () -> player.makeAMove(10));
    }

    @Test
    public void checkWinner_playerXWon() {
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.pickCell(1);
        ticTacToe.pickCell(2);
        ticTacToe.pickCell(5);
        ticTacToe.pickCell(3);
        ticTacToe.pickCell(9);
//        assertEquals();

    }
}