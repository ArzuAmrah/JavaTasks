package arrayList;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.sort;

public class Task1 {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(Math.floor(Math.random() * 100));
            sort(list);
        }
        System.out.println(list);
    }
}
