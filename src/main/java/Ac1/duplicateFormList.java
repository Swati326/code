package Ac1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class duplicateFormList {

    public static void main(String[] args) {

        List<Integer> integers=List.of(2,6,9,2,4,9);
        List<Integer> collect = integers.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(collect);

        List<Integer> collecti=  integers.stream().collect(Collectors.groupingBy(a->a,Collectors.counting())).entrySet().stream().filter(e->e.getValue()>1).
                map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println("Result final"+collecti);

        List<Integer> integers1=List.of(2,6,9,2,4,9);
        List<Integer> integers2=List.of(22,11,91,12,54,19);

        List<Integer> collect1 = Stream.concat(integers1.stream(), integers2.stream()).sorted().collect(Collectors.toList());
        System.out.println(collect1);
    }
}
