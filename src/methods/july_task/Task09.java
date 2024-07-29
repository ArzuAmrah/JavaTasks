package methods.july_task;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Task09 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();


        try {
            parseInt("Arzu");
        } catch (NumberFormatException e) {
            throw new CustomNumberFormatException("This is not a number");
        }

    }
}
