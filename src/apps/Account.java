package apps;

import java.math.BigDecimal;

public class Account {
    private String name;
    private BigDecimal balance;
    private  String pin;
    private String accountNumber;

   public void deposit(BigDecimal depositAmount)throws InvalidAmountException{
       if(depositAmount.compareTo(depositAmount.ZERO) <= 0 ){
           throw new InvalidAmountException("deposit amount must be greater than zero");
       }
      if(balance == null) {
          balance = BigDecimal.ZERO;
      }
      balance = balance.add(depositAmount);

    }
    public Object checkBalance(String pin) throws Exception{
        if(pinIsEqualToLengthOfFour(pin)) return balance;
        else throw new InvalidPinException("Pin should have 4 digits");
    }

    private  static boolean pinIsEqualToLengthOfFour(String pin) {
        return pin.length() == 4;
    }

    public void withdraw(BigDecimal amount, String accountNumber)throws Exception{
       if(!accountNumberIsValid(accountNumber))
       if(amount.compareTo(balance) <= 0)
            balance = balance.subtract(amount);
       else throw new InsufficientFundsException("withdraw amount shouldn't be greater than balance");
    }

    private  boolean accountNumberIsValid(String accountNumber) throws Exception{
        boolean accountNumberIsCorrect = accountNumber.length() == 10;
        if(accountNumberIsCorrect)
            return true;
        else
            throw new InvalidAccountException("account number must ten digits");
    }

}
