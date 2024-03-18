package EStore;

import java.util.ArrayList;
import java.util.List;

public class EStore {
private List<User> users = new ArrayList<>();
    public Customer registerCustomer(Customer customer) {
        users.add(customer);
        return  customer;
    }

    public int getNumberOfUsers() {
        return users.size();
    }
    public void updateProducts(){

    }

    public void buy() {
    }
}
