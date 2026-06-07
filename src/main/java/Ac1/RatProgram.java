package Ac1;

import java.util.Scanner;

public class RatProgram {
    /*

    The function accepts two positive integers ‘r’ and ‘unit’ and a positive integer array ‘arr’ of size ‘n’ as
    its argument ‘r’ represents the number of rats present in an area,
    ‘unit’ is the amount of food each rat consumes and each ith element of array
    ‘arr’ represents the amount of food present in ‘i+1’ house number, where 0 <= i
Note:

Return -1 if the array is null
Return 0 if the total amount of food from all houses is not sufficient for all the rats.
Computed values lie within the integer range.
Example:

Input:

r: 7
unit: 2
n: 8
arr: 2 8 3 5 7 4 1 2
Output:

4
     */

    public static int suffiecentfood(int r, int unit, int n, int arr[])
    {
        int sf=r*unit; //14
        int rf=0;
        int c=0;
        for (int i=0;i<n;i++)
        {
            //2 8 3 5 7 4 1 2

                rf=rf+arr[i]; //rf=18
                c++; //3


            if(rf>=sf)
            {
                break;
            }
        }


        return c;
    }


    public static void main(String[] args) {
        int r=7;
        int unit=2;
              Scanner scanner=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=scanner.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter element in array");
        scanner.nextLine();
        for (int i=0;i<n;i++) {
           arr[i] =scanner.nextInt();
        }
        int result=suffiecentfood(r,unit,n, arr);
        System.out.println(result);


    }
}
