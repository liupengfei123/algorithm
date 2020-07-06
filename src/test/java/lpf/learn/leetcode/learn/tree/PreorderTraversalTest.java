package lpf.learn.leetcode.learn.tree;

import lpf.learn.leetcode.learn.entity.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

public class PreorderTraversalTest {

    @Test
    public void test() {
        PreorderTraversal temp = new PreorderTraversal();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        root.right = right;
        right.left = new TreeNode(4);
        right.right = new TreeNode(5);


        List<Integer> result = new LinkedList<>();
        result.add(1);
        result.add(2);
        result.add(3);
        result.add(4);
        result.add(5);
        Assert.assertEquals(result, temp.preorderTraversal(root));
    }


}
