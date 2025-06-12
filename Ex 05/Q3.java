import banking.Customer;
import banking.Account;
import banking.Transaction;

public class Q3 {
    public static void main(String[] args) {
        // Create customer using Customer class
        Customer cust = new Customer(1, "Tony Stark");

        // Create account using Account class
        Account acc = new Account(1001, cust, 10000.0);

        // Display initial account details
        acc.displayAccount();

        // Create Transaction object and perform operations
        Transaction tx = new Transaction();
        tx.deposit(acc, 5000.0);
        tx.withdraw(acc, 3000.0);
        tx.withdraw(acc, 15000.0);  // Should show insufficient balance

        // Display final account status
        System.out.println("\nFinal Account Details:");
        acc.displayAccount();
    }
}
