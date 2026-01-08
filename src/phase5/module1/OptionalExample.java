package phase5.module1;

import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {

        String s = null;
       // System.out.println(s.length());  // This will throw NullPointerException

        Optional<String> optional = Optional.ofNullable(s);
        System.out.println(optional.isPresent() ? optional.get().length() : "String is null");

        message();


    }

    static void message() {
        System.out.println("Hello from OptionalExample");
    }
}
