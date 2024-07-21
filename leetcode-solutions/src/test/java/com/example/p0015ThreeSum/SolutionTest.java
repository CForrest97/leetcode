package com.example.p0015ThreeSum;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;

public class SolutionTest {
        @Test
        public void testSolution() {
                Solution solution = new Solution();
                assertEquals(List.of(List.of(-1, -1, 2), List.of(-1, 0, 1)),
                                solution.threeSum(new int[] { -1, 0, 1, 2, -1, -4 }));
                assertEquals(List.of(),
                                solution.threeSum(new int[] { 0, 1, 1 }));
                assertEquals(List.of(List.of(0, 0, 0)),
                                solution.threeSum(new int[] { 0, 0, 0 }));
        }
}
