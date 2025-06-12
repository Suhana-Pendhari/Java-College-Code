/* 2. Rectangle Dimensions:
Write a program to calculate the area and perimeter of a rectangle using given length and width. */

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        double length = sc.nextDouble();
        System.out.print("Enter width: ");
        double width = sc.nextDouble();
        double area = length * width;
        double perimeter = 2 * (length + width);
        System.out.println("Area = " + Math.round(area * 100.0) / 100.0);
        System.out.println("Perimeter = " + Math.round(perimeter * 100.0) / 100.0);
    }
}
