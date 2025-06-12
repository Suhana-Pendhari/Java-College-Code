import hotel.Room;
import hotel.Guest;
import hotel.Booking;

public class Q8 {
    public static void main(String[] args) {
        Room room = new Room(101, "Burj Khalifa", 2500);
        Guest guest = new Guest(1, "Suhana Pendhari", 29);

        Booking booking = new Booking(room, guest, 3);

        booking.bookingDetails();
        booking.checkIn();
        booking.bookingDetails();
        booking.checkOut();
        booking.bookingDetails();
    }
}
