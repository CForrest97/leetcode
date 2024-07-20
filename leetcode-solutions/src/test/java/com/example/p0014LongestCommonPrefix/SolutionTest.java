package com.example.p0014LongestCommonPrefix;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void longestCommonPrefix() {
        Solution solution = new Solution();

        assertEquals("fl", solution.longestCommonPrefix(new String[] { "flower", "flow", "flight" }));
        assertEquals("", solution.longestCommonPrefix(new String[] { "dog", "racecar", "car" }));
    }
}
