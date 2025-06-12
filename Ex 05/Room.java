package hotel;

public class Room {
    public int roomNumber;
    public String type;
    public double pricePerNight;
    public boolean isAvailable;

    public Room(int roomNumber, String type, double pricePerNight) {
        this.roomNumber = roomNumber;
        this.type = type;
        this.pricePerNight = pricePerNight;
        this.isAvailable = true;
    }
}
