package zemoso;

public class CharctersAtBegining {
    public static void main(String[] args) {

        String str="a#b#c#d";
        //output="###abcd"
        String temp="";
        String temp2="";
        char ch[]=str.toCharArray();

        for(int i=0;i<str.length();i++)
        {
            if(ch[i]=='#')
            {
                temp=temp+ch[i]+"";

            }else
            {
                temp2=temp2+ch[i]+"";
            }
        }
        System.out.println(temp+temp2);

        StringBuilder stringBuilder=new StringBuilder();
        StringBuilder stringBuilder1=new StringBuilder();
        String str1="a1b2c3d";
        char ch1[]=str1.toCharArray();
        for (int i=0;i<str1.length();i++)
        {
            if(Character.isDigit(ch1[i]))
            {
                stringBuilder.append(ch1[i]);
            }
            else {
                stringBuilder1.append(ch1[i]);
            }
        }
        System.out.println(stringBuilder.append(stringBuilder1));



    }
}
