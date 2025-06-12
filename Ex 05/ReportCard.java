package student;

public class ReportCard {
    public void generate(Student s, Marks m) {
        System.out.println("----- Report Card -----");
        System.out.println("Roll No   : " + s.rollNo);
        System.out.println("Name      : " + s.name);
        System.out.println("Grade     : " + s.grade);
        System.out.println("------------------------");
        System.out.println("Math      : " + m.math);
        System.out.println("Science   : " + m.science);
        System.out.println("English   : " + m.english);
        System.out.println("------------------------");
        System.out.println("Total     : " + m.getTotal());
        System.out.println("Average   : " + m.getAverage());
        System.out.println("------------------------");
    }
}
