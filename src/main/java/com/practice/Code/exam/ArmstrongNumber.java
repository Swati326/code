package com.practice.Code.exam;

import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int original = n;
        int sum = 0;
// 879
        while (n > 0) {
            int d = n % 10;         // Get last digit d=n%10
            //sum sum+d*d*d;
            //n=n/10
            sum =sum+ d * d * d;    // Cube it and add to sum
            n = n / 10;            // Remove last digit
        }

        if (sum == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is NOT an Armstrong number.");
        }
 // last digit= d=n%10;
        // sum=sum+(d*d*d)
        n=n/10;
        sc.close();
    }
}
