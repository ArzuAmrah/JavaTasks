package array;

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double[] num = new double[a];
//       for(int i = 0; i < num.length; i++){
//           num[i] = Math.random() * 100;
//       }
//
//        for (int i = 0; i < num.length; i++) {
//            System.out.println(num[i]);
//        }


        int[] b = new int[a];
        for (int i = 0; i < b.length; i++) {
            b[i] = (int) Math.round(Math.random() * 100);
        }

        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }

        int min = b[0];
        System.out.println("default " + min);
        for (int i = 1; i < b.length; i++) {
            if (min > b[i]) {
                min = b[i];
                System.out.println();
                System.out.println(min);
            }
        }


    }
}
