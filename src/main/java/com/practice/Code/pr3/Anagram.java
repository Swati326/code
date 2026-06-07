package com.practice.Code.pr3;
import java.util.Scanner;

public class Anagram {

        static boolean isAnagram(String a, String b) {
            // lim
            //mil
            boolean isAnagram=false;
            int count=0;

            char ch1[]=a.toLowerCase().toCharArray();
            char ch2[]=b.toLowerCase().toCharArray();
            int j=0;
            if(a.length()==b.length())
            {
                for(int i=0;i<ch1.length;i++)
                {
                    for(int k=j;k<ch2.length;k++)
                    {
                        if(ch1[i]==ch2[k]){
                            j=k+1;
                            count++;
                            break;
                        }
                    }
                }

            }
            else{
                return isAnagram;
            }
            if(count==a.length() && count==b.length())
            {
                return isAnagram=true;
            }
            return isAnagram;

            // Complete the function
        }

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            String a = scan.next();
            String b = scan.next();
            scan.close();
            boolean ret = isAnagram(a, b);
            System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
        }


}
