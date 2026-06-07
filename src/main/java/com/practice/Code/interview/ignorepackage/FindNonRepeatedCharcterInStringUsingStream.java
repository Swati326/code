package com.practice.Code.interview.ignorepackage;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindNonRepeatedCharcterInStringUsingStream {

    public static void main(String[] args) {
        String input = "swiss";
        Character first = input.chars().mapToObj(c -> (char) c).
                collect(Collectors.groupingBy(character -> character, LinkedHashMap::new, Collectors.counting())).
                entrySet().stream().filter(a -> a.getValue() == 1).map(Map.Entry::getKey).findFirst().orElse(null);


        Map<Character, Long> characterLongMap = input.chars().mapToObj(c -> (char) c).
                collect(Collectors.groupingBy(character -> character, LinkedHashMap::new, Collectors.counting())).
                entrySet().stream().filter(a -> a.getValue() == 1).findFirst().map(entry -> Collections.singletonMap(entry.getKey(), entry.getValue())) // Convert to a single-entry map
                .orElse(Collections.emptyMap());

        System.out.println(first);
        System.out.println(characterLongMap);


      Character charnew =  input.chars().mapToObj(c->(char) c).collect(Collectors.groupingBy(c->c,LinkedHashMap::new,Collectors.counting())).
                entrySet().stream().filter(c->c.getValue()==1).map(Map.Entry::getKey).findFirst().orElse(null);
        System.out.println(charnew);

        Map<Character, Long> collect = input.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        // find the length of each string in stream API


        //////////
        Optional<Character> first1 = input.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().
                filter(characterLongEntry -> characterLongEntry.getValue() == 1).map(Map.Entry::getKey).findFirst();

        System.out.println("Non-repeated:"+first1);
        /////////


       // String input = "swiss";
        Map.Entry<Character, Long> characterLongEntry = input.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, Collectors.counting())).entrySet()
                .stream().filter(e -> e.getValue() == 1).findFirst().orElse(null);

        System.out.println(characterLongEntry);


    }
}
