package com.example.p0417PacificAtlanticWaterFlow;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int rows = heights.length;
        int cols = heights[0].length;
        boolean[][] pacific = new boolean[rows][cols];
        boolean[][] atlantic = new boolean[rows][cols];

        for (int c = 0; c < cols; c++) {
            bfs(heights, pacific, 0, c);
            bfs(heights, atlantic, rows - 1, c);
        }

        for (int r = 0; r < rows; r++) {
            bfs(heights, pacific, r, 0);
            bfs(heights, atlantic, r, cols - 1);
        }

        List<List<Integer>> result = new ArrayList<>();

        for (int r = 0; r < rows; r++)
            for (int c = 0; c < cols; c++)
                if (atlantic[r][c] && pacific[r][c])
                    result.add(List.of(r, c));

        return result;
    }

    private void bfs(int[][] heights, boolean[][] ocean, int startR, int startC) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] { startR, startC });

        while (!queue.isEmpty()) {
            var pos = queue.poll();
            int r = pos[0];
            int c = pos[1];

            if (!ocean[r][c]) {
                ocean[r][c] = true;
                if (r > 0 && heights[r][c] <= heights[r - 1][c])
                    queue.offer(new int[] { r - 1, c });
                if (c > 0 && heights[r][c] <= heights[r][c - 1])
                    queue.offer(new int[] { r, c - 1 });
                if (r < heights.length - 1 && heights[r][c] <= heights[r + 1][c])
                    queue.offer(new int[] { r + 1, c });
                if (c < heights[0].length - 1 && heights[r][c] <= heights[r][c + 1])
                    queue.offer(new int[] { r, c + 1 });
            }
        }
    }
}