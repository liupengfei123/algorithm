package lpf.learn.leetcode.tags.stack;

import lpf.learn.leetcode.entity.TreeNode;
import org.junit.Test;

public class BinaryTreeZigzagLevelOrderTraversalTest {

    @Test
    public void test(){

        TreeNode root1 = new TreeNode(3);
        root1.left = new TreeNode(9);

        TreeNode right1 = new TreeNode(20);
        root1.right = right1;
        right1.left = new TreeNode(15);
        right1.right = new TreeNode(7);


        BinaryTreeZigzagLevelOrderTraversal test = new BinaryTreeZigzagLevelOrderTraversal();
        test.zigzagLevelOrder(root1);



    }
}
