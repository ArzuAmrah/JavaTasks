package lesson34;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetInterface {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        set.add("Arzu");
        set.add("Elnur");
        set.add("Nicat");
        set.add("Rustam");
        set.add("Nicat");

        System.out.println(set);
    }
}
