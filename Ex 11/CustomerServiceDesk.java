import java.util.LinkedList;
import java.util.Scanner;

public class CustomerServiceDesk {
    private LinkedList<String> customerQueue;

    public CustomerServiceDesk() {
        customerQueue = new LinkedList<>();
    }

    // Method to add a new customer to the end of the queue
    public void addCustomer(String customerName) {
        customerQueue.addLast(customerName);
        System.out.println(customerName + " has joined the queue. Position: " + customerQueue.size());
    }

    // Method to serve the next customer (remove from front of queue)
    public void serveNextCustomer() {
        if (customerQueue.isEmpty()) {
            System.out.println("No customers in the queue.");
        } else {
            String customer = customerQueue.removeFirst();
            System.out.println("Now serving: " + customer);
        }
    }

    // Method to check who is next in line without removing them
    public void checkNextCustomer() {
        if (customerQueue.isEmpty()) {
            System.out.println("No customers in the queue.");
        } else {
            String nextCustomer = customerQueue.peekFirst();
            System.out.println("Next customer to be served: " + nextCustomer);
        }
    }

    // Method to display the current queue
    public void displayQueue() {
        if (customerQueue.isEmpty()) {
            System.out.println("The queue is currently empty.");
        } else {
            System.out.println("Current queue:");
            for (int i = 0; i < customerQueue.size(); i++) {
                System.out.println((i + 1) + ". " + customerQueue.get(i));
            }
        }
    }

    public static void main(String[] args) {
        CustomerServiceDesk serviceDesk = new CustomerServiceDesk();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Customer Service Desk System");
        System.out.println("----------------------------");
        
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add new customer to queue");
            System.out.println("2. Serve next customer");
            System.out.println("3. Check next customer");
            System.out.println("4. View current queue");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline
            
            switch (choice) {
                case 1:
                    System.out.print("Enter customer name: ");
                    String name = scanner.nextLine();
                    serviceDesk.addCustomer(name);
                    break;
                case 2:
                    serviceDesk.serveNextCustomer();
                    break;
                case 3:
                    serviceDesk.checkNextCustomer();
                    break;
                case 4:
                    serviceDesk.displayQueue();
                    break;
                case 5:
                    System.out.println("Closing the service desk. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}