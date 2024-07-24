package com.example.p0034FindFirstAndLastPositionOfElementInSortedArray;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
    @Test
    public void testSolution() {
        Solution solution = new Solution();
        assertArrayEquals(new int[] { 3, 4 }, solution.searchRange(new int[] { 5, 7, 7, 8,
                8, 10 }, 8));
        assertArrayEquals(new int[] { 1, 2 }, solution.searchRange(new int[] { 5, 7, 7 }, 7));
        assertArrayEquals(new int[] { -1, -1 }, solution.searchRange(new int[] { 5, 7, 7, 8, 8, 10 }, 6));
        assertArrayEquals(new int[] { -1, -1 }, solution.searchRange(new int[] {}, 8));
    }
}
