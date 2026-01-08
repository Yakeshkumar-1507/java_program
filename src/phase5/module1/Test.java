package phase5.module1;

import java.io.FileInputStream;

public class Test {

    public void method1() {
        try {
            System.out.println("method1");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {

        int num =89;
        char ch = (char) num;
        System.out.println("Character is: " + ch);
    }
}