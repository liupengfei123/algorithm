package lpf.learn.leetcode.tags.tree;

import lpf.learn.leetcode.entity.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/** [113]路径总和 II
 * 给定一个二叉树和一个目标和，找到所有从根节点到叶子节点路径总和等于给定目标和的路径。
 * 说明: 叶子节点是指没有子节点的节点。
 * 示例:
 * 给定如下二叉树，以及目标和 sum = 22，
 *               5
 *             / \
 *            4   8
 *           /   / \
 *          11  13  4
 *         /  \    / \
 *        7    2  5   1
 * 返回:
 * [
 *   [5,4,11,2],
 *   [5,8,4,5]
 * ]
 */
public class PathSumIi {
    List<List<Integer>> result = null;
    LinkedList<Integer> list = null;

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        result = new ArrayList<>();
        list = new LinkedList<>();
        traversal(root, sum);
        return result;
    }

    private void traversal(TreeNode node, int sum) {
        if (node == null) {
            return;
        }
        list.add(node.val);
        sum -= node.val;

        if (node.left != null || node.right != null) {
            traversal(node.left, sum);
            traversal(node.right, sum);
        } else {
            if (sum == 0) {
                result.add(new LinkedList<>(list));
            }
        }
        list.removeLast();
    }
}
