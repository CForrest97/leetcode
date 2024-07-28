package com.example.p2045SecondMinimumTimeToReachDestination;

import java.util.*;

public class Solution {
    public int secondMinimum(int n, int[][] edges, int time, int change) {
        Queue<Integer> queue = new LinkedList<>();
        int[][] visitedTimes = new int[n][2];
        for (int i = 0; i < n; i++)
            visitedTimes[i] = new int[] { -1, -1 };

        queue.offer(0);

        List<Set<Integer>> connections = new ArrayList<>();
        for (int i = 0; i < n; i++)
            connections.add(new HashSet<>());

        for (int[] edge : edges) {
            connections.get(edge[0] - 1).add(edge[1] - 1);
            connections.get(edge[1] - 1).add(edge[0] - 1);
        }

        int turn = 0;

        while (true) {
            if ((turn / change) % 2 == 1)
                turn = ((turn / change) + 1) * change;

            int size = queue.size();
            for (int i = 0; i < size; i++)
                for (int to : connections.get(queue.poll()))
                    if (visitedTimes[to][0] == -1) {
                        visitedTimes[to][0] = turn + time;
                        queue.offer(to);
                    } else if (visitedTimes[to][1] == -1 && visitedTimes[to][0] != (turn + time)) {
                        if (to == n - 1)
                            return turn + time;

                        visitedTimes[to][1] = turn + time;
                        queue.offer(to);
                    }

            turn += time;
        }
    }
}