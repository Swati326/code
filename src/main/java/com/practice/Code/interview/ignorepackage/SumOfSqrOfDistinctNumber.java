package com.practice.Code.interview.ignorepackage;

import java.util.*;
import java.util.stream.Collectors;

public class SumOfSqrOfDistinctNumber {

    // 9. Sum of Squares of Distinct Numbers

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 3, 5);
        //1,2,3,4
        //1+4+9+16+25
        Integer sum=  numbers.stream().distinct().map(n->n*n).mapToInt(Integer::intValue).sum();
        System.out.println(sum);

        // 8. Find the First Non-Repeated Character in a String

        //
         String input = "swiss";
         Character firstNonRepeatedCharcter=input.chars().mapToObj(c-> (char) c).collect(Collectors.groupingBy(c->c, LinkedHashMap::new,Collectors.counting()))
                 .entrySet().stream().filter(entry->entry.getValue()==1).map(Map.Entry::getKey).findFirst().orElse(null);

        System.out.println(firstNonRepeatedCharcter);

        List<List<Integer>> nestedList = Arrays.asList(
                Arrays.asList(1, 2, 3,9,9),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8, 9)
        );

        List<Integer> collect = nestedList.stream().flatMap(List::stream).distinct().collect(Collectors.toList());
        System.out.println(collect);

        // partition number into even and odd

        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Map<Boolean, List<Integer>> collect1 = numbers1.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println(collect1.get(true));
        System.out.println(collect1.get(false));

        List<String> words = Arrays.asList("apple", "banana", "kiwi", "pineapple", "pear");
        Optional<String> integer = Optional.of(words.stream().max(String::compareTo).orElse(null));
        System.out.println(integer);

        // 4. Group Employees by Department and Calculate Average Age


        //5. Group Products by Category and Find Total Price

        class Product {
            String name;
            String category;
            double price;

            Product(String name, String category, double price) {
                this.name = name;
                this.category = category;
                this.price = price;
            }
        }

        List<Product> products = Arrays.asList(
                new Product("Laptop", "Electronics", 1000),
                new Product("TV", "Electronics", 800),
                new Product("Shoes", "Fashion", 100),
                new Product("Shirt", "Fashion", 50),
                new Product("Fridge", "Appliances", 500)
        );

     Map<String,Double> p=products.stream().collect(Collectors.groupingBy(product -> product.category, Collectors.summingDouble(p1->p1.price)));
        System.out.println(p);

    }
}
