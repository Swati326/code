package zemoso;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


//amout *10/100

public class FilterBy20KandIncreaseBy10percent {

    public static void main(String[] args) {

        List<Integer> integers= Arrays.asList(10000,20000,3000,60000);
        List<Integer> collect = integers.stream().filter(s -> s < 20000).
                map(s -> s+ (s * 10/100)).collect(Collectors.toList());
        System.out.println(collect);
    }
}
