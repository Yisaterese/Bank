package EStore;

import EStore.BillingInformation;
import EStore.ShoppingCart;
import EStore.User;

import java.util.ArrayList;

public class Customer extends User {
   private final ArrayList<BillingInformation> billingInformation = new ArrayList<BillingInformation>();
   private ShoppingCart shoppingCart ;

   public Customer(String name, int age, String emailAddress, String homeAddress, String password, int phoneNumber) {
      super(name, age, emailAddress, homeAddress, password, phoneNumber);
   }

   public void buy(String nameOfProduct, int quantity, double amount){

   }
}
