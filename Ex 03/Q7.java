/*Q7)Write a Program to design a student class representing student roll no. 
and a test class (derived class of student) representing the scores of the student 
in various subjects and sports class representing the score in sports. The sports
 and test class should be inherited by a result class having the functionality to 
 add the scores and display the final result for a student.
*/

import java.util.Scanner;

public class Q7 {
    public static class Student {
        int roll_no;

        public Student(int roll_no) {
            this.roll_no = roll_no;
        }

        public void getdata() {
            System.out.println("Roll number: " + roll_no);
        }
    }
    class Test extends Student {
        int n;
        int[] marks;

        public Test(int roll_no, int n) {
            super(roll_no);
            this.n = n;
            marks = new int[n];
        }

        public void getdata() {
            super.getdata();
            Scanner sc = new Scanner(System.in);
            for (int i = 0; i < n; i++) {
                System.out.print("Enter the marks of subject " + (i + 1) + ": ");
                marks[i] = sc.nextInt();
            }
        }
    }
    class Sports extends Student {
        int m;
        int[] marks;

        public Sports(int roll_no, int m) {
            super(roll_no);
            this.m = m;
            marks = new int[m];
        }

        public void getdata() {
            super.getdata();
            Scanner sc = new Scanner(System.in);
            for (int i = 0; i < m; i++) {
                System.out.print("Enter the marks of sport " + (i + 1) + ": ");
                marks[i] = sc.nextInt();
            }
        }
    }
    static class Result extends Student {
        int n, m;
        int[] marks;

        public Result(int roll_no, int n, int m) {
            super(roll_no);
            this.n = n;
            this.m = m;
            marks = new int[n + m];
        }

        public void add(Test t, Sports s) {
            for (int i = 0; i < n; i++) {
                marks[i] = t.marks[i];
            }
            for (int i = 0; i < m; i++) {
                marks[n + i] = s.marks[i];
            }
        }

        public void display() {
            super.getdata();
            int total = 0;
            for (int i = 0; i < n + m; i++) {
                total += marks[i];
            }
            System.out.println("Total marks: " + total);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the roll number of the student: ");
        int roll_no = sc.nextInt();
        System.out.print("Enter the number of subjects: ");
        int n = sc.nextInt();
        System.out.print("Enter the number of sports: ");
        int m = sc.nextInt();
        Result r = new Result(roll_no, n, m);
        Test t = new Q7().new Test(roll_no, n);
        Sports s = new Q7().new Sports(roll_no, m);
        t.getdata();
        s.getdata();
        r.add(t, s);
        r.display();
    }
}
