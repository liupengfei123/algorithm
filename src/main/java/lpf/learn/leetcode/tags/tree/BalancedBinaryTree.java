package lpf.learn.leetcode.tags.tree;

import lpf.learn.leetcode.entity.TreeNode;

/** [110]平衡二叉树
 * 给定一个二叉树，判断它是否是高度平衡的二叉树。
 * 本题中，一棵高度平衡二叉树定义为：
 * 一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过1。
 *
 * 示例 1:
 * 给定二叉树 [3,9,20,null,null,15,7]
 *     3
 *   / \
 *  9  20
 *    /  \
 *   15   7
 * 返回 true 。
 *
 * 示例 2:
 * 给定二叉树 [1,2,2,3,3,null,null,4,4]
 *        1
 *      / \
 *     2   2
 *    / \
 *   3   3
 *  / \
 * 4   4
 * 返回 false 。
 */
public class BalancedBinaryTree {
    private boolean result = true;

    public boolean isBalanced(TreeNode root) {
        getTreeHeight(root);
        return result;
    }

    private int getTreeHeight(TreeNode node) {
        if (node == null || !result) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            return 1;
        }
        int leftHeight = getTreeHeight(node.left);
        int rightHeight = getTreeHeight(node.right);

        int heigth = Math.max(leftHeight, rightHeight);

        if (heigth - leftHeight > 1) {
            result = false;
        }
        if (heigth - rightHeight > 1) {
            result = false;
        }
        return heigth + 1;
    }
}
