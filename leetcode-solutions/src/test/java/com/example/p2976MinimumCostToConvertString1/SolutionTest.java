package com.example.p2976MinimumCostToConvertString1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void testSolution() {
        Solution solution = new Solution();
        assertEquals(28, solution.minimumCost(
                "abcd",
                "acbe",
                new char[] { 'a', 'b', 'c', 'c', 'e', 'd' },
                new char[] { 'b', 'c', 'b', 'e', 'b', 'e' },
                new int[] { 2, 5, 5, 1, 2, 20 }));
        assertEquals(12, solution.minimumCost(
                "aaaa",
                "bbbb",
                new char[] { 'a', 'c' },
                new char[] { 'c', 'b' },
                new int[] { 1, 2 }));
        assertEquals(-1, solution.minimumCost(
                "abcd",
                "abce",
                new char[] { 'a' },
                new char[] { 'e' },
                new int[] { 10_000 }));
    }
}
