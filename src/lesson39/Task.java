package lesson39;

import java.util.HashMap;

public class Task {
    public static void main(String[] args) {
        String countryName = "Azerbaijan";
        HashMap<Character, Integer> country = new HashMap<>();

        for (char letter : countryName.toCharArray()) {
            country.put(letter, country.getOrDefault(letter, 0) + 1);
        }
        System.out.println(country);
    }
}
