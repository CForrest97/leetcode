package com.example.p0279PerfectSquares;

import java.util.Arrays;

public class Solution {
    public int numSquares(int n) {
        int[] nums = new int[n + 1];
        Arrays.fill(nums, Integer.MAX_VALUE);
        nums[0] = 0;

        for (int i = 1; i <= n; i++)
            for (int j = 1; j * j <= i; j++)
                nums[i] = Math.min(nums[i], 1 + nums[i - (j * j)]);

        return nums[n];
    }
}