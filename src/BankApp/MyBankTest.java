package BankApp;

import apps.InvalidPinException;
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
    public void registerTwoCustomers_RemoveOne_accountIsRemainingOneTest(){
        MyBank zenithBank = new MyBank();
        MyAccount account1 = zenithBank.registerCustomer("Ayodele", "john", "correctPin");
        MyAccount account2 = zenithBank.registerCustomer("Ayodele", "john", "correctPin");
        assertEquals(2, zenithBank.numberOfAccounts());
        zenithBank.removeAccount(account2.getAccountNumber(),"correctPin");
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
    public void registerThreeAccounts_RemoveSecondWithWrongPin_throwInvalidPinExceptionTest(){
        MyBank zenithBank = new MyBank();
        MyAccount account1 = zenithBank.registerCustomer("Ayo", "john", "correctPin");
        MyAccount account2 = zenithBank.registerCustomer("Ayodele", "joe", "correctPin");
        MyAccount account3 = zenithBank.registerCustomer("Ayodele", "john", "correctPin");
        assertEquals(3, zenithBank.numberOfAccounts());
        assertThrows(InvalidPinException.class,() -> zenithBank.removeAccount(account3.getAccountNumber(),"IncorrectPin"));
    }

    @Test
    public void testAccountDeposit(){
        MyBank zenithBank = new MyBank();
        MyAccount account1 = zenithBank.registerCustomer("Ayodele", "john", "correctPin");
        zenithBank.deposit(5_000, 1234567890);
        assertEquals(5_000, zenithBank.checkBalance(1234567890, "correctPin"));
    }

    @Test
    public void testAccountDepositWithdrawAndCheckBalance(){
        MyBank zenithBank = new MyBank();
        MyAccount account1 = zenithBank.registerCustomer("Ayodele", "john", "correctPin");
        zenithBank.deposit(5_000, 1234567890);
        zenithBank.withdraw(5_000, 1234567890, "correctPin");
        assertEquals(0, zenithBank.checkBalance(1234567890, "correctPin"));
    }



    @Test
    public void testBankCanRegisterThreeAccountsAndRemoveAccountOne() {
        MyBank zenithBank = new MyBank();
        MyAccount account1 = zenithBank.registerCustomer("Ayodele", "john", "correctPin");
        MyAccount account2 = zenithBank.registerCustomer("Ayodele", "john", "correctPin");
        MyAccount account3 = zenithBank.registerCustomer("Ayodele", "john", "correctPin");
        zenithBank.deposit(5_000, account1.getAccountNumber());
        zenithBank.transfer(3_000, account1.getAccountNumber(), account2.getAccountNumber(), "correctPin");
        zenithBank.removeAccount(account2.getAccountNumber(), "correctPin");
        assertThrows(InvalidAccountException.class,()-> zenithBank.findAccount(account2.getAccountNumber()));
    }

    @Test
    public void registerThreeAccounts_RemoveSecondWithWrongAccount_throwInvalidAccountExceptionTest(){
        MyBank zenithBank = new MyBank();
        MyAccount account1 = zenithBank.registerCustomer("Ayo", "john", "correctPin");
        MyAccount account2 = zenithBank.registerCustomer("Ayodele", "joe", "correctPin");
        MyAccount account3 = zenithBank.registerCustomer("Ayodele", "john", "correctPin");
        assertEquals(3, zenithBank.numberOfAccounts());
        assertThrows(InvalidAccountException.class,() -> zenithBank.removeAccount(123456795,"IncorrectPin"));
    }
    @Test
    public void testAccountCanTransferFromAccountOne_toAccountTwo() {
        MyBank zenithBank = new MyBank();
        MyAccount account1 = zenithBank.registerCustomer("Ayodele", "john", "correctPin");
        MyAccount account2 = zenithBank.registerCustomer("Ayodele", "johnson", "correctPin");
        account1.deposit(5000);
        zenithBank.transfer(account1.getAccountNumber(),account2.getAccountNumber(),3000, "correctPin");
        assertEquals(2000, zenithBank.checkBalance(account1.getAccountNumber(), "correctPin"));
        assertEquals(3000, zenithBank.checkBalance(account2.getAccountNumber(),"correctPin"));

    }


}
