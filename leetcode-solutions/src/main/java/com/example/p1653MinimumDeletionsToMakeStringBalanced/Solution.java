package com.example.p1653MinimumDeletionsToMakeStringBalanced;

public class Solution {
    public int minimumDeletions(String s) {
        int swaps = 0, bCount = 0;

        for (char c : s.toCharArray())
            if (c == 'b')
                bCount++;
            else if (bCount > 0) {
                swaps++;
                bCount--;
            }

        return swaps;
    }
}