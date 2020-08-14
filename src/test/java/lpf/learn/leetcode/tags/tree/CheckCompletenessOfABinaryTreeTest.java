package lpf.learn.leetcode.tags.tree;

import lpf.learn.leetcode.entity.TreeNode;
import lpf.learn.leetcode.learn.tree.SerializeAndDeserializeBinaryTree;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CheckCompletenessOfABinaryTreeTest {

    @Test
    public void test1() {
        CheckCompletenessOfABinaryTree temp = new CheckCompletenessOfABinaryTree();
        SerializeAndDeserializeBinaryTree deserialize = new SerializeAndDeserializeBinaryTree();

        TreeNode root = deserialize.deserialize("1,2,3,4,5,6");
        assertTrue(temp.isCompleteTree(root));
    }
    @Test
    public void test2() {
        CheckCompletenessOfABinaryTree temp = new CheckCompletenessOfABinaryTree();
        SerializeAndDeserializeBinaryTree deserialize = new SerializeAndDeserializeBinaryTree();

        TreeNode root = deserialize.deserialize("1,2,3,4,5,null,7");
        assertFalse(temp.isCompleteTree(root));
    }

}
