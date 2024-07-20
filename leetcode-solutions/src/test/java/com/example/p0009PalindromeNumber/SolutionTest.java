package com.example.p0009PalindromeNumber;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void isPalindrome() {
        Solution solution = new Solution();
        assertEquals(true, solution.isPalindrome(121));
        assertEquals(false, solution.isPalindrome(-121));
        assertEquals(false, solution.isPalindrome(10));
    }
}
