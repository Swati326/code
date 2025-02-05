package com.practice.Code.interview.StreamAPIProgram;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class WordWithHighestLength {

    public static void main(String[] args) {

        String s="I am learning Stream API in java";
        // find out highest leghth word in string

        Optional<String> max = Arrays.stream(s.split(" ")).max(Comparator.comparing(String::length));
        System.out.println(max);

    }
}
