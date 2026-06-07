package com.practice.Code.pr3;

import java.util.Scanner;

public class LargestSumSubArray {

    public static void main(String[] args) {


        System.out.println("Enter the size of array");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements in array");
        for (int i=0;i<n;i++)
        {
            a[i]=scanner.nextInt();
        }


        int mx=findLargestSumSubArray(a,n);
        System.out.println(mx);




    }

    public static int findLargestSumSubArray(int a[],int n)
    {
       int maxValue=Integer.MIN_VALUE;
       int sum=0;


       for (int start=0;start< n;start++)
       {
           sum=0;
           for (int end=start;end<n;end++)
           {
               sum=sum+a[end];
                maxValue=Integer.max(maxValue,sum);
           }
       }

        return maxValue;
    }
}

// -2,1,-3,4,-1,2,1,-5,4