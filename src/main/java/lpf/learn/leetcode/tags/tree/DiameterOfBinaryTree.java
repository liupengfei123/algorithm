package lpf.learn.leetcode.tags.tree;

import lpf.learn.leetcode.entity.TreeNode;

/** [543]二叉树的直径
 * 给定一棵二叉树，你需要计算它的直径长度。一棵二叉树的直径长度是任意两个结点路径长度中的最大值。这条路径可能穿过也可能不穿过根结点。
 * 示例 :
 * 给定二叉树
 *            1
 *          / \
 *         2   3
 *        / \
 *       4   5
 *  返回 3, 它的长度是路径 [4,2,1,3] 或者 [5,2,1,3]。
 *  注意：两结点之间的路径长度是以它们之间边的数目表示。
 * @author liupf
 * @date 2020-11-15 14:49
 */
public class DiameterOfBinaryTree {

    private int maxLength = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        maxTreeHigh(root);
        return maxLength;
    }

    /** 返回已节点 node 为根节点的树的最大高度。
     * @param node  node 根节点
     * @return 树的最大高度
     */
    private int maxTreeHigh(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int leftHigh = maxTreeHigh(node.left);
        int rightHigh = maxTreeHigh(node.right);
        // 两个任意节点所在路径必定在同一棵树（子树）上。所以求一棵树的路径长度最大值，即求各个节点中左右子树的最大高度之和。
        maxLength = Math.max(maxLength, leftHigh + rightHigh);
        return Math.max(leftHigh, rightHigh) + 1;
    }
}
