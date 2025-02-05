package com.practice.Code.interview.ignorepackage;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateUsingStream {
    public static void main(String[] args) {
     //   Q. Remove duplicates from a list while preserving the order using Java streams:
        List<Integer> numbersWithDuplicates = Arrays.asList(1, 2, 3, 2, 4, 1, 5, 6, 5);
        List<Integer> integerList=  numbersWithDuplicates.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println(integerList);
    }
}
