package lessonAtl;

public class Animal {
    String name;
    System weight;
    int age;

    public Animal(System weight, int age, String name) {
        this.weight = weight;
        this.age = age;
        this.name = name;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal(String name, System weight) {
        this.name = name;
        this.weight = weight;
    }

    public Animal(System weight, int age) {
        this.weight = weight;
        this.age = age;
    }

}
