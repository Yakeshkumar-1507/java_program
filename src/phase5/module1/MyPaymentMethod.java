package phase5.module1;

import java.util.ArrayList;

@FunctionalInterface
interface Payment{
        void paymentType();
}


public class MyPaymentMethod {

    public static void main(String[] args) {

        // Anonymous function
        Payment upiPayment = new Payment() {
            @Override
            public void paymentType() {
                System.out.println("UPI Payment");
            }
        };

        // lambda expression

        Payment cardPayment = () -> System.out.println("Card Payment");

        upiPayment.paymentType();
        cardPayment.paymentType();

        ArrayList<String> names = new ArrayList<>();
        names.add("UPI Payment");
        names.add("Card Payment");
        names.stream().filter(name -> name.startsWith("U")).forEach(System.out::println);


        for(String name : names){
            if(name.startsWith("UPI")){
                System.out.println("UPI Payment");
            }
        }
    }
}
