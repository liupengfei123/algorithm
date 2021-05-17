package lpf.learn.leetcode.tags.tree;

import lpf.learn.leetcode.learn.tree.SerializeAndDeserializeBinaryTree;
import org.junit.Assert;
import org.junit.Test;

public class CousinsInBinaryTreeTest {


    @Test
    public void test1() {
        CousinsInBinaryTree temp = new CousinsInBinaryTree();
        SerializeAndDeserializeBinaryTree deserialize = new SerializeAndDeserializeBinaryTree();
        Assert.assertFalse(temp.isCousins(deserialize.deserialize("1,2,3,4"), 4, 3));
    }

    @Test
    public void test2() {
        CousinsInBinaryTree temp = new CousinsInBinaryTree();
        SerializeAndDeserializeBinaryTree deserialize = new SerializeAndDeserializeBinaryTree();
        Assert.assertTrue(temp.isCousins(deserialize.deserialize("1,2,3,null,4,null,5"), 5, 4));
    }

    @Test
    public void test3() {
        CousinsInBinaryTree temp = new CousinsInBinaryTree();
        SerializeAndDeserializeBinaryTree deserialize = new SerializeAndDeserializeBinaryTree();
        Assert.assertFalse(temp.isCousins(deserialize.deserialize("1,2,3,null,4"), 2, 3));
    }
}
