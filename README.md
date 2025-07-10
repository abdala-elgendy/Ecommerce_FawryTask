# Ecommerce Task

A simple Java console-based e-commerce task demonstrating core concepts of object-oriented programming, including inheritance, interfaces, encapsulation, and basic shopping cart functionality. This project simulates a minimal online shopping and checkout experience, including product expiry, shipping, and payment validation.

## Features

- **Product Management:** Supports expirable and shippable products.
- **Customer and Cart:** Allows adding products to cart, checks for stock and expiry, and manages customer balance.
- **Checkout Process:** Calculates subtotal, shipping fee, and processes payment.
- **Shipping Service:** Ships eligible products and prints shipment details.
- **Extensible Design:** Demonstrates proper use of abstract classes and interfaces.

## Code Structure

### Main Classes

- `Product` (abstract): Base class for all products.
- `ExpirableProduct`: Products with an expiration date and weight.
- `ShippableProduct`: Shippable product with weight.
- `Cart` & `CartItem`: Manage cart items, quantities, and subtotal.
- `Customer`: Represents a user with a balance.
- `CheckoutService`: Handles checkout, payment, and shipping.
- `ShippingService`: Handles shipping logic for shippable products.

### Interface

- `Shippable`: For products that can be shipped, requiring a `getWeight()` method.

### Example Usage

```java
Product cheese = new ExpirableProduct("Cheese", 100, 10, 200, LocalDate.now().plusDays(1));
Product tv = new ShippableProduct("TV", 300, 3, 700);
Product scratchCard = new Product("Scratch Card", 50, 5) {}; // Not shippable

Customer customer = new Customer("Abdullah", 10000);
Cart cart = new Cart();

cart.add(cheese, 2);
cart.add(tv, 3);
cart.add(scratchCard, 1);

CheckoutService.checkout(customer, cart);
```

## How It Works

1. **Add Products:** Add products to the cart if they're in stock and not expired.
2. **Checkout:** The customer pays for the items. If any item is shippable, a shipping fee is added.
3. **Shipping:** Shippable items are grouped and shipped, showing total weight and item breakdown.
4. **Receipt:** A summary of the purchase is printed, including subtotal, shipping, and total amount.

this is the output of some data 

[https://github.com/abdala-elgendy/Ecommerce_FawryTask/blob/master/img.png]
