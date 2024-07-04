package happyfamily;

public class Main {
    public static void main(String[] args) {
        Human mother = new Human("Mom", "Mommy", 1970);
        Human father = new Human("Father", "Fatherrrr", 1969);
        Family family = new Family(mother, father);

        Human child1 = new Human("Arzu", "Amrah", 1998);
        Human child2 = new Human("Ali", "Amrah", 2000);

        family.addChild(child1);
        family.addChild(child2);

        Pet dog = new Pet("cat", "Yumush");
        family.setPet(dog);

        System.out.println(family);
        System.out.println("---------------");
        family.deleteChild(0);
        System.out.println("After deleting the first child:");
        System.out.println(family);
    }
}
