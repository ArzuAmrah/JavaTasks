package lesson39;

import java.util.Arrays;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "world", "java", "programming");
        String delimiter = "-";

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < words.size(); i++) {
            String capitalizedWord = words.get(i).substring(0, 1).toUpperCase() + words.get(i).substring(1);
            sb.append(capitalizedWord);

            if (i < words.size() - 1) {
                sb.append(delimiter);
            }
        }

        String result = sb.toString();
        System.out.println(result);
    }
}
