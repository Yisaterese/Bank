package apps;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

public class Bank {
    private String name;
    private final ArrayList<Account> accounts = new ArrayList<>();

    Account account1 = new Account("hannah", "2345",  "3456456789");
    Account account2 = new Account("hannah", "2345",  "1234567891");
    public Bank() {
        accounts.add(account1);
        accounts.add(account2);
    }

    public void deposit(BigDecimal depositAmount, String number) throws Exception {
        for (Account account : accounts)
            if (account.getAccountNumber().equals(number))
                account1.deposit(depositAmount);

    }


    public BigDecimal checkBalance(String number, String pin) throws Exception {
        return account1.checkBalance("2345");
    }

    public void Withdraw(BigDecimal amount, String userAccount, String pin)throws Exception {
        account1.pinIsEqualToLengthOfFour(pin);
        account1.accountNumberIsValid(userAccount);
        for (Account account : accounts) {
            if (isEqualsAccountNumber(userAccount))
                if (getCompareTo(amount) > 0)
                    account.withdraw(amount, pin);
        }
    }

    private boolean isEqualsAccountNumber(String accountNumber) {
        return account1.getAccountNumber().equals(accountNumber);
    }

    private int getCompareTo(BigDecimal amount) throws Exception {
        return account1.checkBalance("2345").compareTo(amount);
    }

    public void transfer(BigDecimal transferAmount, String userAccount, String recipientAccount, String userPin) throws Exception{
        account1.pinIsEqualToLengthOfFour(userPin);
        account1.accountNumberIsValid(userAccount); 
        account1.accountNumberIsValid(recipientAccount);
        getCompareTo(new BigDecimal(String.valueOf(transferAmount)));
        isEqualsAccountNumber(userAccount);
        account1.withdraw(transferAmount,userPin);
        account2.deposit(transferAmount);
    }
}



