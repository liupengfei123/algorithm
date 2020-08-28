package lpf.learn.leetcode.tags.tree;

import lpf.learn.leetcode.entity.TreeNode;
import lpf.learn.leetcode.learn.tree.SerializeAndDeserializeBinaryTree;
import org.junit.Assert;
import org.junit.Test;

public class MinimumAbsoluteDifferenceInBstTest {

    @Test
    public void test() {
        MinimumAbsoluteDifferenceInBst temp = new MinimumAbsoluteDifferenceInBst();
        SerializeAndDeserializeBinaryTree deserialize = new SerializeAndDeserializeBinaryTree();

        TreeNode root = deserialize.deserialize("1,null,3,2");
        Assert.assertEquals(1, temp.getMinimumDifference(root));
    }


}
