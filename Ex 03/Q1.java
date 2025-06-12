/*1.Write a Java program to add two numbers using single inheritance. Accept these two numbers 
from the user in base class and display the sum of these two numbers in derived class. */
import java.util.Scanner;

class Base {
    int a, b;

    public void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        a = sc.nextInt();
        System.out.print("Enter the second number: ");
        b = sc.nextInt();
    }
}

class Derived extends Base {
    public void display() {
        getdata();
        int sum = a + b;
        System.out.println("Sum of two numbers is: " + sum);
    }
}

public class Q1 {
    public static void main(String[] args) {
        Derived d = new Derived();
        d.display();
    }
}