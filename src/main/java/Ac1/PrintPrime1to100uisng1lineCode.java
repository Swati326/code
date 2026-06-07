package Ac1;

import java.util.stream.IntStream;

public class PrintPrime1to100uisng1lineCode {

    public static void main(String[] args) {

        IntStream.rangeClosed(2,100)
                .filter(n-> IntStream.rangeClosed(2,(int)Math.sqrt(n)).noneMatch(i->n%i==0))
                .forEach(System.out::println);
    }
}
