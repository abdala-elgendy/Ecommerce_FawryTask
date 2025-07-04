package Fawry;

public abstract class Product {
    protected String name;
    protected double price;
    protected int quantity;

    public Product(String name, double price, int quantity) {
        if ( name.isEmpty() || price <= 0 || quantity < 0) {
            throw new IllegalArgumentException("Invalid product details.");
        }
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public boolean isExpired() {
        return false;
    }

    public boolean isAvailable(int requiredQuantity) {
        return quantity >= requiredQuantity && !isExpired();
    }

    public void reduceQuantity(int amount) {
        quantity -= amount;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
