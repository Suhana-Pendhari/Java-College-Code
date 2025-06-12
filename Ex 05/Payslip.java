package payroll;

public class Payslip {
    public void generate(Employee emp, Salary sal) {
        System.out.println("----- PAY SLIP -----");
        System.out.println("Employee ID   : " + emp.empId);
        System.out.println("Name          : " + emp.name);
        System.out.println("Designation   : " + emp.designation);
        System.out.println("--------------------");
        System.out.println("Basic Salary  : " + sal.basic);
        System.out.println("HRA           : " + sal.hra);
        System.out.println("DA            : " + sal.da);
        System.out.println("PF Deduction  : " + sal.pf);
        System.out.println("--------------------");
        System.out.println("Net Pay       : " + sal.netPay);
    }
}
