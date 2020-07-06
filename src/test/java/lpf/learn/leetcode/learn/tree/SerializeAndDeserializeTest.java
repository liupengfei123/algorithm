package lpf.learn.leetcode.learn.tree;

import lpf.learn.leetcode.learn.entity.TreeNode;
import org.junit.Test;

public class SerializeAndDeserializeTest {

    @Test
    public void test() {
        SerializeAndDeserialize temp = new SerializeAndDeserialize();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        //root.right = right;
        right.left = new TreeNode(4);
        right.right = new TreeNode(5);


        //Assert.assertEquals("1,2,3,null,null,4,5", temp.serialize(root));

        TreeNode te = temp.deserialize(temp.serialize(root));

        System.out.println(te);


    }


}
