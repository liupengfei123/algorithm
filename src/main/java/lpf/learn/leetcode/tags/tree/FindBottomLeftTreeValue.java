package lpf.learn.leetcode.tags.tree;

import lpf.learn.leetcode.entity.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/** [513]找树左下角的值
 * 给定一个二叉树，在树的最后一行找到最左边的值。
 *
 * 示例 1:
 * 输入:
 *    2
 *   / \
 *  1   3
 * 输出: 1
 *
 * 示例 2:
 * 输入:
 *        1
 *       / \
 *      2   3
 *     /   / \
 *    4   5   6
 *       /
 *      7
 * 输出: 7
 * 注意: 您可以假设树（即给定的根节点）不为 NULL。
 */
public class FindBottomLeftTreeValue {
    public int findBottomLeftValue(TreeNode root) {
        int result = findBottomLeftValueBFS(root);
        // int result = findBottomLeftValueDFS(root);
        return result;
    }

    private int maxLevel = 0;
    private TreeNode leftNode = null;
    private int findBottomLeftValueDFS(TreeNode root) {
        dfs(root, 1);
        return leftNode.val;
    }

    private void dfs(TreeNode node, int level) {
        if (node == null) {
            return;
        }
        if (level > maxLevel) {
            leftNode = node;
            maxLevel = level;
        }
        dfs(node.left, level + 1);
        dfs(node.right, level + 1);
    }


    private int findBottomLeftValueBFS(TreeNode root) {
        TreeNode leftNode = null;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            leftNode = queue.peek();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }
        return leftNode.val;
    }
}
