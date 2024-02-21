//package apps;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import java.math.BigDecimal;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class AccountTest {
//
//    private Account account;
//
//    @BeforeEach
//    public void setUp() {
//        account = new Account("alex","8918","2345634563");
//    }
//    @Test
//    public void testAccontCanDeposit()throws Exception{
//        account.deposit(new BigDecimal("12000"));
//        try {
//            assertEquals(new BigDecimal(12000), account.checkBalance("8918"));
//        } catch (InvalidPinException e) {
//            throw new RuntimeException(e);
//        }
//
//    }
//    @Test
//    public void testAccountCanWithdrew()throws Exception {
//        account.deposit(new BigDecimal("12000"));
//        try {
//            assertEquals(new BigDecimal(12000), account.checkBalance("2345"));
//        } catch (InvalidPinException e) {
//            throw new RuntimeException(e);
//        }
//        account.withdraw(new BigDecimal(2000), "2345");
//        assertEquals(new BigDecimal(10000), account.checkBalance("2345"));
//    }
//
//}
