package lpf.learn.leetcode.tags.graph;


/** 1020 飞地的数量
 <p>给你一个大小为 <code>m x n</code> 的二进制矩阵 <code>grid</code> ，其中 <code>0</code> 表示一个海洋单元格、<code>1</code> 表示一个陆地单元格。</p>
 <p>一次 <strong>移动</strong> 是指从一个陆地单元格走到另一个相邻（<strong>上、下、左、右</strong>）的陆地单元格或跨过 <code>grid</code> 的边界。</p>
 <p>返回网格中<strong> 无法 </strong>在任意次数的移动中离开网格边界的陆地单元格的数量。</p>

 <p><strong>示例 1：</strong></p>
 <img alt="" src="https://assets.leetcode.com/uploads/2021/02/18/enclaves1.jpg" style="height: 200px; width: 200px;" />
 <pre>
 <strong>输入：</strong>grid = [[0,0,0,0],[1,0,1,0],[0,1,1,0],[0,0,0,0]]
 <strong>输出：</strong>3
 <strong>解释：</strong>有三个 1 被 0 包围。一个 1 没有被包围，因为它在边界上。
 </pre>

 <p><strong>示例 2：</strong></p>
 <img alt="" src="https://assets.leetcode.com/uploads/2021/02/18/enclaves2.jpg" style="height: 200px; width: 200px;" />
 <pre>
 <strong>输入：</strong>grid = [[0,1,1,0],[0,0,1,0],[0,0,1,0],[0,0,0,0]]
 <strong>输出：</strong>0
 <strong>解释：</strong>所有 1 都在边界上或可以到达边界。
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>m == grid.length</code></li>
 <li><code>n == grid[i].length</code></li>
 <li><code>1 &lt;= m, n &lt;= 500</code></li>
 <li><code>grid[i][j]</code> 的值为 <code>0</code> 或 <code>1</code></li>
 </ul>
 */
public class NumberOfEnclaves {
    private static final int[][] dict = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
    private static final int[] EMPTY = new int[2];

    private int[][] grid;
    private boolean[][] visited;
    private int n;
    private int m;

    public int numEnclaves(int[][] grid) {
        this.grid = grid;
        this.n = grid.length;
        this.m = grid[0].length;
        this.visited = new boolean[n][m];

        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (visited[i][j] || grid[i][j] == 0) continue;

                int[] temp = dfs(i, j);
                if (temp[1] >= 0) res += temp[0];
            }
        }
        return res;
    }

    private int[] dfs(int i, int j) {
        if (visited[i][j]) return EMPTY;
        visited[i][j] = true;

        int[] res = new int[]{1, 0};
        for (int[] d : dict) {
            int ni = i + d[0], nj = j + d[1];
            if (ni < 0 || ni >= n || nj < 0 || nj >= m) {
                res[1] = -1;
                continue;
            }
            if (grid[ni][nj] == 0) continue;

            int[] temp = dfs(ni, nj);
            res[0] += temp[0];
            res[1] += temp[1];
        }
        return res;
    }
}
