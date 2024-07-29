package TaskAll;

import java.util.Arrays;
import java.util.Comparator;

public class StudentApp {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Arzu", 26, 90),
                new Student("Elnur", 27, 90),
                new Student("Rustam", 22, 85),
                new Student("Nicat", 21, 85),
                new Student("Khagani", 26, 95)
        };

        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int nameComparison = s1.getName().compareTo(s2.getName());
                if (nameComparison != 0) {
                    return nameComparison;
                } else {
                    int gradeComparison = Integer.compare(s1.getGrade(), s2.getGrade());
                    if (gradeComparison != 0) {
                        return gradeComparison;
                    } else {
                        return Integer.compare(s2.getAge(), s1.getAge());
                    }
                }
            }
        });

        System.out.println("Birinci sıra:");
        for (Student student : students) {
            System.out.println(student);
        }

        Arrays.sort(students);
        System.out.println("\nİkinci sıra:");
        for (Student student : students) {
            System.out.println(student);
        }

        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int gradeComparison = Integer.compare(s2.getGrade(), s1.getGrade());
                if (gradeComparison != 0) {
                    return gradeComparison;
                } else {
                    return Integer.compare(s1.getAge(), s2.getAge());
                }
            }
        });

        System.out.println("\nÜçüncü sıra:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
