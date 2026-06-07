package Ac1;

import java.util.Scanner;

public class PasswordVerifier {
    /*
    You are given a function.
int CheckPassword(char str[], int n);
The function accepts string str of size n as an argument. Implement the function which returns 1 if given string str is valid password else 0.
str is a valid password if it satisfies the below conditions.

– At least 4 characters
– At least one numeric digit
– At Least one Capital Letter
– Must not have space or slash (/)
– Starting character must not be a number
Assumption:
Input string will not be empty.
     */

     static int CheckPassword(char str[], int n){
        int c=0;
        boolean isfourchar=false;
        boolean isoneDigit=false;
        boolean isOneUpperCase=false;
        boolean isSpace=false;
        boolean isStartNum=false;

         if(Character.isDigit(str[0]))
         {
             isStartNum=true;
         }
         if(n>=4)
         {
             isfourchar=true;
         }
         //buy1
         for(int i=0;i<str.length;i++)
         {


            if( Character.isDigit(str[i]) )
            {
                isoneDigit=true;
            }

             if( Character.isUpperCase(str[i]))
             {
                 isOneUpperCase=true;
             }
             if(Character.isSpaceChar(str[i]) || str[i]=='/' )
             {
                 isSpace=true;
             }


             }

         if(isfourchar  && isoneDigit&& isOneUpperCase && !isSpace && !isStartNum)
         {
             c=1;
             return c;
         }



       return c;
    }

    public static void main(String[] args) {
        System.out.println("Enter a password");
        Scanner scanner = new Scanner(System.in);
        String s=scanner.nextLine();

       char str[]=s.toCharArray();
       int r=CheckPassword(str,s.length());
        System.out.println(r);
    }

}


