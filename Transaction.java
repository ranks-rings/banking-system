// Transaction.java

public class Transaction {
    private Account sender;
    private Account receiver;

    public Transaction(Account sender, Account receiver) {
        this.sender = sender;
        this.receiver = receiver;
    }

    public void perform(double amount) {
        // Perform a basic funds transfer transaction
        sender.withdraw(amount);
        receiver.deposit(amount);
    }
}
