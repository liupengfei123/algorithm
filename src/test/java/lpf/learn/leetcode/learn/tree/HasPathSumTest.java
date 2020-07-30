package lpf.learn.leetcode.learn.tree;

import lpf.learn.leetcode.learn.entity.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class HasPathSumTest {

    /**
     *               5
     *              / \
     *             4   8
     *            /   / \
     *           11  13  4
     *          /  \      \
     *         7    2      1
     */
    @Test
    public void test() {
        PathSum temp = new PathSum();
        TreeNode root1 = new TreeNode(5);
        TreeNode left1 = new TreeNode(4);
        root1.left = left1;
        TreeNode left2 = new TreeNode(11);
        left1.left = left2;
        left2.left = new TreeNode(7);
        left2.right = new TreeNode(2);

        TreeNode right1 = new TreeNode(8);
        root1.right = right1;
        right1.left = new TreeNode(13);
        TreeNode right2 = new TreeNode(4);
        right1.right = right2;
        right2.right = new TreeNode(1);


        Assert.assertTrue(temp.hasPathSum(root1, 22));



    }
}
