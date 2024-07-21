package com.example.p0417PacificAtlanticWaterFlow;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private void floodFill(int[][] heights, boolean[][] ocean, int r, int c) {
        if (r > 0 && !ocean[r - 1][c] && heights[r][c] <= heights[r - 1][c]) {
            ocean[r - 1][c] = true;
            floodFill(heights, ocean, r - 1, c);
        }
        if (c > 0 && !ocean[r][c - 1] && heights[r][c] <= heights[r][c - 1]) {
            ocean[r][c - 1] = true;
            floodFill(heights, ocean, r, c - 1);
        }
        if (r < heights.length - 1 && !ocean[r + 1][c] && heights[r][c] <= heights[r + 1][c]) {
            ocean[r + 1][c] = true;
            floodFill(heights, ocean, r + 1, c);
        }
        if (c < heights[0].length - 1 && !ocean[r][c + 1] && heights[r][c] <= heights[r][c + 1]) {
            ocean[r][c + 1] = true;
            floodFill(heights, ocean, r, c + 1);
        }
    }

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int rows = heights.length;
        int cols = heights[0].length;
        boolean[][] pacific = new boolean[rows][cols];
        boolean[][] atlantic = new boolean[rows][cols];

        for (int c = 0; c < cols; c++) {
            pacific[0][c] = true;
            atlantic[rows - 1][c] = true;
        }

        for (int r = 0; r < rows; r++) {
            pacific[r][0] = true;
            atlantic[r][cols - 1] = true;
        }

        List<List<Integer>> result = new ArrayList<>();

        for (int r = 0; r < rows; r++)
            for (int c = 0; c < cols; c++) {
                if (pacific[r][c])
                    floodFill(heights, pacific, r, c);
                if (atlantic[r][c])
                    floodFill(heights, atlantic, r, c);
            }

        for (int r = 0; r < rows; r++)
            for (int c = 0; c < cols; c++)
                if (atlantic[r][c] && pacific[r][c])
                    result.add(List.of(r, c));

        return result;

    }
}