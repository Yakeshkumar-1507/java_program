package phase5.module4;

import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {
        String[] words = new String[10];
//        String word = words[5].toLowerCase(); // NullPointerException
//        System.out.println(word);

        Optional<String> word = Optional.ofNullable(words[5]);
        word.ifPresent(System.out::println); // Safe execution

        Optional<String> opt = Optional.of(""); opt.ifPresent(val -> System.out.println("Value: " + val));

    }
}
