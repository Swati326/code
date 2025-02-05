package com.practice.Code.interview.ignorepackage;

public class MergeTwoArrayWithManualLoop {
    public static void main(String[] args) {

        int array1[] = {1, 4, 6, 9,98,65};
        int array2[] = {5, 7, 11, 12,1,68};
        int temp;
        int array3[]=new int[array1.length+array2.length];
        for (int i = 0; i <= array1.length-1; i++) {
            array3[i]=array1[i];
        }

        for (int i = 0; i <= array2.length-1; i++) {
            array3[(array3.length-array1.length)+i]=array2[i];
        }
        for (int i = 0; i <= array3.length-1; i++) {
            //System.out.println(array3[i]);
            for (int j=i+1;j<=array3.length-1;j++)
            {
                if(array3[i]>array3[j])
                {
                   temp= array3[i];
                   array3[i]=array3[j];
                   array3[j]=temp;
                }
            }
        }

        for (int i = 0; i <= array3.length-1; i++) {
            System.out.println(array3[i]);
        }

    }
}
