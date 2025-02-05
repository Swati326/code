package com.practice.Code.interview.StreamAPIProgram;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.IntStream;
//hggy

public class WordLengthWithSecondHighest {

    public static void main(String[] args) {
        
        String s="I am learning stream API in java";
        Integer first = Arrays.stream(s.split(" ")).map(x -> x.length()).
                sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);
        System.out.println(first);

    }
}
