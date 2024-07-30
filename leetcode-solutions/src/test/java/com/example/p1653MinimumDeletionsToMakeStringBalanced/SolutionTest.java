package com.example.p1653MinimumDeletionsToMakeStringBalanced;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void testSolution() {
        Solution solution = new Solution();
        assertEquals(2, solution.minimumDeletions("aababbab"));
        assertEquals(2, solution.minimumDeletions("bbaaaaabb"));
        assertEquals(0, solution.minimumDeletions("aaa"));
        assertEquals(0, solution.minimumDeletions("bbb"));
        assertEquals(0, solution.minimumDeletions("aaabbb"));
        assertEquals(52, solution.minimumDeletions(
                "aabbbbaabababbbbaaaaaabbababaaabaabaabbbabbbbabbabbababaabaababbbbaaaaabbabbabaaaabbbabaaaabbaaabbbaabbaaaaabaa"));
    }
}
