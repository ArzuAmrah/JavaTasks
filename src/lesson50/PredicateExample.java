package lesson50;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {
        Predicate<String> isLongerThanFive = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length() > 5;
            }
        };

        BiPredicate <Integer, Integer> areEqual = new BiPredicate<Integer, Integer>() {
            @Override
            public boolean test(Integer a, Integer b) {
                return a.equals(b);
            }
        };

        System.out.println("Is 'Arzu' longer than 5 characters? " + isLongerThanFive.test("Arzu"));
        System.out.println("Are 10 and 20 equal? " + areEqual.test(10, 20));
    }
}
