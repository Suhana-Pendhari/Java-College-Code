package library;

public class LibraryManagement {
    private Book[] books;
    private Member[] members;
    private int bookCount;
    private int memberCount;

    public LibraryManagement(int maxBooks, int maxMembers) {
        books = new Book[maxBooks];
        members = new Member[maxMembers];
        bookCount = 0;
        memberCount = 0;
    }

    public void addBook(int id, String title) {
        books[bookCount++] = new Book(id, title);
    }

    public void addMember(int memberId, String name) {
        members[memberCount++] = new Member(memberId, name);
    }

    public void issueBook(int bookId) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].id == bookId) {
                if (!books[i].isIssued) {
                    books[i].isIssued = true;
                    System.out.println("Book issued: " + books[i].title);
                    return;
                } else {
                    System.out.println("Book already issued.");
                    return;
                }
            }
        }
        System.out.println("Book not found.");
    }

    public void returnBook(int bookId) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].id == bookId) {
                if (books[i].isIssued) {
                    books[i].isIssued = false;
                    System.out.println("Book returned: " + books[i].title);
                    return;
                } else {
                    System.out.println("Book was not issued.");
                    return;
                }
            }
        }
        System.out.println("Book not found.");
    }

    public void displayBooks() {
        System.out.println("Books in Library:");
        for (int i = 0; i < bookCount; i++) {
            System.out.println("ID: " + books[i].id + ", Title: " + books[i].title +
                    ", Issued: " + books[i].isIssued);
        }
    }

    public void displayMembers() {
        System.out.println("Library Members:");
        for (int i = 0; i < memberCount; i++) {
            System.out.println("ID: " + members[i].memberId + ", Name: " + members[i].name);
        }
    }
}
