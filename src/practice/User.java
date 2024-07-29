package practice;

public class User {
    public static void main(String[] args) {
        int[] arr = new int[1];


        int a = 15;

        try {
            System.out.println(a / 1);
            System.out.println(arr[3]++);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
