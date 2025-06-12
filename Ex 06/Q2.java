import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        int[] scores = {85, 90, 78, 92, 88}; // Fixed array of 5 student scores
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student number (0 to 4): ");
        int index = sc.nextInt();

        try {
            System.out.println("Student score: " + scores[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid student number. Please enter a number between 0 and 4.");
        }

        sc.close();
    }
}
