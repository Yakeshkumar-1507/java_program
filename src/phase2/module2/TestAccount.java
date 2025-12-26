package phase2.module2;

public class TestAccount {

    public static void main(String[] args) {

//        Account account = new Account(101, "test", 20000);
//        account.deposit(10000);
//        account.withdraw(5000);
//
//      account.closeAccount();
////
//        account.withdraw(10000);
        Account yakesh =new Account(101,"Yakesh",50000);
        yakesh.deposit(10000);
        yakesh.withdraw(1000);
        yakesh.closeAccount();
        yakesh.deposit(2000);

    }
}
