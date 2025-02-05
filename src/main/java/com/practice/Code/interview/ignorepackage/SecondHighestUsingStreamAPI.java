package com.practice.Code.interview.ignorepackage;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondHighestUsingStreamAPI {
    public static void main(String[] args) {


        //Given a list of integers, find the second-highest number using the Stream API.


        // sorted(Comparator.comparing(//Object and value //))
        //collect.collectors(Collectors.groupingBy(condition, count))
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50, 40);
        Integer first = numbers.stream().sorted(Comparator.comparing(Integer::intValue).reversed()).skip(1).findFirst().orElse(null);
        System.out.println(first);
    }

}
