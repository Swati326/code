package com.practice.Code.interview.StreamAPIProgram;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcanateAllString {

    public static void main(String[] args) {

        List<String> s = Arrays.asList("javavfff", "Stream", "API");

        //   List<List<String>> collect = Stream.concat(s);
        // System.out.println(collect);

        String word = s.stream().max(Comparator.comparing(String::length)).orElse(null);
        System.out.println(word);

        String string = "owatiw";

        Map<Character, Long> characterLongMap = string.chars().mapToObj(c -> (char) c).
                collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().
                filter(entry -> entry.getValue() == 1).
                findFirst().map(e -> Map.of(e.getKey(), e.getValue())).orElse(null);
        System.out.println(characterLongMap);


        List<List<Integer>> integerList = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(3, 4),
                Arrays.asList(5, 6)
        );

        List<Integer> collect = integerList.stream().flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println(collect);


    }
}
