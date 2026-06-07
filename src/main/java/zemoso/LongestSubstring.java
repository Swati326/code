package zemoso;

public class LongestSubstring {

    public static void main(String[] args) {

        String str = "pwwkew";
        int maxLength = 0;

        for(int i = 0; i < str.length(); i++) {

            String temp = ""; //a

            for(int j = i; j < str.length(); j++) {

                char ch = str.charAt(j);

                // Check duplicate
                if(temp.contains(ch + "")) {
                    break;
                }

                temp = temp + ch;

                if(temp.length() > maxLength) {
                    maxLength = temp.length();
                }
            }
        }

        System.out.println("Longest substring length = " + maxLength);
    }
}