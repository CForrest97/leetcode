package com.example.p0015ThreeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            int l = i + 1;
            int r = nums.length - 1;

            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (sum == 0)
                    result.add(List.of(nums[i], nums[l], nums[r]));

                if (sum <= 0)
                    do {
                        l++;
                    } while (l < r && nums[l] == nums[l - 1]);

                if (sum >= 0)
                    do {
                        r--;
                    } while (l < r && nums[r] == nums[r + 1]);

            }
        }

        return result;
    }
}