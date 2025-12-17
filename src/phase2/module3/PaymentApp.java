package phase2.module3;

import java.util.Scanner;

interface Payment {
    void payment(double amount);
}

class CardPayment implements Payment {
    @Override
    public void payment(double amount) {
        System.out.println("Payment of " + amount + " done via card");
    }
}

class UpiPayment implements Payment {
    @Override
    public void payment(double amount) {
        System.out.println("Payment of " + amount + " done via upi");
    }
}

class NetPayment implements Payment {
    @Override
    public void payment(double amount) {
        System.out.println("Payment of " + amount + " done via net banking");
    }
}

class PaymentFactory {
    public static Payment createPayment(String type) {
        return switch (type.toUpperCase()) {
            case "UPI" -> new UpiPayment();
            case "CARD" -> new CardPayment();
            case "NET" -> new NetPayment();
            default -> throw new IllegalArgumentException("Invalid type");
        };
    }
}

public class PaymentApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String choice = "";
        do {
            System.out.println("Enter amount to pay");
            double amount = sc.nextDouble();
            System.out.println("Enter option to pay ");
            System.out.println("1. UPI, 2. Card, 3. Net");
            String option = sc.next();
            Payment payment = PaymentFactory.createPayment(option.toUpperCase());
            payment.payment(amount);
            System.out.println("Do you want to continue? ");
            choice = sc.next();
        } while (choice.equalsIgnoreCase("y"));

    }
}
