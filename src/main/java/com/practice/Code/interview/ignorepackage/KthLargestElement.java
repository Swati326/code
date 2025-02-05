package com.practice.Code.interview.ignorepackage;

import java.util.Scanner;

public class KthLargestElement {

    public static void  main(String[] args) {
        int a[] = {1, 3, 4, 5, 10, 2, 14};
        Scanner sc = new Scanner(System.in); // Create Scanner object for console input
        System.out.println("Provide Kth value:");// Prompt the user
        int input = sc.nextInt();
        if (input > a.length) {
            System.out.println("There is no " + input + "TH index present in array");
        } else {
            for (int i = 0; i <= a.length - 1; i++) {
                for (int j = i + 1; j <= a.length - 1; j++) {
                    if (a[i] < a[j]) {
                        int temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    }
                }
            }
            for (int i = 0; i <= a.length - 1; i++) {
                // System.out.println(a[i]);
                if (i == (input - 1)) {
                    System.out.println(input + "th largest element is: " + a[i]);
                    break;
                }
            }

        }
    }

    // decending order
    // 14,10,5,4,3,2,1
}
