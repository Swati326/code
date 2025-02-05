package com.practice.Code.interview.ignorepackage;

import java.util.Scanner;

public class ReverseStringWithoutbuiltIn {

    public static String reverseString(String str)
    {
        char c[]=new char[str.length()];
        int j=0;
        for(int i=str.length()-1;i>=0;i--)
        {

           c[j]= str.charAt(i);
            j++;
        }
        String result="";

        for(char p: c)
        {
            result=result+p;
        }

        return result;
    }


    public static void main(String[] args) {
        System.out.println("Enter String");
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        String s= reverseString(str);
        System.out.println(s);

    }
}
