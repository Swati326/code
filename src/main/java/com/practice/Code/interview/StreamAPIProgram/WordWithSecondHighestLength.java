package com.practice.Code.interview.StreamAPIProgram;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class WordWithSecondHighestLength {

    public static void main(String[] args) {

        String s= "I am learning stream API in java";

        String s1 = Arrays.stream(s.split(" ")).sorted(Comparator.comparing(String::length).reversed()).skip(1).findFirst().orElse(null);
        System.out.println(s1);
    }
}
