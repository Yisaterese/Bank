package apps;

public class MyAccount {
    private String name;
    private int balance;
    private String pin;
    private int accountNumber;

    public MyAccount(String name){

    }
    public void deposit(int depositAmount) {
        balance += depositAmount;
    }

    public Object checkBalance(String  myCorrectPin) {
        return balance;
    }

    public  void withdraw(int withdrawAmount, String theCorrectPin) {
        balance -= withdrawAmount;
    }
}
