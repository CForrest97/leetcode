package com.example.p0014LongestCommonPrefix;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        var sb = new StringBuilder();
        int minLength = strs[0].length();

        for (String s : strs)
            minLength = Math.min(minLength, s.length());

        main: for (int i = 0; i < minLength; i++) {
            char c = strs[0].charAt(i);
            for (String s : strs)
                if (c != s.charAt(i))
                    break main;

            sb.append(c);
        }

        return sb.toString();
    }
}