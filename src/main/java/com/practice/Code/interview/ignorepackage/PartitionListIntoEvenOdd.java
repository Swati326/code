package com.practice.Code.interview.ignorepackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionListIntoEvenOdd {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> evenNumber;
        List<Integer> oddNumber;
        Map<Boolean, List<Integer>> partitionList  = numbers.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
        evenNumber=partitionList.get(true);
        oddNumber=partitionList.get(false);
        System.out.println(evenNumber);
        System.out.println(oddNumber);

    }
}
