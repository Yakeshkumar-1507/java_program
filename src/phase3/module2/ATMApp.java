package phase3.module2;

import java.util.Scanner;

public class ATMApp {

    public static void main(String[] args) {

        ATM atm = new ATM();
        Scanner sc = new Scanner(System.in);

        int attempt = 0;
        boolean success = false;

        while (attempt < 3 && !success) {
            try {
                System.out.println("Enter the pin:");
                int pin = sc.nextInt();

                System.out.println("Enter the withdraw amount: ");
                double amount = sc.nextDouble();

                atm.withdraw(pin, amount);
                success = true;
            } catch (InvalidPinException e) {
                attempt++;
                logError(e);
                if (attempt == 3) {
                    System.out.println("ATM blocked after 3 incorrect pin attempt");
                } else {
                    System.out.println("Attempts left:  " + (3 - attempt));
                }
            } catch (InsufficientBalanceException | InvalidAmountException e) {
                logError(e);
                break;
            }
        }

    }

    public static void logError(Exception e) {
        System.err.println("[ERROR] " + e.getMessage());
    }
}
