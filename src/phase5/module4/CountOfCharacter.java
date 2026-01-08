package phase5.module4;

import java.util.Map;
import java.util.stream.Collectors;

public class CountOfCharacter {
    public static void main(String[] args) {

        String str="YakeshKumar";

        Map<Character, Long> counts = str.chars() // Gets an IntStream of character code points
                .mapToObj(c -> (char) c) // Converts each code point to a Character object
                .collect(Collectors.groupingBy(
                        c -> c, // Groups by the character itself
                        Collectors.counting() // Counts the occurrences of each group
                ));

        System.out.println("Counts: " + counts);


    }
}
