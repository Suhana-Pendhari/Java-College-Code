import airline.Flight;
import airline.Passenger;
import airline.Ticket;

public class Q9 {
    public static void main(String[] args) {
        Flight flight = new Flight(505, "Mumbai", "Delhi", 2);
        Passenger passenger1 = new Passenger(1, "Shinchan Nohara", "P123456");
        Passenger passenger2 = new Passenger(2, "Nobita Nobi", "P654321");

        Ticket ticket1 = new Ticket(flight, passenger1, "1A");
        ticket1.bookTicket();
        ticket1.printTicket();

        Ticket ticket2 = new Ticket(flight, passenger2, "1B");
        ticket2.bookTicket();
        ticket2.printTicket();
    }
}
