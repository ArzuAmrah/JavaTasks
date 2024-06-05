package beginwithjava;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int data = 1;
        System.out.println("Enter positive number");
        num = sc.nextInt();

        for(int i = 1; i <= num; i++){
            data *= i;
        }
        System.out.println( " Factorial " + data);
    }
}
