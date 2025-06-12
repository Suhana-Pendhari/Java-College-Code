/* 6. Convert Decimal to Binary
Write a program to convert a given decimal number to binary format using arithmetic operators.*/

import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();
        
        int num = decimal;
        String binary = "";
        while (num > 0) {
            binary = (num % 2) + binary;
            num = num / 2;
        }
        System.out.println("Binary = " + binary);
    }
}
