package EStore;

public class Item {
    private int quantity;
    private Product product;

    public Item(int quantity, Product product) {
        this.quantity =quantity;
        this.product =product;
    }
    public int getQuantity() {
        return quantity;
    }
}
