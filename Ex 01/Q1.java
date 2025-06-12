/* 1. Area and Circumference of a Circle
Write a program to calculate the area and circumference of a circle using the given radius. 
*/
import java.util.Scanner;
public class Q1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        double rad = sc.nextDouble();
        double circ = 2 * Math.PI * rad;
        double area = Math.PI * rad * rad;
        System.out.println("Area: " + (Math.round(area * 100.0)/100.0));
        System.out.println("Circumference: " + (Math.round(circ * 100.0)/100.0));
    }
}