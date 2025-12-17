package phase2.module2;

public class CurrentAccount extends Account {

    private final double overdraftLimit;

    public CurrentAccount(int accountNumber, String holderName, double balance,  double overdraftLimit) {
        super(accountNumber, holderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (getStatus() == AccountStatus.CLOSED) {
            System.out.println("Current account closed. withdraw not allowed");
            return;
        }

        if (amount <= 0) {
            System.out.println("Current account amount must be greater than 0.");
            return;
        }

        if (amount > getBalance() + overdraftLimit) {
            System.out.println("Overdraft limit reached.");
            return;
        }
        updateBalance(-amount);
        System.out.println("Current account withdrawn." + amount);
    }
}
