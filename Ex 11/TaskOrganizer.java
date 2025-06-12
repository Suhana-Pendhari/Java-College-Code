import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Task {
    private String description;
    private int priority; // 1 = highest priority

    public Task(String description, int priority) {
        this.description = description;
        this.priority = priority;
    }

    public String getDescription() {
        return description;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "Priority " + priority + ": " + description;
    }
}

public class TaskOrganizer {
    private ArrayList<Task> tasks;

    public TaskOrganizer() {
        tasks = new ArrayList<>();
    }

    // Method to add a new task
    public void addTask(String description, int priority) {
        tasks.add(new Task(description, priority));
        System.out.println("Task added successfully.");
    }

    // Method to display tasks sorted by priority
    public void displayTasksByPriority() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks in the organizer.");
            return;
        }

        // Sort tasks by priority (ascending order - 1 is highest priority)
        Collections.sort(tasks, new Comparator<Task>() {
            @Override
            public int compare(Task t1, Task t2) {
                return Integer.compare(t1.getPriority(), t2.getPriority());
            }
        });

        System.out.println("\nTasks sorted by priority:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }

    public static void main(String[] args) {
        TaskOrganizer organizer = new TaskOrganizer();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Task Organizer App");
        System.out.println("------------------");
        
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add new task");
            System.out.println("2. View tasks by priority");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline
            
            switch (choice) {
                case 1:
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    System.out.print("Enter priority (1=highest): ");
                    int priority = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    organizer.addTask(description, priority);
                    break;
                case 2:
                    organizer.displayTasksByPriority();
                    break;
                case 3:
                    System.out.println("Exiting Task Organizer. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}