package com.practice.Code.interview.ignorepackage;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class CountOfEachElementusingStream {
    //count each characters of strings using stream API
    public static void main(String[] args) {


        String s = "nnpu";

        Map<Character, Long> collect = s.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        System.out.println(collect);


       /* CompletableFuture<Integer> integerCompletableFutureTest=CompletableFuture.supplyAsync(
                add(5,7)
        )
    }

    static int add (int a, int b)
    {
        return a+b;
    }
    *
        */

        List<Integer> list= Arrays.asList(1,3,5,7);




    }
}
