package fiveyrs;

import java.util.Arrays;

public class SmallestNumber {
    public static void main(String[] args) {


        int a[]={101,53,3,8,9};
        int min=a[0];

        Integer min1 = Arrays.stream(a).min().orElse(0);
        // for loop

        for(int i=1;i<a.length;i++)
        {
            if(a[i]<min)
            {
                min=a[i];
            }
        }
        System.out.println(min);

    }
}
