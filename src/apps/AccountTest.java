package apps;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {
    @Test
    public void testAccontCanDeposit()throws Exception{
        Account account1 = new Account("alex", new BigDecimal(0.00),"8918","2345634563");
        account1.deposit(new BigDecimal("12000"));
        try {
            assertEquals(new BigDecimal(12000), account1.checkBalance("8918"));
        } catch (InvalidPinException e) {
            throw new RuntimeException(e);
        }

    }
    @Test
    public void testAccontCanWithdrew()throws Exception {
        Account acccount2 = new Account("iwobi",new BigDecimal(0.00),"2345", "3423456672");
        acccount2.deposit(new BigDecimal("12000"));
        try {
            assertEquals(new BigDecimal(12000), acccount2.checkBalance("2345"));
        } catch (InvalidPinException e) {
            throw new RuntimeException(e);
        }
        acccount2.withdraw(new BigDecimal(2000), "2345");
        assertEquals(new BigDecimal(10000), acccount2.checkBalance("2345"));
    }

}
