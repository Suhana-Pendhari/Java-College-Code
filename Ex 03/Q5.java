/*Q5) ⦁	Write a Program to design a class having static member function named 
showcount() which has the property of displaying the number of objects created of the class.
 */

public class Q5 {
    static class MyClass {
        static int count = 0;

        public MyClass() {
            count++;
        }

        public static void showcount() {
            System.out.println("Number of objects created: " + count);
        }
    }
    public static void main(String[] args) {
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass();
        MyClass obj3 = new MyClass();
        MyClass.showcount();
    }
}
