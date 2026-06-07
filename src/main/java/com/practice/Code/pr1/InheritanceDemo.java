package com.practice.Code.pr1;

import java.util.*;
import java.util.stream.Collectors;

class A {

    static {
        System.out.println("Static block: Class A");
    }

    public A() {
        System.out.println("Constructor: Class A");
    }

    public void m1() {
        System.out.println("m1 method : Class A");
    }
}
class B extends A{
    static {
        System.out.println("Static block: Class B");
    }
    public B() {
        System.out.println("Constructor: Class B");
    }

    public void m1() {
        System.out.println("m1 method : Class A");
    }
}

class Main {
    public static void main(String[] args) {
      //  B b = new B();
      //  b.m1();

        List<String> list = Arrays.asList("one", "two", "three", "four");

        list.stream()
                .filter(s -> s.length() > 3)
                .peek(s -> System.out.println("Filtered: " + s))
                .map(String::toUpperCase)
                .peek(s -> System.out.println("Mapped: " + s))
                .collect(Collectors.toList());

       /* List<Integer> list= Arrays.asList(5,8,2,13,42,56,24,36);
        Integer integer= list.stream().sorted(Comparator.comparing(Integer::intValue).reversed()).skip(1).findFirst().orElse(null);
        System.out.println(integer);
        ////153
        //1cube+5 cube+ 3 cute
        num=153;
        int n= ;
        while (n>0)
        {

            n=%10;

            c++;
        }
    }

}
 /*s1="abc"
s2="abc"

s1.equals.s2= true
s1==s2= true

s2=s1+s2

  */

        List<List<String>> l = Arrays.asList(
                Arrays.asList("Java", "Python"),
                Arrays.asList("C++", "Rust")
        );
        List<String> collect = l.stream().flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println(collect);

    }
}





