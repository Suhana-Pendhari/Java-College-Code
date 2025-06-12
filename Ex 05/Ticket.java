package airline;

public class Ticket {
    public Flight flight;
    public Passenger passenger;
    public String seatNumber;
    public boolean isConfirmed;

    public Ticket(Flight flight, Passenger passenger, String seatNumber) {
        this.flight = flight;
        this.passenger = passenger;
        this.seatNumber = seatNumber;
        this.isConfirmed = false;
    }

    public void bookTicket() {
        if (flight.isSeatAvailable()) {
            flight.allocateSeat();
            isConfirmed = true;
            System.out.println("Ticket booked successfully for " + passenger.name);
        } else {
            System.out.println("No seats available on Flight " + flight.flightNumber);
        }
    }

    public void printTicket() {
        System.out.println("----- Ticket Details -----");
        System.out.println("Passenger: " + passenger.name);
        System.out.println("Passport No: " + passenger.passportNumber);
        System.out.println("Flight No: " + flight.flightNumber);
        System.out.println("From: " + flight.origin + " To: " + flight.destination);
        System.out.println("Seat: " + seatNumber);
        System.out.println("Status: " + (isConfirmed ? "Confirmed" : "Not Confirmed"));
        System.out.println("--------------------------");
    }
}
