package beginwithjava;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter positive number");
        num = sc.nextInt();

        for(int i = 1; i <= 10;
        i++){
            System.out.println(num + " x " + i + " = " + num*i);
        }
    }
}
