/* 7. Volume and Surface Area of a Cylinder:
Write a program to calculate the volume and surface area of a cylinder. */

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius and height: ");
        double radius = sc.nextDouble();
        double height = sc.nextDouble();
        double volume = Math.PI * Math.pow(radius, 2) * height;
        double surfaceArea = 2 * Math.PI * radius * (radius + height);
        System.out.println("Volume = " + Math.round(volume * 10000.0) / 10000.0);
        System.out.println("Surface Area = " + Math.round(surfaceArea * 10000.0) / 10000.0);
    }
}
