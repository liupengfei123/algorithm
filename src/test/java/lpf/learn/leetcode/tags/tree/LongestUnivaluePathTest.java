package lpf.learn.leetcode.tags.tree;

import lpf.learn.leetcode.entity.TreeNode;
import lpf.learn.leetcode.learn.tree.SerializeAndDeserializeBinaryTree;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestUnivaluePathTest {

    @Test
    public void test1() {
        LongestUnivaluePath temp = new LongestUnivaluePath();
        SerializeAndDeserializeBinaryTree deserialize = new SerializeAndDeserializeBinaryTree();

        TreeNode root = deserialize.deserialize("5,4,5,1,1,5");
        assertEquals(2, temp.longestUnivaluePath(root));
    }

    @Test
    public void test2() {
        LongestUnivaluePath temp = new LongestUnivaluePath();
        SerializeAndDeserializeBinaryTree deserialize = new SerializeAndDeserializeBinaryTree();

        TreeNode root = deserialize.deserialize("1,4,5,4,4,5");
        assertEquals(2, temp.longestUnivaluePath(root));
    }

    @Test
    public void test3() {
        LongestUnivaluePath temp = new LongestUnivaluePath();
        SerializeAndDeserializeBinaryTree deserialize = new SerializeAndDeserializeBinaryTree();

        TreeNode root = deserialize.deserialize("5,5,5,5,5,1,4,5,4,1,1,1,1,5,4");
        assertEquals(4, temp.longestUnivaluePath(root));
    }

    @Test
    public void test4() {
        LongestUnivaluePath temp = new LongestUnivaluePath();
        SerializeAndDeserializeBinaryTree deserialize = new SerializeAndDeserializeBinaryTree();

        TreeNode root = deserialize.deserialize("");
        assertEquals(0, temp.longestUnivaluePath(root));
    }

    @Test
    public void test5() {
        LongestUnivaluePath temp = new LongestUnivaluePath();
        SerializeAndDeserializeBinaryTree deserialize = new SerializeAndDeserializeBinaryTree();

        TreeNode root = deserialize.deserialize("1");
        assertEquals(0, temp.longestUnivaluePath(root));
    }
}
