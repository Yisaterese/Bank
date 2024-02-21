package apps;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MyAccountTest {
    @Test
    public void accountCanDeposit(){
        MyAccount myAccount = new MyAccount("fidel", 0, "correctPin");
        myAccount.deposit(3_000);
        assertEquals(3_000, myAccount.checkBalance("correctPin"));
    }
    @Test
    public void testAccountWithdraw(){
        MyAccount myAccount = new MyAccount("fidel", 0, "correctPin");
        myAccount.deposit(3_000);
        myAccount.withdraw(1_000, "correctPin");
        assertEquals(2_000, myAccount.checkBalance("correctPin"));

    }

    @Test
    public void withdrawAboveBalance_throwInsuuficientFundsException() {
       MyAccount myAccount = new MyAccount("fidel", 0, "correctPin");
        myAccount.deposit(3_000);
        assertThrows(InssufficientFundsException.class,()-> myAccount.withdraw(4_000, "correctPin"));
    }

    @Test
    public void withdrawMinus3k_throwsInvalidAmountException(){
        MyAccount myAccount = new MyAccount("fidel", 0, "correctPin");
        myAccount.deposit(3_000);
        assertThrows(InvalidAmountException.class,()-> myAccount.withdraw(-2_000, "correctPin"));
    }
}
