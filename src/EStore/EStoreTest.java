package EStore;

import EStore.EStore;
import org.junit.Test;

import static EStore.ProductCategory.GROCERIES;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EStoreTest {
    @Test
    public void registerUsersToEStore(){
        EStore eStore = new EStore();
        Customer customer = new Customer("Ada", 22, "josephterese@gamil.com", "No 4 ogunlabi street Lekki lagos", "password", 1);
        eStore.registerCustomer(customer);
        assertEquals( 1, eStore.getNumberOfUsers());
    }

    @Test
    public void customerBuysAProduct_numberOfProductsInStoreDecrease(){
         EStore eStore = new EStore();
         Customer customer1 = new Customer("Adekunle",34, "adekunle@gmail.com", "N0 23 moshuud str Mushin lagos stae", "password", 2);
         Customer customer2 = new Customer("Adesanya",50, "adesanya@gmail.com", "N0 2 Babalola str Ogun state", "password", 2);
         eStore.registerCustomer(customer1);
         eStore.registerCustomer(customer2);
         Product product1 = new Product("Orange", 200, "sweet like fanta", GROCERIES);
         Item item1 = new Item(2, product1);
         eStore.addProductToStore(product1);
         ShoppingCart shoppingCart = new ShoppingCart(item1);
         customer1.buy(product1);
         eStore.buyProduct(customer1,product1);




    }
}
