package Testsss;

public class MoveAllZero {

    public static void main(String[] args) {
        /*
        Given an integer array, move all 0s to the end of the array while maintaining the relative order of the non-zero elements.

    You must do this in-place without creating another array.

    Example 1

Input:

[0, 1, 0, 3, 12]

Output:

[1, 3, 12, 0, 0]
         */

        int a[]={0,1,0,3,12};

        StringBuilder stringBuilder=new StringBuilder();
        StringBuilder stringBuilder1=new StringBuilder();

        for (int i = 0;i<a.length;i++)
        {
            if(a[i]!=0)
            {
                stringBuilder.append(a[i]);

            }
            else if(a[i]==0){
                stringBuilder1.append(a[i]);
            }
        }
        System.out.println(stringBuilder.append(stringBuilder1));


    }
}
