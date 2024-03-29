package lpf.learn.leetcode.tags.tree;

import lpf.learn.leetcode.entity.TreeNode;


/** 687 最长同值路径
 <p>给定一个二叉树的<meta charset="UTF-8" />&nbsp;<code>root</code>&nbsp;，返回&nbsp;<em>最长的路径的长度</em> ，这个路径中的&nbsp;<em>每个节点具有相同值</em>&nbsp;。 这条路径可以经过也可以不经过根节点。</p>
 <p><strong>两个节点之间的路径长度</strong>&nbsp;由它们之间的边数表示。</p>

 <p><strong>示例 1:</strong></p>
 <p><img alt="" src="https://assets.leetcode.com/uploads/2020/10/13/ex1.jpg" /></p>
 <pre>
 <strong>输入：</strong>root = [5,4,5,1,1,5]
 <strong>输出：</strong>2
 </pre>

 <p><strong>示例 2:</strong></p>
 <p><img alt="" src="https://assets.leetcode.com/uploads/2020/10/13/ex2.jpg" /></p>
 <pre>
 <strong>输入：</strong>root = [1,4,5,4,4,5]
 <strong>输出：</strong>2
 </pre>

 <p><strong>提示:</strong></p>
 <ul>
 <li>树的节点数的范围是<meta charset="UTF-8" />&nbsp;<code>[0, 10<sup>4</sup>]</code>&nbsp;</li>
 <li><code>-1000 &lt;= Node.val &lt;= 1000</code></li>
 <li>树的深度将不超过 <code>1000</code>&nbsp;</li>
 </ul>
 */
public class LongestUnivaluePath {
    private int maxPath = 1;
    public int longestUnivaluePath(TreeNode root) {
        if (root != null) {
            dfs(root, root.val);
        }
        return maxPath - 1;
    }

    private int dfs(TreeNode node, int parentVal) {
        if (node == null) {
            return 0;
        }
        int leftValue = dfs(node.left, node.val);
        int rightValue = dfs(node.right, node.val);

        int result = Math.max(leftValue, rightValue) + 1;

        maxPath = Math.max(maxPath, leftValue + rightValue + 1);

        return node.val != parentVal ? 0 : result;
    }
}
