package com.practice.Code.interview.ignorepackage;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindCountFive {
    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("565", "987", "465", "352", "780");
        List<String> finalList = stringList.stream().filter(str -> str.contains("5")).collect(Collectors.toList());
        System.out.println(finalList);
    }
}
