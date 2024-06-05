package tasks;
import java.util.Scanner;

public class Task32 {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        int first = sc.nextInt();

        Scanner scanner = new Scanner (System.in);
        int second = sc.nextInt();

        if (first != second){
            System.out.println(first + " != " + second);
        } ;
        if (first < second){
            System.out.println(first + " < " + second);
        }if (first <= second){
            System.out.println(first + " <= " + second);
        }
        scanner.close();
    }
}
