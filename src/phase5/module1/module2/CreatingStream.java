package phase5.module1.module2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreatingStream {

    public static void main(String[] args) {

        // Using Collection
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        java.util.stream.Stream<Integer> stream = list.stream();

        // Using Array
        int arr[] ={1,2,3};
        java.util.stream.IntStream intStream =Arrays.stream(arr);

        // Using stream
        Stream<Integer> s = Stream.of(1,2,3,4,5);

    }
}
