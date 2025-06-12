/*Q8)Write a program to design a class representing theinformation 
regarding digital library (books, tape: book & tape should be separate 
classes having the base class as media).The class should have the functionality 
for adding new item, issuing, deposit etc.
 */

import java.util.Scanner;

public class Q8 {
    public static class Media {
        String title;
        double price;
    }
    static class Book extends Media {
        String author;
    }
    static class Tape extends Media {
    }
    static class Library {
        Book[] books;
        Tape[] tapes;

        public Library(Book[] books, Tape[] tapes) {
            this.books = books;
            this.tapes = tapes;
        }

        public void display() {
            System.out.println("Books:");
            for (int i = 0; i < books.length; i++) {
                System.out.println("Title: " + books[i].title);
                System.out.println("Author: " + books[i].author);
                System.out.println("Price: " + books[i].price);
            }
            System.out.println("Tapes:");
            for (int i = 0; i < tapes.length; i++) {
                System.out.println("Title: " + tapes[i].title);
                System.out.println("Price: " + tapes[i].price);
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of books: ");
        int n = sc.nextInt();
        Book[] books = new Book[n];
        for (int i = 0; i < n; i++) {
            books[i] = new Book();
            System.out.print("Enter the title of the book: ");
            books[i].title = sc.next();
            System.out.print("Enter the author of the book: ");
            books[i].author = sc.next();
            System.out.print("Enter the price of the book: ");
            books[i].price = sc.nextDouble();
        }
        System.out.print("Enter the number of tapes: ");
        int m = sc.nextInt();
        Tape[] tapes = new Tape[m];
        for (int i = 0; i < m; i++) {
            tapes[i] = new Tape();
            System.out.print("Enter the title of the tape: ");
            tapes[i].title = sc.next();
            System.out.print("Enter the price of the tape: ");
            tapes[i].price = sc.nextDouble();
        }
        Library library = new Library(books, tapes);
        library.display();
    }
}
