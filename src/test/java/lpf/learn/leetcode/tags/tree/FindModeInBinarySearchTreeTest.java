package lpf.learn.leetcode.tags.tree;

import lpf.learn.leetcode.entity.TreeNode;
import lpf.learn.leetcode.learn.tree.SerializeAndDeserializeBinaryTree;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class FindModeInBinarySearchTreeTest {

    @Test
    public void test1() {
        FindModeInBinarySearchTree temp = new FindModeInBinarySearchTree();
        SerializeAndDeserializeBinaryTree deserialize = new SerializeAndDeserializeBinaryTree();

        TreeNode root = deserialize.deserialize("5,3,6,2,4,null,null,1");
        assertArrayEquals(new int[]{1,2,3,4,5,6}, temp.findMode(root));
    }
    @Test
    public void test2() {
        FindModeInBinarySearchTree temp = new FindModeInBinarySearchTree();
        SerializeAndDeserializeBinaryTree deserialize = new SerializeAndDeserializeBinaryTree();

        TreeNode root = deserialize.deserialize("1,null,2,2");
        assertArrayEquals(new int[]{2}, temp.findMode(root));
    }


}
