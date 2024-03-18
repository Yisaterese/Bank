package EStore;

public class Product {
    private int id;
    private String productName;
    private double price;
    private String productDescription;
    private ProductCategory productCategory;

    public Product(int id, String productName, double price, String productDescription, ProductCategory productCategory ){
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.productDescription = productDescription;
        this.productCategory = productCategory;

    }


}
