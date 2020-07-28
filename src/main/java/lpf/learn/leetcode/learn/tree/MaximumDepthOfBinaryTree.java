package lpf.learn.leetcode.learn.tree;

import lpf.learn.leetcode.learn.entity.TreeNode;

/** [104]二叉树的最大深度
 * 给定一个二叉树，找出其最大深度。
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 *
 * 说明: 叶子节点是指没有子节点的节点。
 * 示例：
 * 给定二叉树 [3,9,20,null,null,15,7]，
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回它的最大深度 3 。
 */
public class MaximumDepthOfBinaryTree {

    /**
     * “自底向上” 的解决方案 (后序遍历)
     * 对于树中的任意一个节点，如果你知道它子节点的答案，你能计算出该节点的答案吗
     */
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

    /**
     * “自顶向下” 的解决方案 (前序遍历)
     *
     * 你能确定一些参数，从该节点自身解决出发寻找答案吗？
     * 你可以使用这些参数和节点本身的值来决定什么应该是传递给它子节点的参数吗？
     */
    private int maxDepth = 0;
    public int maxDepth2(TreeNode root) {
        maxDepth2(root, 1);
        return maxDepth;
    }

    private void maxDepth2(TreeNode node, int depth) {
        if (node == null) {
            return;
        }

        if (node.left == null && node.right == null) {
            maxDepth = Math.max(maxDepth, depth);
        }
        maxDepth2(node.left, depth + 1);
        maxDepth2(node.right, depth + 1);
    }
}
