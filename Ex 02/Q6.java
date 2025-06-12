/* 6.Write a program to print the area of two rectangles having sides 
(4,5) and (5,8) respectively by creating a class named 'Rectangle' with 
a method named 'Area' which returns the area and length and breadth passed 
as parameters to its constructor. */
public class Q6 {
    public static class Rectangle {
        int length;
        int breadth;

        public Rectangle(int length, int breadth){
            this.length = length;
            this.breadth = breadth;
        }

        public int getArea(){
            return length * breadth;
        }
    }
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4, 5);
        Rectangle r2 = new Rectangle(5, 8);
        System.out.println("Area of rectangle 1: " + r1.getArea());
        System.out.println("Area of rectangle 2: " + r2.getArea());
    }
}