package lpf.learn.leetcode.game.autumn2022;

import lpf.learn.leetcode.entity.TreeNode;

public class TTwo {

    public TreeNode expandBinaryTree(TreeNode root) {
        if (root.left != null) {
            expandBinaryTree(root.left);
            root.left = new TreeNode(-1, root.left, null);
        }

        if (root.right != null) {
            expandBinaryTree(root.right);
            root.right = new TreeNode(-1, null, root.right);
        }

        return root;
    }


}
