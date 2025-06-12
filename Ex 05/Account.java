package banking;

public class Account {
    public int accountNumber;
    public double balance;
    public Customer customer;

    public Account(int accountNumber, Customer customer, double initialBalance) {
        this.accountNumber = accountNumber;
        this.customer = customer;
        this.balance = initialBalance;
    }

    public void displayAccount() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Customer Name  : " + customer.name);
        System.out.println("Balance        : " + balance);
    }
}
