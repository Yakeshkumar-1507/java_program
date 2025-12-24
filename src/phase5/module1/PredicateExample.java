package phase5.module1;

import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {

        Predicate<Integer> checkEven = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                if (integer % 2 == 0) {
                    return true;
                }
                return false;
            }
        };

        System.out.println(checkEven.test(1));

        // lambda expression

        Predicate<Integer> checkOdd = (number -> number % 2 == 1);
        System.out.println(checkOdd.test(15));

    }
}
