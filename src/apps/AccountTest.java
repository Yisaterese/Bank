package apps;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {
    @Test
    public void testAccontCanDeposit() {
        Account alex = new Account();
        alex.deposit(new BigDecimal("12000.78"));
        try {
            assertEquals(1200.78, alex.checkBalance("8912"));
        } catch (InvalidPinException e) {
            throw new RuntimeException(e);
        }


    }

}
