package com.lucio.leetcode.c_ls;

public class LongestSubstring {
    public int lengthOfLongestSubstring(String string) {
        int max = 0;
        int[] ascii = new int[128];

        for (int left = 0, right = 0; right < string.length(); right++) {
            char character = string.charAt(right);
            left = Math.max(left, ascii[character]);
            max = Math.max(max, right - left + 1);
            ascii[character] = right + 1;
        }

        return max;
    }
}
