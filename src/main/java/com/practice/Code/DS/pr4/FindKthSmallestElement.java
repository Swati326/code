package com.practice.Code.DS.pr4;

public class FindKthSmallestElement {

    public static void main(String[] args) {
        //🔥 Next Problem: Find the Kth Largest Element in an Array

        int arr[] = {2, 5, 8, 3, 9, 12};
        int k=1;

        for (int i = 0; i < k;i++)
        {
            for (int j=i+1;j<arr.length;j++)
            {
                if (arr[i]>arr[j])
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

/*
Explaination:

int[] arr = {7, 10, 4, 3, 20, 15};
int k = 3;
Step-by-step Execution:
i = 0 → Find the smallest from {7, 10, 4, 3, 20, 15}

3 is the smallest → Swap it with 7
Array becomes: {3, 10, 4, 7, 20, 15}
i = 1 → Find the smallest from {10, 4, 7, 20, 15}

4 is the smallest → Swap it with 10
Array becomes: {3, 4, 10, 7, 20, 15}
i = 2 → Find the smallest from {10, 7, 20, 15}

7 is the smallest → Swap it with 10
Array becomes: {3, 4, 7, 10, 20, 15}
 */
