package lpf.learn.leetcode.tags.tree;

import lpf.learn.leetcode.entity.TreeNode;

/** [222]完全二叉树的节点个数
 * 给出一个完全二叉树，求出该树的节点个数。
 * 说明：
 * 完全二叉树的定义如下：在完全二叉树中，除了最底层节点可能没填满外，其余每层节点数都达到最大值，并且最下面一层的节点都集中在该层最左边的若干位置。若最底层为
 * 第 h 层，则该层包含 1~ 2h 个节点。
 * 示例:
 * 输入:
 *    1
 *   / \
 *  2   3
 * / \  /
 * 4  5 6
 * 输出: 6
 */
public class CountCompleteTreeNodes {
    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = getTreeHeiht(root.left);
        int rightHeight = getTreeHeiht(root.right);

        if (leftHeight == rightHeight) {
            return countNodes(root.right) + (1 << leftHeight);
        } else {
            return countNodes(root.left) + (1 << rightHeight);
        }
    }


    private int getTreeHeiht(TreeNode node) {
        int treeHeight = 0;
        while (node != null) {
            treeHeight++;
            node = node.left;
        }
        return treeHeight;
    }
}
