package lpf.learn.leetcode.tags.tree;

import lpf.learn.leetcode.entity.TreeNode;
import lpf.learn.leetcode.learn.tree.SerializeAndDeserializeBinaryTree;
import org.junit.Assert;
import org.junit.Test;

public class SecondMinimumNodeInABinaryTreeTest {

    @Test
    public void test() {
        SecondMinimumNodeInABinaryTree temp = new SecondMinimumNodeInABinaryTree();
        SerializeAndDeserializeBinaryTree deserialize = new SerializeAndDeserializeBinaryTree();

        TreeNode root = deserialize.deserialize("1,1,3,1,1,3,4,3,1,1,1,3,8,4,8,3,3,1,6,2,1");
        Assert.assertEquals(2, temp.findSecondMinimumValue(root));
    }

    @Test
    public void test2() {
        SecondMinimumNodeInABinaryTree temp = new SecondMinimumNodeInABinaryTree();
        SerializeAndDeserializeBinaryTree deserialize = new SerializeAndDeserializeBinaryTree();

        TreeNode root = deserialize.deserialize("2,2,2,2,5");
        Assert.assertEquals(5, temp.findSecondMinimumValue(root));
    }

    @Test
    public void test3() {
        SecondMinimumNodeInABinaryTree temp = new SecondMinimumNodeInABinaryTree();
        SerializeAndDeserializeBinaryTree deserialize = new SerializeAndDeserializeBinaryTree();

        TreeNode root = deserialize.deserialize("2,2,2");
        Assert.assertEquals(-1, temp.findSecondMinimumValue(root));
    }

    @Test
    public void test4() {
        SecondMinimumNodeInABinaryTree temp = new SecondMinimumNodeInABinaryTree();
        SerializeAndDeserializeBinaryTree deserialize = new SerializeAndDeserializeBinaryTree();

        TreeNode root = deserialize.deserialize("2,2,5,null,null,5,7");
        Assert.assertEquals(5, temp.findSecondMinimumValue(root));
    }
}
