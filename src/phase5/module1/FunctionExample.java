package phase5.module1;

import java.util.function.Function;

public class FunctionExample {

    public static void main(String[] args) {

        Function<String,Integer> names = n -> n.length();
        System.out.println(names.apply("Yakesh Kumar"));

        Function<String,Boolean> checkStartWith = n -> n.startsWith("Y");
        System.out.println(names.apply("Yakesh Kumar"));

        Function<String,String> convertUpperCase = n -> n.toUpperCase();
        System.out.println(convertUpperCase.apply("Yakesh Kumar"));
    }
}
