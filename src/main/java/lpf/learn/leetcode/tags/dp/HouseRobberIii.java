package lpf.learn.leetcode.tags.dp;

import lpf.learn.leetcode.entity.TreeNode;

/** [337]打家劫舍 III
 * 在上次打劫完一条街道之后和一圈房屋后，小偷又发现了一个新的可行窃的地区。这个地区只有一个入口，我们称之为“根”。 除了“根”之外，每栋房子有且只有一个“父“
 * 房子与之相连。一番侦察之后，聪明的小偷意识到“这个地方的所有房屋的排列类似于一棵二叉树”。 如果两个直接相连的房子在同一天晚上被打劫，房屋将自动报警。
 *
 * 计算在不触动警报的情况下，小偷一晚能够盗取的最高金额。
 *
 * 示例 1:
 * 输入: [3,2,3,null,3,null,1]
 *     3
 *    / \
 *   2   3
 *    \   \
 *     3   1
 *
 * 输出: 7
 * 解释: 小偷一晚能够盗取的最高金额 = 3 + 3 + 1 = 7.
 *
 * 示例 2:
 * 输入: [3,4,5,1,3,null,1]
 *      3
 *    / \
 *   4   5
 *  / \   \
 * 1   3   1
 * 输出: 9
 * 解释: 小偷一晚能够盗取的最高金额 = 4 + 5 = 9.
 *
 */
public class HouseRobberIii {

    public  int rob(TreeNode root) {
        //res[0]代表偷当前结点,res[1] 代表不偷当前结点
        int[] res = dfs(root);
        return Math.max(res[0], res[1]);
    }
    private int[] dfs(TreeNode root) {
        if (root == null) {
            return new int[2];
        }
        int[] res = new int[2];
        int[] leftRes = dfs(root.left);
        int[] rightRes = dfs(root.right);
        //用当前结点
        res[0] = root.val + leftRes[1] + rightRes[1];
        //不用当前结点,直接加上左右子结点最大的状态即可,因为当前结点没有用,所有不用担心子结点用不用
        res[1] = Math.max(leftRes[0], leftRes[1]) + Math.max(rightRes[0], rightRes[1]);
        return res;
    }



    public int rob2(TreeNode root) {
        return help(root, true);
    }

    private int help(TreeNode node, boolean use) {
        if (node == null) {
            return 0;
        }

        if (use) {
            return Math.max(help(node.left, true) + help(node.right, true)
                    ,  help(node.left, false) + help(node.right, false) + node.val);
        } else {
            return help(node.left, true) + help(node.right, true);
        }
    }
}
