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

        int a = 10;
        System.out.println(a);

        try {
            int b = 20 / 0;
            System.out.println(b);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Exception occured");
        }


        int c = 30;
        System.out.println(c);

        try {
            FileInputStream fis = new FileInputStream("");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}