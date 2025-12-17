package phase3.module1;

public class ATM {

    private int pin=1234;
    private double balance =10000;

    public void withdraw(int enteredPin,double amount){
        if(enteredPin!=pin){
            throw new InvalidPinException("Incorrect pin");
        }
        if(amount>balance){
            throw new InsufficientBalanceException("Insufficient balance");
        }

        balance = balance - amount;
        System.out.println("Withdraw Successful. Remaining balance $ " + balance);
    }

}
