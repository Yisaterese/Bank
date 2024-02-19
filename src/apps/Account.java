package apps;

import java.math.BigDecimal;

public class Account {
    private String name;
    private BigDecimal balance;
    private  String pin;
    private String accountNumber;

    public Account(String name, BigDecimal balance, String pin, String accountNumber){
        this.name = name;
        this.balance = balance;
        this.pin = pin;
        this.accountNumber = accountNumber;
    }

   public void deposit(BigDecimal depositAmount)throws InvalidAmountException{
       if(depositAmount.compareTo(depositAmount.ZERO) <= 0 ){
           throw new InvalidAmountException("deposit amount must be greater than zero");
       }
      if(balance == null) {
          balance = BigDecimal.ZERO;
      }
      balance = balance.add(depositAmount);

    }
    public BigDecimal checkBalance(String pin) throws Exception{
        pinIsEqualToLengthOfFour(pin);
        return balance;
    }
    private static String pinIsEqualToLengthOfFour(String pin) throws Exception{
        if(pin.length() == 4){
            return pin;
        }else{
            throw new InvalidPinException("Pin should be 4 digits");
        }
    }

    public void withdraw(BigDecimal amount, String pin)throws Exception{
        pinIsEqualToLengthOfFour(pin);
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
