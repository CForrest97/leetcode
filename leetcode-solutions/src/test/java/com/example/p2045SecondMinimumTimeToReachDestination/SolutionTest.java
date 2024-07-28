package com.example.p2045SecondMinimumTimeToReachDestination;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void testSolution() {
        Solution solution = new Solution();
        assertEquals(11, solution.secondMinimum(
                2,
                new int[][] { { 1, 2 } },
                3,
                2));
        assertEquals(12, solution.secondMinimum(
                6,
                new int[][] { { 1, 2 }, { 1, 3 }, { 2, 4 }, { 3, 5 }, { 5, 4 }, { 4, 6 } },
                3,
                100));
        assertEquals(13, solution.secondMinimum(
                5,
                new int[][] { { 1, 2 }, { 1, 3 }, { 1, 4 }, { 3, 4 }, { 4, 5 } },
                3,
                5));
    }
}
