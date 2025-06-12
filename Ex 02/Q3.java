/* 3.Assign and print the roll number, phone number and address of two students 
having names "Sam" and "John" respectively by creating two objects of class 'Student'.
*/
import java.util.Scanner;

public class Q3 {
    public static class Student {
        int roll_no;
        long phone_no;
        String address;

        void getDetails(){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Roll No: ");
            roll_no = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter phone No: ");
            phone_no = sc.nextLong();
            sc.nextLine();
            System.out.print("Enter Address: ");
            address = sc.nextLine();
        }

        void displayDetails(){
            System.out.println("Roll No: " + roll_no);
            System.out.println("Phone No: " + phone_no);
            System.out.println("Address: " + address);
        }
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.getDetails();
        s1.displayDetails();
        
        s2.getDetails();
        s2.displayDetails();
    }
}
