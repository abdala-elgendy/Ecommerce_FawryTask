package Fawry;

public class ShippableProduct extends Product implements Shippable {
    private double weight;

    public ShippableProduct(String name, double price, int quantity, double weight) {
        super(name, price, quantity);
        if(weight <= 0 ) {
            throw new IllegalArgumentException("weight should be greater than zero.");
        }

        this.weight = weight;
    }

    @Override
    public double getWeight() {
        return weight;
    }
}
