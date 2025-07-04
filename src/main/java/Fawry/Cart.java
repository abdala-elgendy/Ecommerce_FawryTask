package Fawry;

import java.util.*;

public class Cart {
    private List<CartItem> items = new ArrayList<>();

    private  double totalPrice = 0.0;
    public void add(Product product, int quantity) {
        if (!product.isAvailable(quantity)) {
            throw new RuntimeException("Product out of stock or expired: " + product.getName());
        }
        totalPrice += product.getPrice() * quantity;
        items.add(new CartItem(product, quantity));
    }

    public List<CartItem> getItems() {
        return items;
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public double getSubtotal() {
        return totalPrice;

    }

    public List<Shippable> getShippableItems() {
        List<Shippable> list = new ArrayList<>();
        for (CartItem item : items) {
            if (item.product instanceof Shippable) {
                for (int i = 0; i < item.quantity; i++) {
                    list.add((Shippable) item.product);
                }
            }
        }
        return list;
    }
}
