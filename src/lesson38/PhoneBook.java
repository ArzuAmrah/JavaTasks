package lesson38;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {
    private static Scanner sc = new Scanner(System.in);

    private static HashMap<String, String> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public static void addPhoneBook(Scanner sc) {
        String name = sc.nextLine();
        String phoneNumber = sc.nextLine();
        phoneBook.put(name, phoneNumber);
        System.out.println("Contact is added to the phone book " + name + " " + phoneNumber);
    }

    public static void removePhoneBook(Scanner sc) {
        String name = PhoneBook.sc.nextLine();
        if (phoneBook.containsKey(name)) {
            phoneBook.remove(name);
            System.out.println("Contact is removed from the phone book " + name);
        } else {
            System.out.println("Contact is not added tho the phone book " + name);
        }
    }

    public static void findContact(Scanner sc) {
        String name = PhoneBook.sc.nextLine();
        if (phoneBook.containsKey(name)) {
            System.out.println("Telephone number is: " + phoneBook.get(name));
        } else {
            System.out.println("Contact is not found : " + name);
        }
    }

    public static void displayAllContacts(Scanner sc) {
        if (phoneBook.isEmpty()) {
            System.out.println("Telephone number is empty.");
        } else {
            for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
                System.out.println("Nem: " + entry.getKey() + ", Telephone number is : " + entry.getValue());
            }
        }
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        boolean exit = true;

        while (exit) {
            System.out.println("\nTelefon kitabçası menyusu:");
            System.out.println("1. Yeni əlaqə əlavə et");
            System.out.println("2. Əlaqəni sil");
            System.out.println("3. Əlaqəni tap");
            System.out.println("4. Bütün əlaqələri göstər");
            System.out.println("5. Proqramdan çıx");
            System.out.print("Seçiminizi edin: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    addPhoneBook(sc);
                    break;
                case 2:
                    removePhoneBook(sc);
                    break;
                case 3:
                    findContact(sc);
                    break;
                case 4:
                    displayAllContacts(sc);
                    break;
                case 5:
                    exit = false;
                    break;
                default:
                    System.out.println("Try again");

            }
        }
    }
}

