package banking;

public class Transaction {
    public void deposit(Account acc, double amount) {
        if (amount > 0) {
            acc.balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(Account acc, double amount) {
        if (amount > 0 && acc.balance >= amount) {
            acc.balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
}
