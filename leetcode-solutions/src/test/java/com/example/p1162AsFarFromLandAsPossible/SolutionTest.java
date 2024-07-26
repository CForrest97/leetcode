package com.example.p1162AsFarFromLandAsPossible;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void testSolution() {
        Solution solution = new Solution();
        assertEquals(2, solution.maxDistance(new int[][] {
                { 1, 0, 1 },
                { 0, 0, 0 },
                { 1, 0, 1 }
        }));
        assertEquals(4, solution.maxDistance(new int[][] {
                { 1, 0, 0 },
                { 0, 0, 0 },
                { 0, 0, 0 }
        }));
        assertEquals(4, solution.maxDistance(new int[][] {
                { 1, 0, 0 },
                { 0, 0, 0 },
                { 0, 0, 0 }
        }));
        assertEquals(-1, solution.maxDistance(new int[][] {
                { 0, 0, 0 },
                { 0, 0, 0 },
                { 0, 0, 0 }
        }));
        assertEquals(-1, solution.maxDistance(new int[][] {
                { 1, 1, 1 },
                { 1, 1, 1 },
                { 1, 1, 1 }
        }));
        assertEquals(-1, solution.maxDistance(new int[][] {}));
    }
}
