package Ac1;

import java.util.*;
import java.util.stream.Collectors;

public class SingletonClass {

    private static SingletonClass singletonClass;

    public static SingletonClass getInstance() {
        if (singletonClass == null) {
            new SingletonClass();
        }
        return singletonClass;
    }


    interface A {
        default void show() {
            System.out.println("A");
        }
    }

    interface B {
        default void show() {
            System.out.println("B");
        }
    }

    class Test implements A, B {


        @Override
        public void show() {
            A.super.show();
        }
    }

    public static void main(String[] args) {
        /*

        Find duplicate elements
        Find unique elements
        Find count of each element

         */

        List<String> names = Arrays.asList("Java", "Spring", "Hibernate", "Java", "Spring");

        List<Map.Entry<String, Long>> collect4 = names.stream().collect(Collectors.groupingBy(s -> s, Collectors.counting())).entrySet().stream().filter(e -> e.getValue() > 1).collect(Collectors.toList());
        //2️⃣2️⃣ Find longest string using streams

        System.out.println("Result: "+collect4);
        Optional<String> max1 = names.stream().max(Comparator.comparing(String::length));
        System.out.println(max1);

        Optional<String> max = names.stream().max(Comparator.comparing(String::length));
        System.out.println(max);
        String s1="java";
        List<Map.Entry<String, Long>> collect = names.stream().collect(Collectors.groupingBy(s -> s, Collectors.counting())).entrySet().stream().filter(stringLongEntry ->
                stringLongEntry.getValue() > 1).collect(Collectors.toList());
        System.out.println(collect);

        List<String> collect2 = names.stream().distinct().collect(Collectors.toList());
        System.out.println(collect2);

        List<String> collect3 = names.stream().distinct().collect(Collectors.toList());
        System.out.println(collect3);

        List<Map.Entry<Character, Long>> collect1 = s1.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting())).entrySet().stream().collect(Collectors.toList());
        System.out.println(collect1);



    }
}

