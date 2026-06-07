package com.practice.Code.DS.pr4;

public class FindKthLargestElement {

    public static void main(String[] args) {
        //🔥 Next Problem: Find the Kth Largest Element in an Array

        int arr[] = {2, 5, 8, 3, 9, 12};
        int k = 1;

        for (int i = 0; i < k; i++) {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]<arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }


        }
        System.out.println(arr[k-1]);
    }
}
