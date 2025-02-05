package com.practice.Code.interview.ignorepackage;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class HighestRepeatedCharacter {

    public static void main(String[] args) {


        String name = " Swathi springboot spring ";
        //output :- springboot

        // first seperated the string with blankspace
        name=name.replaceAll("//s","");
        System.out.println(name);

        Character character = name.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, Collectors.counting())).entrySet().stream()
                .filter(entry -> entry.getValue() > 1).map(Map.Entry::getKey).findFirst().orElse(null);
        System.out.println(character);


    }

}
