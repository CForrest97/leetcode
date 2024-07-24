package com.example.p0279PerfectSquares;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void testSolution() {
        Solution solution = new Solution();
        assertEquals(3, solution.numSquares(12));
        assertEquals(2, solution.numSquares(13));
        assertEquals(4, solution.numSquares(7_168));
    }
}
