package Fawry;

public class Customer {
    private String name;
    private double money;

    public Customer(String name, double money) {
        if(name== null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty.");
        }
        if(money < 0) {
            throw new IllegalArgumentException("Money cannot be negative.");
        }
        this.name = name;
        this.money = money;
    }

    public boolean pay(double amount) {
        if (money >= amount) {
            money -= amount;
            return true;
        }
        return false;
    }


}
