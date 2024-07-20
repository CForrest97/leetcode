package com.example.p0038CountAndSay;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void testTwoSum() {
        Solution solution = new Solution();
        assertEquals("1", solution.countAndSay(1));
        assertEquals("1211", solution.countAndSay(4));
    }
}
