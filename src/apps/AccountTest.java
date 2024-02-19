package apps;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {
    @Test
    public void testAccontCanDeposit()throws Exception{
        Account alex = new Account();
        alex.deposit(new BigDecimal("12000"));
        try {
            assertEquals(new BigDecimal(12000), alex.checkBalance("8918"));
        } catch (InvalidPinException e) {
            throw new RuntimeException(e);
        }

    }
    @Test
    public void testAccontCanWithdrew()throws Exception {
        Account alex = new Account();
        alex.deposit(new BigDecimal("12000"));
        try {
            assertEquals(new BigDecimal(12000), alex.checkBalance("8918"));
        } catch (InvalidPinException e) {
            throw new RuntimeException(e);
        }
        alex.withdraw(new BigDecimal(2000), "2341234567");
        assertEquals(new BigDecimal(10000),alex.checkBalance("5674"));
    }

}
