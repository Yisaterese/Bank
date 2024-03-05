package BankApp;

import apps.InvalidPinException;

import java.util.ArrayList;

public class MyBank {

    public MyAccount registerCustomer(String firstName, String lastName, String pin) {
       MyAccount myAccount =  new MyAccount(firstName + " " +lastName, pin);
       myAccount.setAccountNumber(accountNumber++);
       myAccounts.add(myAccount);
       return myAccount;
   }

      public int numberOfAccounts(){
          return myAccounts.size();
      }

    public void removeAccount(int accountNumber, String myPin){
            if(!isValidating(accountNumber)) throw new InvalidAccountException("incorrect account.");
            if(!isEquals(myPin)) throw new InvalidPinException("incorrect pin");
            MyAccount foundAccount = findAccount(accountNumber);
            myAccounts.remove(foundAccount);
            numberOfAccounts --;
    }

    public void deposit(int depositAmount, int accountNumber){
        for (MyAccount account : myAccounts){
            if(isValid(accountNumber, account)) {
                account.deposit(depositAmount);
            }
        }
    }

    public void withdraw(int withdrawAmount, int accountNumber, String correctPin) {
        for (MyAccount myAccount: myAccounts){
            if (isValid(accountNumber, myAccount)){
                myAccount.withdraw(withdrawAmount, correctPin);
                break;
            }
        }
    }


    public void transfer(int transferAmount, int senderAccountNumber, int recipientAccountNumber, String correctPin) {
        for (MyAccount myAccount : myAccounts) {
            if (isValid(senderAccountNumber, myAccount)) {
                myAccount.withdraw(transferAmount, correctPin);
            }
            if (isValid(recipientAccountNumber, myAccount)) {
                myAccount.deposit(transferAmount);
            }

        }

    }

    public MyAccount findAccount(int accountNumber){
        for(MyAccount account: myAccounts){
            if(isValid(accountNumber, account)){
                return account;
            }
        }
       throw new InvalidAccountException("Account provided does not exist");
    }

    public int checkBalance(int accountNumber, String pin) {
        for (MyAccount account : myAccounts) {
            if (isValid(accountNumber, account)) {
                return account.checkBalance(pin);
            }
            if (!isEquals(pin)) {
                throw new InvalidPinException("provided pin is not correct");
            }
        }
        throw new InvalidAccountException("Provided account does not exist");
    }
    private final ArrayList<MyAccount> myAccounts = new ArrayList<>();

    private boolean isEquals(String pin) {
        return MyAccount.isEqualsLengthOf(pin);
    }
    private static boolean isValid(int accountNumber, MyAccount myAccount) {
        return myAccount.getAccountNumber() == accountNumber;
    }

    private boolean isValidating(int accountNumber){
        for(MyAccount account: myAccounts)
            if(account.getAccountNumber() == accountNumber)
                return true;
        throw new InvalidAccountException("Incorrect account number");
    }
    private   int accountNumber = 1234567890;
    private int  numberOfAccounts;

}
