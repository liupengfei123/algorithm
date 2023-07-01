package lpf.learn.leetcode.game.weekly338;

import java.util.*;

/** [2603] 收集树中金币
 <p>给你一个 <code>n</code>&nbsp;个节点的无向无根树，节点编号从&nbsp;<code>0</code>&nbsp;到&nbsp;<code>n - 1</code>&nbsp;。给你整数&nbsp;<code>n</code>&nbsp;和一个长度为 <code>n - 1</code>&nbsp;的二维整数数组 <code>edges</code>&nbsp;，其中&nbsp;<code>edges[i] = [a<sub>i</sub>, b<sub>i</sub>]</code>&nbsp;表示树中节点&nbsp;<code>a<sub>i</sub></code> 和&nbsp;<code>b<sub>i</sub></code>&nbsp;之间有一条边。再给你一个长度为 <code>n</code>&nbsp;的数组&nbsp;<code>coins</code>&nbsp;，其中&nbsp;<code>coins[i]</code> 可能为&nbsp;<code>0</code>&nbsp;也可能为&nbsp;<code>1</code>&nbsp;，<code>1</code>&nbsp;表示节点 <code>i</code>&nbsp;处有一个金币。</p>
 <p>一开始，你需要选择树中任意一个节点出发。你可以执行下述操作任意次：</p>
 <ul>
 <li>收集距离当前节点距离为 <code>2</code>&nbsp;以内的所有金币，或者</li>
 <li>移动到树中一个相邻节点。</li>
 </ul>
 <p>你需要收集树中所有的金币，并且回到出发节点，请你返回最少经过的边数。</p>
 <p>如果你多次经过一条边，每一次经过都会给答案加一。</p>

 <p><strong>示例 1：</strong></p>
 <p><img alt="" src="https://assets.leetcode.com/uploads/2023/03/01/graph-2.png" style="width: 522px; height: 522px;"></p>
 <pre><b>输入：</b>coins = [1,0,0,0,0,1], edges = [[0,1],[1,2],[2,3],[3,4],[4,5]]
 <b>输出：</b>2
 <b>解释：</b>从节点 2 出发，收集节点 0 处的金币，移动到节点 3 ，收集节点 5 处的金币，然后移动回节点 2 。
 </pre>

 <p><strong>示例 2：</strong></p>
 <p><img alt="" src="https://assets.leetcode.com/uploads/2023/03/02/graph-4.png" style="width: 522px; height: 522px;"></p>
 <pre><b>输入：</b>coins = [0,0,0,1,1,0,0,1], edges = [[0,1],[0,2],[1,3],[1,4],[2,5],[5,6],[5,7]]
 <b>输出：</b>2
 <b>解释：</b>从节点 0 出发，收集节点 4 和 3 处的金币，移动到节点 2 处，收集节点 7 处的金币，移动回节点 0 。
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>n == coins.length</code></li>
 <li><code>1 &lt;= n &lt;= 3 * 10<sup>4</sup></code></li>
 <li><code>0 &lt;= coins[i] &lt;= 1</code></li>
 <li><code>edges.length == n - 1</code></li>
 <li><code>edges[i].length == 2</code></li>
 <li><code>0 &lt;= a<sub>i</sub>, b<sub>i</sub> &lt; n</code></li>
 <li><code>a<sub>i</sub> != b<sub>i</sub></code></li>
 <li><code>edges</code>&nbsp;表示一棵合法的树。</li>
 </ul>
 */
public class CollectCoinsInATree {

    public int collectTheCoins(int[] coins, int[][] edges) {
        int n = coins.length;
        List<Integer> g[] = new ArrayList[n];
        Arrays.setAll(g, e -> new ArrayList<>());
        int[] deg = new int[n];
        for (int[] e : edges) {
            int x = e[0], y = e[1];
            g[x].add(y);
            g[y].add(x); // 建图
            ++deg[x];
            ++deg[y];
        }

        // 用拓扑排序「剪枝」：去掉没有金币的子树
        Deque<Integer> q = new ArrayDeque<Integer>();
        for (int i = 0; i < n; ++i)
            if (deg[i] == 1 && coins[i] == 0) // 无金币叶子
                q.add(i);
        while (!q.isEmpty()) {
            int x = q.peek();
            q.pop();
            for (int y : g[x])
                if (--deg[y] == 1 && coins[y] == 0)
                    q.add(y);
        }

        // 再次拓扑排序
        for (int i = 0; i < n; ++i)
            if (deg[i] == 1 && coins[i] == 1) // 有金币叶子
                q.add(i);
        if (q.size() <= 1) return 0; // 至多一个有金币的叶子，直接收集
        int[] time = new int[n];
        while (!q.isEmpty()) {
            int x = q.peek();
            q.pop();
            for (int y : g[x])
                if (--deg[y] == 1) {
                    time[y] = time[x] + 1; // 记录入队时间
                    q.add(y);
                }
        }

        // 统计答案
        int ans = 0;
        for (int[] e : edges)
            if (time[e[0]] >= 2 && time[e[1]] >= 2)
                ans += 2;
        return ans;
    }
}
