package apps;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MyBankTest {
    @Test
    public void testBankCanRegisterCustomer_customerIsOne(){
        MyBank zenithBank = new MyBank();
        zenithBank.registerCustomer("Ayodele", "john", "correctPin");
        zenithBank.registerCustomer("Ayodele", "john", "correctPin");
        assertEquals(2, zenithBank.numberOfAccounts());
    }
    @Test
    public void testBankCanRegisterTwoCustomer_customerAreTwo(){
        MyBank zenithBank = new MyBank();
        zenithBank.registerCustomer("Ayodele", "john", "correctPin");
        zenithBank.registerCustomer("Ayodele", "john", "correctPin");
        assertEquals(2, zenithBank.numberOfAccounts());
    }
    @Test
    public void testBankCanRegisterTwoCustomerAndRemoveOne_accountIsRemainingOne(){
        MyBank zenithBank = new MyBank();
        zenithBank.registerCustomer("Ayodele", "john", "correctPin");
        zenithBank.registerCustomer("Ayodele", "john", "correctPin");
        assertEquals(2, zenithBank.numberOfAccounts());
        zenithBank.removeAccount(1234567890,"correctPin");
        assertEquals(1, zenithBank.numberOfAccounts());
    }

    @Test
    public void testBankCanRegisterTwoAccountsAndRemoveTwo_accountIsRemainingZero(){
        MyBank zenithBank = new MyBank();
        MyAccount account1 = zenithBank.registerCustomer("Ayodele", "john", "correctPin");
        MyAccount account2 = zenithBank.registerCustomer("Ayodele", "john", "correctPin");
        assertEquals(2, zenithBank.numberOfAccounts());
        zenithBank.removeAccount(1234567890,"correctPin");
        zenithBank.removeAccount(1234567891,"correctPin");
        assertEquals(0, zenithBank.numberOfAccounts());
    }

    @Test
    public void testBankCanRegisterThreeAccountsAndRemoveTheSecond_throwInvalidAccoundException(){
        MyBank zenithBank = new MyBank();
        MyAccount account1 = zenithBank.registerCustomer("Ayodele", "john", "correctPin");
        MyAccount account2 = zenithBank.registerCustomer("Ayodele", "john", "correctPin");
        MyAccount account3 = zenithBank.registerCustomer("Ayodele", "john", "correctPin");
        assertEquals(3, zenithBank.numberOfAccounts());
        zenithBank.removeAccount(account2.getAccountNumber(),"correctPin");
        assertThrows(InvalidAccountException.class,() -> zenithBank.findAccount(account2.getAccountNumber()));
    }

    @Test
    public void testBankCanRegisterThreeAccountsAndRemoveTheSecondWithWrongPin_throwInvalidPinException(){
        MyBank zenithBank = new MyBank();
        MyAccount account1 = zenithBank.registerCustomer("Ayodele", "john", "correctPin");
        MyAccount account2 = zenithBank.registerCustomer("Ayodele", "john", "correctPin");
        MyAccount account3 = zenithBank.registerCustomer("Ayodele", "john", "correctPin");
        assertEquals(3, zenithBank.numberOfAccounts());
        zenithBank.removeAccount(account3.getAccountNumber(),"IncorrectPin");
        assertThrows(InvalidPinException.class,() -> zenithBank.findAccount(account2.getAccountNumber()));
    }
    @Test
    public void testAccountDeposit(){
        MyBank zenithBank = new MyBank();
        MyAccount account1 = zenithBank.registerCustomer("Ayodele", "john", "correctPin");
        zenithBank.deposit(1234567890, 5_000);
        assertEquals(5_000, zenithBank.checkBalance(1234567890, "correctPin"));
    }

}
