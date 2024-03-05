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
    public void checkIfMoveValid_placeMoveAtAnEmptyBoardCell(){
        Player player = new Player("Chijioke");


    }
}
