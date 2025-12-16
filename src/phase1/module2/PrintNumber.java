package phase1.module2;

import java.util.Scanner;

public class PrintNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n= sc.nextInt();

        for(int i=0;i<=n;i++){
            System.out.println(i);
        }
    }
}
