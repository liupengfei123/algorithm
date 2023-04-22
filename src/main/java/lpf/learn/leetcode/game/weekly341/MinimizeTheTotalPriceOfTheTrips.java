package lpf.learn.leetcode.game.weekly341;

import java.util.*;

/** [2646] 最小化旅行的价格总和
 <p>现有一棵无向、无根的树，树中有 <code>n</code> 个节点，按从 <code>0</code> 到 <code>n - 1</code> 编号。给你一个整数 <code>n</code> 和一个长度为 <code>n - 1</code> 的二维整数数组 <code>edges</code> ，其中 <code>edges[i] = [a<sub>i</sub>, b<sub>i</sub>]</code> 表示树中节点 <code>a<sub>i</sub></code> 和 <code>b<sub>i</sub></code> 之间存在一条边。</p>
 <p>每个节点都关联一个价格。给你一个整数数组 <code>price</code> ，其中 <code>price[i]</code> 是第 <code>i</code> 个节点的价格。</p>
 <p>给定路径的 <strong>价格总和</strong> 是该路径上所有节点的价格之和。</p>
 <p>另给你一个二维整数数组 <code>trips</code> ，其中 <code>trips[i] = [start<sub>i</sub>, end<sub>i</sub>]</code> 表示您从节点 <code>start<sub>i</sub></code> 开始第 <code>i</code> 次旅行，并通过任何你喜欢的路径前往节点 <code>end<sub>i</sub></code> 。</p>
 <p>在执行第一次旅行之前，你可以选择一些 <strong>非相邻节点</strong> 并将价格减半。</p>
 <p>返回执行所有旅行的最小价格总和。</p>

 <p><strong>示例 1：</strong></p>
 <img alt="" src="https://assets.leetcode.com/uploads/2023/03/16/diagram2.png" style="width: 541px; height: 181px;">
 <pre><strong>输入：</strong>n = 4, edges = [[0,1],[1,2],[1,3]], price = [2,2,10,6], trips = [[0,3],[2,1],[2,3]]
 <strong>输出：</strong>23
 <strong>解释：
 </strong>上图表示将节点 2 视为根之后的树结构。第一个图表示初始树，第二个图表示选择节点 0 、2 和 3 并使其价格减半后的树。
 第 1 次旅行，选择路径 [0,1,3] 。路径的价格总和为 1 + 2 + 3 = 6 。
 第 2 次旅行，选择路径 [2,1] 。路径的价格总和为 2 + 5 = 7 。
 第 3 次旅行，选择路径 [2,1,3] 。路径的价格总和为 5 + 2 + 3 = 10 。
 所有旅行的价格总和为 6 + 7 + 10 = 23 。可以证明，23 是可以实现的最小答案。</pre>

 <p><strong>示例 2：</strong></p>
 <img alt="" src="https://assets.leetcode.com/uploads/2023/03/16/diagram3.png" style="width: 456px; height: 111px;">
 <pre><strong>输入：</strong>n = 2, edges = [[0,1]], price = [2,2], trips = [[0,0]]
 <strong>输出：</strong>1
 <strong>解释：</strong>
 上图表示将节点 0 视为根之后的树结构。第一个图表示初始树，第二个图表示选择节点 0 并使其价格减半后的树。
 第 1 次旅行，选择路径 [0] 。路径的价格总和为 1 。
 所有旅行的价格总和为 1 。可以证明，1 是可以实现的最小答案。
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= n &lt;= 50</code></li>
 <li><code>edges.length == n - 1</code></li>
 <li><code>0 &lt;= a<sub>i</sub>, b<sub>i</sub> &lt;= n - 1</code></li>
 <li><code>edges</code> 表示一棵有效的树</li>
 <li><code>price.length == n</code></li>
 <li><code>price[i]</code> 是一个偶数</li>
 <li><code>1 &lt;= price[i] &lt;= 1000</code></li>
 <li><code>1 &lt;= trips.length &lt;= 100</code></li>
 <li><code>0 &lt;= start<sub>i</sub>, end<sub>i</sub>&nbsp;&lt;= n - 1</code></li>
 </ul>
 */
public class MinimizeTheTotalPriceOfTheTrips {
    private Map<Integer, Set<Integer>> map;
    private int[] price;
    private int[] counts;

    public int minimumTotalPrice(int n, int[][] edges, int[] price, int[][] trips) {
        this.map = new HashMap<>();
        this.counts = new int[n];
        this.price = price;

        for (int i = 0; i < n; i++) map.put(i, new HashSet<>());

        for (int[] edge : edges) {
            map.get(edge[0]).add(edge[1]);
            map.get(edge[1]).add(edge[0]);
        }

        for (int[] trip : trips) dfsCountPath(trip[0], -1, trip[1]);

        int[] res = dfsValue(0, -1);
        return Math.min(res[0], res[1]);
    }

    private int[] dfsValue(int i, int fa) {
        int[] res = {price[i] * counts[i] / 2, price[i] * counts[i]};

        for (Integer j : map.get(i)) {
            if (j == fa) continue;

            int[] childRes = dfsValue(j, i);
            res[0] += childRes[1];
            res[1] += Math.min(childRes[0], childRes[1]);
        }
        return res;
    }


    private boolean dfsCountPath(int i, int fa, int t) {
        if (i == t) {
            counts[i]++;
            return true;
        }

        for (Integer j : map.get(i)) {
            if (j == fa) continue;

            if (dfsCountPath(j, i, t)) {
                counts[i]++;
                return true;
            }
        }
        return false;
    }
}
