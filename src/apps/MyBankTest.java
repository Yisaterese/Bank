package apps;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyBankTest {
    @Test
    public void testBankCanRegisterCustomer_customerIsOne(){
        MyBank myBank = new MyBank();
        myBank.registerCustomer("Ayodele", "john", "correctPin");
        assertEquals(1, myBank.findAccount(65778));
    }
}
