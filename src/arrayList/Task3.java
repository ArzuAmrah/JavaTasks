package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> name = new ArrayList<>();

        while (true) {
            System.out.println("Add name:");
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("q")){
                break;
            };
            name.add(input);
        }
        System.out.println(name);

        System.out.println("add car model");
        String model = sc.nextLine();

        if(name.contains(model)){
            name.remove(model);
            System.out.println("This element remove from arraylist");
        }else{
            System.out.println("This element ist not found");
        }
        System.out.println("Update list is:" + " " + name);
    }
}
