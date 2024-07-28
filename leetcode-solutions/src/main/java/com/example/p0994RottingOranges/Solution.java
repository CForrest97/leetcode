package com.example.p0994RottingOranges;

import java.util.*;

public class Solution {
    public int orangesRotting(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        Queue<int[]> queue = new LinkedList<>();

        for (int y = 0; y < rows; y++)
            for (int x = 0; x < cols; x++)
                if (grid[y][x] == 2)
                    queue.offer(new int[] { x, y });

        if (queue.size() == 0) {
            for (int y = 0; y < rows; y++)
                for (int x = 0; x < cols; x++)
                    if (grid[y][x] == 1)
                        return -1;
            return 0;
        }

        int turns = -1;

        while (!queue.isEmpty()) {
            turns++;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] pos = queue.poll();
                int x = pos[0], y = pos[1];

                if (x > 0 && grid[y][x - 1] == 1) {
                    grid[y][x - 1] = 2;
                    queue.offer(new int[] { x - 1, y });
                }
                if (y > 0 && grid[y - 1][x] == 1) {
                    grid[y - 1][x] = 2;
                    queue.offer(new int[] { x, y - 1 });
                }
                if (x < cols - 1 && grid[y][x + 1] == 1) {
                    grid[y][x + 1] = 2;
                    queue.offer(new int[] { x + 1, y });
                }
                if (y < rows - 1 && grid[y + 1][x] == 1) {
                    grid[y + 1][x] = 2;
                    queue.offer(new int[] { x, y + 1 });
                }
            }
        }

        for (int y = 0; y < rows; y++)
            for (int x = 0; x < cols; x++)
                if (grid[y][x] == 1)
                    return -1;

        return turns;
    }
}