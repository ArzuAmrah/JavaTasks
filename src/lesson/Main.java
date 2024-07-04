package lesson;


import java.beans.JavaBean;

public class Main {
    public static void main(String[] args) {
        Lesson lesson = new Lesson("Java", 19);
        Lesson lesson1 = new Lesson("Java", 19);

        System.out.println(lesson);
        System.out.println(lesson1);
    }



}
