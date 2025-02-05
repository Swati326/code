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

        // find the length of each string in stream API


    }
}
