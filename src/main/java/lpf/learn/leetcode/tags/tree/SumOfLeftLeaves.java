package lpf.learn.leetcode.tags.tree;

import lpf.learn.leetcode.learn.entity.TreeNode;

/** [404]左叶子之和
 * 计算给定二叉树的所有左叶子之和。
 * 示例：
 *    3
 *   / \
 *  9  20
 *    /  \
 *   15   7
 * 在这个二叉树中，有两个左叶子，分别是 9 和 15，所以返回 24
 */
public class SumOfLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root) {
        return traversal(root, false);
    }

    private int traversal(TreeNode node, boolean isLeft) {
        if (node == null) {
            return 0;
        }
        int result = 0;
        if (isLeft && node.left == null && node.right == null) {
            result += node.val;
        }
        result += traversal(node.left, true);
        result += traversal(node.right, false);
        return result;
    }
}
