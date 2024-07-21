package com.example.p1492TheKthFactorOfN;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void testTwoSum() {
        Solution solution = new Solution();
        assertEquals(3, solution.kthFactor(12, 3));
        assertEquals(7, solution.kthFactor(7, 2));
        assertEquals(-1, solution.kthFactor(4, 4));
    }
}
