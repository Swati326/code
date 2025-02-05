package com.practice.Code.interview.ignorepackage;
import java.io.Serializable;
public class Person implements Serializable {
        private static final long serialVersionUID = 1L;

        private String name;
        private int age;

        // Constructor
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Getters and toString() for display
        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return "Person{name='" + name + "', age=" + age + "}";
        }
    }


