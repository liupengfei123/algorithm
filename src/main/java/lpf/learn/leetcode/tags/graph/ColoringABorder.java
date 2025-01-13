package lpf.learn.leetcode.tags.graph;


/** 1034 边界着色
 <p>给你一个大小为 <code>m x n</code> 的整数矩阵 <code>grid</code> ，表示一个网格。另给你三个整数&nbsp;<code>row</code>、<code>col</code> 和 <code>color</code> 。网格中的每个值表示该位置处的网格块的颜色。</p>
 <p>如果两个方块在任意 4 个方向上相邻，则称它们&nbsp;<strong>相邻 </strong>。</p>
 <p>如果两个方块具有相同的颜色且相邻，它们则属于同一个 <strong>连通分量</strong> 。</p>
 <p><strong>连通分量的边界</strong><strong> </strong>是指连通分量中满足下述条件之一的所有网格块：</p>
 <ul>
 <li>在上、下、左、右任意一个方向上与不属于同一连通分量的网格块相邻</li>
 <li>在网格的边界上（第一行/列或最后一行/列）</li>
 </ul>
 <p>请你使用指定颜色&nbsp;<code>color</code> 为所有包含网格块&nbsp;<code>grid[row][col]</code> 的 <strong>连通分量的边界</strong> 进行着色。</p>
 <p>并返回最终的网格&nbsp;<code>grid</code> 。</p>

 <p><strong class="example">示例 1：</strong></p>
 <pre>
 <strong>输入：</strong>grid = [[1,1],[1,2]], row = 0, col = 0, color = 3
 <strong>输出：</strong>[[3,3],[3,2]]</pre>

 <p><strong class="example">示例 2：</strong></p>
 <pre>
 <strong>输入：</strong>grid = [[1,2,2],[2,3,2]], row = 0, col = 1, color = 3
 <strong>输出：</strong>[[1,3,3],[2,3,3]]</pre>

 <p><strong class="example">示例 3：</strong></p>
 <pre>
 <strong>输入：</strong>grid = [[1,1,1],[1,1,1],[1,1,1]], row = 1, col = 1, color = 2
 <strong>输出：</strong>[[2,2,2],[2,1,2],[2,2,2]]</pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>m == grid.length</code></li>
 <li><code>n == grid[i].length</code></li>
 <li><code>1 &lt;= m, n &lt;= 50</code></li>
 <li><code>1 &lt;= grid[i][j], color &lt;= 1000</code></li>
 <li><code>0 &lt;= row &lt; m</code></li>
 <li><code>0 &lt;= col &lt; n</code></li>
 </ul>
 */
public class ColoringABorder {
    private static final int[][] dict = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};

    private int[][] grid;
    private int[][] newGrid;
    private boolean[][] visited;
    private int n;
    private int m;
    private int t;
    private int color;

    public int[][] colorBorder(int[][] grid, int row, int col, int color) {
        this.grid = grid;
        this.n = grid.length;
        this.m = grid[0].length;
        this.visited = new boolean[n][m];
        this.t = grid[row][col];
        this.color = color;
        this.newGrid = new int[n][m];

        for (int i = 0; i < n; i++) System.arraycopy(grid[i], 0, newGrid[i], 0, m);

        if (t != color) dfs(row, col);

        return newGrid;
    }

    private void dfs(int i, int j) {
        if (visited[i][j]) return;
        visited[i][j] = true;

        for (int[] d : dict) {
            int ni = i + d[0], nj = j + d[1];
            if (ni < 0 || ni >= n || nj < 0 || nj >= m || grid[ni][nj] != t) {
                newGrid[i][j] = color;
                continue;
            }
            dfs(ni, nj);
        }
    }
}
