package lesson50;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {

        Consumer<String> printString = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };

        BiConsumer<String, String> concatenateAndPrint = new BiConsumer<String, String>() {
            @Override
            public void accept(String s, String s2) {
                System.out.println(s + " " + s2);
            }
        };

        printString.accept("Hello");
        concatenateAndPrint.accept("Arzu", "Amrahova");
    }
}
