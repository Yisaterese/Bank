package apps;

import java.util.ArrayList;

public class MyBank {
    private final ArrayList<MyAccount> myAccounts = new ArrayList<>();
    private   int accountNumber = 1234567890;
    public MyAccount registerCustomer(String firstName, String lastName, String pin) {
       MyAccount myAccount =  new MyAccount(firstName + " " +lastName, pin);
       myAccount.setAccountNumber(accountNumber++);
       //myAccount.accountNumber++;
       myAccounts.add(myAccount);
       return myAccount;
   }
    private int  numberOfAccounts;
      public int numberOfAccounts(){
          return myAccounts.size();
      }

    public void removeAccount(int accountNumber, String myPin) {
        for(MyAccount account: myAccounts){
            if(isEquals(accountNumber, account)) {
                myAccounts.remove(account);
                break;
            }
        }
    }

    private static boolean isEquals(int accountNumber, MyAccount account) {
        return account.getAccountNumber() == accountNumber;
    }

  /*  public MyAccount findAccount(int accountNumber){
        for(MyAccount account: myAccountList){
            if(isValid(accountNumber, account)){
                return account;
            }
        }
        return null;
    }

    private static boolean isValid(int accountNumber, MyAccount account) {
        return account.getAccountNumber() == accountNumber;
    }

    public void deposit(int depositAmount, int accountNumber){
        for (MyAccount account : myAccountList){
           if(isValid(accountNumber, account)) {
                account.deposit(depositAmount);
            }
        }
    }

    public int checkBalance(int accountNumber, String pin) {
        for (MyAccount account : myAccountList) {
            if (isValid(accountNumber, account)) {
                return account.checkBalance(pin);
            }
            if (!isValidate(pin)) {
                throw new InvalidPinException("provided pin is not correct");
            }
        }
        throw new InvalidAccountException("Provided account does not exist");
    }
    private boolean isValidate(String pin) {
        return MyAccount.isEqualsLengthOf(pin);
    }
    }*/
}
