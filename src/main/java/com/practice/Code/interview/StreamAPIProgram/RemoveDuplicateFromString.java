package com.practice.Code.interview.StreamAPIProgram;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RemoveDuplicateFromString {

    public static void main(String[] args) {

        // abdafhs
        //abdfhs

        String s="abdafhs";
        s.chars().mapToObj(c->(char) c).distinct().forEach(System.out::print);
        Map<Character, Long> collect = s.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .entrySet().stream().filter(characterLongEntry ->characterLongEntry.getValue()>1).collect(Collectors.toMap(Map.Entry::getKey,
                        Map.Entry::getValue));
        System.out.println(collect);
    }
}
