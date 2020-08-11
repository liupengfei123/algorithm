package lpf.learn.leetcode.tags.tree;

import lpf.learn.leetcode.entity.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class SearchInABinarySearchTreeTest {


    @Test
    public void test() {
        SearchInABinarySearchTree temp = new SearchInABinarySearchTree();

        TreeNode root1 = new TreeNode(4);
        TreeNode left1 = new TreeNode(2);
        root1.left = left1;
        left1.left  = new TreeNode(1);
        left1.right  = new TreeNode(3);

        root1.right = new TreeNode(7);

        Assert.assertEquals(left1, temp.searchBST(root1, 2));
        Assert.assertNull(temp.searchBST(root1, 5));



    }
}
