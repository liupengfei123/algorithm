package lpf.learn.leetcode.tags.tree;

import lpf.learn.leetcode.entity.TreeNode;

import java.util.LinkedList;

/** [437]路径总和 III
 * 给定一个二叉树的根节点 root ，和一个整数 targetSum ，求该二叉树里节点值之和等于 targetSum 的 路径 的数目。
 * 路径 不需要从根节点开始，也不需要在叶子节点结束，但是路径方向必须是向下的（只能从父节点到子节点）。
 *
 * 示例 1：
 * 输入：root = [10,5,-3,3,2,null,11,3,-2,null,1], targetSum = 8
 * 输出：3
 * 解释：和等于 8 的路径有 3 条，如图所示。
 *
 * 示例 2：
 * 输入：root = [5,4,8,11,null,13,4,7,2,null,null,5,1], targetSum = 22
 * 输出：3
 *
 * 提示:
 * 二叉树的节点个数的范围是 [0,1000]
 * -10^9 <= Node.val <= 10^9
 * -1000 <= targetSum <= 1000
 */
public class PathSumIii {
    private int result;
    private int targetSum;
    private LinkedList<Integer> list;


    public int pathSum(TreeNode root, int targetSum) {
        this.result = 0;
        this.targetSum = targetSum;
        this.list = new LinkedList();

        traversal(root, 0);

        return result;
    }


    private void traversal(TreeNode node, long sum) {
        if (node == null) {
            return;
        }
        list.addLast(node.val);
        sum += node.val;

        result += checkTargetSum(sum);

        traversal(node.left, sum);
        traversal(node.right, sum);

        list.removeLast();
    }

    private int checkTargetSum(long sum) {
        int value = 0;
        for (int i = 0; i < list.size(); i++) {
            if (sum == targetSum) {
                value++;
            }
            sum -= list.get(i);
        }
        return value;
    }
}
