package eolymp;

import java.util.Scanner;

public class Task8371 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if( n % 2 ==0){
            System.out.println("EVEN");
        }else{
            System.out.println("ODD");
        }
    }
}