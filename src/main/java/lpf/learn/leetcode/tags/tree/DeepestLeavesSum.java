package lpf.learn.leetcode.tags.tree;

import lpf.learn.leetcode.entity.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

/** [1302]层数最深叶子节点的和
 <p>给你一棵二叉树的根节点 <code>root</code> ，请你返回 <strong>层数最深的叶子节点的和</strong> 。</p>
 <p><strong>示例 1：</strong></p>
 <p><strong><img alt="" src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2019/12/28/1483_ex1.png" style="height: 265px; width: 273px;" /></strong></p>
 <pre>
 <strong>输入：</strong>root = [1,2,3,4,5,null,6,7,null,null,null,null,8]
 <strong>输出：</strong>15
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <strong>输入：</strong>root = [6,7,8,2,7,1,3,9,null,1,4,null,null,null,5]
 <strong>输出：</strong>19
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li>树中节点数目在范围 <code>[1, 10<sup>4</sup>]</code> 之间。</li>
 <li><code>1 <= Node.val <= 100</code></li>
 </ul>
 */
public class DeepestLeavesSum {
    private int sum = 0;
    private int maxDepth = 0;

    public int deepestLeavesSum(TreeNode root) {
        dfs(root, 0);
        return sum;
    }

    private void dfs(TreeNode node, int depth) {
        if (node == null) {
            return;
        }

        if (depth > maxDepth) {
            maxDepth = depth;
            sum = node.val;
        } else if (depth == maxDepth) {
            sum += node.val;
        }
        dfs(node.left, depth + 1);
        dfs(node.right, depth + 1);
    }



    public int deepestLeavesSum2(TreeNode root) {
        Deque<TreeNode> deque = new LinkedList<>();
        deque.push(root);

        int sum = 0;
        while (!deque.isEmpty()) {
            sum = 0;
            int size = deque.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = deque.pop();
                sum += node.val;

                if (node.left != null) {
                    deque.add(node.left);
                }
                if (node.right != null) {
                    deque.add(node.right);
                }
            }
        }

        return sum;
    }
}
