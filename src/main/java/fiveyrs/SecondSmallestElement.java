package fiveyrs;

public class SecondSmallestElement {

    public static void main(String[] args) {

        int a[]={2,7,8,14,9};
        int min=  Integer.MAX_VALUE;  //200 eg
        int secondMin=  Integer.MAX_VALUE; //200 eg

        for(int i=0;i<a.length;i++)
        {
            if(a[i]<min) //7<2
            {
                secondMin=min;
                min=a[i]; //2
                // 2,200
            } else if (a[i]<secondMin && a[i]!=min) {
                secondMin=a[i]; //sec =4

            }
        }
        System.out.println(secondMin);
    }
}
