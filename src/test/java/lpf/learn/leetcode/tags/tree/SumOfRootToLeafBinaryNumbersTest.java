package lpf.learn.leetcode.tags.tree;

import lpf.learn.leetcode.entity.TreeNode;
import lpf.learn.leetcode.learn.tree.SerializeAndDeserializeBinaryTree;
import org.junit.Assert;
import org.junit.Test;

public class SumOfRootToLeafBinaryNumbersTest {


    @Test
    public void test1() {
        SumOfRootToLeafBinaryNumbers temp = new SumOfRootToLeafBinaryNumbers();

        SerializeAndDeserializeBinaryTree serializeAndDeserializeBinaryTree = new SerializeAndDeserializeBinaryTree();


        TreeNode root = serializeAndDeserializeBinaryTree.deserialize("1,0,1,0,1,0,1");

        Assert.assertEquals(22, temp.sumRootToLeaf(root));
    }

    @Test
    public void test2() {
        SumOfRootToLeafBinaryNumbers temp = new SumOfRootToLeafBinaryNumbers();

        SerializeAndDeserializeBinaryTree serializeAndDeserializeBinaryTree = new SerializeAndDeserializeBinaryTree();


        TreeNode root = serializeAndDeserializeBinaryTree.deserialize("0");

        Assert.assertEquals(0, temp.sumRootToLeaf(root));
    }

    @Test
    public void test3() {
        SumOfRootToLeafBinaryNumbers temp = new SumOfRootToLeafBinaryNumbers();

        SerializeAndDeserializeBinaryTree serializeAndDeserializeBinaryTree = new SerializeAndDeserializeBinaryTree();


        TreeNode root = serializeAndDeserializeBinaryTree.deserialize("1,1");

        Assert.assertEquals(3, temp.sumRootToLeaf(root));
    }
}
