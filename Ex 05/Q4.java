import student.Student;
import student.Marks;
import student.ReportCard;

public class Q4 {
    public static void main(String[] args) {
        // Create a student using Student class
        Student s = new Student(101, "Harry Potter", "10th");

        // Assign marks using Marks class
        Marks m = new Marks(85, 92, 78);

        // Generate and display the report card
        ReportCard card = new ReportCard();
        card.generate(s, m);
    }
}
