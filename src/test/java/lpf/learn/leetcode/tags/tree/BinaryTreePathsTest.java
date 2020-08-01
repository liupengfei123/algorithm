package lpf.learn.leetcode.tags.tree;

import lpf.learn.leetcode.entity.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class BinaryTreePathsTest {


    @Test
    public void test() {
        BinaryTreePaths temp = new BinaryTreePaths();

        TreeNode root1 = new TreeNode(1);
        TreeNode left1 = new TreeNode(2);
        root1.left = left1;
        left1.right  = new TreeNode(5);

        root1.right = new TreeNode(3);

        ArrayList<Object> list = new ArrayList<>();
        list.add("1->2->5");
        list.add("1->3");
        Assert.assertEquals(list, temp.binaryTreePaths(root1));



    }
}
