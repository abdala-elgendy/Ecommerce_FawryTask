package Fawry;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        Product cheese = new ExpirableProduct("Cheese", 100, 10,200, LocalDate.now().plusDays(1));
        Product biscuits = new ExpirableProduct("Biscuits", 150, 5,700, LocalDate.now().plusDays(1));
        Product tv = new ShippableProduct("TV", 300, 3, 700);
        Product scratchCard = new Product("Scratch Card", 50, 5) {};

        Customer customer = new Customer("Abdullah", 10000);
        Cart cart = new Cart();

        cart.add(cheese, 2);
        cart.add(biscuits, 1);
        cart.add(tv, 3);
        cart.add(scratchCard, 1);

        CheckoutService.checkout(customer, cart);
    }
}