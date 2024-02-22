package apps;

import java.util.ArrayList;

public class MyBank {
    private final ArrayList<MyAccount> myAccountList = new ArrayList<>();
    public void registerCustomer(String firstName, String lastName, String pin) {
       MyAccount myAccount =  new MyAccount(firstName + " " +lastName, pin);
       myAccountList.add(myAccount);
   }

    public MyAccount findAccount(int accountNumber){
        for(MyAccount account: myAccountList){
            if(account.getAccountNumber() == accountNumber){
                return account;
            }
        }
        return null;
    }
}
