/*Q6) ⦁	Write a Program using class to process Shopping List for a Departmental Store. 
The list include details such as the Code No and Price of each item and perform the 
operations like Adding, Deleting Items to the list and Printing the Total value of a Order.*/
import java.util.Scanner;
public class Q6 {
    public static class Item {
        int code;
        double price;

        public Item(int code, double price) {
            this.code = code;
            this.price = price;
        }

        public void display() {
            System.out.println("Item code: " + code);
            System.out.println("Item price: " + price);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        int n = sc.nextInt();
        Item[] items = new Item[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the item code: ");
            int code = sc.nextInt();
            System.out.print("Enter the item price: ");
            double price = sc.nextDouble();
            items[i] = new Item(code, price);
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
