package phase2.module2;

public class Account {

    private final int accountNumber;
    private final String holderName;
    private double balance;
    private AccountStatus status;

    public Account(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = Math.max(balance, 0);
        this.status = AccountStatus.ACTIVE;
    }

    protected void updateBalance(double amount) {
        this.balance = amount;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public void deposit(double amount) {
        if (status == AccountStatus.CLOSED) {
            System.out.println("Account closed. Deposit not possible");
            return;
        }
        if (amount <= 0) {
            System.out.println("Invalid deposit amount");
            return;
        }
        updateBalance(amount);
        System.out.println("Deposited " + amount);
        System.out.println("Current balance is " + balance);
    }

    public void withdraw(double amount) {
        if (status == AccountStatus.CLOSED) {
            System.out.println("Account closed. Withdraw not possible");
            return;
        }
        if (amount <= 0) {
            System.out.println("Invalid withdraw amount");
            return;
        }
        if (amount > balance) {
            System.out.println("Invalid withdraw amount");
            return;
        }
        updateBalance(-amount);
        System.out.println("Withdrawn " + amount);
        System.out.println("Current balance is " + balance);
    }

    public void closeAccount() {
        status = AccountStatus.CLOSED;
        System.out.println("Account closed successfully");
    }

    public void displayAccount() {
        System.out.println("Account number: " + accountNumber);
        System.out.println("Holder name: " + holderName);
        System.out.println("Balance: " + balance);
        System.out.println("Status: " + status);
    }
}
