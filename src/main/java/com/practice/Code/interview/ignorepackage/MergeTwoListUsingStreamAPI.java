package com.practice.Code.interview.ignorepackage;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeTwoListUsingStreamAPI {
    // Q. Merge two sorted lists into a single sorted list using Java streams:

    public static void main(String[] args) {
        List<Integer> list1= Arrays.asList(2,5,6,1,9);
        List<Integer> list2= Arrays.asList(21,51,61,11,91);
        List<Integer> mergeList= Stream.of(list1,list2).flatMap(List::stream).sorted().collect(Collectors.toList());
        System.out.println(mergeList);


    }
}
