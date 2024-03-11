package ECommerce;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EStoreTest {
    @Test
    public void  registerStores(){
        EStore eStore = new EStore();
        eStore.register("Leisure stores", "Nigeria", "Lagos", "Lagos City", "Ogunlayi Abiodun str", 45 );
        eStore.register("Lenux stores ", "Nigeria", "Lagos", "Lagos City", "Ogunlayi Abiodun str", 45 );
        assertEquals(2,eStore.getNumberOfStoresAvailable());
    }

    @Test
    public void  searchForStoresByName(){
        EStore eStore = new EStore();
        Store store1 =  eStore.register("Leisure stores", "Nigeria", "Lagos", "Lagos City", "Ogunlayi Abiodun str", 45 );
        Store store2 = eStore.register("Lenux stores ", "Nigeria", "Lagos", "Lagos City", "Ogunlayi Abiodun str", 45 );
        assertEquals(store1,eStore.search("Leisure stores"));
    }

    @Test
    public void  searchForStoresWithWrongName_throwInvalidStoreNameException(){
        EStore eStore = new EStore();
        Store store1 =  eStore.register("Leisure stores", "Nigeria", "Lagos", "Lagos City", "Ogunlayi Abiodun str", 45 );
        Store store2 = eStore.register("Lenux stores ", "Nigeria", "Lagos", "Lagos City", "Ogunlayi Abiodun str", 45 );
        assertThrows(InvalidStoreException.class,() -> eStore.search("Leisure "));
    }

}
