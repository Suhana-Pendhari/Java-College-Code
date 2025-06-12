/* 2.Create a class named 'Student' with String variable 'name' and 
integer variable 'roll_no'. Assign the value of roll_no as '2' and that 
of name as "John" by creating an object of the class Student.
*/

import java.util.Scanner;

public class Q2 {
    public static class Student {
        String name;
        int roll_no;

        void getDetails(){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter name and Roll No: ");
            name = sc.nextLine();
            roll_no = sc.nextInt();
        }

        void displayDetails(){
            System.out.println("Name: " + name);
            System.out.println("Roll No: " + roll_no);
        }
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.getDetails();
        s1.displayDetails();
    }
}
