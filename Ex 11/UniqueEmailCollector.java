import java.util.HashSet;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class UniqueEmailCollector {
    private HashSet<String> emailSet;

    public UniqueEmailCollector() {
        emailSet = new HashSet<>();
    }

    // Method to add email from user input
    public void addEmailFromInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter email address: ");
        String email = scanner.nextLine().trim();
        
        if (emailSet.contains(email)) {
            System.out.println("Email already exists in the collection.");
        } else {
            emailSet.add(email);
            System.out.println("Email added successfully.");
        }
    }

    // Method to import emails from file
    public void importEmailsFromFile(String filename) {
        try {
            File file = new File(filename);
            Scanner fileScanner = new Scanner(file);
            int addedCount = 0;
            int duplicateCount = 0;

            while (fileScanner.hasNextLine()) {
                String email = fileScanner.nextLine().trim();
                if (!email.isEmpty()) {
                    if (emailSet.contains(email)) {
                        duplicateCount++;
                    } else {
                        emailSet.add(email);
                        addedCount++;
                    }
                }
            }
            fileScanner.close();
            System.out.println("Imported " + addedCount + " emails. " + 
                               duplicateCount + " duplicates ignored.");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
        }
    }

    // Method to check if email exists
    public void checkEmailExists() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter email to check: ");
        String email = scanner.nextLine().trim();
        
        if (emailSet.contains(email)) {
            System.out.println("Email exists in the collection.");
        } else {
            System.out.println("Email not found.");
        }
    }

    // Method to display all unique emails
    public void displayAllEmails() {
        if (emailSet.isEmpty()) {
            System.out.println("No emails in the collection.");
        } else {
            System.out.println("Unique email addresses (" + emailSet.size() + "):");
            int count = 1;
            for (String email : emailSet) {
                System.out.println(count++ + ". " + email);
            }
        }
    }

    public static void main(String[] args) {
        UniqueEmailCollector collector = new UniqueEmailCollector();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Unique Email Address Collector");
        System.out.println("------------------------------");
        
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add email from input");
            System.out.println("2. Import emails from file");
            System.out.println("3. Check if email exists");
            System.out.println("4. Display all emails");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline
            
            switch (choice) {
                case 1:
                    collector.addEmailFromInput();
                    break;
                case 2:
                    System.out.print("Enter filename: ");
                    String filename = scanner.nextLine();
                    collector.importEmailsFromFile(filename);
                    break;
                case 3:
                    collector.checkEmailExists();
                    break;
                case 4:
                    collector.displayAllEmails();
                    break;
                case 5:
                    System.out.println("Exiting program. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}