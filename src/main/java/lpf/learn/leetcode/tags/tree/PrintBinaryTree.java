package lpf.learn.leetcode.tags.tree;

import lpf.learn.leetcode.entity.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** 655 输出二叉树
 <p>给你一棵二叉树的根节点 <code>root</code> ，请你构造一个下标从 <strong>0</strong> 开始、大小为 <code>m x n</code> 的字符串矩阵 <code>res</code> ，用以表示树的 <strong>格式化布局</strong> 。构造此格式化布局矩阵需要遵循以下规则：</p>
 <ul>
 <li>树的 <strong>高度</strong> 为 <code>height</code> ，矩阵的行数 <code>m</code> 应该等于 <code>height + 1</code> 。</li>
 <li>矩阵的列数 <code>n</code> 应该等于 <code>2<sup>height+1</sup> - 1</code> 。</li>
 <li><strong>根节点</strong> 需要放置在 <strong>顶行</strong> 的 <strong>正中间</strong> ，对应位置为 <code>res[0][(n-1)/2]</code> 。</li>
 <li>对于放置在矩阵中的每个节点，设对应位置为 <code>res[r][c]</code> ，将其左子节点放置在 <code>res[r+1][c-2<sup>height-r-1</sup>]</code> ，右子节点放置在 <code>res[r+1][c+2<sup>height-r-1</sup>]</code> 。</li>
 <li>继续这一过程，直到树中的所有节点都妥善放置。</li>
 <li>任意空单元格都应该包含空字符串 <code>""</code> 。</li>
 </ul>

 <p>返回构造得到的矩阵<em> </em><code>res</code> 。</p>

 <p><strong>示例 1：</strong></p>
 <img alt="" src="https://assets.leetcode.com/uploads/2021/05/03/print1-tree.jpg" style="width: 141px; height: 181px;" />
 <pre>
 <strong>输入：</strong>root = [1,2]
 <strong>输出：</strong>
 [["","1",""],
 &nbsp;["2","",""]]
 </pre>

 <p><strong>示例 2：</strong></p>
 <img alt="" src="https://assets.leetcode.com/uploads/2021/05/03/print2-tree.jpg" style="width: 207px; height: 302px;" />
 <pre>
 <strong>输入：</strong>root = [1,2,3,null,4]
 <strong>输出：</strong>
 [["","","","1","","",""],
 &nbsp;["","2","","","","3",""],
 &nbsp;["","","4","","","",""]]
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li>树中节点数在范围 <code>[1, 2<sup>10</sup>]</code> 内</li>
 <li><code>-99 &lt;= Node.val &lt;= 99</code></li>
 <li>树的深度在范围 <code>[1, 10]</code> 内</li>
 </ul>
 */
public class PrintBinaryTree {
    public List<List<String>> printTree(TreeNode root) {
        int depth = dfsDepth(root, 1);

        String[][] array = new String[depth][(1 << depth) - 1];
        for (String[] strings : array) {
            Arrays.fill(strings, "");
        }

        dfs(root, (1 << (depth - 1)) - 1, depth, array, depth);

        List<List<String>> result = new ArrayList<>();

        for (String[] strings : array) {
            result.add(Arrays.asList(strings));
        }
        return result;
    }

    private void dfs(TreeNode node, int index, int depth, String[][] array, int maxDepth) {
        array[maxDepth - depth][index] = String.valueOf(node.val);
        depth--;
        if (node.left != null) {
            dfs(node.left, index - (1 << (depth - 1)), depth, array, maxDepth);
        }
        if (node.right != null) {
            dfs(node.right, index + (1 << (depth - 1)), depth, array, maxDepth);
        }
    }

    private int dfsDepth(TreeNode node, int depth) {
        int result = depth;
        if (node.left != null) {
            result = Math.max(result, dfsDepth(node.left, depth + 1));
        }
        if (node.right != null) {
            result = Math.max(result, dfsDepth(node.right, depth + 1));
        }
        return result;
    }
}
