package phase3.module2;

public class ATM {

    private final int pin = 1234;
    private double balance = 10000;

    public void withdraw(int enteredPin, double amount) {
        if (enteredPin != pin) {
            throw new InvalidPinException("Invalid Pin");
        }

        if (amount < 0) {
            throw new InvalidAmountException("Invalid Amount");
        }

        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient Balance");
        }

        balance = balance - amount;
        System.out.println("Withdraw Successful. Balance is " + balance);
    }

    public void deposit(int enteredPin, double amount) {
        if (enteredPin != pin) {
            throw new InvalidPinException("Invalid Pin");
        }
        if (amount < 0) {
            throw new InvalidAmountException("Invalid Amount");
        }
        balance = balance + amount;
        System.out.println("Deposit Successful. Balance is " + balance);
    }

    public double getBalance() {
        return balance;
    }
}
