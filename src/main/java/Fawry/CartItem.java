package Fawry;

public class CartItem {
    public Product product ;
    public int quantity;

    public CartItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public String getName() {
        return product.getName();
    }


    public double getPrice() {
        return product.getPrice() * quantity;
    }

}
