package phase2.module1;

import java.util.Scanner;

class Account {

    int accountNumber;
    String accountName;
    double balance;

    Account(int accountNumber, String accountName, double balance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        if (balance > 0) {
            this.balance = balance;
        }
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount);
    }

    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds");
        } else {
            balance -= amount;
            System.out.println("Withdrawal $" + amount);
        }
    }

    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Name: " + accountName);
        System.out.println("Balance: " + balance);
    }

}

public class BankApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the account number: ");
        int accountNumber = sc.nextInt();
        System.out.println("Enter the account name: ");
        String accountName = sc.next();

        Account account = new Account(accountNumber, accountName, 0);
        String choice = "";
        do {
            System.out.println("Enter the option: 1. Deposit, 2. Withdraw,3. Statement");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter the amount: ");
                    int amount = sc.nextInt();
                    account.deposit(amount);
                    break;
                case 2:
                    System.out.println("Enter the amount: ");
                    int withdrawAmount = sc.nextInt();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    System.out.println("Display the statment");
                    account.display();
            }
            System.out.println("Do you want to continue? y/n");
            choice = sc.next();
        }while(choice.equalsIgnoreCase("y"));
    }
}
