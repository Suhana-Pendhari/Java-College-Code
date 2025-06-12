import rental.Vehicle;
import rental.Customers;
import rental.RentalTransaction;

public class Q6 {
    public static void main(String[] args) {
        // Create vehicle
        Vehicle v = new Vehicle(101, "Maruti Swift", 1200);

        // Create customer
        Customers c = new Customers(1, "Suhana Pendhari", "MH12AB1234");

        // Create rental transaction
        RentalTransaction rt = new RentalTransaction(v, c, 4); // 4-day rental

        // Print receipt
        rt.printReceipt();
    }
}
