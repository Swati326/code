package com.practice.Code.interview.StreamAPIProgram;

import org.apache.logging.log4j.util.PropertySource;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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


        //15. Merge Two Lists and Remove Duplicates

        List<List<String>> strings=Arrays.asList( Arrays.asList("neha","meena","bhagyashri","smita"),Arrays.asList("mina"));
        List<List<String>> strings1=Arrays.asList(Arrays.asList("Ankit","sharvari","mahir","smita","reena"));
         List<String> collect3= Stream.concat(strings.stream(), strings1.stream()).flatMap(Collection::stream).distinct().collect(Collectors.toList());

        System.out.println(collect3);



        List<List<String>> stringsa = Arrays.asList(
                Arrays.asList("neha", "meena", "bhagyashri", "smita"),
                Arrays.asList("mina")
        );

        List<String> stringsb = Arrays.asList("Ankit", "sharvari", "mahir", "smita", "reena");

        List<String> collect4 = Stream.concat(stringsa.stream(), Stream.of(stringsb)).flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println(collect4);


       /* 14. Find the Most Frequent Character in a String
        Given a string, find the character that appears most frequently.
        If there are multiple characters with the same frequency, return the lexicographically smallest one.

        */

        String s="mississippi";
        Character character = s.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, Collectors.counting())).entrySet()
                .stream().filter(e -> e.getValue() > 1).findFirst().map(Map.Entry::getKey).orElse(null);
        System.out.println(character);

        Map<Character, Long> characterLongMap = s.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting())).entrySet()
                .stream().filter(e -> e.getValue() > 1).

                findFirst().map(e -> Map.of(e.getKey(), e.getValue())).orElseGet(Collections::emptyMap);
        System.out.println(characterLongMap);


        Map<Character, Long> characterLongMap1 = s.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c,LinkedHashMap::new, Collectors.counting())).entrySet()
                .stream().filter(e -> e.getValue() > 1).sorted(
                        (e1, e2) -> {
                            int fre = Long.compare(e1.getValue(), e2.getValue());
                            if (fre != 0)
                                fre = e1.getKey().compareTo(e2.getKey());
                            return fre;
                        }).findFirst().map(e -> Map.of(e.getKey(), e.getValue())).orElseGet(Collections::emptyMap);
        System.out.println(characterLongMap1);

    }

}
