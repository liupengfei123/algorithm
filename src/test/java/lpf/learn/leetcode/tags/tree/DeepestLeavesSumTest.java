package lpf.learn.leetcode.tags.tree;

import lpf.learn.leetcode.learn.tree.SerializeAndDeserializeBinaryTree;
import org.junit.Assert;
import org.junit.Test;

public class DeepestLeavesSumTest {

    SerializeAndDeserializeBinaryTree deserialize = new SerializeAndDeserializeBinaryTree();

    @Test
    public void test1() {
        DeepestLeavesSum temp = new DeepestLeavesSum();
        Assert.assertEquals(15, temp.deepestLeavesSum(deserialize.deserialize("1,2,3,4,5,null,6,7,null,null,null,null,8")));
    }

    @Test
    public void test2() {
        DeepestLeavesSum temp = new DeepestLeavesSum();
        Assert.assertEquals(19, temp.deepestLeavesSum(deserialize.deserialize("6,7,8,2,7,1,3,9,null,1,4,null,null,null,5")));
    }
}
