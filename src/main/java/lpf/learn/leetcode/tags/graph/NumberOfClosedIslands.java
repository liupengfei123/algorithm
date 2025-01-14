package lpf.learn.leetcode.tags.graph;


/** 1254 统计封闭岛屿的数目
 <p>二维矩阵 <code>grid</code>&nbsp;由 <code>0</code>&nbsp;（土地）和 <code>1</code>&nbsp;（水）组成。岛是由最大的4个方向连通的 <code>0</code>&nbsp;组成的群，封闭岛是一个&nbsp;<code>完全</code> 由1包围（左、上、右、下）的岛。</p>
 <p>请返回 <em>封闭岛屿</em> 的数目。</p>

 <p><strong>示例 1：</strong></p>
 <p><img alt="" src="https://assets.leetcode.com/uploads/2019/10/31/sample_3_1610.png" style="height: 151px; width: 240px;" /></p>
 <pre>
 <strong>输入：</strong>grid = [[1,1,1,1,1,1,1,0],[1,0,0,0,0,1,1,0],[1,0,1,0,1,1,1,0],[1,0,0,0,0,1,0,1],[1,1,1,1,1,1,1,0]]
 <strong>输出：</strong>2
 <strong>解释：</strong>
 灰色区域的岛屿是封闭岛屿，因为这座岛屿完全被水域包围（即被 1 区域包围）。</pre>

 <p><strong>示例 2：</strong></p>
 <p><img src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2019/11/07/sample_4_1610.png" style="height: 98px; width: 160px;" /></p>
 <pre>
 <strong>输入：</strong>grid = [[0,0,1,0,0],[0,1,0,1,0],[0,1,1,1,0]]
 <strong>输出：</strong>1
 </pre>

 <p><strong>示例 3：</strong></p>
 <pre>
 <strong>输入：</strong>grid = [[1,1,1,1,1,1,1],
 &nbsp;            [1,0,0,0,0,0,1],
 &nbsp;            [1,0,1,1,1,0,1],
 &nbsp;            [1,0,1,0,1,0,1],
 &nbsp;            [1,0,1,1,1,0,1],
 &nbsp;            [1,0,0,0,0,0,1],
 [1,1,1,1,1,1,1]]
 <strong>输出：</strong>2
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= grid.length, grid[0].length &lt;= 100</code></li>
 <li><code>0 &lt;= grid[i][j] &lt;=1</code></li>
 </ul>
 */
public class NumberOfClosedIslands {
    private static final int[][] dict = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    private int[][] grid;
    private boolean[][] visited;
    private int n;
    private int m;

    public int closedIsland(int[][] grid) {
        this.grid = grid;
        this.n = grid.length;
        this.m = grid[0].length;
        this.visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            dfs(i, 0);
            dfs(i, m - 1);
        }
        for (int j = 0; j < m; j++) {
            dfs(0, j);
            dfs(n - 1, j);
        }
        int res = 0;
        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < m - 1; j++) {
                if (visited[i][j] || grid[i][j] == 1) continue;

                res++;
                dfs(i, j);
            }
        }
        return res;
    }

    private void dfs(int i, int j) {
        if (visited[i][j] || grid[i][j] == 1) return;
        visited[i][j] = true;

        for (int[] d : dict) {
            int ni = i + d[0], nj = j + d[1];
            if (ni < 0 || ni >= n || nj < 0 || nj >= m || grid[ni][nj] == 1) continue;
            dfs(ni, nj);
        }
    }
}
