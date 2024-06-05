package tasks;

public class Task15 {
    public static void main(String[] args) {
        int a = 25;
        int b = 15;
        System.out.println("Before: a = " + a + ", b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After: a = " + a + ", b = " + b);
    }
}
