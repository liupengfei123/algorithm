package lpf.learn.leetcode.tags.dp;

import java.util.Arrays;

/** 1483 树节点的第 K 个祖先
 <p>给你一棵树，树上有 <code>n</code> 个节点，按从 <code>0</code> 到 <code>n-1</code> 编号。树以父节点数组的形式给出，其中 <code>parent[i]</code> 是节点 <code>i</code> 的父节点。树的根节点是编号为 <code>0</code> 的节点。</p>
 <p>树节点的第 <em><code>k</code> </em>个祖先节点是从该节点到根节点路径上的第 <code>k</code> 个节点。</p>
 <p>实现 <code>TreeAncestor</code> 类：</p>
 <ul>
 <li><code>TreeAncestor（int n， int[] parent）</code> 对树和父数组中的节点数初始化对象。</li>
 <li><code>getKthAncestor</code><code>(int node, int k)</code> 返回节点 <code>node</code> 的第 <code>k</code> 个祖先节点。如果不存在这样的祖先节点，返回 <code>-1</code>&nbsp;。</li>
 </ul>

 <p><strong>示例 1：</strong></p>
 <p><strong><img alt="" src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/06/14/1528_ex1.png" /></strong></p>
 <pre>
 <strong>输入：</strong>
 ["TreeAncestor","getKthAncestor","getKthAncestor","getKthAncestor"]
 [[7,[-1,0,0,1,1,2,2]],[3,1],[5,2],[6,3]]

 <strong>输出：</strong> [null,1,0,-1]
 <strong>解释：</strong>
 TreeAncestor treeAncestor = new TreeAncestor(7, [-1, 0, 0, 1, 1, 2, 2]);
 treeAncestor.getKthAncestor(3, 1);  // 返回 1 ，它是 3 的父节点
 treeAncestor.getKthAncestor(5, 2);  // 返回 0 ，它是 5 的祖父节点
 treeAncestor.getKthAncestor(6, 3);  // 返回 -1 因为不存在满足要求的祖先节点
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= k &lt;= n &lt;= 5 * 10<sup>4</sup></code></li>
 <li><code>parent[0] == -1</code> 表示编号为 <code>0</code> 的节点是根节点。</li>
 <li>对于所有的 <code>0 &lt;&nbsp;i &lt; n</code> ，<code>0 &lt;= parent[i] &lt; n</code> 总成立</li>
 <li><code>0 &lt;= node &lt; n</code></li>
 <li>至多查询&nbsp;<code>5 * 10<sup>4</sup></code> 次</li>
 </ul>
 */
public class KthAncestorOfATreeNode {
    private static final int LOG = 16;
    private final int[][] ancestor;

    public KthAncestorOfATreeNode(int n, int[] parent) {
        ancestor = new int[n][LOG];

        for (int i = 0; i < n; i++) {
            Arrays.fill(ancestor[i], -1);
            ancestor[i][0] = parent[i];
        }
        for (int i = 1; i < LOG; i++) {
            for (int j = 0; j < n; j++) {
                if (ancestor[j][i - 1] != -1) ancestor[j][i] = ancestor[ancestor[j][i - 1]][i - 1];
            }
        }
    }

    public int getKthAncestor(int node, int k) {
        while (k > 0 && node != -1) {
            node = ancestor[node][Integer.numberOfTrailingZeros(k)];
            k &= k - 1;
        }
        return node;
    }
}
