package com.example.p0063UniquePaths2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void testSolution() {
        Solution solution = new Solution();
        assertEquals(2, solution.uniquePathsWithObstacles(
                new int[][] { { 0, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } }));
        assertEquals(0, solution.uniquePathsWithObstacles(
                new int[][] { { 0, 0 }, { 1, 1 }, { 0, 0 } }));
    }
}
