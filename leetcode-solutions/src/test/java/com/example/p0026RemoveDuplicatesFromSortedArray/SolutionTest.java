package com.example.p0026RemoveDuplicatesFromSortedArray;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void testSolution() {
        Solution solution = new Solution();
        assertEquals(3, solution.removeDuplicates(new int[] { 1, 2, 3 }));
        assertEquals(2, solution.removeDuplicates(new int[] { 1, 1, 2 }));
        assertEquals(5, solution.removeDuplicates(new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 }));
    }
}
