/*4. Swap Two Numbers Without Temporary Variable:
Write a program to swap two numbers without using a temporary variable.*/

import java.util.Scanner;

public class Q4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first Number: ");
        int number1 = sc.nextInt(); 
        System.out.print("Enter second Number: ");
        int number2 = sc.nextInt(); 

        System.out.println("Before Swapping =>");
        System.out.println("Number1 = " + number1);
        System.out.println("Number2 = " + number2);
        
        number1 = number1 + number2;
        number2 = number1 - number2;
        number1 = number1 - number2;

        System.out.println("After Swapping =>");
        System.out.println("Number1 = " + number1);
        System.out.println("Number2 = " + number2);
    }
}
