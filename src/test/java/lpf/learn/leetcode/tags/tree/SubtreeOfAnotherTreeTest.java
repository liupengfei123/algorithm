package lpf.learn.leetcode.tags.tree;

import lpf.learn.leetcode.entity.TreeNode;
import lpf.learn.leetcode.learn.tree.SerializeAndDeserializeBinaryTree;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SubtreeOfAnotherTreeTest {

    @Test
    public void test1() {
        SubtreeOfAnotherTree temp = new SubtreeOfAnotherTree();

        SerializeAndDeserializeBinaryTree deserialize = new SerializeAndDeserializeBinaryTree();

        TreeNode source = deserialize.deserialize("3,4,5,1,2");
        TreeNode target = deserialize.deserialize("4,1,2");

        assertTrue(temp.isSubtree(source, target));
    }

    @Test
    public void test2() {
        SubtreeOfAnotherTree temp = new SubtreeOfAnotherTree();

        SerializeAndDeserializeBinaryTree deserialize = new SerializeAndDeserializeBinaryTree();

        TreeNode source = deserialize.deserialize("3,4,5,1,2,null,null,0");
        TreeNode target = deserialize.deserialize("4,1,2");

        assertFalse(temp.isSubtree(source, target));
    }


    @Test
    public void test3() {
        SubtreeOfAnotherTree temp = new SubtreeOfAnotherTree();

        SerializeAndDeserializeBinaryTree deserialize = new SerializeAndDeserializeBinaryTree();

        TreeNode source = deserialize.deserialize("3,4,5,1,null,2");
        TreeNode target = deserialize.deserialize("3,1,2");

        assertFalse(temp.isSubtree(source, target));
    }

    @Test
    public void test4() {
        SubtreeOfAnotherTree temp = new SubtreeOfAnotherTree();

        SerializeAndDeserializeBinaryTree deserialize = new SerializeAndDeserializeBinaryTree();

        TreeNode source = deserialize.deserialize("3,4,5,1,2,null,null,6,8");
        TreeNode target = deserialize.deserialize("4,1,2,6,8");

        assertTrue(temp.isSubtree(source, target));
    }
}
