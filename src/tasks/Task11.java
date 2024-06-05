package tasks;

public class Task11 {
    public static void main(String[] args) {
        double r = 7.5;

//        Circle perimeter
        double perimeter = 2 * Math.PI * r;
        System.out.println(perimeter);

//        Circle area
        double area = Math.PI * Math.pow(r, 2);
        System.out.println(area);
    }
}
