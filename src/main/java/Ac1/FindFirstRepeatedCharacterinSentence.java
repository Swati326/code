package Ac1;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindFirstRepeatedCharacterinSentence {

    public static void main(String[] args) {

        String s ="Java Stream is very good concept";
         s = s.replace(" ","");


    Character character=  s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(s1->s1,Collectors.counting()))
                .entrySet().stream().filter(e->e.getValue()>1).findFirst().get().getKey();
        System.out.println(character);
    }
}
