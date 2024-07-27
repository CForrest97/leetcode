package com.example.p2976MinimumCostToConvertString1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public long minimumCost(String source, String target, char[] original, char[] changed, int[] cost) {
        int[][] costMap = new int[26][26];
        int[][] minCostMap = new int[26][26];
        for (int i = 0; i < 26; i++) {
            Arrays.fill(costMap[i], Integer.MAX_VALUE);
            Arrays.fill(minCostMap[i], Integer.MAX_VALUE);
        }

        for (int i = 0; i < original.length; i++)
            costMap[original[i] - 'a'][changed[i] - 'a'] = Math.min(cost[i],
                    costMap[original[i] - 'a'][changed[i] - 'a']);

        for (int i = 0; i < 26; i++)
            updateMinCostMap(minCostMap, costMap, i);

        long sum = 0;

        for (int i = 0; i < source.length(); i++) {
            int d = minCostMap[source.charAt(i) - 'a'][target.charAt(i) - 'a'];

            if (d == Integer.MAX_VALUE)
                return -1;
            sum += d;
        }

        return sum;
    }

    private void updateMinCostMap(int[][] minCostMap, int[][] costMap, int start) {
        int[] distances = minCostMap[start];
        distances[start] = 0;

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);

        while (!queue.isEmpty()) {
            int j = queue.poll();
            for (int i = 0; i < 26; i++) {
                int cost = costMap[j][i];

                if (cost != Integer.MAX_VALUE) {
                    int d = distances[j] + costMap[j][i];
                    if (d < distances[i]) {
                        queue.offer(i);
                        distances[i] = d;
                        costMap[start][i] = d;
                    }
                }
            }
        }
    }
}