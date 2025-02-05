package com.practice.Code.interview.ignorepackage;

import java.util.Scanner;

public class LCM {

        // Function to calculate LCM using the manual approach
        public static int findLCM(int a, int b) {
            int max = (a > b) ? a : b;  // Start with the larger of the two numbers

            // Keep incrementing max until it is divisible by both a and b
            for (;;max++){
                if (max % a == 0 && max % b == 0) {
                    return max;  // Found the LCM
                }
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Input two numbers
            System.out.print("Enter the first number: ");
            int num1 = sc.nextInt();

            System.out.print("Enter the second number: ");
            int num2 = sc.nextInt();

            // Find LCM
            int lcm = findLCM(num1, num2);

            // Output result
            System.out.println("The LCM of " + num1 + " and " + num2 + " is: " + lcm);
        }


}
