package com.example.p0063UniquePaths2;

public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int rows = obstacleGrid.length;
        int cols = obstacleGrid[0].length;

        int[] row = new int[cols];
        row[cols - 1] = 1;

        for (int y = rows - 1; y >= 0; y--) {
            if (obstacleGrid[y][cols - 1] == 1)
                row[cols - 1] = 0;

            for (int x = cols - 2; x >= 0; x--)
                row[x] = obstacleGrid[y][x] == 1 ? 0 : row[x] + row[x + 1];
        }

        return row[0];
    }
}