package BankApp;

import BankApp.InvalidAccountException;
import BankApp.InvalidAmountException;
import apps.InvalidPinException;

import javax.naming.InsufficientResourcesException;
import java.math.BigDecimal;

public class Account {
    public static BigDecimal balance;
    private final String pin;
    private  String accountNumber = "3456456789";

    public Account(String name, String pin, String number){
        this.pin = pin;
        this.accountNumber = accountNumber;
        this.balance = new BigDecimal("0");
    }

   public void deposit(BigDecimal depositAmount)throws InvalidAmountException {
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
     static String pinIsEqualToLengthOfFour(String pin) throws Exception{
        if(pin.length() == 4){
            return pin;
        }
        throw new InvalidPinException("Pin should be 4 digits");

    }

    public void withdraw(BigDecimal amount, String pin) throws Exception {
        pinIsEqualToLengthOfFour(pin);
       if(amount.compareTo(balance) <= 0)
            balance = balance.subtract(amount);
       else throw new InsufficientResourcesException("withdraw amount shouldn't be greater than balance");
    }

    static boolean accountNumberIsValid(String accountNumber) throws Exception{
        boolean accountNumberIsCorrect = accountNumber.length() == 10;
        if(accountNumberIsCorrect)
            return true;
        else
            throw new InvalidAccountException("account number must ten digits");
    }

    public String getAccountNumber() {
        return  accountNumber;
    }
    public String getPin(){

        return this.pin;
    }

}
