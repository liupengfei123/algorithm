package lpf.learn.leetcode.tags.tree;

import lpf.learn.leetcode.entity.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidateBinarySearchTreeTest {

    /*
     *    4
     *   / \
     *  1   5
     */
    @Test
    public void test1() {
        ValidateBinarySearchTree temp = new ValidateBinarySearchTree();

        TreeNode root1 = new TreeNode(4);
        root1.left = new TreeNode(1);
        root1.right = new TreeNode(5);

        assertTrue(temp.isValidBST(root1));
    }

    /*
     *    4
     *   / \
     *  1   5
     *      / \
     *     3   6
     */
    @Test
    public void test2() {
        ValidateBinarySearchTree temp = new ValidateBinarySearchTree();

        TreeNode root1 = new TreeNode(4);
        root1.left = new TreeNode(1);

        TreeNode right1 = new TreeNode(5);
        root1.right = right1;

        right1.left = new TreeNode(3);
        right1.right = new TreeNode(6);

        assertFalse(temp.isValidBST(root1));
    }

    /*
     *    1
     *   /
     *  1
     */
    @Test
    public void test3() {
        ValidateBinarySearchTree temp = new ValidateBinarySearchTree();

        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(1);

        assertFalse(temp.isValidBST(root1));
    }
}
