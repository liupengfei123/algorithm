package lpf.learn.leetcode.tags.tree;

import lpf.learn.leetcode.entity.TreeNode;
import lpf.learn.leetcode.learn.tree.SerializeAndDeserializeBinaryTree;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PathSumIiiTest {

    @Test
    public void test1() {
        PathSumIii temp = new PathSumIii();
        SerializeAndDeserializeBinaryTree deserialize = new SerializeAndDeserializeBinaryTree();

        TreeNode root = deserialize.deserialize("10,5,-3,3,2,null,11,3,-2,null,1");
        assertEquals(3, temp.pathSum(root, 8));
    }

    @Test
    public void test2() {
        PathSumIii temp = new PathSumIii();
        SerializeAndDeserializeBinaryTree deserialize = new SerializeAndDeserializeBinaryTree();

        TreeNode root = deserialize.deserialize("10,5,-3,3,2,null,11,3,-2,null,1");
        assertEquals(0, temp.pathSum(root, 0));
    }

    @Test
    public void test3() {
        PathSumIii temp = new PathSumIii();
        SerializeAndDeserializeBinaryTree deserialize = new SerializeAndDeserializeBinaryTree();

        TreeNode root = deserialize.deserialize("5,4,8,11,null,13,4,7,2,null,null,5,1");
        assertEquals(3, temp.pathSum(root, 22));
    }

    @Test
    public void test4() {
        PathSumIii temp = new PathSumIii();
        SerializeAndDeserializeBinaryTree deserialize = new SerializeAndDeserializeBinaryTree();

        TreeNode root = deserialize.deserialize("0,1,1");
        assertEquals(4, temp.pathSum(root, 1));
    }
}
