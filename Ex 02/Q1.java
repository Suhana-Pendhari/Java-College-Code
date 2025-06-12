/* 1. Write a program to print the area of a rectangle by creating a class 
named 'Area' having two methods. First method named as 'setDim' takes length and 
breadth of rectangle as parameters and the second method named as 'getArea' returns 
the area of the rectangle. Length and breadth of rectangle are entered through keyboard.
*/
import java.util.Scanner;

public class Q1 {
    public static class Area{
        float length;
        float breadth;
        void setDim(float l, float b){
            length = l;
            breadth = b;
        }
        float getArea(){
            return length * breadth;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Area a = new Area();
        System.out.print("Enter the length and width of the rectangle: ");
        float length = sc.nextFloat();
        float width = sc.nextFloat();
        a.setDim(length, width);
        float area = a.getArea();
        System.out.println(area);
    }
}