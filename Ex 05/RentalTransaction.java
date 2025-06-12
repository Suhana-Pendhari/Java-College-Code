package rental;

public class RentalTransaction {
    public Vehicle vehicle;
    public Customers customer;
    public int days;

    public RentalTransaction(Vehicle vehicle, Customers customer, int days) {
        this.vehicle = vehicle;
        this.customer = customer;
        this.days = days;
    }

    public void printReceipt() {
        System.out.println("---- Rental Receipt ----");
        System.out.println("Customer Name: " + customer.name);
        System.out.println("License No   : " + customer.licenseNumber);
        System.out.println("Vehicle Model: " + vehicle.model);
        System.out.println("Rent/Day     : " + vehicle.rentPerDay);
        System.out.println("Total Days   : " + days);
        double total = days * vehicle.rentPerDay;
        System.out.println("Total Rent   : " + total);
        System.out.println("------------------------");
    }
}
