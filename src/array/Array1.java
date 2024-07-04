package array;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        double[] arr = new double[size];
        double sum = 0;


        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.round(Math.random() * 100);
            sum += arr[i];
        }

        System.out.println(sum);

    }
}
