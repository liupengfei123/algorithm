package lpf.learn.leetcode.game.weekly320;

import lpf.learn.leetcode.entity.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/** [2476] 二叉搜索树最近节点查询
 <p>给你一个 <strong>二叉搜索树</strong> 的根节点 <code>root</code> ，和一个由正整数组成、长度为 <code>n</code> 的数组 <code>queries</code> 。</p>
 <p>请你找出一个长度为 <code>n</code> 的 <strong>二维</strong> 答案数组 <code>answer</code> ，其中 <code>answer[i] = [min<sub>i</sub>, max<sub>i</sub>]</code> ：</p>
 <ul>
 <li><code>min<sub>i</sub></code> 是树中小于等于&nbsp;<code>queries[i]</code> 的 <strong>最大值</strong> 。如果不存在这样的值，则使用 <code>-1</code> 代替。</li>
 <li><code>max<sub>i</sub></code> 是树中大于等于&nbsp;<code>queries[i]</code> 的 <strong>最小值</strong> 。如果不存在这样的值，则使用 <code>-1</code> 代替。</li>
 </ul>

 <p>返回数组 <code>answer</code> 。</p>
 <p><strong>示例 1 ：</strong></p>

 <p><img alt="" src="https://assets.leetcode.com/uploads/2022/09/28/bstreeedrawioo.png" style="width: 261px; height: 281px;" /></p>
 <pre>
 <strong>输入：</strong>root = [6,2,13,1,4,9,15,null,null,null,null,null,null,14], queries = [2,5,16]
 <strong>输出：</strong>[[2,2],[4,6],[15,-1]]
 <strong>解释：</strong>按下面的描述找出并返回查询的答案：
 - 树中小于等于 2 的最大值是 2 ，且大于等于 2 的最小值也是 2 。所以第一个查询的答案是 [2,2] 。
 - 树中小于等于 5 的最大值是 4 ，且大于等于 5 的最小值是 6 。所以第二个查询的答案是 [4,6] 。
 - 树中小于等于 16 的最大值是 15 ，且大于等于 16 的最小值不存在。所以第三个查询的答案是 [15,-1] 。
 </pre>

 <p><strong>示例 2 ：</strong></p>
 <p><img alt="" src="https://assets.leetcode.com/uploads/2022/09/28/bstttreee.png" style="width: 101px; height: 121px;" /></p>
 <pre>
 <strong>输入：</strong>root = [4,null,9], queries = [3]
 <strong>输出：</strong>[[-1,4]]
 <strong>解释：</strong>树中不存在小于等于 3 的最大值，且大于等于 3 的最小值是 4 。所以查询的答案是 [-1,4] 。
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li>树中节点的数目在范围 <code>[2, 10<sup>5</sup>]</code> 内</li>
 <li><code>1 &lt;= Node.val &lt;= 10<sup>6</sup></code></li>
 <li><code>n == queries.length</code></li>
 <li><code>1 &lt;= n &lt;= 10<sup>5</sup></code></li>
 <li><code>1 &lt;= queries[i] &lt;= 10<sup>6</sup></code></li>
 </ul>
 */
public class ClosestNodesQueriesInABinarySearchTree {
    public List<List<Integer>> closestNodes(TreeNode root, List<Integer> queries) {
        TreeSet<Integer> treeSet = new TreeSet();

        bfs(root, treeSet);

        List<List<Integer>> list = new ArrayList<>();

        for (Integer query : queries) {
            List<Integer> temp = new ArrayList<>();
            list.add(temp);

            Integer floor = treeSet.floor(query);
            temp.add(floor == null ? -1 : floor);
            Integer ceiling = treeSet.ceiling(query);
            temp.add(ceiling == null ? -1 : ceiling);
        }
        return list;
    }

    private void bfs(TreeNode node, TreeSet<Integer> treeSet) {
        if (node == null) {
            return;
        }
        bfs(node.left, treeSet);
        treeSet.add(node.val);

        bfs(node.right, treeSet);
    }

}
