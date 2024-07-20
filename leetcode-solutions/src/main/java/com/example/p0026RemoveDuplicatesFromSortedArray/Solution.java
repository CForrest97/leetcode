package com.example.p0026RemoveDuplicatesFromSortedArray;

public class Solution {
    public int removeDuplicates(int[] nums) {
        int l = 0;

        for (int r = 1; r < nums.length; r++)
            if (nums[r] != nums[l])
                nums[++l] = nums[r];

        return l + 1;
    }
}