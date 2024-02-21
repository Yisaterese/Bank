package apps;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyAccountTest {
    @Test
    public void accountCanDeposit(){
        MyAccount myAccount = new MyAccount("fidel");
        myAccount.deposit(3_000);
        assertEquals(3_000, myAccount.checkBalance("correctPin"));
    }
    @Test
    public void testAccountWithdraw(){
        MyAccount myAccount = new MyAccount("fidel");
        myAccount.deposit(3_000);
        myAccount.withdraw(1_000, "correctPin");
        assertEquals(2_000, myAccount.checkBalance("correctPin"));

    }
}
