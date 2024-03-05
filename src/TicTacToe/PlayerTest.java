package TicTacToe;
import apps.CellValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PlayerTest {
    @Test
    public void checkIfMoveIsNotValid_throwIndexOutOfBoundException() {
        Player player = new Player("Okpe");
        assertThrows(IndexOutOfBoundsException.class, () -> player.makeAMove(3,4, CellValues.X));
    }

    @Test
    public void checkIfMoveValid_placeMoveAtAnEmptyBoardCell(){
        Player player = new Player("Chijioke");


    }
}
