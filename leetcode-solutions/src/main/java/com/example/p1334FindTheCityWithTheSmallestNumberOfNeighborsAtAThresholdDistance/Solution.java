package com.example.p1334FindTheCityWithTheSmallestNumberOfNeighborsAtAThresholdDistance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int[] connections = new int[n];
        List<List<int[]>> edgesFromCities = new ArrayList<>(n);
        for (int i = 0; i < n; i++)
            edgesFromCities.add(new ArrayList<>());

        for (int[] edge : edges) {
            edgesFromCities.get(edge[0]).add(new int[] { edge[1], edge[2] });
            edgesFromCities.get(edge[1]).add(new int[] { edge[0], edge[2] });
        }

        for (int i = 0; i < n; i++) {
            int[] distances = new int[n];
            Arrays.fill(distances, Integer.MAX_VALUE);
            distances[i] = 0;

            Queue<Integer> queue = new PriorityQueue<>((a, b) -> Integer.compare(distances[a], distances[b]));

            queue.offer(i);

            while (!queue.isEmpty()) {
                int node = queue.poll();
                int currentDistance = distances[node];
                for (int[] edgesFromCity : edgesFromCities.get(node)) {
                    if (currentDistance + edgesFromCity[1] <= distanceThreshold) {

                        if (distances[edgesFromCity[0]] > currentDistance + edgesFromCity[1]) {
                            if (distances[edgesFromCity[0]] == Integer.MAX_VALUE)
                                connections[i]++;
                            distances[edgesFromCity[0]] = currentDistance + edgesFromCity[1];
                            queue.offer(edgesFromCity[0]);
                        }
                    }
                }
            }
        }

        int min = Integer.MAX_VALUE;
        int minIndex = -1;

        for (int i = 0; i < n; i++)
            if (min >= connections[i]) {
                min = connections[i];
                minIndex = i;
            }

        return minIndex;
    }
}