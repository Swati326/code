package com.practice.Code.interview.StreamAPIProgram;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyEachChar {

    public static void main(String[] args) {


        String s = "swaappppp";

        Map<Character, Long> collect = s.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(character -> character,LinkedHashMap::new, Collectors.counting()));
        System.out.println(collect);
    }
}
