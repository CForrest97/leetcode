package com.example.p2405OptimalPartitionOfString;

public class Solution {
    public int partitionString(String s) {
        var seen = new boolean[26];
        int count = 1;

        for (char c : s.toCharArray()) {
            if (seen[c - 'a']) {
                count++;
                seen = new boolean[26];
            }
            seen[c - 'a'] = true;
        }

        return count;
    }
}