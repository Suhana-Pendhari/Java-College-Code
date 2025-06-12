package rental;

public class Vehicle {
    public int id;
    public String model;
    public double rentPerDay;

    public Vehicle(int id, String model, double rentPerDay) {
        this.id = id;
        this.model = model;
        this.rentPerDay = rentPerDay;
    }
}
