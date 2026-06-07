package zemoso;

public class Palindrome {

    public static void main(String[] args) {

        String s="mah";
        char c[]=s.toCharArray();
        String temp="";
        for(int i=s.length()-1;i>=0;i--)
        {
            char c1 = s.charAt(i);
            temp=temp+c1;
        }
        if(s.equals(temp))
        {
            System.out.println("String is palindrom");
        }
        else {
            System.out.println("String is not palindraom");
        }
    }
}
