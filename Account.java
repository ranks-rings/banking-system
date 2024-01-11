// Account.java

public class Account {
    private int accountNumber;
    private double balance;

    public Account(int accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;  // Successful withdrawal
        } else {
            System.out.println("Insufficient funds!");
            return false; // Failed withdrawal
        }
    }

    public void display() {
        System.out.println("Account Number: " + accountNumber + ", Balance: $" + balance);
    }
}
