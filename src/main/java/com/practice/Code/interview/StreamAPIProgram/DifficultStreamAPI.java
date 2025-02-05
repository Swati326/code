package com.practice.Code.interview.StreamAPIProgram;

import java.util.*;
import java.util.stream.Collectors;

public class DifficultStreamAPI {

   /* 🔥 Problem Statement:
    Given a list of sentences, perform the following operations using Stream API:

    Extract all unique words (ignoring case). - done
    Count occurrences of each word. - done
    Sort the words based on frequency in descending order. - done
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

        LinkedHashMap<String, Long> collect2 = sentences.stream().flatMap(s -> Arrays.stream(s.split(" ")))
                .collect(Collectors.groupingBy(p -> p, Collectors.counting())).entrySet().stream()
                .sorted( (a, b) -> { int fre= Long.compare(b.getValue(), a.getValue());
                                 if(fre==0)
                               fre=  a.getKey().compareTo(b.getKey());
                    return fre;
                }).limit(5).
                collect(Collectors.toMap
                        (Map.Entry::getKey,
                                Map.Entry::getValue,
                                (e1, e2) -> e2,
                                LinkedHashMap::new));
        System.out.println(collect2);

    }

}
