import java.util.Stack;
import java.util.Scanner;

public class BrowserNavigation {
    private Stack<String> backStack;
    private Stack<String> forwardStack;
    private String currentPage;

    public BrowserNavigation() {
        backStack = new Stack<>();
        forwardStack = new Stack<>();
        currentPage = null;
    }

    // Method to visit a new page
    public void visitPage(String url) {
        if (currentPage != null) {
            backStack.push(currentPage);
        }
        currentPage = url;
        forwardStack.clear(); // Clearing forward stack as we're visiting new page
        System.out.println("Visited: " + url);
    }

    // Method to go back to previous page
    public void goBack() {
        if (backStack.isEmpty()) {
            System.out.println("Cannot go back. No previous pages.");
        } else {
            forwardStack.push(currentPage);
            currentPage = backStack.pop();
            System.out.println("Back to: " + currentPage);
        }
    }

    // Method to go forward
    public void goForward() {
        if (forwardStack.isEmpty()) {
            System.out.println("Cannot go forward. No forward pages.");
        } else {
            backStack.push(currentPage);
            currentPage = forwardStack.pop();
            System.out.println("Forward to: " + currentPage);
        }
    }

    // Method to display current page
    public void displayCurrentPage() {
        if (currentPage == null) {
            System.out.println("No page is currently open.");
        } else {
            System.out.println("Current page: " + currentPage);
        }
    }

    public static void main(String[] args) {
        BrowserNavigation browser = new BrowserNavigation();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Browser Navigation Simulator");
        System.out.println("----------------------------");
        
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Visit new page");
            System.out.println("2. Go back");
            System.out.println("3. Go forward");
            System.out.println("4. Show current page");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline
            
            switch (choice) {
                case 1:
                    System.out.print("Enter URL to visit: ");
                    String url = scanner.nextLine();
                    browser.visitPage(url);
                    break;
                case 2:
                    browser.goBack();
                    break;
                case 3:
                    browser.goForward();
                    break;
                case 4:
                    browser.displayCurrentPage();
                    break;
                case 5:
                    System.out.println("Closing browser. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}