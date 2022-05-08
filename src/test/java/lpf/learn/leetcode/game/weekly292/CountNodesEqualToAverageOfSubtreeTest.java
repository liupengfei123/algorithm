package lpf.learn.leetcode.game.weekly292;

import lpf.learn.leetcode.entity.TreeNode;
import lpf.learn.leetcode.learn.tree.SerializeAndDeserializeBinaryTree;
import org.junit.Assert;
import org.junit.Test;

public class CountNodesEqualToAverageOfSubtreeTest {
    @Test
    public void test1(){

        CountNodesEqualToAverageOfSubtree test = new CountNodesEqualToAverageOfSubtree();

        SerializeAndDeserializeBinaryTree deserialize = new SerializeAndDeserializeBinaryTree();
        TreeNode root = deserialize.deserialize("4,8,5,0,1,null,6");

        Assert.assertEquals(5, test.averageOfSubtree(root));
    }

    @Test
    public void test2(){
        CountNodesEqualToAverageOfSubtree test = new CountNodesEqualToAverageOfSubtree();

        SerializeAndDeserializeBinaryTree deserialize = new SerializeAndDeserializeBinaryTree();
        TreeNode root = deserialize.deserialize("1");

        Assert.assertEquals(1, test.averageOfSubtree(root));
    }

    @Test
    public void test3(){
    }
}
