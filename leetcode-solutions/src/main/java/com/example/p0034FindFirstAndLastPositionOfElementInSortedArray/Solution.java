package com.example.p0034FindFirstAndLastPositionOfElementInSortedArray;

public class Solution {
    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0)
            return new int[] { -1, -1 };

        int minL = 0;
        int maxL = nums.length - 1;
        int minR = 0;
        int maxR = nums.length - 1;

        int l = 0;
        int r = nums.length - 1;

        while (l < r) {
            int m = (l + r) / 2;
            if (nums[m] < target) {
                l = m + 1;
                minL = m + 1;
                minR = m + 1;
            } else if (nums[m] > target) {
                r = m - 1;
                maxL = m - 1;
                maxR = m - 1;
            } else {
                maxL = m;
                minR = m;
                break;
            }
        }

        if (l >= r) {
            if (nums[l] == target)
                return new int[] { l, r };
            return new int[] { -1, -1 };
        }

        int L, R = -1;

        while (minL + 1 < maxL) {
            int m = (minL + maxL) / 2;
            if (nums[m] < target) {
                minL = m + 1;
            } else if (nums[m] > target) {
                maxL = m - 1;
            } else {
                maxL = m;
            }
        }
        L = nums[minL] == target ? minL : maxL;

        while (minR + 1 < maxR) {
            int m = (minR + maxR) / 2;
            if (nums[m] > target) {
                maxR = m - 1;
            } else {
                minR = m;
            }
        }
        R = nums[maxR] == target ? maxR : minR;

        return new int[] { L, R };

    }
}