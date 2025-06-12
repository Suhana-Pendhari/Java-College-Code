package payroll;

public class Salary {
    public double basic;
    public double hra;
    public double da;
    public double pf;
    public double netPay;

    public Salary(double basic) {
        this.basic = basic;
        calculate();
    }

    private void calculate() {
        hra = 0.2 * basic;     // 20% of basic
        da = 0.1 * basic;      // 10% of basic
        pf = 0.12 * basic;     // 12% of basic
        netPay = basic + hra + da - pf;
    }
}
