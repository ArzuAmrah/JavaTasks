package arrayList;

import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> num = new ArrayList<>();

        Collections.<Integer>emptyIterator();
        for (int i = 0; i < 5; i++) {
            System.out.print("Add number: ");
            double a = sc.nextDouble();
            num.add(a);
        }

        double sum = 0;

        for (double element : num) {
            sum += element;
        }

        double average = sum / num.size();

        System.out.println("Average is: " + average);

        sc.close();
    }
}
