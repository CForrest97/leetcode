package com.example.p1038BinarySearchTreeToGreaterSumTree;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void testSolution() {
        Solution solution = new Solution();

        TreeNode root1 = new TreeNode(4, new TreeNode(1, new TreeNode(0), new TreeNode(2, null, new TreeNode(3))),
                new TreeNode(6, new TreeNode(5), new TreeNode(7, null, new TreeNode(8))));
        TreeNode gst1 = solution.bstToGst(root1);
        assertEquals(30, gst1.val);
        assertEquals(36, gst1.left.val);
        assertEquals(36, gst1.left.left.val);
        assertEquals(35, gst1.left.right.val);
        assertEquals(33, gst1.left.right.right.val);
        assertEquals(21, gst1.right.val);
        assertEquals(26, gst1.right.left.val);
        assertEquals(15, gst1.right.right.val);
        assertEquals(8, gst1.right.right.right.val);

        TreeNode root2 = new TreeNode(0, null, new TreeNode(1));
        TreeNode gst2 = solution.bstToGst(root2);
        assertEquals(1, gst2.val);
        assertEquals(1, gst2.right.val);

    }
}
