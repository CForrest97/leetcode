package com.example.p0787CheapestFlightsWithinKStops;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void testSolution() {
        Solution solution = new Solution();
        assertEquals(6, solution.findCheapestPrice(4,
                new int[][] {
                        { 0, 1, 1 },
                        { 0, 2, 5 },
                        { 1, 2, 1 },
                        { 2, 3, 1 }
                }, 0, 3, 1));
        assertEquals(700, solution.findCheapestPrice(4,
                new int[][] {
                        { 0, 1, 100 },
                        { 1, 2, 100 },
                        { 2, 0, 100 },
                        { 1, 3, 600 },
                        { 2, 3, 200 }
                }, 0, 3, 1));
        assertEquals(200, solution.findCheapestPrice(3,
                new int[][] {
                        { 0, 1, 100 },
                        { 1, 2, 100 },
                        { 0, 2, 500 }
                }, 0, 2, 1));
        assertEquals(-1, solution.findCheapestPrice(3,
                new int[][] {
                        { 0, 1, 100 },
                        { 1, 2, 100 },
                        { 0, 2, 500 }
                }, 2, 0, 1));
        assertEquals(500, solution.findCheapestPrice(3,
                new int[][] {
                        { 0, 1, 100 },
                        { 1, 2, 100 },
                        { 0, 2, 500 }
                }, 0, 2, 0));
    }
}
