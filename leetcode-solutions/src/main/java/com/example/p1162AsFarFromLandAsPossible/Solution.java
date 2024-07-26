package com.example.p1162AsFarFromLandAsPossible;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int maxDistance(int[][] grid) {
        Queue<int[]> queue = new LinkedList<>();
        for (int y = 0; y < grid.length; y++)
            for (int x = 0; x < grid[0].length; x++)
                if (grid[y][x] == 1)
                    queue.offer(new int[] { x, y });

        if (queue.size() == 0 || queue.size() == grid.length * grid[0].length)
            return -1;

        int steps = -1;

        while (!queue.isEmpty()) {
            int size = queue.size();
            steps++;

            for (int i = 0; i < size; i++) {
                int[] pos = queue.poll();
                int x = pos[0];
                int y = pos[1];

                if (x > 0 && grid[y][x - 1] == 0) {
                    grid[y][x - 1] = 1;
                    queue.offer(new int[] { x - 1, y });
                }
                if (x < grid[0].length - 1 && grid[y][x + 1] == 0) {
                    grid[y][x + 1] = 1;
                    queue.offer(new int[] { x + 1, y });
                }
                if (y > 0 && grid[y - 1][x] == 0) {
                    grid[y - 1][x] = 1;
                    queue.offer(new int[] { x, y - 1 });
                }
                if (y < grid.length - 1 && grid[y + 1][x] == 0) {
                    grid[y + 1][x] = 1;
                    queue.offer(new int[] { x, y + 1 });
                }
            }
        }

        return steps;
    }
}