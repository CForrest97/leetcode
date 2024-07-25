package com.example.p0787CheapestFlightsWithinKStops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        List<List<int[]>> connections = new ArrayList<List<int[]>>(n);
        for (int i = 0; i < n; i++)
            connections.add(new ArrayList<>());

        for (int[] flight : flights)
            connections.get(flight[0]).add(new int[] { flight[1], flight[2] });

        int[] seen = new int[n];
        Arrays.fill(seen, Integer.MAX_VALUE);
        seen[src] = 0;
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] { src, 0 });

        for (int i = 0; i < k + 1; i++) {
            int size = queue.size();

            for (int j = 0; j < size; j++) {
                int[] node = queue.poll();
                for (int[] connection : connections.get(node[0])) {
                    int sum = connection[1] + node[1];

                    if (seen[connection[0]] > sum) {
                        queue.offer(new int[] { connection[0], sum });
                        seen[connection[0]] = sum;
                    }

                }
            }
        }

        return seen[dst] == Integer.MAX_VALUE ? -1 : seen[dst];
    }
}