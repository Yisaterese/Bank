package EStore;

import java.util.ArrayList;
import java.util.List;

public class User {
    private int age;
    private String emailAddress;
    private String homeAddress;
    private String name;
    private String password;
    private int phone;

   // private List<ShoppingCart> shoppingCartList = new ArrayList<EStore.ShoppingCart>();
    public User(String name,int age, String emailAddress, String homeAddress, String password, int phoneNumber ){
        this.name = name;
        this.age = age;
        this.emailAddress = emailAddress;
        this.homeAddress = homeAddress;
        this.password = password;
        this.phone = phoneNumber;

    }

    public void buy(Product product, double price,int quantity){

    }
}

