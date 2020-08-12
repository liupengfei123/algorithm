package lpf.learn.leetcode.tags.tree;

import lpf.learn.leetcode.entity.TreeNode;

import java.util.ArrayList;
import java.util.List;

/** [653]两数之和 IV - 输入 BST
 * 给定一个二叉搜索树和一个目标结果，如果 BST 中存在两个元素且它们的和等于给定的目标结果，则返回 true。
 * 案例 1:
 * 输入:
 *    5
 *   / \
 *  3   6
 * / \   \
 * 2   4   7
 * Target = 9
 * 输出: True
 *
 * 案例 2:
 * 输入:
 *    5
 *   / \
 *  3   6
 * / \   \
 * 2   4   7
 * Target = 28
 * 输出: False
 */
public class TwoSumIvInputIsABst {
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        traversal(root, list);

        int start = 0, end = list.size() - 1;

        while (start <= end) {
            int sum = list.get(start) + list.get(end);
            if (sum > k) {
                end--;
            } else if (sum < k) {
                start++;
            } else {
                return true;
            }
        }
        return false;
    }

    private void traversal(TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }
        traversal(node.left, list);
        list.add(node.val);
        traversal(node.right, list);
    }
}
