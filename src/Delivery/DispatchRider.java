package Delivery;


import InvalidNumberOfDelivery.InvalidNumberOfDelivery;

public class DispatchRider {
    public static  int calculateRidersWage(int numberOfDelivery) {
        if (numberOfDelivery < 50) {
            return numberOfDelivery * 160 + 5000;
        } else if (numberOfDelivery < 60) {
            return numberOfDelivery * 200 + 5000;
        } else if (numberOfDelivery < 70) {
            return numberOfDelivery * 250 + 5000;
        } else if (numberOfDelivery >= 70) {
            return numberOfDelivery * 500 + 5000;
        } else if (numberOfDelivery < 1 && numberOfDelivery > 100) {
           throw new InvalidNumberOfDelivery("number of delivery above range");
        }
        return 0;
    }
}
