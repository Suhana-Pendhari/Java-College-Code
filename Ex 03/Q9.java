/*Q9) ⦁	Create class student having member variable mark and name.there is a 
derived class named as markname which will take input name and marks of 10 
student as a input from the user and display the name and mark of 10 student.
 */
import java.util.Scanner;

public class Q9 {
    public static class Student {
        int mark;
        String name;

        public void getdata() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the name of the student: ");
            name = sc.next();
            System.out.print("Enter the marks of the student: ");
            mark = sc.nextInt();
        }

        public void display() {
            System.out.println("Name: " + name);
            System.out.println("Marks: " + mark);
        }
    }
    static class MarkName extends Student {
        Student[] students;

        public MarkName() {
            students = new Student[10];
        }

        public void getdata() {
            Scanner sc = new Scanner(System.in);
            for (int i = 0; i < 10; i++) {
                students[i] = new Student();
                System.out.print("Enter the name of student " + (i + 1) + ": ");
                students[i].name = sc.next();
                System.out.print("Enter the marks of student " + (i + 1) + ": ");
                students[i].mark = sc.nextInt();
            }
        }

        public void display() {
            for (int i = 0; i < 10; i++) {
                System.out.println("Student " + (i + 1) + ":");
                System.out.println("Name: " + students[i].name);
                System.out.println("Marks: " + students[i].mark);
            }
        }
    }
    public static void main(String[] args) {
        MarkName obj = new MarkName();
        obj.getdata();
        obj.display();
    }
}
