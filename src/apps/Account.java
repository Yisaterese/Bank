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
    public Object checkBalance(String pin) throws InvalidPinException{
        if(pin.length() == 4) return balance;
        else throw new InvalidPinException("Pin should have 4 digits");
    }

}
