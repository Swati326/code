package zemoso;

public class majorityelement {
    public static void main(String[] args) {

        int a[]={2,2,2,2,3,2,2};
        int temp = 0;
   int c=1;


        for(int i = 0; i < a.length; i++) {

            for (int j = i + 1; j < a.length; j++) {

                if (a[i] == a[j])
                {
                    c++;
                    temp=c;
                }
            }
        }
    }
}
