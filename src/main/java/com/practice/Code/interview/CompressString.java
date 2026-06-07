package com.practice.Code.interview;

import java.util.Map;
import java.util.stream.Collectors;

public class CompressString {

    public static void main(String[] args) {
        //✅Compress the string "aabcccccaaa" into "a2b1c5a3" with minimal space complexity.
        String s="aabcccccaaa";
        int a[]=new int[s.length()];
        int c=0;
        for(int i=0;i<s.length();i++)
        {

            for (int j=i+1;j<s.length();j++)
            {
                if(s.charAt(i)==s.charAt(j))
                {
                   c++;
                }
                break;
            }
            System.out.print(a[i]+c);
        }
        //Map<Character, Long> collect = s.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        //System.out.println(collect);
    }
}
