package Ac1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindWordInSenWhichStartsFromB {

    public static void main(String[] args) {

        String s="apple bannana mango been box orange ble";

        List<String> stringList= Arrays.stream(s.split("\\s")).toList();
        List<String> b = stringList.stream().filter(s1 -> s1.toLowerCase().startsWith("b")).collect(Collectors.toList());
        System.out.println(b);
    }
}
