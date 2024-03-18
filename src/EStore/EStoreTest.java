package EStore;

import EStore.EStore;
import org.junit.Test;
import EStore.test.Customer;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EStoreTest {
    @Test
    public void registerUsersToEStore(){
        EStore eStore = new EStore();
        eStore.registerCustomer("Ada", 22, "josephterese@gamil.com", "No 4 ogunlabi street Lekki lagos", "password", 1);
        assertEquals( 1, eStore.getNumberOfUsers());
    }

    @Test
    public void userBuysAProduct(){
         EStore eStore = new EStore();
         Customer customer1 = new Customer("Adekunle",34, "adekunle@gmail.com", "N0 23 moshuud str Mushin lagos stae", "password", 2);
         Customer customer2 = new Customer("Adesanya",50, "adesanya@gmail.com", "N0 2 Babalola str Ogun state", "password", 2);
         eStore.registerCustomer(customer1);
         eStore.registerCustomer(customer2);
         Product product = new Product();
         eStore.buy(customer1, product);



    }
}
