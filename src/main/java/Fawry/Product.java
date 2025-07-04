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
        return quantity >= requiredQuantity && requiredQuantity > 0 && !isExpired();
    }

    public void reduceQuantity(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount to reduce must be greater than zero.");
        }
        quantity -= amount;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
