package lpf.learn.leetcode.tags.graph;


/** 2658 网格图中鱼的最大数目
 <p>给你一个下标从 <strong>0</strong>&nbsp;开始大小为 <code>m x n</code>&nbsp;的二维整数数组&nbsp;<code>grid</code>&nbsp;，其中下标在&nbsp;<code>(r, c)</code>&nbsp;处的整数表示：</p>
 <ul>
 <li>如果&nbsp;<code>grid[r][c] = 0</code>&nbsp;，那么它是一块 <strong>陆地</strong>&nbsp;。</li>
 <li>如果&nbsp;<code>grid[r][c] &gt; 0</code>&nbsp;，那么它是一块&nbsp;<strong>水域</strong>&nbsp;，且包含&nbsp;<code>grid[r][c]</code>&nbsp;条鱼。</li>
 </ul>

 <p>一位渔夫可以从任意 <strong>水域</strong>&nbsp;格子&nbsp;<code>(r, c)</code>&nbsp;出发，然后执行以下操作任意次：</p>
 <ul>
 <li>捕捞格子&nbsp;<code>(r, c)</code>&nbsp;处所有的鱼，或者</li>
 <li>移动到相邻的 <strong>水域</strong>&nbsp;格子。</li>
 </ul>
 <p>请你返回渔夫最优策略下，&nbsp;<strong>最多</strong>&nbsp;可以捕捞多少条鱼。如果没有水域格子，请你返回 <code>0</code>&nbsp;。</p>
 <p>格子&nbsp;<code>(r, c)</code>&nbsp;<strong>相邻</strong>&nbsp;的格子为&nbsp;<code>(r, c + 1)</code>&nbsp;，<code>(r, c - 1)</code>&nbsp;，<code>(r + 1, c)</code> 和&nbsp;<code>(r - 1, c)</code>&nbsp;，前提是相邻格子在网格图内。</p>

 <p><strong>示例 1：</strong></p>
 <p><img alt="" src="https://assets.leetcode.com/uploads/2023/03/29/example.png" style="width: 241px; height: 161px;" /></p>
 <pre><b>输入：</b>grid = [[0,2,1,0],[4,0,0,3],[1,0,0,4],[0,3,2,0]]
 <b>输出：</b>7
 <b>解释：</b>渔夫可以从格子 <span><code>(1,3)</code></span> 出发，捕捞 3 条鱼，然后移动到格子 <span><code>(2,3)</code></span>&nbsp;，捕捞 4 条鱼。
 </pre>

 <p><strong>示例 2：</strong></p>
 <p><img alt="" src="https://assets.leetcode.com/uploads/2023/03/29/example2.png" /></p>
 <pre><b>输入：</b>grid = [[1,0,0,0],[0,0,0,0],[0,0,0,0],[0,0,0,1]]
 <b>输出：</b>1
 <b>解释：</b>渔夫可以从格子 (0,0) 或者 (3,3) ，捕捞 1 条鱼。
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>m == grid.length</code></li>
 <li><code>n == grid[i].length</code></li>
 <li><code>1 &lt;= m, n &lt;= 10</code></li>
 <li><code>0 &lt;= grid[i][j] &lt;= 10</code></li>
 </ul>
 */
public class MaximumNumberOfFishInAGrid {
    private static final int[][] dict = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};

    private int[][] grid;
    private boolean[][] visited;
    private int n;
    private int m;

    public int findMaxFish(int[][] grid) {
        this.grid = grid;
        this.n = grid.length;
        this.m = grid[0].length;
        this.visited = new boolean[n][m];

        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (visited[i][j] || grid[i][j] == 0) continue;

                res = Math.max(res, dfs(i, j));
            }
        }
        return res;
    }

    private int dfs(int i, int j) {
        if (visited[i][j]) return 0;
        visited[i][j] = true;

        int c = grid[i][j];
        for (int[] d : dict) {
            int ni = i + d[0], nj = j + d[1];
            if (ni < 0 || ni >= n || nj < 0 || nj >= m || grid[ni][nj] == 0) continue;

            c += dfs(ni, nj);
        }
        return c;
    }

}
