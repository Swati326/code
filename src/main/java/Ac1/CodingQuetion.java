package Ac1;

import java.util.stream.Collectors;

public class CodingQuetion {
    public static void main(String[] args) {

        String s="abcbcdc";

       String result= s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(s1->s1,Collectors.counting()))
                .entrySet().stream().map(e->e.getKey()+""+e.getValue()).collect(Collectors.joining());
        System.out.println(result);

        String result1=s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(s2->s2,Collectors.counting())).entrySet().stream().
                map(e->e.getKey()+""+e.getValue()).collect(Collectors.joining());
        System.out.println(result1);

    }
}
