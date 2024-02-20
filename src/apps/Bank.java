package apps;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

public class Bank {
    private String name;
    private final ArrayList<Account> accounts = new ArrayList<>();

    Account account1 = new Account("hannah", "2345",  "3456456789");

    public void deposit(BigDecimal depositAmount, String number) throws Exception {
        accounts.add(account1);
        for (Account account : accounts)
            if (account.getAccountNumber().equals(number))
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
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber))
                if (account1.checkBalance("2345").compareTo(amount) > 0)
                    account1.withdraw(amount, "2345");
                else throw new InsufficientFundsException("Insufficient funds in your account");
        }
    }
      /*  public String getStringValue() throws Exception {
        String [] account = new String[accounts.size()];
        int count =-1;
        for(Account acc : accounts){
            account[++count] = String.valueOf(acc.checkBalance(acc.getPin()));
        }
        return String.format("%s",Arrays.toString(account));
    }*/
}



