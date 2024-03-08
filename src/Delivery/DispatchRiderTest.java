package Delivery;

import InvalidNumberOfDelivery.InvalidNumberOfDeliveryException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DispatchRiderTest {
    @Test
    public void ridersSuccessfulDeliveryIs80_wageIs45000(){
        assertEquals(45000, DispatchRider.calculateRidersWage(80));
    }

    @Test
    public void ridersSuccessfulDeliveryIsAboveRange_throwInvalidNumberOfDelivery(){
        assertThrows(InvalidNumberOfDeliveryException.class, () ->  DispatchRider.calculateRidersWage(122));
    }
    @Test
    public void ridersSuccessfulDeliveryIs25_wageIs9000(){
        assertEquals(9000, DispatchRider.calculateRidersWage(25));
    }
}
