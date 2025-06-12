/*⦁	Write a Java program to design a base class Person (name, address, phone_no).
 Derive a class Employee (eno, ename) from Person. Derive a class Manager 
 (designation, department name, basic-salary) from Employee. Write a menu driven program to:
a. Accept all details of 'n' managers.
b. Display manager having highest salary
 */
import java.util.Scanner;

public class Q3 {
    public static class Person {
        String name, address, phone_no;
    }
    public static class Employee extends Person {
        int eno;
        String ename;
    }
    public static class Manager extends Employee {
        String designation, department_name;
        double basic_salary;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of managers: ");
        int n = sc.nextInt();
        Manager[] m = new Manager[n];
        for (int i = 0; i < n; i++) {
            m[i] = new Manager();
            System.out.print("Enter the name of the manager " + (i+1) + ": ");
            m[i].name = sc.next();
            System.out.print("Enter the address of the manager: ");
            m[i].address = sc.next();
            System.out.print("Enter the phone number of the manager: ");
            m[i].phone_no = sc.next();
            System.out.print("Enter the employee number of the manager: ");
            m[i].eno = sc.nextInt();
            System.out.print("Enter the employee name of the manager: ");
            m[i].ename = sc.next();
            System.out.print("Enter the designation of the manager: ");
            m[i].designation = sc.next();
            System.out.print("Enter the department name of the manager: ");
            m[i].department_name = sc.next();
            System.out.print("Enter the basic salary of the manager: ");
            m[i].basic_salary = sc.nextDouble();
        }
        double max = m[0].basic_salary;
        int index = 0;
        for (int i = 1; i < n; i++) {
            if (m[i].basic_salary > max) {
                max = m[i].basic_salary;
                index = i;
            }
        }
        System.out.println("Manager with highest salary is: ");
        System.out.println("Name: " + m[index].name);
        System.out.println("Address: " + m[index].address);
        System.out.println("Phone number: " + m[index].phone_no);
        System.out.println("Employee number: " + m[index].eno);
        System.out.println("Employee name: " + m[index].ename);
        System.out.println("Designation: " + m[index].designation);
        System.out.println("Department name: " + m[index].department_name);
        System.out.println("Basic salary: " + m[index].basic_salary);
    }
}
