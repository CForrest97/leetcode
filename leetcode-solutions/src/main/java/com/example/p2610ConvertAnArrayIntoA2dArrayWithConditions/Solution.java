package com.example.p2610ConvertAnArrayIntoA2dArrayWithConditions;

import java.util.*;

public class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());
        int[] counts = new int[nums.length + 1];
        int max = 0;

        for (int num : nums) {
            int count = counts[num];
            if (count > max) {
                max = count;
                list.add(new ArrayList<>());
            }
            counts[num]++;
            list.get(count).add(num);
        }

        return list;
    }
}