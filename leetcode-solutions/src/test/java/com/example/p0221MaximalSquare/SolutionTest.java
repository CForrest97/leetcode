package com.example.p0221MaximalSquare;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void testSolution() {
        Solution solution = new Solution();
        assertEquals(4, solution.maximalSquare(new char[][] {
                { '1', '0', '1', '0' },
                { '1', '0', '1', '1' },
                { '1', '0', '1', '1' },
                { '1', '1', '1', '1' }
        }));

        assertEquals(4, solution.maximalSquare(new char[][] {
                { '1', '1' },
                { '1', '1' },
        }));
        assertEquals(4, solution.maximalSquare(new char[][] {
                { '1', '0', '1', '0', '0' },
                { '1', '0', '1', '1', '1' },
                { '1', '1', '1', '1', '1' },
                { '1', '0', '0', '1', '0' },
        }));
        assertEquals(1, solution.maximalSquare(new char[][] {
                { '1' },
        }));
        assertEquals(0, solution.maximalSquare(new char[][] {
                { '0' },
        }));
    }
}
