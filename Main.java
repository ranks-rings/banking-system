// Main.java

public class Main {
    public static void main(String[] args) {
        // Create accounts
        Account account1 = new Account(12345, 1000.0);
        Account account2 = new Account(67890, 2000.0);

        // Create a transaction
        Transaction transaction = new Transaction(account1, account2);

        // Perform a transaction
        transaction.perform(500.0);

        // Display account details after the transaction
        account1.display();
        account2.display();
    }
}
