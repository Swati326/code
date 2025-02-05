package com.practice.Code.interview.ignorepackage;


    import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

    public class MostRepeatedCharacterWord {
        public static void main(String[] args) {
            String input = "Swathi springboot spring";

            // Split the input into words
            String[] words = input.split("\\s+");

            // Find the word with the most repeated character
            String wordWithMostRepeatedChar = Arrays.stream(words)
                    .max(Comparator.comparingLong(word -> getMostRepeatedCharCount(word))) // Compare by the highest char frequency
                    .orElse(null); // Handle case when input is empty

            if (wordWithMostRepeatedChar != null) {
                System.out.println("Word with Most Repeated Character: " + wordWithMostRepeatedChar);
            } else {
                System.out.println("No word found in the input.");
            }
        }

        // Helper method to calculate the count of the most repeated character in a word
        private static long getMostRepeatedCharCount(String word) {
            return word.chars() // Get a stream of character ASCII values
                    .mapToObj(c -> (char) c) // Convert to Stream<Character>
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())) // Count each character
                    .values() // Get the counts of characters
                    .stream() // Stream the counts
                    .max(Comparator.naturalOrder()) // Find the maximum count
                    .orElse(0L); // Return 0 if no characters
        }
    }


