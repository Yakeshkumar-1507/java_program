package phase3.module1;

public class ATMApp {

    public static void main(String[] args) {

        ATM atm = new ATM();
        try {
            atm.withdraw(1234, 1500);
            atm.withdraw(3214,5000);
        } catch (InvalidPinException | InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}