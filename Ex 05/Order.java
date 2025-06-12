package shopping;

public class Order {
    public void processOrder(Cart cart) {
        double total = 0;
        System.out.println("---- Order Summary ----");
        for (int i = 0; i < cart.count; i++) {
            Product p = cart.products[i];
            int qty = cart.quantities[i];
            double amount = p.price * qty;
            System.out.println(p.name + " x " + qty + " = " + amount);
            total += amount;
        }
        System.out.println("Total Amount: " + total);
        System.out.println("Order placed successfully!");
    }
}
