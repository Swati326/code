package fiveyrs;

import java.util.Arrays;
import java.util.OptionalInt;

public class FindLargestElm {
    public static void main(String[] args) {


        int a[]={101,53,3,8,9};
        int max=a[0];

        Integer max1 = Arrays.stream(a).max().orElse(0);
        System.out.println(max1);
        // for loop

        for(int i=1;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        System.out.println(max);

    }
}
