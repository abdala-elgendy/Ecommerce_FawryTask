package Fawry;

import java.time.LocalDate;

public class ExpirableProduct extends Product implements Shippable {

    private LocalDate expiryDate;
    private double weight;
    public ExpirableProduct(String name, double price, int quantity, double weight,LocalDate expiryDate) {
        super(name, price, quantity);
     if(expiryDate == null || expiryDate.isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("Expiry date must have a valid future date.");
        }
     if(weight <= 0 ) {
            throw new IllegalArgumentException("Weight should be greater than zero.");
        }
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
