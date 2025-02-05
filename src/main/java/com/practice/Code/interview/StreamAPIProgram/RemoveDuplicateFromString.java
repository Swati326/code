package com.practice.Code.interview.StreamAPIProgram;

import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateFromString {

    public static void main(String[] args) {

        // abdafhs
        //abdfhs

        String s="abdafhs";
        s.chars().mapToObj(c->(char) c).distinct().forEach(System.out::print);

    }
}
