package lpf.learn.leetcode.tags.graph;


/** 1905 统计子岛屿
 <p>给你两个&nbsp;<code>m x n</code>&nbsp;的二进制矩阵&nbsp;<code>grid1</code> 和&nbsp;<code>grid2</code>&nbsp;，它们只包含&nbsp;<code>0</code>&nbsp;（表示水域）和 <code>1</code>&nbsp;（表示陆地）。一个 <strong>岛屿</strong>&nbsp;是由 <strong>四个方向</strong>&nbsp;（水平或者竖直）上相邻的&nbsp;<code>1</code>&nbsp;组成的区域。任何矩阵以外的区域都视为水域。</p>
 <p>如果 <code>grid2</code>&nbsp;的一个岛屿，被 <code>grid1</code>&nbsp;的一个岛屿&nbsp;<strong>完全</strong> 包含，也就是说 <code>grid2</code>&nbsp;中该岛屿的每一个格子都被 <code>grid1</code>&nbsp;中同一个岛屿完全包含，那么我们称 <code>grid2</code>&nbsp;中的这个岛屿为 <strong>子岛屿</strong>&nbsp;。</p>
 <p>请你返回 <code>grid2</code>&nbsp;中 <strong>子岛屿</strong>&nbsp;的 <strong>数目</strong>&nbsp;。</p>

 <p><strong>示例 1：</strong></p>
 <img alt="" src="https://assets.leetcode.com/uploads/2021/06/10/test1.png" style="width: 493px; height: 205px;"> <pre><b>输入：</b>grid1 = [[1,1,1,0,0],[0,1,1,1,1],[0,0,0,0,0],[1,0,0,0,0],[1,1,0,1,1]], grid2 = [[1,1,1,0,0],[0,0,1,1,1],[0,1,0,0,0],[1,0,1,1,0],[0,1,0,1,0]]
 <b>输出：</b>3
 <strong>解释：</strong>如上图所示，左边为 grid1 ，右边为 grid2 。
 grid2 中标红的 1 区域是子岛屿，总共有 3 个子岛屿。
 </pre> </img>

 <p><strong>示例 2：</strong></p>
 <img alt="" src="https://assets.leetcode.com/uploads/2021/06/03/testcasex2.png" style="width: 491px; height: 201px;"> <pre><b>输入：</b>grid1 = [[1,0,1,0,1],[1,1,1,1,1],[0,0,0,0,0],[1,1,1,1,1],[1,0,1,0,1]], grid2 = [[0,0,0,0,0],[1,1,1,1,1],[0,1,0,1,0],[0,1,0,1,0],[1,0,0,0,1]]
 <b>输出：</b>2
 <strong>解释：</strong>如上图所示，左边为 grid1 ，右边为 grid2 。
 grid2 中标红的 1 区域是子岛屿，总共有 2 个子岛屿。
 </pre> </img>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>m == grid1.length == grid2.length</code></li>
 <li><code>n == grid1[i].length == grid2[i].length</code></li>
 <li><code>1 &lt;= m, n &lt;= 500</code></li>
 <li><code>grid1[i][j]</code> 和&nbsp;<code>grid2[i][j]</code>&nbsp;都要么是&nbsp;<code>0</code>&nbsp;要么是&nbsp;<code>1</code>&nbsp;。</li>
 </ul>
 */
public class CountSubIslands {
    private static final int[][] dict = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    private int[][] grid1;
    private int[][] grid2;
    private boolean[][] visited;
    private int n;
    private int m;

    public int countSubIslands(int[][] grid1, int[][] grid2) {
        this.grid1 = grid1;
        this.grid2 = grid2;
        this.n = grid2.length;
        this.m = grid2[0].length;
        this.visited = new boolean[n][m];

        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (visited[i][j] || grid2[i][j] == 0) continue;

                if (dfs(i, j)) res++;
            }
        }
        return res;
    }

    private boolean dfs(int i, int j) {
        if (visited[i][j]) return true;
        visited[i][j] = true;

        boolean res = grid1[i][j] == grid2[i][j];
        for (int[] d : dict) {
            int ni = i + d[0], nj = j + d[1];
            if (ni < 0 || ni >= n || nj < 0 || nj >= m || grid2[ni][nj] == 0) continue;

            res = dfs(ni, nj) && res;
        }
        return res;
    }
}
