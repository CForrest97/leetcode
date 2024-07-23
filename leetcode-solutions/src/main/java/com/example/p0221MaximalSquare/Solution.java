package com.example.p0221MaximalSquare;

import java.util.Arrays;

public class Solution {
    public int maximalSquare(char[][] matrix) {
        int[] row = new int[matrix[0].length];
        int max = 0;

        for (int i = 0; i < row.length; i++)
            if (matrix[0][i] == '1') {
                row[i] = 1;
                max = 1;
            }

        for (int y = 1; y < matrix.length; y++) {
            int[] next = new int[matrix[0].length];

            if (matrix[y][0] == '1')
                next[0] = 1;

            for (int x = 1; x < matrix[y].length; x++)
                next[x] = matrix[y][x] == '0' ? 0 : 1 + Math.min(next[x - 1], Math.min(row[x], row[x - 1]));

            for (int i : next)
                max = Math.max(max, i);

            row = Arrays.copyOf(next, next.length);
        }

        return max * max;
    }
}