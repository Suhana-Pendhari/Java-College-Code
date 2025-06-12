/*Q2) Write a Java program to calculate the percentage of a student using 
multi-level inheritance. Accept the marks of three subjects in base class. 
A class will derived from the above mentioned class which includes a function 
to find the total marks obtained and another class derived from this class 
which calculates and displays the percentage of student.
 */
import java.util.Scanner;
class Student{
    int maths, science, english;
    public void Accept(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Maths, Science, and Physics Marks: ");
        maths = sc.nextInt();
        science = sc.nextInt();
        english = sc.nextInt();
    }
}
class Marks extends Student{
    public int totalMarks() {
        return maths + science + english;
    }
}

class Percentage extends Marks{
    public double percentage() {
        Accept();
        return ((double)totalMarks() / 300) * 100;
    }
}

public class Q2 {
    public static void main(String[] args) {
        Percentage p = new Percentage();
        double per = p.percentage();
        System.out.println("Percentage of three subject: " + per);
    }
}
