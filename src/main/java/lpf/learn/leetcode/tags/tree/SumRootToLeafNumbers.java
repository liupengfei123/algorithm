package lpf.learn.leetcode.tags.tree;

import lpf.learn.leetcode.entity.TreeNode;

import java.util.ArrayList;
import java.util.List;

/** [129]求根到叶子节点数字之和
 * 给定一个二叉树，它的每个结点都存放一个 0-9 的数字，每条从根到叶子节点的路径都代表一个数字。
 * 例如，从根到叶子节点路径 1->2->3 代表数字 123。
 * 计算从根到叶子节点生成的所有数字之和。
 *
 * 说明: 叶子节点是指没有子节点的节点。
 * 示例 1:
 * 输入: [1,2,3]
 *    1
 *   / \
 *  2   3
 * 输出: 25
 * 解释:
 * 从根到叶子节点路径 1->2 代表数字 12.
 * 从根到叶子节点路径 1->3 代表数字 13.
 * 因此，数字总和 = 12 + 13 = 25.
 *
 * 示例 2:
 * 输入: [4,9,0,5,1]
 *    4
 *   / \
 *  9   0
 *  / \
 * 5   1
 * 输出: 1026
 * 解释:
 * 从根到叶子节点路径 4->9->5 代表数字 495.
 * 从根到叶子节点路径 4->9->1 代表数字 491.
 * 从根到叶子节点路径 4->0 代表数字 40.
 * 因此，数字总和 = 495 + 491 + 40 = 1026.
 */
public class SumRootToLeafNumbers {
    private int result = 0;
    private List<Integer> list = new ArrayList<>();

    public int sumNumbers(TreeNode root) {
        traversal(root);
        return result;
    }

    private void traversal(TreeNode node) {
        if (node == null) {
            return;
        }
        list.add(node.val);

        if (node.left == null && node.right == null) {
            int temp = 0;
            for (Integer value : list) {
                temp = temp * 10 + value;
            }
            result += temp;
        } else {
            traversal(node.left);
            traversal(node.right);
        }
        list.remove(list.size() - 1);
    }


    public int sumNumbers2(TreeNode root) {
        return helper(root, 0);
    }
    //按照路径从顶往下计算  值 = 旧值 * 10 + val
    private int helper(TreeNode node, int temp) {
        //说明该条路径不为叶子节点 不计算
        if (node == null) {
            return 0;
        }
        temp = temp * 10 + node.val;
        //到达叶子节点返回计算的值
        if (node.left == null && node.right == null) {
            return temp;
        }
        return helper(node.left, temp) + helper(node.right, temp);
    }

}
