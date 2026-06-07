package com.practice.Code.poly;

import org.springframework.security.core.parameters.P;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestPoly {

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {

        TestPoly testPoly = new TestPoly();
        testPoly.add(3, 7);
        testPoly.add(6, 7, 9);

        Student student1 = new Student(1, 53);
        Student student2 = new Student(2, 43);
        Student student3 = new Student(1, 23);
        List<Student> studentList = Arrays.asList(student1, student2, student3);
        List<Student> finallist = studentList.stream().sorted(Comparator.comparing(student -> student.getAge())).collect(Collectors.toList());
        System.out.println(finallist);
        int arr[] = {16, 17, 4, 3, 5, 2};
        int arr1[] = new int[5];
        int c = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (arr[i] >= arr[j]) {
                    c++;

                }
            }
            if (c > 0) {
                arr1[i] = arr[i];
            }
        }
        for (int i = 0; i < arr1.length - 1; i++) {
           // System.out.println(arr1[i]);
        }





    /*
    Given an array arr[] of size n, the task is to find all the Leaders in the array. An element is a Leader if it is greater than or equal to all the elements to its right side.

Examples:

Input: arr[] = [16, 17, 4, 3, 5, 2]
Output: [17 5 2]

Input: arr[] = [1, 2, 3, 4, 5, 2]
Output: [5 2]
     */
    /*
    Reverse digits of a number.
            Input: 12345, output: 54321
    Input: 200, output: 2

    i

*/

        int n = 12345;


        while (n > 0) {
           int d=n%10;
             n=n/10;
            System.out.print(d);

        }


    }
}
