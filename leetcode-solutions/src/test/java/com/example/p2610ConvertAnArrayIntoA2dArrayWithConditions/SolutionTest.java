package com.example.p2610ConvertAnArrayIntoA2dArrayWithConditions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

public class SolutionTest {
    @Test
    public void testSolution() {
        Solution solution = new Solution();
        assertEquals(List.of(List.of(1, 3, 4, 2), List.of(1, 3), List.of(1)),
                solution.findMatrix(new int[] { 1, 3, 4, 1, 2, 3, 1 }));
    }
}
