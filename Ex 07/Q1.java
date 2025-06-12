// 1. Create a Personal Notes Manager where users can write, save, and read notes using 
// FileWriter and FileReader.

// import java.io.FileWriter;
// import java.io.FileReader;
// import java.io.IOException;
import java.io.*;
import java.util.Scanner;

public class Q1 {
    private static final String FILE_NAME = "notes.txt";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Personal Notes Manager ---");
            System.out.println("1. Write a new note");
            System.out.println("2. Read saved notes");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    writeNote(scanner);
                    break;
                case 2:
                    readNotes();
                    break;
                case 3:
                    System.out.println("Exiting Notes Manager. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose 1, 2 or 3.");
            }
        } while (choice != 3);

        scanner.close();
    }

    public static void writeNote(Scanner scanner) {
        System.out.println("Enter your note (type 'end' in a new line to save):");
        StringBuilder note = new StringBuilder();
        String line;

        while (!(line = scanner.nextLine()).equalsIgnoreCase("end")) {
            note.append(line).append("\n");
        }

        try (FileWriter writer = new FileWriter(FILE_NAME, true)) {
            writer.write(note.toString());
            writer.write("-------------------------------\n");
            System.out.println("Note saved successfully.");
        } catch (IOException e) {
            System.out.println("Error saving note: " + e.getMessage());
        }
    }

    public static void readNotes() {
        try (FileReader reader = new FileReader(FILE_NAME)) {
            int ch;
            System.out.println("\n--- Saved Notes ---");
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
            System.out.println("\n--------------------");
        } catch (IOException e) {
            System.out.println("Error reading notes: " + e.getMessage());
        }
    }
}
