package apps;

public class MyAccount {


    public MyAccount(String name, String pin){
        this.name = name;
        this.balance = 0;
        this.pin = pin;
    }
    public void deposit(int depositAmount) {
        balance += depositAmount;
    }

    public int checkBalance(String  myCorrectPin ) {
        return balance;
    }

    public  void withdraw(int withdrawAmount, String theCorrectPin) {
        validate(withdrawAmount, theCorrectPin);
        balance -= withdrawAmount;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
    private void validate(int withdrawAmount, String theCorrectPin){
        if(isInvalid(withdrawAmount))throw new InvalidAmountException("Amount provided should be greater than zero.");
        if(!isEquals(theCorrectPin))throw new InvalidPinException("Provided pin is incorrect.");
        if(!isValidAmount(withdrawAmount))throw new InssufficientFundsException("Insufficient funds in account.");

    }
    private boolean isInvalid(int withdrawAmount) {
        return withdrawAmount <= 0;
    }
    private boolean isEqualsLengthOf(String theCorrectPin){
        return theCorrectPin.length() == 10;
    }

    private boolean isEquals(String theCorrectPin) {
        return this.pin.equals(theCorrectPin) && isEqualsLengthOf(theCorrectPin);
    }

    private boolean isValidAmount(int  withdrawAmount){
      return  withdrawAmount <= balance;
    }
    private String name;
    private int balance;
    private String pin;
    private int accountNumber;


}
