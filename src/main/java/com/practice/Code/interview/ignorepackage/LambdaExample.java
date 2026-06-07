package com.practice.Code.interview.ignorepackage;


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class LambdaExample {

    interface Addable{
        int add(int a,int b);

    }


        public static void main(String[] args) {
            List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

            // Using Consumer lambda to print each element
            Consumer<String> printName = System.out::println;

            // Applying the consumer to the list
            names.forEach(printName);  // Output: Alice, Bob, Charlie


            UnaryOperator<Integer> unaryOperator= x->x+x;
            System.out.println(unaryOperator.apply(4));
            Addable addable= (int a, int b)->a+b;
            System.out.println(addable.add(5,7));
        }


}
