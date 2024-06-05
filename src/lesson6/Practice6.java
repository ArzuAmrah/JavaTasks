package lesson6;

import java.util.Scanner;

public class Practice6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if ( num % 2 == 0 && num != 0){
            System.out.println("The number is even");
        } else if (num % 2 == 1) {
            System.out.println("The number is odd");
        }else{
            System.out.println("number is equal zero");
        }

        Scanner sc1 = new Scanner(System.in);
        int number = sc1.nextInt();

        if (number % 3 == 0 && number % 5 == 0  ){
            System.out.println("Fizz Buzz");
        } else if (number % 3 == 0) {
            System.out.println("Fizz");
        }else if (number % 5 == 0 ){
            System.out.println("Buzz");
        }else{
            System.out.println(number);
        }
    }

}
