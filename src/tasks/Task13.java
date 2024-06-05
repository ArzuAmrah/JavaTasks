package tasks;

public class Task13 {
    public static void main(String[] args) {
        double width = 5.6;
        double height = 8.5;

//        Rectangle area
        double area = width * height;
        System.out.println("Area is " + width + " * " + height + " = " + area);

//        Rectangle perimeter
        double perimeter = 2 * (width + height);
        System.out.println("Perimeter is 2 * (" + width + " + " + height + ") = " + perimeter);

    }
}
