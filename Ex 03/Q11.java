import java.util.Scanner;

public class Q11 {
    static class Student{
        String sname;
        int marks[];
        int total;
        int Tmax;
        void assign(String name, int n){
            sname = name;
            marks = new int[n];
            Tmax = n;
        }
        void computeTotal(){
            total = 0;
            for(int i = 0; i < Tmax; i++){
                total += marks[i];
            }
        }
        void display(){
            System.out.println("Name: " + sname);
            System.out.println("Marks:");
            for(int i = 0; i < Tmax; i++){
                System.out.println("Subject " + (i + 1) + ": " + marks[i]);
            }
            System.out.println("Total: " + total);
            System.out.println("Average: " + (total / Tmax));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        Student[] students = new Student[n];
        for(int i = 0; i < n; i++){
            students[i] = new Student();
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            String name = sc.next();
            System.out.print("Enter the number of subjects: ");
            int m = sc.nextInt();
            students[i].assign(name, m);
            for(int j = 0; j < m; j++){
                System.out.print("Enter the marks of subject " + (j + 1) + ": ");
                students[i].marks[j] = sc.nextInt();
            }
            students[i].computeTotal();
        }
        for(int i = 0; i < n; i++){
            System.out.println("Student " + (i + 1) + ":");
            students[i].display();
        }
    }
}
