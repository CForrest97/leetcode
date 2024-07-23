package com.example.p0064MinimumPathSum;

public class Solution {
    public int minPathSum(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int[] row = new int[cols];

        row[0] = grid[0][0];
        for (int x = 1; x < cols; x++)
            row[x] = grid[0][x] + row[x - 1];

        for (int y = 1; y < rows; y++) {
            row[0] += grid[y][0];
            for (int x = 1; x < cols; x++)
                row[x] = grid[y][x] + Math.min(row[x], row[x - 1]);
        }

        return row[cols - 1];
    }
}