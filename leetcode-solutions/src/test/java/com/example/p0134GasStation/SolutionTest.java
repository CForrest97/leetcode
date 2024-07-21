package com.example.p0134GasStation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void testTwoSum() {
        Solution solution = new Solution();
        assertEquals(3, solution.canCompleteCircuit(new int[] { 1, 2, 3, 4, 5 }, new int[] { 3, 4, 5, 1, 2 }));
        assertEquals(-1, solution.canCompleteCircuit(new int[] { 2, 3, 4 }, new int[] { 3, 4, 3 }));
    }
}
