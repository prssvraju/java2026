class NoBalanceException extends Exception {
    public NoBalanceException(String message) {
        super(message);
    }
}
public class BankEx {
    private double balance;

    public BankEx(double initialBalance) {
        this.balance = initialBalance;
    }

    public void withdraw(double amount) throws NoBalanceException {
        if (amount > balance) {
            throw new NoBalanceException("Insufficient balance. Current balance: " + balance);
        }
        balance -= amount;
        System.out.println("Withdrawal successful. New balance: " + balance);
    }

    public static void main(String[] args) {
        BankEx bankAccount = new BankEx(1000.0);

        try {
            bankAccount.withdraw(1500.0);
        } catch (NoBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}