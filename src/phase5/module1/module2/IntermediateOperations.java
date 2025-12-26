package phase5.module1.module2;

import java.util.Comparator;
import java.util.List;

public class IntermediateOperations {

    public static void main(String[] args) {
        // Using Collection
        List<Integer> list = List.of(11,9,17, 8, 2, 3, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // filter -> to check the condition of the elements

        list.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

        //Map

        List<String> values = List.of("A", "B", "C");
        values.stream().map(str -> str.toLowerCase()).forEach(System.out::println);

        // distinct() - to remove duplicate
        list.stream().distinct().forEach(System.out::println);

        //limit
        list.stream().limit(3).forEach(System.out::println);

        System.out.println();
        //skip
        list.stream().skip(3).forEach(System.out::println);

        System.out.println();
        //sorting - Ascending order
        list.stream().sorted().forEach(System.out::println);

        // sorting -descending order
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
