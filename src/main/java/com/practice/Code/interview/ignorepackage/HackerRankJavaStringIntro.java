package com.practice.Code.interview.ignorepackage;


import java.util.Scanner;

public class HackerRankJavaStringIntro {
    //Sample Input 0
    //
    //hello
    //java
    //Sample Output 0
    //
    //9
    //No
    //Hello Java
    //Explanation 0
    //
    //String  is "hello" and  is "java".
    //
    // has a length of , and  has a length of ; the sum of their lengths is .
    //When sorted alphabetically/lexicographically, "hello" precedes "java"; therefore,  is not greater than  and the answer is No.
    //
    //When you capitalize the first letter of both  and  and then print them separated by a space, you get "Hello Java".
    public static void main(String[] args) {
        System.out.println("Enter First String");
        Scanner scanner=new Scanner(System.in);
        String s1=scanner.nextLine();
        System.out.println("Enter First String");
        Scanner scanner1=new Scanner(System.in);
        String s2=scanner1.nextLine();
        //1
        int combineStringsSize=s1.length()+s2.length();
        System.out.println(combineStringsSize);

        //2

        //siya
        //Siyaram

       if(s1.compareTo(s2)>0)
       {
           System.out.println("No");
       }
        }



}
