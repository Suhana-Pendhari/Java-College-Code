package library;

public class Book {
    public int id;
    public String title;
    public boolean isIssued;

    public Book(int id, String title) {
        this.id = id;
        this.title = title;
        this.isIssued = false;
    }
}
