/*Q10) Write a program that illustrates interface inheritance. Interface P12 
inherits from both P1 and P2. Each interface declares one constant and one method. 
The class Q implements P12 . Instantiate Q and invoke each of its methods. 
Each method displays one of the constants.
 */

public class Q10 {
    interface P1 {
        int a = 10;
        void method1();
    }
    interface P2 {
        int b = 20;
        void method2();
    }
    interface P12 extends P1, P2 {
    }
    static class Q implements P12 {
        public void method1() {
            System.out.println("a: " + a);
        }
        public void method2() {
            System.out.println("b: " + b);
        }
    }
    public static void main(String[] args) {
        Q q = new Q();
        q.method1();
        q.method2();
    }
}
