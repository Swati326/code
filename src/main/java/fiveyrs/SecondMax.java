package fiveyrs;

public class SecondMax {
    public static void main(String[] args) {

        int a[]={10,84,67,98,34};

        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        for(int i=1;i<a.length;i++)
        {
            if (a[i]>max)
            {
                secMax=max;
                max=a[i];
            }
            else if(a[i]>secMax && a[i]!=max)
            {
                secMax=a[i];
            }
        }
        System.out.println(secMax);
    }
}
