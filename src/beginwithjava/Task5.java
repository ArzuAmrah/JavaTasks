package beginwithjava;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int main;
         int power;
         int result = 1;

        System.out.println("Enter a number");
        main = sc.nextInt();

        System.out.println("Enter a power");
        power = sc.nextInt();

        for(int i = 1; i <= power; i++){
            result *= main;
        }
        System.out.println(" Result " + result);
    }
}
