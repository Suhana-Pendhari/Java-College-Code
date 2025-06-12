import library.Book;
import library.Member;
import library.LibraryManagement;

public class Q1 {
    public static void main(String[] args) {
        
        LibraryManagement lib = new LibraryManagement(5, 3);

        // Using Book class to create new books (for demonstration)
        Book b1 = new Book(201, "Operating Systems");
        Book b2 = new Book(202, "Database Management");
        
        // Adding books using LibraryManagement class
        lib.addBook(b1.id, b1.title);
        lib.addBook(b2.id, b2.title);
        lib.addBook(203, "Computer Networks"); 

        Member m1 = new Member(1, "Shinchan Nohara");
        Member m2 = new Member(2, "Himawari Nohara");

        // Adding members using LibraryManagement class
        lib.addMember(m1.memberId, m1.name);
        lib.addMember(m2.memberId, m2.name);

        // Display books and members
        lib.displayBooks();
        lib.displayMembers();

        // Issue and return books
        lib.issueBook(201);   
        lib.issueBook(201);   
        lib.returnBook(201); 
        lib.returnBook(204);  

        // Final state
        lib.displayBooks();
    }
}
