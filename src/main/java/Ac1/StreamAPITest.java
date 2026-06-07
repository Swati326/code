package Ac1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamAPITest {

    /*
    1️⃣ Find the second highest number
    2️⃣ Find the top 3 highest numbers
    3️⃣ Find the sum of all even numbers
     */

    public static void main(String[] args) {


    List<Integer> list= Arrays.asList(2,5,8,6,1);

    //
        Optional<Integer> max = list.stream().max(Comparator.comparing(Integer::intValue));
        list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        //
        Optional<Integer> first = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println(first);
        List<Integer> top3 = list.stream().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());
        System.out.println(top3);

        int sum = list.stream().filter(n -> n % 2 == 0).mapToInt(i -> i).sum();
        System.out.println(sum);
    }

}
