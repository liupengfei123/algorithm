package lpf.learn.leetcode.tags.tree;

import lpf.learn.leetcode.learn.entity.TreeNode;

/** [226]翻转二叉树
 * 翻转一棵二叉树。
 * 示例：
 * 输入：
 *      4
 *   /   \
 *  2     7
 * / \   / \
 * 1   3 6   9
 * 输出：
 *      4
 *   /   \
 *  7     2
 * / \   / \
 * 9   6 3   1
 *
 */
public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode leftNode = root.left;
        TreeNode rightNode = root.right;
        root.left = invertTree(rightNode);
        root.right = invertTree(leftNode);

        return root;
    }
}
