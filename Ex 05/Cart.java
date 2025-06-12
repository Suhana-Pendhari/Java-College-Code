package shopping;

public class Cart {
    public Product[] products;
    public int[] quantities;
    public int count;

    public Cart() {
        products = new Product[5];   // fixed size cart
        quantities = new int[5];
        count = 0;
    }

    public void addProduct(Product p, int qty) {
        if (count < products.length) {
            products[count] = p;
            quantities[count] = qty;
            count++;
            System.out.println(p.name + " added to cart.");
        } else {
            System.out.println("Cart is full.");
        }
    }

    public void showCart() {
        System.out.println("---- Cart Items ----");
        for (int i = 0; i < count; i++) {
            System.out.println(products[i].name + " x " + quantities[i] + " = " + (products[i].price * quantities[i]));
        }
    }
}
