import payroll.Employee;
import payroll.Salary;
import payroll.Payslip;

public class Q2 {
    public static void main(String[] args) {
        // Create an employee using Employee class
        Employee emp = new Employee(101, "Suhana Pendhari", "Software Engineer");

        // Create salary details using Salary class
        Salary sal = new Salary(50000);  

        // Generate and print the payslip using Payslip class
        Payslip slip = new Payslip();
        slip.generate(emp, sal);
    }
}
