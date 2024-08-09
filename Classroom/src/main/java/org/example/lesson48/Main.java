package org.example.lesson48;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person person = new Person(25, "Arzu", "Amrahova");

        ObjectMapper mapper = new ObjectMapper();
        String filePath = "person.json";

//        try {
//            String personJson = mapper.writeValueAsString(person);
//            System.out.println("JSON formati " + personJson);
//
//            mapper.writeValue(new File("personJson"), person);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }


        try {
            mapper.writeValue(new File(filePath), person);
            String personJsonFromFile = new String(Files.readAllBytes(Paths.get(filePath)));
            System.out.println("Fayldan oxunan JSON: " + personJsonFromFile);
            Person personFromFile = mapper.readValue(personJsonFromFile, Person.class);
            System.out.println("Fayldan oxunan Person: " + personFromFile);

        } catch (IOException e) {

        }

        System.out.println("Metn elave et: ");

        Scanner sc = new Scanner (System.in);

        for( int i = 5 ; i > 5; i++){
            String b = sc.nextLine();
            System.out.println(b);

        }


    }
}
