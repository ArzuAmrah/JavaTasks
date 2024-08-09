package lesson50;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<String, Integer> stringLength = new Function<String, Integer>() {
            public Integer apply(String s) {
                return s.length();
            }
        };

        BiFunction<Integer, Integer, Integer> add = new BiFunction<Integer,Integer,Integer>(){

            public Integer apply(Integer a, Integer b){
                return a + b;
            }
        };

        System.out.println("Length of Arzu: " + stringLength.apply("Arzu"));
        System.out.println("Sum of 10 and 20: " + add.apply(10, 20));
    }
}
