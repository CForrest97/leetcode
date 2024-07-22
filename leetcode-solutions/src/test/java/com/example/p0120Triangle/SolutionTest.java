package com.example.p0120Triangle;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

public class SolutionTest {
    @Test
    public void testSolution() {
        Solution solution = new Solution();
        assertEquals(11, solution.minimumTotal(
                List.of(new ArrayList<>(List.of(2)), new ArrayList<>(List.of(3, 4)), new ArrayList<>(List.of(6, 5, 7)),
                        new ArrayList<>(List.of(4, 1, 8, 3)))));
        assertEquals(-10, solution.minimumTotal(List.of(List.of(-10))));
    }
}
