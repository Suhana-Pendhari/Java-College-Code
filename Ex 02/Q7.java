/* 7.Write a program to print the area of a rectangle by creating a class 
named 'Area' taking the values of its length and breadth as parameters of its 
constructor and having a method named 'returnArea' which returns the area of the 
rectangle. Length and breadth of rectangle are entered through keyboard.
*/

import java.util.Scanner;

public class Q7 {
    public static class Area{
        float length;
        float breadth;
        public Area(float l, float b){
            length = l;
            breadth = b;
        }
        public float returnArea(){
            return length * breadth;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length and width of the rectangle: ");
        float length = sc.nextFloat();
        float width = sc.nextFloat();
        Area a = new Area(length, width);
        float area = a.returnArea();
        System.out.println("Area of Rectangle: " + area);
    }
}
