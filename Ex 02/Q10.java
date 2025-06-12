/*10. Write a program that would print the information (name, year of joining, salary, address) 
of three employees by creating a class named 'Employee'. The output should be as follows:
Name        Year of joining        Address
Robert            1994                64C- WallsStreat
Sam                2000                68D- WallsStreat
John                1999                26B- WallsStreat
 */

import java.util.Scanner;

public class Q10 {
    public static class Employee {
        String name;
        int year;
        String address;

        public void displayDetails(){
            System.out.println(name + "\t\t" + year + "\t\t\t" + address);
        }

        public void getDetails(){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Name: ");
            name = sc.nextLine();
            System.out.print("Enter Year of Joining: ");
            year = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Address: ");
            address = sc.nextLine();
        }
    }
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();
        e1.getDetails();
        e2.getDetails();
        e3.getDetails();
        System.out.println("Name\t\tYear of Joining\t\tAddress");
        e1.displayDetails();
        e2.displayDetails();
        e3.displayDetails();
    }
}
