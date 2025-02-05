package com.practice.Code.interview.ignorepackage;


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class LambdaExample {
        public static void main(String[] args) {
            List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

            // Using Consumer lambda to print each element
            Consumer<String> printName = System.out::println;

            // Applying the consumer to the list
            names.forEach(printName);  // Output: Alice, Bob, Charlie


            UnaryOperator<Integer> unaryOperator= x->x+x;
            System.out.println(unaryOperator.apply(4));
        }


}
