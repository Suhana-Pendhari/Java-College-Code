/* 8. Problem Statement:
Write a program to calculate the difference between simple interest and
compound interest for the same principal, rate, and time.*/

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal, rate, time: ");
        double principal = sc.nextDouble();
        double rate = sc.nextDouble();
        double time = sc.nextDouble();
        double simpleInterest = (principal * rate * time) / 100;
        double compoundInterest = principal * Math.pow((1 + rate / 100), time) - principal;
        double difference = compoundInterest - simpleInterest;
        System.out.println("Simple Interest = " + Math.round(simpleInterest * 100.0) / 100.0);
        System.out.println("Compound Interest = " + Math.round(compoundInterest * 100.0) / 100.0);
        System.out.println("Difference = " + Math.round(difference * 100.0) / 100.0);
    }
}
