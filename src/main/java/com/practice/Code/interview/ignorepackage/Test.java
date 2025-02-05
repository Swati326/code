package com.practice.Code.interview.ignorepackage;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Test {
    public static void main(String[] args) {
        Person person = new Person("John Doe", 40);

        try {
            // Specify the file name
            String fileName = "c://person.txt";

            // Write the object to the file
            try (FileOutputStream fileOut = new FileOutputStream(fileName);
                 ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
                out.writeObject(person);
                System.out.println("Serialized data is saved in: " + new java.io.File(fileName).getAbsolutePath());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
