/*9.Print the sum, difference and product of two complex numbers by creating 
a class named 'Complex' with separate methods for each operation whose real and 
imaginary parts are entered by user. */

import java.util.Scanner;

public class Q9 {
    public static class Complex{
        int real1;
        int real2;
        int img1;
        int img2;
        public Complex(int r1, int i1, int r2, int i2){
            real1 = r1;
            img1 = i1;
            real2 = r2;
            img2 = i2;
        }
        public void sum(){
            System.out.println("Sum: " + (real1 + real2) + " + " + (img1 + img2) + "i");
        }
        public void difference(){
            System.out.println("Difference: " + (real1 - real2) + " + " + (img1 - img2) + "i");
        }
        public void product(){
            System.out.println("Product: " + (real1 * real2 - img1 * img2) + " + " + (real1 * img2 + real2 * img1) + "i");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the real and imaginary parts of the first complex number: ");
        int real1 = sc.nextInt();
        int img1 = sc.nextInt();
        System.out.print("Enter the real and imaginary parts of the second complex number: ");
        int real2 = sc.nextInt();
        int img2 = sc.nextInt();
        Complex c = new Complex(real1, img1, real2, img2);
        c.sum();
        c.difference();
        c.product();

    }
}
