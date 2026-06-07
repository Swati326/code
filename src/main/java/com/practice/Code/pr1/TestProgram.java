package com.practice.Code.pr1;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestProgram {

    public static void main(String[] args) {

        String s= "This is cat cat";
        String s2[]=s.split(" ");
        System.out.println("word count "+s2.length);
        List<String> distinct = Arrays.stream(s2).distinct().collect(Collectors.toList());
        Map<String, Long> collect1 = Arrays.stream(s2).collect(Collectors.groupingBy(s3 -> s3, Collectors.counting()));
        System.out.println(collect1);
        System.out.println(distinct);
        String s1= s.replace(" ","");
        Map<Character, Long> collect = s1.chars().mapToObj(c -> (char) c).
                collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()));
        System.out.println(collect);
    }

}
