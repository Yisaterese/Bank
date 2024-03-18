package EStore;

import java.util.ArrayList;
import java.util.List;

public class EStore {
private List<User> users = new ArrayList<>();
private List<Item> items = new ArrayList<>();
    public void registerCustomer(Customer customer) {
        users.add(customer);
    }

    public int getNumberOfUsers() {
        return users.size();
    }
    public void updateProducts(){

    }

    public void buyProduct(Customer customer, Product product) {

    }
}
