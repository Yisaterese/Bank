package apps;

import java.util.ArrayList;

public class MyBank {
    private final ArrayList<MyAccount> myAccountList = new ArrayList<>();
    public void registerCustomer(String firstName, String lastName, String pin) {
       MyAccount myAccount =  new MyAccount(firstName + " " +lastName, "correctPin");
       myAccountList.add(myAccount);
   }

    public int findAccount(int accountNumber){
        for(MyAccount accounts: myAccountList){
            if(accounts.getAccountNumber() == accountNumber)
        }
    }
}
