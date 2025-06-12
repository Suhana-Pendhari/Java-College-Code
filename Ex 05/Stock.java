package inventory;

public class Stock {
    public Item item;
    public int quantity;

    public Stock(Item item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public void addStock(int amount) {
        quantity += amount;
        System.out.println(amount + " units added. New stock: " + quantity);
    }

    public void reduceStock(int amount) {
        if (amount <= quantity) {
            quantity -= amount;
            System.out.println(amount + " units sold. Remaining stock: " + quantity);
        } else {
            System.out.println("Insufficient stock to sell " + amount + " units.");
        }
    }

    public void stockDetails() {
        item.showItem();
        System.out.println("Current Stock: " + quantity);
    }
}
