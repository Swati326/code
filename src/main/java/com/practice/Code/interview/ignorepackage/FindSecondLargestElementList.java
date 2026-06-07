package com.practice.Code.interview.ignorepackage;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindSecondLargestElementList {

    public static void main(String[] args) {


        List<Integer> integerList = Arrays.asList(1, 3, 5, 7);
        Optional<Integer> secondLargest = integerList.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println(secondLargest);

        Integer integer= integerList.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);
        System.out.println(integer);


    }
}
