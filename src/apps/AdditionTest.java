package apps;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AdditionTest {
        @Test
        public void addNumbersWithoutAdding(){
        Assertions.assertEquals(23,Addition.addWithOutUsingAddition(5,18));
    }

    @Test
    public void addNumbersWithOutUsingAdditionOperator(){
        Assertions.assertEquals(10,Addition.addWithOutAdding(20,-20,20,-10));
    }
}

