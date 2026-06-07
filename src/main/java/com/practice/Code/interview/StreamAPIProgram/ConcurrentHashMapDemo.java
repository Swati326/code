package com.practice.Code.interview.StreamAPIProgram;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {

        /*
         public static void main(String[] args) throws InterruptedException {
            Map<Integer, String> map = new HashMap<>();
            map.put(1, "Java");
            map.put(2, "Python");

            for (Integer key : map.keySet()) {
                map.put(3, "C++"); // Modifying while iterating
            }

            System.out.println(map); // Output may be {1=Java, 2=Python} OR {1=Java, 2=C++}
        }

          It will thrown an exception beacuse in hashmap read and write data concurrently is not possible.
         */


        public static void main(String[] args) throws InterruptedException {
            ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
            map.put(1, "Java");
            map.remove(2, "Python");

            for (Integer key : map.keySet()) {
                map.put(3, "C++"); // Modifying while iterating
            }

            System.out.println(map); // Output may be {1=Java, 2=Python} OR {1=Java, 2=C++}
        }


}
