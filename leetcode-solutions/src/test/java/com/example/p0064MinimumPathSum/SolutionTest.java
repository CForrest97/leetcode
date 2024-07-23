package com.example.p0064MinimumPathSum;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void testSolution() {
        Solution solution = new Solution();
        assertEquals(7, solution.minPathSum(
                new int[][] {
                        { 1, 3, 1 },
                        { 1, 5, 1 },
                        { 4, 2, 1 }
                }));
        assertEquals(12, solution.minPathSum(
                new int[][] {
                        { 1, 2, 3 },
                        { 4, 5, 6, },
                }));
    }
}
