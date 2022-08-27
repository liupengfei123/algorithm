package lpf.learn.leetcode.game.weekly305;

import java.util.*;

/** [2368] 受限条件下可到达节点的数目
 <p>现有一棵由 <code>n</code> 个节点组成的无向树，节点编号从 <code>0</code> 到 <code>n - 1</code> ，共有 <code>n - 1</code> 条边。</p>
 <p>给你一个二维整数数组 <code>edges</code> ，长度为 <code>n - 1</code> ，其中 <code>edges[i] = [a<sub>i</sub>, b<sub>i</sub>]</code> 表示树中节点 <code>a<sub>i</sub></code> 和 <code>b<sub>i</sub></code> 之间存在一条边。另给你一个整数数组 <code>restricted</code> 表示 <strong>受限</strong> 节点。</p>
 <p>在不访问受限节点的前提下，返回你可以从节点<em> </em><code>0</code><em> </em>到达的 <strong>最多</strong> 节点数目<em>。</em></p>
 <p>注意，节点 <code>0</code> <strong>不</strong> 会标记为受限节点。</p>

 <p><strong>示例 1：</strong></p>
 <img alt="" src="https://assets.leetcode.com/uploads/2022/06/15/ex1drawio.png" style="width: 402px; height: 322px;">
 <pre><strong>输入：</strong>n = 7, edges = [[0,1],[1,2],[3,1],[4,0],[0,5],[5,6]], restricted = [4,5]
 <strong>输出：</strong>4
 <strong>解释：</strong>上图所示正是这棵树。
 在不访问受限节点的前提下，只有节点 [0,1,2,3] 可以从节点 0 到达。</pre>

 <p><strong>示例 2：</strong></p>
 <img alt="" src="https://assets.leetcode.com/uploads/2022/06/15/ex2drawio.png" style="width: 412px; height: 312px;">
 <pre><strong>输入：</strong>n = 7, edges = [[0,1],[0,2],[0,5],[0,4],[3,2],[6,5]], restricted = [4,2,1]
 <strong>输出：</strong>3
 <strong>解释：</strong>上图所示正是这棵树。
 在不访问受限节点的前提下，只有节点 [0,5,6] 可以从节点 0 到达。
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>2 &lt;= n &lt;= 10<sup>5</sup></code></li>
 <li><code>edges.length == n - 1</code></li>
 <li><code>edges[i].length == 2</code></li>
 <li><code>0 &lt;= a<sub>i</sub>, b<sub>i</sub> &lt; n</code></li>
 <li><code>a<sub>i</sub> != b<sub>i</sub></code></li>
 <li><code>edges</code> 表示一棵有效的树</li>
 <li><code>1 &lt;= restricted.length &lt; n</code></li>
 <li><code>1 &lt;= restricted[i] &lt; n</code></li>
 <li><code>restricted</code> 中的所有值 <strong>互不相同</strong></li>
 </ul>
 */
public class ReachableNodesWithRestrictions {

    public int reachableNodes(int n, int[][] edges, int[] restricted) {
        Set<Integer> visied = new HashSet<>();
        Set<Integer> restrictSet = new HashSet<>();
        for (int i : restricted) {
            restrictSet.add(i);
        }

        Map<Integer, Set<Integer>> tree = new HashMap<>();

        for (int[] edge : edges) {
            Set<Integer> set = tree.computeIfAbsent(edge[0], k -> new HashSet<>());
            set.add(edge[1]);

            set = tree.computeIfAbsent(edge[1], k -> new HashSet<>());
            set.add(edge[0]);
        }

        dfs(0, visied, restrictSet, tree);

        return visied.size();
    }

    private void dfs(int index, Set<Integer> visied, Set<Integer> restricted, Map<Integer, Set<Integer>> tree) {
        if (restricted.contains(index) || visied.contains(index)) {
            return;
        }
        visied.add(index);

        Set<Integer> set = tree.get(index);
        if (set == null) {
            return;
        }
        for (Integer i : set) {
            dfs(i, visied, restricted, tree);
        }
    }
}
