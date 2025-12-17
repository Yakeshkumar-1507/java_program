package phase2.module2;

public class TestAccountType {

    public static void main(String[] args) {

        SavingAccount savingAccount = new SavingAccount(201,"Anil",10000,5);
        savingAccount.addInterest();
        savingAccount.displayAccount();

        System.out.println();

        CurrentAccount currentAccount = new CurrentAccount(202,"Sunil",10000,5000);
        currentAccount.withdraw(2000);
        currentAccount.displayAccount();
    }
}
