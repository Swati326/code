package com.practice.Code.poly;

import org.springframework.boot.actuate.autoconfigure.metrics.MetricsProperties;

import java.util.*;

public class LongestRepeatedSubstring {

    public static void main (String arg[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String");
        String s=scanner.nextLine();

        int maxLen=0;

        for(int i=0;i<s.length();i++)
        {
            String temp="";
            for(int j=i;j<s.length();j++)
            {
                if(temp.indexOf(s.charAt(j))!=-1)
                {
                    break;
                }
                temp = temp+s.charAt(j);
                maxLen=Math.max(maxLen,temp.length());

            }
        }
        System.out.println("Longeste non repeated substring"+maxLen);
    }
}
