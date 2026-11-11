package fiveyrs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseWordInString {

    public static void main(String[] args) {

        String statement="I love Java programming";
        //split,List of string,

        String s[]=statement.split(" ");
        for (int i=s.length-1;i>=0;i--)
        {
            //System.out.println(s[i]);
        }
        List<String> collect = Arrays.stream(s).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(collect);
    }
}
