package dispactRider;


import InvalidNumberOfDelivery.InvalidNumberOfDeliveryException;

public class DispatchRider {
    public static int calculateRidersWage(int numberOfDelivery) {
        if (numberOfDelivery < 1 || numberOfDelivery > 100) {
            throw new InvalidNumberOfDeliveryException("number of delivery above range");
        }else if (numberOfDelivery < 50) {
            return numberOfDelivery * 160 + 5000;
        } else if (numberOfDelivery < 60) {
            return numberOfDelivery * 200 + 5000;
        } else if (numberOfDelivery < 70) {
            return numberOfDelivery * 250 + 5000;
        } else if (numberOfDelivery >= 70) {
            return numberOfDelivery * 500 + 5000;
        }
        return 0;
    }
}
