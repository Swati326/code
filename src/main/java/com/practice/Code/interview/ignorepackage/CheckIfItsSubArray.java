package com.practice.Code.interview.ignorepackage;

public class CheckIfItsSubArray {

    //21. Given two unsorted arrays. Check if the second array is a subarray of the first array.
    //Example:
    //Input :
    //arr1 = {2, 3, 0, 5, 1, 1, 2}
    //arr2 = {3, 0, 5, 1}
    //Output :
    //True
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5, 6};
        int arr2[] = {1, 2, 4};
        //int p[]={1,2,3,4,5}

        int c = 0;

        if (arr2.length > arr1.length) {
            System.out.println("false");
        }
        for (int i = 0; i <= arr2.length - 1; i++) {
            for (int j = 0; j <= arr1.length - 1; j++) {
                if (arr2[i] == arr1[j]) {
                    c++;
                    //1,2,3,4,5
                }


            }


        }

        if (arr2.length == c || arr2.length < c) {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }


    }

}
