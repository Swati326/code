package zemoso;

public class CompressCharacterBySeqRep {
    public static void main(String[] args) {

        String str="aaabbcccccddaa";
        char ch[]=str.toCharArray();
        //a3b2c3d2
        for(int i = 0; i < str.length(); i++) {
            int c=1;
            String temp = ""; //a

            for(int j = i+1; j < str.length(); j++) {
                {
                    if(ch[i]==ch[j] && ch[i]!='-')
                    {
                        c++;
                        ch[j]='-';

                    }
                }

            }
            if(ch[i]!='-') {
              //  System.out.print(ch[i]+""+c);
            }
            }
        String str1 = "aaabbccccccccddaa";

        int count = 1;

        for(int i = 0; i < str1.length() - 1; i++) {

            if(str1.charAt(i) == str1.charAt(i + 1)) {
                count++;
            } else {
                System.out.print(str1.charAt(i) + "" + count);
                count = 1;
            }
        }

        System.out.print(str1.charAt(str1.length() - 1) + "" + count);

        ///////////////

        int a[] = {2,2,2,2,4,4,5,5,6,6,6};

        int index = 0;

        for(int i = 0; i < str1.length() - 1; i++) {

            for(int j = i+1; j < str1.length() - 1; j++) {


            if (a[i] == a[j]) {
                a[index] = a[i];
                a[i + 1] = '-';
                index++;
            }
        }

            for (int k = 0; k < index; k++) {
                System.out.println(a[k]);


        }

        }


                int[] arr = {1, 1,1,1, 2, 2, 3, 4,1,1, 4, 5};

                System.out.print(arr[0] + " ");

                for(int i = 1; i < arr.length; i++) {

                    if(arr[i] != arr[i - 1]) {
                        System.out.print(arr[i] + " ");
                    }
                }
            }
        }


