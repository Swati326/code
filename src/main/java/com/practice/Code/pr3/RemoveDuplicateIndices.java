package com.practice.Code.pr3;



    import java.io.*;
    import java.util.*;
    import java.util.stream.*;
import static java.util.stream.Collectors.joining;

//aabbb
//aabb


class Result {
    /*
     * Complete the 'getRemovableIndices' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. STRING str1
     *  2. STRING str2
     */


        /*
         * Complete the 'getRemovableIndices' function below.
         *
         * The function is expected to return an INTEGER_ARRAY.
         * The function accepts following parameters:
         *  1. STRING str1
         *  2. STRING str2
         */
        public static List<Integer> getRemovableIndices(String str1, String str2) {
            List<Integer> removableIndices = new ArrayList<>();
            char[] ch1 = str1.toCharArray();
            char[] ch2 = str2.toCharArray();

            int j = 0; // Pointer for str2

            // First loop iterates over str1
            for (int i = 0; i < ch1.length; i++) {
                boolean found = false;

                // Second loop iterates over str2 to find a matching character
                for (int k = j; k < ch2.length; k++) {
                    if (ch1[i] == ch2[k]) {
                        j=k+1;
                        found = true;
                        break;
                    }
                }

                // If character not found in str2, it's a removable index
                if (!found) {
                    removableIndices.add(i);
                }
            }

            return removableIndices;
        }
    }

    public class RemoveDuplicateIndices {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            String str1 = bufferedReader.readLine();
            String str2 = bufferedReader.readLine();

            List<Integer> result = Result.getRemovableIndices(str1, str2);

            System.out.println(
                    result.stream()
                            .map(Object::toString)
                            .collect(Collectors.joining(" ")) // Print indices separated by space
            );

            bufferedReader.close();
        }


}


