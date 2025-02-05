package com.practice.Code.interview.ignorepackage;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindFrequencyOfEachWord {

    public static void main(String[] args) {

        //Q. Given a list of strings, find the frequency of each word using Java streams:
        List<String> words = Arrays.asList("apple", "banana", "apple", "cherry",
                "banana", "apple");
        Map<String,Long> wordFrequency= words.stream().collect(Collectors.groupingBy(word->word,Collectors.counting()));
        System.out.println(wordFrequency);
    }
}
