package Fawry;

import java.time.LocalDate;

public class ExpirableProduct extends Product implements Shippable {
    private LocalDate expiryDate;

   private double weight;
    public ExpirableProduct(String name, double price, int quantity, double weight,LocalDate expiryDate) {
        super(name, price, quantity);
        this.expiryDate = expiryDate;
        this.weight = weight;
    }

    @Override
    public boolean isExpired() {
        return LocalDate.now().isAfter(expiryDate);
    }

    @Override
    public double getWeight() {
        return weight;
    }
}
