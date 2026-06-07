package com.practice.Code.interview.StreamAPIProgram;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class NumberDivisibleBy7 {

    public static void main(String[] args) {

        List<Integer> integerList= Arrays.asList(3,14,67,34,12);
        List<Integer> collect = integerList.stream().filter(n -> n % 7 == 0).collect(Collectors.toList());
        System.out.println(collect);

        Optional<Integer> max = integerList.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        Optional<Integer> min = integerList.stream().skip(1).findFirst();


        System.out.println(min);
        System.out.println(max);
    }

    //9. Find Maximum and Minimum Number in List


}
