package fiveyrs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FindTopNNumbers {
        public static void main(String[] args) {
            //FindTopNNumbers
            int n=3;
            int a[]={2,5,7,91,43};
            //stream,desc,limit n
           // Arrays.stream(a).sorted(Comparator.reverseOrder()).limit(3); it will break as Its return IntStream not Stream
            // to convert IntStream to Stream we have boxed() method
            List<Integer> topN= Arrays.stream(a).boxed().sorted(Comparator.reverseOrder()).limit(n).collect(Collectors.toList());
            System.out.println(topN);


        }
    }

