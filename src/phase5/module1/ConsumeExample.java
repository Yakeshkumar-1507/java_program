package phase5.module1;

import java.util.function.Consumer;

public class ConsumeExample {

    public static void main(String[] args) {

        Consumer<String > convertUpperCase = (n) -> System.out.println(n.toUpperCase());
        convertUpperCase.accept("Yakesh Kumar");

    }
}
