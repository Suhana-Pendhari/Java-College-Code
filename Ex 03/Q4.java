/*Q4)Write a Java program to define a base class Item (item-no, name, price). 
Derive a class Discounted-Item (discount-percent). A customer purchases 'n' items.
 Display the item-wise bill and total amount using appropriate format.
 */
import java.util.Scanner;

public class Q4 {
    public static class Item {
        int item_no;
        String name;
        double price;

        public Item(int item_no, String name, double price) {
            this.item_no = item_no;
            this.name = name;
            this.price = price;
        }

        public void display() {
            System.out.println("Item number: " + item_no);
            System.out.println("Item name: " + name);
            System.out.println("Item price: " + price);
        }
    }
    class DiscountedItem extends Item {
        double discount_percent;

        public DiscountedItem(int item_no, String name, double price, double discount_percent) {
            super(item_no, name, price);
            this.discount_percent = discount_percent;
        }

        public void display() {
            super.display();
            System.out.println("Discount percent: " + discount_percent);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        int n = sc.nextInt();
        Item[] items = new Item[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the item number: ");
            int item_no = sc.nextInt();
            System.out.print("Enter the item name: ");
            String name = sc.next();
            System.out.print("Enter the item price: ");
            double price = sc.nextDouble();
            items[i] = new Item(item_no, name, price);
        }
        double total = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Item " + (i + 1) + ":");
            items[i].display();
            total += items[i].price;
        }
        System.out.println("Total amount: " + total);
    }
}
