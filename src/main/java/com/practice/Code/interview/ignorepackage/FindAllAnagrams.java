package com.practice.Code.interview.ignorepackage;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class FindAllAnagrams {

    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();

        // If p is longer than s, we can't find an anagram
        if (s.length() < p.length()) {
            return result;
        }

        // Step 1: Create a frequency map for string p
        HashMap<Character, Integer> pMap = new HashMap<>();
        for (char c : p.toCharArray()) {
            pMap.put(c, pMap.getOrDefault(c, 0) + 1);  // Count each character in p
        }

        // Step 2: Create a frequency map for the current window in s
        HashMap<Character, Integer> windowMap = new HashMap<>();
        for (int i = 0; i < p.length(); i++) {
            windowMap.put(s.charAt(i), windowMap.getOrDefault(s.charAt(i), 0) + 1);  // Count the characters in the window
        }

        // Step 3: Compare maps and slide the window
        if (pMap.equals(windowMap)) {
            result.add(0);  // Add starting index of the anagram if the maps are equal
        }

        // Now, slide the window through string s
        for (int i = p.length(); i < s.length(); i++) {
            // Add the new character to the window
            char newChar = s.charAt(i);
            windowMap.put(newChar, windowMap.getOrDefault(newChar, 0) + 1);

            // Remove the character that slides out of the window
            char oldChar = s.charAt(i - p.length());
            windowMap.put(oldChar, windowMap.get(oldChar) - 1);
            if (windowMap.get(oldChar) == 0) {
                windowMap.remove(oldChar);  // Remove the character if its count is zero
            }

            // Compare the maps again after sliding the window
            if (pMap.equals(windowMap)) {
                result.add(i - p.length() + 1);  // Add the starting index of the anagram
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        System.out.println(findAnagrams(s, p));  // Output: [0, 6]
    }
}
