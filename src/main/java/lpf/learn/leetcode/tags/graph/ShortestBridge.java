package lpf.learn.leetcode.tags.graph;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/** 934 最短的桥
 <p>给你一个大小为 <code>n x n</code> 的二元矩阵 <code>grid</code> ，其中 <code>1</code> 表示陆地，<code>0</code> 表示水域。</p>
 <p><strong>岛</strong> 是由四面相连的 <code>1</code> 形成的一个最大组，即不会与非组内的任何其他 <code>1</code> 相连。<code>grid</code> 中 <strong>恰好存在两座岛</strong> 。</p>
 <div class="original__bRMd">
 <div>
 <p>你可以将任意数量的 <code>0</code> 变为 <code>1</code> ，以使两座岛连接起来，变成 <strong>一座岛</strong> 。</p>
 </div>
 </div>
 <p>返回必须翻转的 <code>0</code> 的最小数目。</p>

 <p><strong>示例 1：</strong></p>
 <pre>
 <strong>输入：</strong>grid = [[0,1],[1,0]]
 <strong>输出：</strong>1
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <strong>输入：</strong>grid = [[0,1,0],[0,0,0],[0,0,1]]
 <strong>输出：</strong>2
 </pre>

 <p><strong>示例 3：</strong></p>
 <pre>
 <strong>输入：</strong>grid = [[1,1,1,1,1],[1,0,0,0,1],[1,0,1,0,1],[1,0,0,0,1],[1,1,1,1,1]]
 <strong>输出：</strong>1
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>n == grid.length == grid[i].length</code></li>
 <li><code>2 &lt;= n &lt;= 100</code></li>
 <li><code>grid[i][j]</code> 为 <code>0</code> 或 <code>1</code></li>
 <li><code>grid</code> 中恰有两个岛</li>
 </ul>
 */
public class ShortestBridge {
    private final static int[][] dict = new int[][]{{1, 0}, {0, -1}, {-1, 0}, {0, 1}};
    private final Queue<int[]> queue = new LinkedList<>();

    private int[][] grid;
    private boolean[][] visited;
    private int n;
    private int m;

    public int shortestBridge(int[][] grid) {
        this.grid = grid;
        this.n = grid.length;
        this.m = grid[0].length;
        this.visited = new boolean[n][m];

        int[][] dp1 = solve();
        int[][] dp2 = solve();

        int min = 1000000;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 0) min = Math.min(min, dp1[i][j] + dp2[i][j] - 1);
            }
        }
        return min;
    }


    private int[][] solve() {
        int[][] dp = new int[n][m];
        for (int i = 0; i < n; i++) Arrays.fill(dp[i], 100000);

        out:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 0 || visited[i][j]) continue;
                dfs(i, j, dp);
                break out;
            }
        }
        bfs(dp);
        return dp;
    }

    private void dfs(int i, int j, int[][] dp) {
        if (visited[i][j]) return;
        visited[i][j] = true;

        dp[i][j] = 0;
        queue.add(new int[]{i, j});

        for (int[] d : dict) {
            int ni = i + d[0], nj = j + d[1];
            if (ni < 0 || ni >= n || nj < 0 || nj >= m || grid[ni][nj] == 0 || visited[ni][nj])
                continue;
            dfs(ni, nj, dp);
        }
    }

    private void bfs(int[][] dp) {
        while (!queue.isEmpty()) {
            int[] pos = queue.poll();
            int i = pos[0], j = pos[1];
            for (int[] d : dict) {
                int ni = i + d[0], nj = j + d[1];
                if (ni < 0 || ni >= n || nj < 0 || nj >= m || dp[ni][nj] <= dp[i][j] + 1) continue;

                dp[ni][nj] = dp[i][j] + 1;
                queue.add(new int[]{ni, nj});
            }
        }
    }
}
