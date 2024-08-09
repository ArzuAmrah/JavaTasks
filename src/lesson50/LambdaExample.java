package lesson50;

import java.util.function.*;

public class LambdaExample {
    public static void main(String[] args) {

        Function<String, Integer> stringLength = s -> s.length();

        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;

        Consumer<String> printString = s -> System.out.println(s);

        BiConsumer<String, String> concatenateAndPrint = (s, s2) -> System.out.println(s + " " + s2);

        Predicate<String> isLongerThanFive = p -> p.length() > 5;

        BiPredicate<Integer, Integer> areEqual = (a, b) -> a.equals(b);
        System.out.println("Length of 'Arzu': " + stringLength.apply("Arzu"));
        System.out.println("Sum of 10 and 20: " + add.apply(10, 20));

        printString.accept("Hello");
        concatenateAndPrint.accept("Arzu", "Əmrahova");

        System.out.println("Is 'Arzu' longer than 5 characters? " + isLongerThanFive.test("Arzu"));
        System.out.println("Are 10 and 20 equal? " + areEqual.test(10, 20));

    }
}
