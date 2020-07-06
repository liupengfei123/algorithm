package lpf.learn.leetcode.learn.tree;

import lpf.learn.leetcode.learn.entity.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class IsSymmetricTest {

    @Test
    public void test() {
        IsSymmetric temp = new IsSymmetric();
        TreeNode root1 = new TreeNode(1);
        TreeNode left1 = new TreeNode(2);
        root1.left = left1;
        left1.left = new TreeNode(3);
        left1.right = new TreeNode(4);

        TreeNode right1 = new TreeNode(2);
        root1.right = right1;
        right1.left = new TreeNode(4);
        right1.right = new TreeNode(3);

        Assert.assertTrue(temp.isSymmetric(root1));
        Assert.assertTrue(temp.isSymmetric2(root1));



        TreeNode root2 = new TreeNode(1);
        TreeNode left2 = new TreeNode(2);
        root2.left = left2;
        left2.right = new TreeNode(3);

        TreeNode right2 = new TreeNode(2);
        root2.right = right2;
        right2.right = new TreeNode(3);

        Assert.assertFalse(temp.isSymmetric(root2));
        Assert.assertFalse(temp.isSymmetric2(root2));

    }
}
