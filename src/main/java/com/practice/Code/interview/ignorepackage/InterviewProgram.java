package com.practice.Code.interview.ignorepackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InterviewProgram {

   /*
    public static void main(String[] args) {
        //7- Write a program to find min and max numbers in the array.
        List<Integer>  integerList= Arrays.asList(1,4,11,7);
       Integer min= integerList.stream().min(Integer::compareTo).orElse(null);
        Integer max= integerList.stream().max(Integer::compareTo).orElse(null);
        System.out.println("min:" +min);
        System.out.println("max:" +max);

    }
    */
  /* public static void main(String[] args) {

               // Input: List of strings
               List<String> strings = Arrays.asList("apple", "banana", "apple", "orange", "banana", "grape");

               // Find duplicates using groupingBy and filter
               Map<String, Long> duplicates = strings.stream()
                       .collect(Collectors.groupingBy(str -> str, Collectors.counting())) // Count occurrences
                       .entrySet().stream()
                     .filter(entry -> entry.getValue()>1) // Filter duplicates
                       .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)); // Collect as Map

               // Print the duplicate strings and their counts
               System.out.println("Duplicate Strings:");
               duplicates.forEach((key, value) -> System.out.println(key + " : " + value));
           }

   */
    //9-Write a program to find the second-highest number in an array.

    public static void main(String[] args) {
        List<Integer> list =Arrays.asList( 3, 6, 32, 1, 8, 5, 31, 22 );
      Integer secondMax=  list.stream().sorted((a, b) -> b - a)                        // Sort in descending order
                .skip(1).findFirst().get();
        System.out.println(secondMax);
    }



}
