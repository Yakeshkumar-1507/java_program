package phase5.module1.module2;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class TerminalOperation {

    public static void main(String[] args) {
        // Using Collection
        List<Integer> list = List.of(11, 9, 17, 8, 2, 3, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        list.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

        //way 1
        List<Integer> evenNumbers = list.stream().filter(n -> n % 2 == 0).toList();

        //way 2
        //java.util.List<Integer> evenNumbers=list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());

        // count

        long count = list.stream().filter(n -> n % 2 == 0).count();
        System.out.println("Count of even numbers: " + count);

        java.util.Optional<Integer> minValue = list.stream().min(Integer::compareTo);
        System.out.println("Min value is " + minValue);

        java.util.Optional<Integer> maxValue = list.stream().max(Integer::compareTo);
        System.out.println("Max value is " + maxValue);

        java.util.Optional<Integer> findFirst = list.stream().filter(n -> n % 2 == 0).findFirst();
        System.out.println("Find first value is " + findFirst);

        java.util.Map<String, List<Integer>>groupValues= list.stream().collect(Collectors.groupingBy(n -> n % 2 == 0 ? "Even":"Odd"));
        System.out.println("groupValues: " + groupValues);
    }
}
