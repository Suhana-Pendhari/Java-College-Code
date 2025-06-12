/* 5. Problem Statement:
Write a program to calculate compound interest for a given principal, rate, and time.*/

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal, rate, time: ");

        double principal = sc.nextDouble();
        double rate = sc.nextDouble();
        double time = sc.nextDouble();

        double amount = principal * Math.pow((1 + rate / 100), time);
        double compoundInterest = amount - principal;

        System.out.println("Amount = " + Math.round(amount * 100.0) / 100.0);
        System.out.println("Compound Interest = " + Math.round(compoundInterest * 100.0) / 100.0);
    }
}
