package apps;

import org.junit.After;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class BankTest {
    private Bank bank;
    @BeforeEach
    void createNewObject(){
        bank = new Bank();
    }
    @AfterEach
    void destroyObject(){
        bank = null;
    }
    @Test
    public void testBankCanMakeDeposit()throws Exception{
        bank.deposit(new BigDecimal("2312"), "3456456789");
        assertEquals(new BigDecimal("2312"), bank.checkBalance("3456456789","2345"));
    }
    @Test
    public void testAccountCanWithDraw()throws Exception{
        bank.deposit(new BigDecimal("2312"), "3456456789");
        assertEquals(new BigDecimal("2312"), bank.checkBalance("3456456789","2345"));
        bank.Withdraw(new BigDecimal("2000"), "3456456789", "2345");
        assertEquals(new BigDecimal("312"), bank.checkBalance("456456789", "2345"));
    }

    @Test
    public void accountCanMakeTransfer()throws Exception{
        bank.deposit(new BigDecimal("2312"), "3456456789");
        assertEquals(new BigDecimal("2312"), bank.checkBalance("3456456789","2345"));
        bank.Withdraw(new BigDecimal("2000"), "3456456789", "2345");
        assertEquals(new BigDecimal("312"), bank.checkBalance("456456789", "2345"));
        bank.deposit(new BigDecimal("2000"), "3456456789");
        assertEquals(new BigDecimal("2312"), bank.checkBalance("3456456789", "2345"));
        bank.transfer(new BigDecimal("312"),  "3456456789", "12345678910", "2345");
        assertEquals(new BigDecimal("2000"),  bank.checkBalance("3456456789", "2345"));
    }


}
