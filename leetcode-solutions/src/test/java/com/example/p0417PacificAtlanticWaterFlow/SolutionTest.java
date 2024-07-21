package com.example.p0417PacificAtlanticWaterFlow;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;

public class SolutionTest {
    @Test
    public void testTwoSum() {
        Solution solution = new Solution();
        assertEquals(
                List.of(List.of(0, 4), List.of(1, 3), List.of(1, 4), List.of(2, 2), List.of(3, 0), List.of(3, 1),
                        List.of(4, 0)),
                solution.pacificAtlantic(new int[][] { { 1, 2, 2, 3, 5 }, { 3, 2, 3, 4, 4 },
                        { 2, 4, 5, 3, 1 }, { 6, 7, 1, 4, 5 }, { 5, 1, 1, 2, 4 } }));
        assertEquals(List.of(List.of(0, 0)), solution.pacificAtlantic(new int[][] { { 1 } }));
        assertEquals(
                List.of(List.of(0, 3), List.of(1, 0), List.of(1, 1), List.of(1, 2), List.of(1, 3), List.of(2, 0),
                        List.of(2, 1), List.of(2, 2), List.of(2, 3), List.of(3, 0), List.of(3, 1), List.of(3, 2),
                        List.of(3, 3)),
                solution
                        .pacificAtlantic(
                                new int[][] { { 1, 2, 3, 4 }, { 12, 13, 14, 5 }, { 11, 16, 15, 6 }, { 10, 9, 8, 7 } }));
    }
}
