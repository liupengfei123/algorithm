package lpf.learn.leetcode.tags.tree;

import lpf.learn.leetcode.entity.TreeNode;
import lpf.learn.leetcode.learn.tree.SerializeAndDeserializeBinaryTree;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaximumDifferenceBetweenNodeAndAncestorTest {

    @Test
    public void test1() {
        MaximumDifferenceBetweenNodeAndAncestor temp = new MaximumDifferenceBetweenNodeAndAncestor();
        SerializeAndDeserializeBinaryTree deserialize = new SerializeAndDeserializeBinaryTree();

        TreeNode root = deserialize.deserialize("8,3,10,1,6,null,14,null,null,4,7,13");
        assertEquals(7, temp.maxAncestorDiff(root));
    }

    @Test
    public void test2() {
        MaximumDifferenceBetweenNodeAndAncestor temp = new MaximumDifferenceBetweenNodeAndAncestor();
        SerializeAndDeserializeBinaryTree deserialize = new SerializeAndDeserializeBinaryTree();

        TreeNode root = deserialize.deserialize("1,null,2,null,0,3");
        assertEquals(3, temp.maxAncestorDiff(root));
    }

    @Test
    public void test3() {
        MaximumDifferenceBetweenNodeAndAncestor temp = new MaximumDifferenceBetweenNodeAndAncestor();
        SerializeAndDeserializeBinaryTree deserialize = new SerializeAndDeserializeBinaryTree();

        TreeNode root = deserialize.deserialize("2,5,0,null,null,4,null,null,6,1,null,3");
        assertEquals(6, temp.maxAncestorDiff(root));
    }
}
