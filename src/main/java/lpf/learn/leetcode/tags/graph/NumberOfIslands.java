package lpf.learn.leetcode.tags.graph;

/** 200 岛屿数量
 <p>给你一个由&nbsp;<code>'1'</code>（陆地）和 <code>'0'</code>（水）组成的的二维网格，请你计算网格中岛屿的数量。</p>
 <p>岛屿总是被水包围，并且每座岛屿只能由水平方向和/或竖直方向上相邻的陆地连接形成。</p>
 <p>此外，你可以假设该网格的四条边均被水包围。</p>

 <p><strong>示例 1：</strong></p>
 <pre>
 <strong>输入：</strong>grid = [
 ["1","1","1","1","0"],
 ["1","1","0","1","0"],
 ["1","1","0","0","0"],
 ["0","0","0","0","0"]
 ]
 <strong>输出：</strong>1
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <strong>输入：</strong>grid = [
 ["1","1","0","0","0"],
 ["1","1","0","0","0"],
 ["0","0","1","0","0"],
 ["0","0","0","1","1"]
 ]
 <strong>输出：</strong>3
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>m == grid.length</code></li>
 <li><code>n == grid[i].length</code></li>
 <li><code>1 &lt;= m, n &lt;= 300</code></li>
 <li><code>grid[i][j]</code> 的值为 <code>'0'</code> 或 <code>'1'</code></li>
 </ul>
 */
public class NumberOfIslands {
    private static final int[][] dict = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};

    private char[][] grid;
    private int m;
    private int n;

    public int numIslands(char[][] grid) {
        this.grid = grid;
        this.m = grid.length;
        this.n = grid[0].length;

        boolean[][] visited = new boolean[m][n];
        int res = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '0' || visited[i][j]) continue;

                dfs(i, j, visited);
                res++;
            }
        }
        return res;
    }

    private void dfs(int i, int j, boolean[][] visited) {
        if (visited[i][j]) return;
        visited[i][j] = true;

        for (int[] d : dict) {
            int ni = i + d[0], nj = j + d[1];
            if (ni < 0 || ni >= m || nj < 0 || nj >= n) continue;

            if (grid[ni][nj] == '0') continue;

            dfs(ni, nj, visited);
        }
    }
}
