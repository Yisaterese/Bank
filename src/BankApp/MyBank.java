package BankApp;

import apps.InvalidPinException;

import javax.swing.*;
import java.util.ArrayList;

public class MyBank {

    public MyAccount registerCustomer(String firstName, String lastName, String pin) {
       MyAccount myAccount =  new MyAccount(firstName + " " +lastName, pin);
       myAccount.setAccountNumber(generateAccountNumber());
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


    public void transfer( int senderAccountNumber, int recipientAccountNumber, int transferAmount,String correctPin) {
        for (MyAccount myAccount : myAccounts) {
            if (isValid(senderAccountNumber, myAccount)) {
                myAccount.withdraw(transferAmount, correctPin);
            }
            if (isValid(recipientAccountNumber, myAccount)) {
                myAccount.deposit(transferAmount);
            }

        }

    }
public int generateAccountNumber(){
     return    this.accountNumber++;
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

    private boolean accountCreated;
    private boolean isValidating(int accountNumber){
        for(MyAccount account: myAccounts)
            if(account.getAccountNumber() == accountNumber)
                return true;
        throw new InvalidAccountException("Incorrect account number");
    }
    private   int accountNumber = 1234567890;
    private int  numberOfAccounts;



    public void executeMain() {
        MyAccount myAccount = new MyAccount("hamzat", "correctPin");
        JOptionPane.showMessageDialog(null, " Welcome to FUNDFIX BANK");
        while (true) {
            String[] options = {"Create Account", "Deposit", "Withdraw", "Transfer", "Check Balance", "Close Account", "Exit"};

            int selection = JOptionPane.showOptionDialog(null, "Select an option:", "Bank App",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

            switch (selection) {
                case 0:
                    createAccount();
                    break;
                case 1:
                   depositToAccount();
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Withdrawing...");
                    break;
                case 3:
                    // Transfer
                    JOptionPane.showMessageDialog(null, "Transferring...");
                    break;
                case 4:
                    // Check Balance
                    JOptionPane.showMessageDialog(null, "Checking Balance...");
                    break;
                case 5:
                    // Close Account
                    JOptionPane.showMessageDialog(null, "Closing Account...");
                    break;
                case 6:
                    // Exit
                    JOptionPane.showMessageDialog(null, "Exiting...");
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid option selected.");
                    break;
            }
        }

    }

    private void depositToAccount() {
        if (accountCreated) {
            String stringDepositAmount = JOptionPane.showInputDialog(null, "Enter deposit amount");
            int depositAmount = Integer.parseInt(stringDepositAmount);
            deposit(depositAmount, generateAccountNumber());
            JOptionPane.showMessageDialog(null, "Deposit successful");
        } else {
            JOptionPane.showMessageDialog(null, "you have not created an account");
            createAccount();
        }
    }

    private void createAccount() {
        String firstName = JOptionPane.showInputDialog(null,"Enter your first name");
        String lastName = JOptionPane.showInputDialog(null,"Enter your last name");
        String pin = JOptionPane.showInputDialog(null,"Enter your pin");
        registerCustomer(firstName,lastName,pin);
        accountCreated = true;
        JOptionPane.showMessageDialog(null,"Hello "+firstName+" "+lastName+ ",your account number is: "+generateAccountNumber());

    }

}









