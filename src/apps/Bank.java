package apps;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Account> accounts = new ArrayList<Account>();

    Account account1 = new Account("hanah", "2345", "3456456789");

    public void deposit(BigDecimal depositAmount, String number) throws Exception {
        accounts.add(account1);
        for (int index = 0; index < accounts.size(); index++)
            if (accounts.get(index).getAccountNumber().equals(number))
                account1.deposit(depositAmount);
            else
                throw new InvalidAccountException("Account number provided not found");
    }

    public BigDecimal checkBalance(String number, String pin) throws Exception {
        return account1.checkBalance("2345");
    }

    public void Withdraw(BigDecimal amount, String accountNumber, String pin)throws Exception {
        account1.pinIsEqualToLengthOfFour(pin);
        account1.accountNumberIsValid(accountNumber);
        for (int index = 0; index < accounts.size(); index++) {
            if (accounts.get(index).getAccountNumber().equals(accountNumber))
                if(account1.checkBalance("2345").compareTo(amount) > 0)
                  account1.withdraw(amount, "2345" );
            else throw new InsufficientFundsException("Insufficient funds in your account");
        }
    }
}



