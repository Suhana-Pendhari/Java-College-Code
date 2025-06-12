/*5. You have been assigned the task of designing an interface for a library 
management system using Java. The system should provide functionality for 
managing books, library members, and transactions. */

import java.util.Scanner;

interface LibraryManagement {
    void addBook(String title, String author);
    void issueBook(String bookTitle, String memberId);
    void returnBook(String bookTitle, String memberId);
    void registerMember(String memberId, String name);
}

class Library implements LibraryManagement {
    private String[][] books = new String[100][2]; // Stores book title and author
    private String[][] members = new String[100][2]; // Stores member ID and name
    private String[][] issuedBooks = new String[100][2]; // Stores book title and member ID
    private int bookCount = 0, memberCount = 0, issuedCount = 0;
    
    public void addBook(String title, String author) {
        books[bookCount][0] = title;
        books[bookCount][1] = author;
        bookCount++;
        System.out.println("Book added: " + title + " by " + author);
    }
    
    public void registerMember(String memberId, String name) {
        members[memberCount][0] = memberId;
        members[memberCount][1] = name;
        memberCount++;
        System.out.println("Member registered: " + name + " (ID: " + memberId + ")");
    }
    
    public void issueBook(String bookTitle, String memberId) {
        if (findBook(bookTitle) && findMember(memberId) && !isBookIssued(bookTitle)) {
            issuedBooks[issuedCount][0] = bookTitle;
            issuedBooks[issuedCount][1] = memberId;
            issuedCount++;
            System.out.println("Book issued: " + bookTitle + " to member " + memberId);
        } else {
            System.out.println("Cannot issue book: " + bookTitle);
        }
    }
    
    public void returnBook(String bookTitle, String memberId) {
        for (int i = 0; i < issuedCount; i++) {
            if (issuedBooks[i][0].equals(bookTitle) && issuedBooks[i][1].equals(memberId)) {
                issuedBooks[i][0] = issuedBooks[issuedCount - 1][0];
                issuedBooks[i][1] = issuedBooks[issuedCount - 1][1];
                issuedCount--;
                System.out.println("Book returned: " + bookTitle);
                return;
            }
        }
        System.out.println("Invalid return attempt for book: " + bookTitle);
    }
    
    private boolean findBook(String title) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i][0].equals(title)) {
                return true;
            }
        }
        return false;
    }
    
    private boolean findMember(String memberId) {
        for (int i = 0; i < memberCount; i++) {
            if (members[i][0].equals(memberId)) {
                return true;
            }
        }
        return false;
    }
    
    private boolean isBookIssued(String title) {
        for (int i = 0; i < issuedCount; i++) {
            if (issuedBooks[i][0].equals(title)) {
                return true;
            }
        }
        return false;
    }
}

public class Q5 {
    public static void main(String[] args) {
        System.out.println("Library Management System");
        LibraryManagement library = new Library();
        Scanner sc = new Scanner(System.in);
        int ch;
        System.out.println("1. Add book");
        System.out.println("2. Issue book");
        System.out.println("3. Return book");
        System.out.println("4. Register member");
        System.out.println("5. Exit");
        do{
            System.out.print("Enter choice: ");
            ch = sc.nextInt();
            switch(ch){
                case 1:
                    System.out.print("Enter book title: ");
                    String title = sc.next();
                    System.out.print("Enter author: ");
                    String author = sc.next();
                    library.addBook(title, author);
                    break;

                case 2:
                    System.out.print("Enter book title: ");
                    String bookTitle = sc.next();
                    System.out.print("Enter member ID: ");
                    String memberId = sc.next();
                    library.issueBook(bookTitle, memberId);
                    break;

                case 3:
                    System.out.print("Enter book title: ");
                    bookTitle = sc.next();
                    System.out.print("Enter member ID: ");
                    memberId = sc.next();
                    library.returnBook(bookTitle, memberId);
                    break;

                case 4:
                    System.out.print("Enter member ID: ");
                    memberId = sc.next();
                    System.out.print("Enter name: ");
                    String name = sc.next();
                    library.registerMember(memberId, name);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default: System.out.println("Invalid choice!");
            }
        }while(ch != 5);
    }
}

