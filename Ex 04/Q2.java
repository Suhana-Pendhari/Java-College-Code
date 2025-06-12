/*2. Design an interface for a "Shape" hierarchy that includes various geometric 
shapes such as circles, rectangles, and triangles. The interface should define 
common methods such as calculating area and perimeter, and should allow for different 
classes to implement these methods based on their specific shape properties. */

import java.util.Scanner;
public class Q2 {
    interface Shape {
        public double calculateArea();
        public double calculatePerimeter();
    }
    static class Circle implements Shape {
        private double radius;
        
        public void getRadius() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the radius: ");
            radius = sc.nextDouble();
        }
        
        public double calculateArea() {
            return Math.PI * radius * radius;
        }
        
        public double calculatePerimeter() {
            return 2 * Math.PI * radius;
        }
    }

    static class Rectangle implements Shape {
        private double length;
        private double width;
        
        public void getDimensions() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the length: ");
            length = sc.nextDouble();
            System.out.print("Enter the width: ");
            width = sc.nextDouble();
        }
        
        public double calculateArea() {
            return length * width;
        }
        
        public double calculatePerimeter() {
            return 2 * (length + width);
        }
    }

    static class Triangle implements Shape {
        private double side1;
        private double side2;
        private double side3;
        
        public void getDimensions() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the length of side 1: ");
            side1 = sc.nextDouble();
            System.out.print("Enter the length of side 2: ");
            side2 = sc.nextDouble();
            System.out.print("Enter the length of side 3: ");
            side3 = sc.nextDouble();
        }
        
        public double calculateArea() {
            double s = (side1 + side2 + side3) / 2;
            return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        }
        
        public double calculatePerimeter() {
            return side1 + side2 + side3;
        }
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println("-----Enter the details of the circle------");
        c.getRadius();
        System.out.println("Area of the circle: " + c.calculateArea());
        System.out.println("Perimeter of the circle: " + c.calculatePerimeter());

        Rectangle r = new Rectangle();
        System.out.println("-----Enter the details of the rectangle------");
        r.getDimensions();
        System.out.println("Area of the rectangle: " + r.calculateArea());
        System.out.println("Perimeter of the rectangle: " + r.calculatePerimeter());

        Triangle t = new Triangle();
        System.out.println("-----Enter the details of the triangle------");
        t.getDimensions();
        System.out.println("Area of the triangle: " + t.calculateArea());
        System.out.println("Perimeter of the triangle: " + t.calculatePerimeter());
    }
}
