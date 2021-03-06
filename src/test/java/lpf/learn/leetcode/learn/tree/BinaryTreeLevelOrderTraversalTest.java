package lpf.learn.leetcode.learn.tree;

import lpf.learn.leetcode.entity.TreeNode;
import lpf.learn.leetcode.tags.tree.BinaryTreeLevelOrderTraversal;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreeLevelOrderTraversalTest {

    @Test
    public void test() {
        BinaryTreeLevelOrderTraversal temp = new BinaryTreeLevelOrderTraversal();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        TreeNode right = new TreeNode(20);
        root.right = right;
        right.left = new TreeNode(15);
        right.right = new TreeNode(7);

        List<List<Integer>> result = new LinkedList<>();
        result.add(new LinkedList<>(Collections.singletonList(3)));
        result.add(new LinkedList<>(Arrays.asList(9, 20)));
        result.add(new LinkedList<>(Arrays.asList(15, 7)));

        Assert.assertEquals(result, temp.levelOrder(root));
    }


}
