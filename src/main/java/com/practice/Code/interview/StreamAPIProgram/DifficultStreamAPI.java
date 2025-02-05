package com.practice.Code.interview.StreamAPIProgram;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DifficultStreamAPI {

   /* 🔥 Problem Statement:
    Given a list of sentences, perform the following operations using Stream API:

    Extract all unique words (ignoring case).
    Count occurrences of each word.
    Sort the words based on frequency in descending order.
    If frequencies are equal, sort lexicographically.
    Print the top 5 most frequent words.

    */

    public static void main(String[] args) {
        List<String> sentences = Arrays.asList(
                "Java is awesome and Java is powerful",
                "Stream API is powerful and makes Java coding easy",
                "Functional programming with Java is great"
        );
        List<String> collect = sentences.stream().flatMap(s -> Arrays.stream(s.split(" "))).distinct().collect(Collectors.toList());
        System.out.println(collect);


        Map<String, Long> collect1 = sentences.stream().flatMap(s -> Arrays.stream(s.split(" "))).collect(Collectors.groupingBy(p -> p, Collectors.counting()));
        System.out.println(collect1);

    }
}
