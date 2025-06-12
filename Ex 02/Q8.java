/*8.Print the average of three numbers entered by user by creating a class 
named 'Average' having a method to calculate and print the average.*/

import java.util.Scanner;

public class Q8 {
    public static class Average{
        public void getAverage(int a, int b, int c){
            System.out.println("Average: " + (a + b + c) / 3);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        Average avg = new Average();
        avg.getAverage(a, b, c);
    }
}
