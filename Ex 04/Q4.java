/*4. A banking system needs to be developed in Java, and an important requirement 
is to create an interface for the core functionality of the system. The interface 
should define the methods that will be implemented by various classes responsible 
for different banking operations. */

import java.util.Scanner;
interface BankingSystem {
    public void deposit();
    public void withdraw();
    public void transfer();
    public void checkBalance();
}

class SavingsAccount implements BankingSystem {
    private double balance;

    public SavingsAccount(double initialBalance) {
        this.balance = initialBalance;
    }
    
    public void deposit() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount to deposit: ");
        double amount = sc.nextDouble();
        balance += amount;
        System.out.println("Deposited: " + amount);
    }
    
    public void withdraw() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount to withdraw: ");
        double amount = sc.nextDouble();
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }
    
    public void transfer() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount to transfer: ");
        double amount = sc.nextDouble();
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Transferred: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }
    
    public void checkBalance() {
        System.out.println("Balance: " + balance);
    }
}

class CurrentAccount implements BankingSystem {
    private double balance;
    private double overdraftLimit;
    
    public CurrentAccount(double initialBalance, double overdraftLimit) {
        this.balance = initialBalance;
        this.overdraftLimit = overdraftLimit;
    }
    
    public void deposit() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount to deposit: ");
        double amount = sc.nextDouble();
        balance += amount;
        System.out.println("Deposited: " + amount);
    }
    
    public void withdraw() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount to withdraw: ");
        double amount = sc.nextDouble();
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Withdrawal exceeds overdraft limit!");
        }
    }
    
    public void transfer() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount to transfer: ");
        double amount = sc.nextDouble();
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("Transferred: " + amount);
        } else {
            System.out.println("Transfer exceeds overdraft limit!");
        }
    }
    
    public void checkBalance() {
        System.out.println("Balance: " + balance);
    }
}
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Savings Account:");
        System.out.print("Enter the initial balance: ");
        double initialBalance1 = sc.nextDouble();
        SavingsAccount s = new SavingsAccount(initialBalance1);
        s.deposit();
        s.withdraw();
        s.transfer();
        s.checkBalance();

        System.out.println("Current Account:");
        System.out.print("Enter the initial balance: ");
        double initialBalance2 = sc.nextDouble();
        System.out.print("Enter the overdraft limit: ");
        double overdraftLimit = sc.nextDouble();
        CurrentAccount c = new CurrentAccount(initialBalance2, overdraftLimit);
        c.deposit();
        c.withdraw();
        c.transfer();
        c.checkBalance();
    }
}
