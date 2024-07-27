package com.example.p1334FindTheCityWithTheSmallestNumberOfNeighborsAtAThresholdDistance;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void testSolution() {
        Solution solution = new Solution();
        assertEquals(3, solution.findTheCity(
                4,
                new int[][] {
                        { 0, 1, 3 },
                        { 1, 2, 1 },
                        { 1, 3, 4 },
                        { 2, 3, 1 }
                }, 4));
        assertEquals(0, solution.findTheCity(
                5,
                new int[][] {
                        { 0, 1, 2 },
                        { 0, 4, 8 },
                        { 1, 2, 3 },
                        { 1, 4, 2 },
                        { 2, 3, 1 },
                        { 3, 4, 1 }
                },
                2));
    }
}
