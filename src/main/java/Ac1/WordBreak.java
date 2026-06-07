package Ac1;

import io.micrometer.common.util.StringUtils;

import java.util.List;

public class WordBreak {

        public static boolean wordBreak(String s, List<String> wordDict) {
                int c=0;
                boolean result=false;
        //         wordBreak("catsandog", List.of(new String[]{"cats", "dog", "sand", "and", "cat"}));
            for (String word: wordDict) {
                if (s.contains(word)) {
                    int start = s.indexOf(word);
                    s = s.substring(0, start) + s.substring(start + word.length());
                    c++;

                }
            }
            if (wordDict.size() != c) {
                result = false;
            } else {
                result = true;
            }
            return result;
        }

    public static void main(String[] args) {
        System.out.println(wordBreak("catsandog", List.of(new String[]{"cats", "dog", "sand", "and", "cat"})));

    }

}
