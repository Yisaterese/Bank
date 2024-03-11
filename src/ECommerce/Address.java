package ECommerce;

public class Address {
    private String country;
    private String city;
    private String street;
    private String state;
    private int houseNumber;

    public Address(String country, String state, String city, String street, int houseNumber) {
        this.city = city;
        this.country = country;
        this.state = state;
        this.street = street;

    }
}
