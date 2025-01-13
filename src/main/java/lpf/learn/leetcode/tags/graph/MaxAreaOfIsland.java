package lpf.learn.leetcode.tags.graph;


/** 695 岛屿的最大面积
 <p>给你一个大小为 <code>m x n</code> 的二进制矩阵 <code>grid</code> 。</p>
 <p><strong>岛屿</strong>&nbsp;是由一些相邻的&nbsp;<code>1</code>&nbsp;(代表土地) 构成的组合，这里的「相邻」要求两个 <code>1</code> 必须在 <strong>水平或者竖直的四个方向上 </strong>相邻。你可以假设&nbsp;<code>grid</code> 的四个边缘都被 <code>0</code>（代表水）包围着。</p>
 <p>岛屿的面积是岛上值为 <code>1</code> 的单元格的数目。</p>
 <p>计算并返回 <code>grid</code> 中最大的岛屿面积。如果没有岛屿，则返回面积为 <code>0</code> 。</p>

 <p><strong>示例 1：</strong></p>
 <img alt="" src="https://assets.leetcode.com/uploads/2021/05/01/maxarea1-grid.jpg" style="width: 500px; height: 310px;" />
 <pre>
 <strong>输入：</strong>grid = [[0,0,1,0,0,0,0,1,0,0,0,0,0],[0,0,0,0,0,0,0,1,1,1,0,0,0],[0,1,1,0,1,0,0,0,0,0,0,0,0],[0,1,0,0,1,1,0,0,1,0,1,0,0],[0,1,0,0,1,1,0,0,1,1,1,0,0],[0,0,0,0,0,0,0,0,0,0,1,0,0],[0,0,0,0,0,0,0,1,1,1,0,0,0],[0,0,0,0,0,0,0,1,1,0,0,0,0]]
 <strong>输出：</strong>6
 <strong>解释：</strong>答案不应该是 <span><code>11</code></span> ，因为岛屿只能包含水平或垂直这四个方向上的 <span><code>1</code></span> 。
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <strong>输入：</strong>grid = [[0,0,0,0,0,0,0,0]]
 <strong>输出：</strong>0
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>m == grid.length</code></li>
 <li><code>n == grid[i].length</code></li>
 <li><code>1 &lt;= m, n &lt;= 50</code></li>
 <li><code>grid[i][j]</code> 为 <code>0</code> 或 <code>1</code></li>
 </ul>
 */
public class MaxAreaOfIsland {
    private static final int[][] dict = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    private int[][] grid;
    private int n;
    private int m;

    public int maxAreaOfIsland(int[][] grid) {
        this.grid = grid;
        this.n = grid.length;
        this.m = grid[0].length;

        int res = 0;
        boolean[][] visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (visited[i][j] || grid[i][j] == 0) continue;

                res = Math.max(res, dfs(i, j, visited));
            }
        }
        return res;
    }

    private int dfs(int i, int j, boolean[][] visited) {
        if (visited[i][j]) return 0;
        visited[i][j] = true;

        int c = grid[i][j];
        for (int[] d : dict) {
            int ni = i + d[0], nj = j + d[1];
            if (ni < 0 || ni >= n || nj < 0 || nj >= m || grid[ni][nj] == 0) continue;

            c += dfs(ni, nj, visited);
        }
        return c;
    }
}
