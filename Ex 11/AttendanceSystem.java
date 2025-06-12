import java.util.ArrayList;
import java.util.Scanner;

public class AttendanceSystem {
    private ArrayList<String> presentStudents;

    public AttendanceSystem() {
        presentStudents = new ArrayList<>();
    }

    // Method to add a student to the attendance list
    public void addStudent(String studentName) {
        if (!presentStudents.contains(studentName)) {
            presentStudents.add(studentName);
            System.out.println(studentName + " has been marked present.");
        } else {
            System.out.println(studentName + " is already marked present.");
        }
    }

    // Method to search for a student in the attendance list
    public void searchStudent(String studentName) {
        if (presentStudents.contains(studentName)) {
            System.out.println(studentName + " is present today.");
        } else {
            System.out.println(studentName + " is not marked present today.");
        }
    }

    // Method to display all present students in order
    public void displayAttendance() {
        if (presentStudents.isEmpty()) {
            System.out.println("No students have been marked present yet.");
        } else {
            System.out.println("List of present students (in order marked):");
            for (int i = 0; i < presentStudents.size(); i++) {
                System.out.println((i + 1) + ". " + presentStudents.get(i));
            }
        }
    }

    public static void main(String[] args) {
        AttendanceSystem system = new AttendanceSystem();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Student Attendance System");
        System.out.println("-------------------------");
        
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Mark student present");
            System.out.println("2. Search for a student");
            System.out.println("3. Display attendance list");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline
            
            switch (choice) {
                case 1:
                    System.out.print("Enter student name to mark present: ");
                    String nameToAdd = scanner.nextLine();
                    system.addStudent(nameToAdd);
                    break;
                case 2:
                    System.out.print("Enter student name to search: ");
                    String nameToSearch = scanner.nextLine();
                    system.searchStudent(nameToSearch);
                    break;
                case 3:
                    system.displayAttendance();
                    break;
                case 4:
                    System.out.println("Exiting the system. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}