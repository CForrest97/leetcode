package com.example.p0994RottingOranges;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void testSolution() {
        Solution solution = new Solution();
        assertEquals(4, solution.orangesRotting(
                new int[][] {
                        { 2, 1, 1 },
                        { 1, 1, 0 },
                        { 0, 1, 1 }
                }));
        assertEquals(-1, solution.orangesRotting(
                new int[][] {
                        { 2, 1, 1 },
                        { 0, 1, 1 },
                        { 1, 0, 1 }
                }));
        assertEquals(0, solution.orangesRotting(
                new int[][] {
                        { 0, 2 }
                }));
        assertEquals(0, solution.orangesRotting(
                new int[][] {
                        { 0 }
                }));
    }
}
