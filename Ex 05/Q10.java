import inventory.Item;
import inventory.Stock;
import inventory.Supplier;

public class Q10 {
    public static void main(String[] args) {
        Item item = new Item(101, "USB Cable", 150);
        Supplier supplier = new Supplier(1, "Tech Supplies Co.", "9876543210");
        Stock stock = new Stock(item, 50);

        System.out.println("--- Inventory Management ---");
        supplier.showSupplier();
        stock.stockDetails();

        stock.addStock(20);
        stock.reduceStock(30);
        stock.stockDetails();
    }
}
