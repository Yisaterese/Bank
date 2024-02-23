package apps;

import java.util.ArrayList;
import java.util.Iterator;

public class MyBank {
    private final ArrayList<MyAccount> myAccounts = new ArrayList<>();
    private   int accountNumber = 1234567890;
    public MyAccount registerCustomer(String firstName, String lastName, String pin) {
       MyAccount myAccount =  new MyAccount(firstName + " " +lastName, pin);
       myAccount.setAccountNumber(accountNumber++);
       myAccounts.add(myAccount);
       return myAccount;
   }
    private int  numberOfAccounts;
      public int numberOfAccounts(){
          return myAccounts.size();
      }


    public void removeAccount(int accountNumber, String myPin){
        Iterator<MyAccount> iterator = myAccounts.iterator();
        while (iterator.hasNext()){
            MyAccount myAccount = iterator.next();
            /*if(!isEquals(accountNumber, myAccount)) {
                throw new InvalidAccountException("account provided does not exist.");
            }
            if(!isValidate(myPin)) {
                throw new InvalidPinException("Incorrect pin.");
            }*/
            iterator.remove();
        }
    }


    public MyAccount findAccount(int accountNumber){
        for(MyAccount account: myAccounts){
            if(isEquals(accountNumber, account)){
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
            if (!isValidate(pin)) {
                throw new InvalidPinException("provided pin is not correct");
            }
        }
        throw new InvalidAccountException("Provided account does not exist");
    }
    private boolean isValidate(String pin) {
        return MyAccount.isEqualsLengthOf(pin);
    }
    private static boolean isEquals(int accountNumber, MyAccount myAccount) {
        return myAccount.getAccountNumber() == accountNumber;
    }
    /*private static boolean isEquals(int accountNumber, MyAccount account) {
        return isEquals(accountNumber, account);
    }*/

   /* public void deposit(int depositAmount, int accountNumber){
        for (MyAccount account : myAccountList){
           if(isValid(accountNumber, account)) {
                account.deposit(depositAmount);
            }
        }
    }

      public void removeAccount(int accountNumber, String myPin) {
        for(MyAccount account: myAccounts){
            if(!isEquals(accountNumber, account)) throw new InvalidAccountException("Account provided does not exist");
            if(!isValidate(myPin)) throw new InvalidPinException("Incorrect pin");
            myAccounts.remove(account);
        }

    }

    }
    }*/
}
