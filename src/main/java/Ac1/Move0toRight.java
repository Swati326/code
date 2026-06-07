package Ac1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Move0toRight {

    public static void main(String[] args) {

        List<Integer> integers= Arrays.asList(1,0,-3,0,5,-2,0,8,0,-4);
        // move all 0 to right
        // out/ 1,-3,5,-2,8,-4,0,0,0,0
        int[] ints = integers.stream().mapToInt(Integer::intValue).toArray();
        int temp=0; //1 || 0
        // 1 -3 5 0
        for (int i=0;i<ints.length-1;i++)
        {
            for (int j=i+1;j<ints.length;j++) {
                if (ints[i] == 0) {
                    temp = ints[j];
                    ints[j] = ints[i];
                    ints[i] = temp;
                }
            }
        }

        for (int i=0;i<ints.length;i++) {
            System.out.print(ints[i]);
        }


    }
}
