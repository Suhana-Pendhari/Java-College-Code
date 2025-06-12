package hotel;

public class Booking {
    public Room room;
    public Guest guest;
    public int nights;
    public boolean checkedIn;

    public Booking(Room room, Guest guest, int nights) {
        this.room = room;
        this.guest = guest;
        this.nights = nights;
        this.checkedIn = false;
    }

    public void checkIn() {
        if (room.isAvailable) {
            room.isAvailable = false;
            checkedIn = true;
            System.out.println("Check-in successful for " + guest.name);
        } else {
            System.out.println("Room is not available for check-in.");
        }
    }

    public void checkOut() {
        if (checkedIn) {
            room.isAvailable = true;
            double bill = nights * room.pricePerNight;
            System.out.println("Check-out successful. Total bill: ₹" + bill);
        } else {
            System.out.println("Guest has not checked in.");
        }
    }

    public void bookingDetails() {
        System.out.println("---- Booking Details ----");
        System.out.println("Guest: " + guest.name + ", Age: " + guest.age);
        System.out.println("Room: " + room.roomNumber + " (" + room.type + ")");
        System.out.println("Nights: " + nights);
        System.out.println("Price/Night: ₹" + room.pricePerNight);
        System.out.println("Checked In: " + (checkedIn ? "Yes" : "No"));
        System.out.println("--------------------------");
    }
}
