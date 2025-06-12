import shopping.Product;
import shopping.Cart;
import shopping.Order;

public class Q5 {
    public static void main(String[] args) {
        // Create products
        Product p1 = new Product(1, "Laptop", 45000);
        Product p2 = new Product(2, "Mouse", 500);
        Product p3 = new Product(3, "Keyboard", 800);

        // Create cart and add products
        Cart cart = new Cart();
        cart.addProduct(p1, 1);
        cart.addProduct(p2, 2);
        cart.addProduct(p3, 1);

        cart.showCart();

        // Process order
        Order order = new Order();
        order.processOrder(cart);
    }
}
