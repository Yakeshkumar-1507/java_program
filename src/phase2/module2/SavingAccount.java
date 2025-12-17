package phase2.module2;

public class SavingAccount extends Account {

    private final double interestRate;

    public SavingAccount(int accountNumber, String holderName, double balance, int interestRate) {
        super(accountNumber, holderName, balance);
        this.interestRate= interestRate;
    }

    public void addInterest(){
        if(getStatus() == AccountStatus.CLOSED){
            System.out.println("Account closed. Interest not added");
            return;
        }

        double interest = getBalance() * interestRate/100;
        updateBalance(interest);
        System.out.println("New interest is " + interest);
    }

}
