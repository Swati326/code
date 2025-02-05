package com.practice.Code.interview.ignorepackage;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateCount {
    public static void main(String[] args) {
        //20-Write a program to find the only duplicate count list in the List.
     /*   List<String> list= Arrays.asList("java","python","java","react","js");
        Map<String, Long> duplicateCount = list.stream()
                .collect(Collectors.groupingBy(n->n, Collectors.counting()));
       Map<String,Long> finalOutput= duplicateCount.entrySet().stream().filter(stringLongEntry -> stringLongEntry.getValue()>1)
                        .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
        System.out.println(finalOutput);

      */


        List<Integer> integerList=Arrays.asList(1,4,5,3,1);
      /* Map<Integer,Long> finalResult= integerList.stream().collect(Collectors.groupingBy(integer -> integer,Collectors.counting())).
                entrySet().stream().filter(integerLongEntry -> integerLongEntry.getValue()>1).
                collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(finalResult);
        
       */

        Map<Integer, Long> collect = integerList.stream().collect(Collectors.groupingBy(i -> i, Collectors.counting())).entrySet().
                stream().filter(entry -> entry.getValue() > 1).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println(collect);
    }
}
