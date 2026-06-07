package Ac1;

public class Identicalelement {
    public static void main(String[] args) {

        // 23332264444
        int a[]={1,2,3,3,3,2,2,6,4,4,4,4};
        for(int i=0;i<a.length;i++)
        {
            int c=a[i]; //c=3
            int p=1;
            for(int j=i+1;j<a.length;j++)
            {

                if(a[i]==a[j])
                {
                    p++; //3

                }else {
                    break;
                }
            }
            if(c==p)
            {
                System.out.println(c);
            }
        }
    }
}

