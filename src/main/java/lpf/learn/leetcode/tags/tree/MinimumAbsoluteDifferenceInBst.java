package lpf.learn.leetcode.tags.tree;

import lpf.learn.leetcode.entity.TreeNode;

/** [530]二叉搜索树的最小绝对差
 * 给你一棵所有节点为非负值的二叉搜索树，请你计算树中任意两节点的差的绝对值的最小值。
 *
 * 示例：
 * 输入：
 *   1
 *    \
 *     3
 *    /
 *   2
 * 输出： 1
 * 解释：
 * 最小绝对差为 1，其中 2 和 1 的差的绝对值为 1（或者 2 和 3）。
 *
 * 提示：
 * 树中至少有 2 个节点。
 * 本题与 783 https://leetcode-cn.com/problems/minimum-distance-between-bst-nodes/
 * 相同
 */
public class MinimumAbsoluteDifferenceInBst {
    private int result = Integer.MAX_VALUE;
    private Integer preVal = null;

    public int getMinimumDifference(TreeNode root) {
        inOrder(root);
        return result;
    }

    private void inOrder(TreeNode node) {
        if (node == null) {
            return;
        }

        inOrder(node.left);
        if (preVal != null) {
            result = Math.min(result, Math.abs(preVal - node.val));
        }
        preVal = node.val;
        inOrder(node.right);
    }
}
