/* 4.Write a program to print the area and perimeter of a triangle having
 sides of 3, 4 and 5 units by creating a class named 'Triangle' 
 without any parameter in its constructor.
*/

public class Q4 {
    public static class Triangle {
        int a, b, c;

        public Triangle(){
            a = 3;
            b = 4;
            c = 5;
        }

        public void getArea(){
            int s = (a + b + c) / 2;
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            System.out.println("Area: " + area);
        }

        public void getPerimeter(){
            System.out.println("Perimeter: " + (a + b + c));
        }
    }
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.getArea();
        t.getPerimeter();
    }
}