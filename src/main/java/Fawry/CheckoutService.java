package Fawry;

import java.util.List;

public class CheckoutService {
    public static void checkout(Customer customer, Cart cart) {
        if (cart.isEmpty()) throw new RuntimeException("Cart is empty");

        double subtotal = cart.getSubtotal();
        double shippingFee = cart.getShippableItems().isEmpty() ? 0 : 30;
        double total = subtotal + shippingFee;

        if (!customer.pay(total)) {
            throw new RuntimeException("Insufficient balance");
        }

        for (CartItem item : cart.getItems()) {
            item.product.reduceQuantity(item.quantity);
        }

        List<Shippable> toShip = cart.getShippableItems();
        if (!toShip.isEmpty()) {
            ShippingService.ship(toShip);
        }

        System.out.println("** Checkout receipt **");
        for (CartItem item : cart.getItems()) {
            System.out.println(item.quantity + "x " + item.product.getName() + "\t" + item.getPrice());
        }

        System.out.println("----------------------");
        System.out.println("Subtotal\t" + subtotal);
        System.out.println("Shipping\t" + shippingFee);
        System.out.println("Amount\t\t" + total);
    }
}

