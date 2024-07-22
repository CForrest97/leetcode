package com.example.p0120Triangle;

import java.util.List;

public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int[] below = new int[triangle.size() + 1];
        for (int i = triangle.size() - 1; i >= 0; i--)
            for (int j = 0; j < triangle.get(i).size(); j++)
                below[j] = triangle.get(i).get(j) + Math.min(below[j], below[j + 1]);

        return below[0];
    }
}