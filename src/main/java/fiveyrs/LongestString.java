package fiveyrs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LongestString {
    //Find the longest string
    public static void main(String[] args) {


        List<String> list =Arrays.asList("we","are","always","happy");
        //stream,length,max
        String longest = list.stream().max(Comparator.comparing(String::length)).orElse(null);
        System.out.println(longest);

    }
}
