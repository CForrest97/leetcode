package com.example.p2405OptimalPartitionOfString;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void testSolution() {
        Solution solution = new Solution();
        assertEquals(4, solution.partitionString("abacaba"));
        assertEquals(6, solution.partitionString("ssssss"));
    }
}
