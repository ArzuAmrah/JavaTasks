package org.example.lesson48;

import java.io.*;

public class PersonApp {

    public static final String RESOURCE = "src/lesson48/recources/";

//    public static void main(String[] args) {
//        Person person = new Person(1, "Arzu", "Amrahova" );
//
//        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(RESOURCE + "person.ser"));
//             ObjectOutputStream oos = new ObjectOutputStream(bos)) {
//            oos.writeObject(person);
//            System.out.println("Obyekt fayla yazıldı: " + person);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("person.ser"));
//             ObjectInputStream ois = new ObjectInputStream(bis)) {
//            Person readPerson = (Person) ois.readObject();
//            System.out.println("Fayldan oxunan obyekt: " + readPerson);
//        } catch (IOException | ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//
//    }
}
