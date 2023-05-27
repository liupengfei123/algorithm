package lpf.learn.leetcode.game.weekly346;

import java.util.*;

/** [2699] 修改图中的边权
 <p>给你一个 <code>n</code>&nbsp;个节点的 <strong>无向带权连通</strong>&nbsp;图，节点编号为&nbsp;<code>0</code>&nbsp;到&nbsp;<code>n - 1</code>&nbsp;，再给你一个整数数组&nbsp;<code>edges</code>&nbsp;，其中&nbsp;<code>edges[i] = [a<sub>i</sub>, b<sub>i</sub>, w<sub>i</sub>]</code>&nbsp;表示节点&nbsp;<code>a<sub>i</sub></code> 和&nbsp;<code>b<sub>i</sub></code>&nbsp;之间有一条边权为&nbsp;<code>w<sub>i</sub></code>&nbsp;的边。</p>
 <p>部分边的边权为&nbsp;<code>-1</code>（<code>w<sub>i</sub> = -1</code>），其他边的边权都为 <strong>正</strong>&nbsp;数（<code>w<sub>i</sub> &gt; 0</code>）。</p>
 <p>你需要将所有边权为 <code>-1</code>&nbsp;的边都修改为范围&nbsp;<code>[1, 2 * 10<sup>9</sup>]</code>&nbsp;中的 <strong>正整数</strong>&nbsp;，使得从节点&nbsp;<code>source</code>&nbsp;到节点&nbsp;<code>destination</code>&nbsp;的 <strong>最短距离</strong>&nbsp;为整数&nbsp;<code>target</code>&nbsp;。如果有 <strong>多种</strong>&nbsp;修改方案可以使&nbsp;<code>source</code> 和&nbsp;<code>destination</code>&nbsp;之间的最短距离等于&nbsp;<code>target</code>&nbsp;，你可以返回任意一种方案。</p>
 <p>如果存在使 <code>source</code>&nbsp;到 <code>destination</code>&nbsp;最短距离为 <code>target</code>&nbsp;的方案，请你按任意顺序返回包含所有边的数组（包括未修改边权的边）。如果不存在这样的方案，请你返回一个 <strong>空数组</strong>&nbsp;。</p>
 <p><strong>注意：</strong>你不能修改一开始边权为正数的边。</p>

 <p><strong>示例 1：</strong></p>
 <p><strong><img alt="" src="https://assets.leetcode.com/uploads/2023/04/18/graph.png" style="width: 300px; height: 300px;" /></strong></p>
 <pre>
 <b>输入：</b>n = 5, edges = [[4,1,-1],[2,0,-1],[0,3,-1],[4,3,-1]], source = 0, destination = 1, target = 5
 <b>输出：</b>[[4,1,1],[2,0,1],[0,3,3],[4,3,1]]
 <b>解释：</b>上图展示了一个满足题意的修改方案，从 0 到 1 的最短距离为 5 。
 </pre>

 <p><strong>示例 2：</strong></p>
 <p><strong><img alt="" src="https://assets.leetcode.com/uploads/2023/04/18/graph-2.png" style="width: 300px; height: 300px;" /></strong></p>
 <pre>
 <b>输入：</b>n = 3, edges = [[0,1,-1],[0,2,5]], source = 0, destination = 2, target = 6
 <b>输出：</b>[]
 <b>解释：</b>上图是一开始的图。没有办法通过修改边权为 -1 的边，使得 0 到 2 的最短距离等于 6 ，所以返回一个空数组。
 </pre>

 <p><strong>示例 3：</strong></p>
 <p><strong><img alt="" src="https://assets.leetcode.com/uploads/2023/04/19/graph-3.png" style="width: 300px; height: 300px;" /></strong></p>
 <pre>
 <b>输入：</b>n = 4, edges = [[1,0,4],[1,2,3],[2,3,5],[0,3,-1]], source = 0, destination = 2, target = 6
 <b>输出：</b>[[1,0,4],[1,2,3],[2,3,5],[0,3,1]]
 <b>解释：</b>上图展示了一个满足题意的修改方案，从 0 到 2 的最短距离为 6 。
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= n &lt;= 100</code></li>
 <li><code>1 &lt;= edges.length &lt;= n * (n - 1) / 2</code></li>
 <li><code>edges[i].length == 3</code></li>
 <li><code>0 &lt;= a<sub>i</sub>, b<sub>i&nbsp;</sub>&lt;&nbsp;n</code></li>
 <li><code>w<sub>i</sub>&nbsp;= -1</code> 或者 <code>1 &lt;= w<sub>i&nbsp;</sub>&lt;= 10<sup><span style="">7</span></sup></code></li>
 <li><code>a<sub>i&nbsp;</sub>!=&nbsp;b<sub>i</sub></code></li>
 <li><code>0 &lt;= source, destination &lt; n</code></li>
 <li><code>source != destination</code></li>
 <li><code>1 &lt;= target &lt;= 10<sup>9</sup></code></li>
 <li>输入的图是连通图，且没有自环和重边。</li>
 </ul>
 */
public class ModifyGraphEdgeWeights {
    public int[][] modifiedGraphEdges(int n, int[][] edges, int source, int destination, int target) {
        List<int[]> g[] = new ArrayList[n];
        Arrays.setAll(g, e -> new ArrayList<>());
        for (int i = 0; i < edges.length; i++) {
            int x = edges[i][0], y = edges[i][1];
            g[x].add(new int[]{y, i});
            g[y].add(new int[]{x, i}); // 建图，额外记录边的编号
        }

        int[][] dis = new int[n][2];
        for (int i = 0; i < n; i++)
            if (i != source)
                dis[i][0] = dis[i][1] = Integer.MAX_VALUE;

        dijkstra(g, edges, destination, dis, 0, 0);
        int delta = target - dis[destination][0];
        if (delta < 0) // -1 全改为 1 时，最短路比 target 还大
            return new int[][]{};

        dijkstra(g, edges, destination, dis, delta, 1);
        if (dis[destination][1] < target) // 最短路无法再变大，无法达到 target
            return new int[][]{};

        for (int[] e : edges)
            if (e[2] == -1) // 剩余没修改的边全部改成 1
                e[2] = 1;
        return edges;
    }

    // 朴素 Dijkstra 算法
    // 这里 k 表示第一次/第二次
    private void dijkstra(List<int[]> g[], int[][] edges, int destination, int[][] dis, int delta, int k) {
        int n = g.length;
        boolean[] vis = new boolean[n];
        for (; ; ) {
            // 找到当前最短路，去更新它的邻居的最短路
            // 根据数学归纳法，dis[x][k] 一定是最短路长度
            int x = -1;
            for (int i = 0; i < n; ++i)
                if (!vis[i] && (x < 0 || dis[i][k] < dis[x][k]))
                    x = i;
            if (x == destination) // 起点 source 到终点 destination 的最短路已确定
                return;
            vis[x] = true; // 标记，在后续的循环中无需反复更新 x 到其余点的最短路长度
            for (int[] e : g[x]) {
                int y = e[0], eid = e[1];
                int wt = edges[eid][2];
                if (wt == -1)
                    wt = 1; // -1 改成 1
                if (k == 1 && edges[eid][2] == -1) {
                    // 第二次 Dijkstra，改成 w
                    int w = delta + dis[y][0] - dis[x][1];
                    if (w > wt)
                        edges[eid][2] = wt = w; // 直接在 edges 上修改
                }
                // 更新最短路
                dis[y][k] = Math.min(dis[y][k], dis[x][k] + wt);
            }
        }
    }
}
