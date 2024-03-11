package ECommerce;

import java.util.ArrayList;

public class EStore extends ECommerce {
    private final ArrayList<Store>stores = new ArrayList<>();
    private String name;
    private int id = 1;
    public void sell(String productName, double price, int quantity) {

    }

    @Override
    public Product buy(String productName, int quantity) {
        return null;
    }

    public Store register(String storeName, String country, String state, String city, String street, int houseNumber) {
        Store myStore = new Store(storeName, country,state, city, street, houseNumber);
        stores.add(myStore);
        myStore.setId(id++);
        return myStore;
    }

    public int getNumberOfStoresAvailable(){
        return stores.size();
    }

    public Store search(String storeName) {
        for(Store store : stores){
            if(store.getStoreName().equals(storeName))
                return store;
        }
        throw new InvalidStoreException("Invalid store name");
    }
}
