/* 5.Write a program to print the area and perimeter of a triangle having sides of 
3, 4 and 5 units by creating a class named 'Triangle' with constructor having the 
three sides as its parameters. */

public class Q5 {
    public static class Triangle {
        int a, b, c;

        public Triangle(int a, int b, int c){
            this.a = a;
            this.b = b;
            this.c = c;
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
        Triangle t = new Triangle(3, 4, 5);
        t.getArea();
        t.getPerimeter();
    }
}
