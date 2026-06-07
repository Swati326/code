package com.practice.Code.interview.StreamAPIProgram;

public class DemoTestOne implements Runnable {

    public static void main(String[] args) {


        int a[]={1,4,6};
        int num=3;
        checkValidNew(a, num);

    }

    public static void checkValidNew(int []a, int num)
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]-a[j]==num || a[j]-a[i]==num)
                {
                    System.out.println("The pair is: "+ a[i]+":" +a[j] );
                    //return true;
                }


            }
        }
    }



    public boolean checkValid(int [][] a)
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {

            }
        }

        return false;
    }

    @Override
    public void run() {



    }
}

// Input: matrix = [
// [1,2,3],
// [3,1,2],
// [2,3,1]
// ]
//Output: true
//Explanation: In this case, n = 3, and every row and column contains the numbers 1, 2, and 3.
//Hence, we return true.
