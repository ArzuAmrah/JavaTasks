package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String addName = sc.nextLine();
        ArrayList<String> names = new ArrayList<>();
        names.add("Arzu");
        names.add("Nubar");
        names.add("Elnur");
        names.add("Xagani");
        names.add("Rustem");

        names.add(addName);

        if (names.contains(addName)){
            System.out.println(addName);
        }else{
            System.out.println("It is not available");


        }
    }
}
