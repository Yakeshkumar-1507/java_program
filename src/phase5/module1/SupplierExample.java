package phase5.module1;

import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {

        Supplier<String> getName =() -> "Yakesh Kumar";
        System.out.println(getName.get());

        Supplier <Integer> getAge = ()-> 18;
        System.out.println(getAge.get());


    }
}
