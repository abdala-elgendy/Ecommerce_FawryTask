package Fawry;

public class Customer {
    private String name;
    private double money;

    public Customer(String name, double money) {
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

    public double getMoney() {
        return money;
    }
}
