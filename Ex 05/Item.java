package inventory;

public class Item {
    public int itemId;
    public String itemName;
    public double price;

    public Item(int itemId, String itemName, double price) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.price = price;
    }

    public void showItem() {
        System.out.println("Item ID: " + itemId + ", Name: " + itemName + ", Price: ₹" + price);
    }
}
