package lpf.learn.leetcode.game.biweekly81;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** [2316] 统计无向图中无法互相到达点对数
 * <p>给你一个整数&nbsp;<code>n</code>&nbsp;，表示一张<strong>&nbsp;无向图</strong>&nbsp;中有 <code>n</code>&nbsp;个节点，编号为&nbsp;<code>0</code>&nbsp;到&nbsp;<code>n - 1</code>&nbsp;。同时给你一个二维整数数组&nbsp;<code>edges</code>&nbsp;，其中&nbsp;<code>edges[i] = [a<sub>i</sub>, b<sub>i</sub>]</code>&nbsp;表示节点&nbsp;<code>a<sub>i</sub></code> 和&nbsp;<code>b<sub>i</sub></code>&nbsp;之间有一条&nbsp;<strong>无向</strong>&nbsp;边。</p>
 * <p>请你返回 <strong>无法互相到达</strong>&nbsp;的不同 <strong>点对数目</strong>&nbsp;。</p>
 *
 * <p><strong>示例 1：</strong></p>
 * <p><img alt="" src="https://assets.leetcode.com/uploads/2022/05/05/tc-3.png" style="width: 267px; height: 169px;"></p>
 * <pre><b>输入：</b>n = 3, edges = [[0,1],[0,2],[1,2]]
 * <b>输出：</b>0
 * <b>解释：</b>所有点都能互相到达，意味着没有点对无法互相到达，所以我们返回 0 。
 * </pre>
 *
 *  <p><strong>示例 2：</strong></p>
 * <p><img alt="" src="https://assets.leetcode.com/uploads/2022/05/05/tc-2.png" style="width: 295px; height: 269px;"></p>
 * <pre><b>输入：</b>n = 7, edges = [[0,2],[0,5],[2,4],[1,6],[5,4]]
 * <b>输出：</b>14
 * <b>解释：</b>总共有 14 个点对互相无法到达：
 * [[0,1],[0,3],[0,6],[1,2],[1,3],[1,4],[1,5],[2,3],[2,6],[3,4],[3,5],[3,6],[4,6],[5,6]]
 * 所以我们返回 14 。
 * </pre>
 *
 * <p><strong>提示：</strong></p>
 * <ul>
 * 	<li><code>1 &lt;= n &lt;= 10<sup>5</sup></code></li>
 * 	<li><code>0 &lt;= edges.length &lt;= 2 * 10<sup>5</sup></code></li>
 * 	<li><code>edges[i].length == 2</code></li>
 * 	<li><code>0 &lt;= a<sub>i</sub>, b<sub>i</sub> &lt; n</code></li>
 * 	<li><code>a<sub>i</sub> != b<sub>i</sub></code></li>
 * 	<li>不会有重复边。</li>
 * </ul>
 */
public class CountUnreachablePairsOfNodesInAnUndirectedGraph {
    boolean[] visit;
    Map<Integer, List<Integer>> link;

    public long countPairs(int n, int[][] edges) {
        this.visit = new boolean[n];
        this.link = new HashMap<>();

        for (int[] edge : edges) {
            List<Integer> list = link.getOrDefault(edge[0], new ArrayList<>());
            list.add(edge[1]);
            link.putIfAbsent(edge[0], list);

            list = link.getOrDefault(edge[1], new ArrayList<>());
            list.add(edge[0]);
            link.putIfAbsent(edge[1], list);
        }

        List<Integer> counts = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int count = dfs(i);
            if (count != 0) {
                counts.add(count);
            }
        }
        long result = 0;
        long sum = 0;
        for (Integer count : counts) {
            result += sum * count;
            sum += count;
        }
        return result;
    }

    private int dfs(int i) {
        if (visit[i]) {
            return 0;
        }
        visit[i] = true;

        int result = 1;
        List<Integer> list = link.get(i);
        if (list != null) {
            for (Integer j : list) {
                result += dfs(j);
            }
        }
        return result;
    }
}
