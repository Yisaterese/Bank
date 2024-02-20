package apps;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class BankTest {
    @Test
    public void testBankCanRegisterCustomer()throws Exception{
        Bank bank = new Bank();
        bank.deposit(new BigDecimal("2312"), "3456456789");
        assertEquals(new BigDecimal("2312"), bank.checkBalance("3456456789","2345"));

    }
    @Test
    public void testAccountCanWithDraw()throws Exception{
        Bank bank = new Bank();
        bank.deposit(new BigDecimal("2312"), "3456456789");
        assertEquals(new BigDecimal("2312"), bank.checkBalance("3456456789","2345"));

        bank.Withdraw(new BigDecimal("2000"), "3456456789", "2345");
        assertEquals(new BigDecimal("312"), bank.checkBalance("456456789", "2345"));
    }
}
