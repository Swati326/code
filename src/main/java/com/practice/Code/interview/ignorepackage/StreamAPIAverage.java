package com.practice.Code.interview.ignorepackage;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Q. Calculate the average age of a list of Person objects using Java streams:
public class StreamAPIAverage {

    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("John",23));
        personList.add(new Person("Jisa",20));
        personList.add(new Person("Misa",21));

        OptionalDouble averageAge= personList.stream().mapToInt(Person::getAge).average();
        System.out.println(averageAge);

        //find the length of each string in list
        List<String> words = Arrays.asList("apple", "banana", "kiwi", "orange", "grape", "pear");
        Map<String, Integer> collect = words.stream().collect(Collectors.toMap(s->s, String::length));
        System.out.println(collect);


        // Group the words by their first letter
        Map<Character, List<String>> collect1 = words.stream().collect(Collectors.groupingBy(w -> w.charAt(0)));
        System.out.println(collect1);

        // Group the words by their length
        Map<Integer, List<String>> collect2 = words.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(collect2);

        // Group by first letter and count occurrences
        Map<Character, Long> collect3 = words.stream().collect(Collectors.groupingBy(w -> w.charAt(0),Collectors.counting()));
        System.out.println(collect3);

        // Write a program to find the maximum and minimum number from a list using the Stream API.
        List<Integer> numbers = Arrays.asList(10, 20, 5, 25, 15);
        Optional<Integer> max = numbers.stream().max(Integer::compare);
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println(max);
        System.out.println(sum);

        //
        String input = "hello world hello everyone";

        Map<String, Long> wordCount = Arrays.stream(input.split(" "))
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()));

        System.out.println(wordCount);
    }
}
