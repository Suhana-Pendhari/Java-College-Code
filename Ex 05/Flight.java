package airline;

public class Flight {
    public int flightNumber;
    public String origin;
    public String destination;
    public int totalSeats;
    public int bookedSeats;

    public Flight(int flightNumber, String origin, String destination, int totalSeats) {
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.destination = destination;
        this.totalSeats = totalSeats;
        this.bookedSeats = 0;
    }

    public boolean isSeatAvailable() {
        return bookedSeats < totalSeats;
    }

    public void allocateSeat() {
        if (isSeatAvailable()) {
            bookedSeats++;
        }
    }
}
