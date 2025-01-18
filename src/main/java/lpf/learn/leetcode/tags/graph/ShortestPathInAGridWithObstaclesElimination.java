package lpf.learn.leetcode.tags.graph;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/** 1293 网格中的最短路径
 <p>给你一个&nbsp;<code>m * n</code>&nbsp;的网格，其中每个单元格不是&nbsp;<code>0</code>（空）就是&nbsp;<code>1</code>（障碍物）。每一步，您都可以在空白单元格中上、下、左、右移动。</p>
 <p>如果您 <strong>最多</strong> 可以消除 <code>k</code> 个障碍物，请找出从左上角 <code>(0, 0)</code> 到右下角 <code>(m-1, n-1)</code> 的最短路径，并返回通过该路径所需的步数。如果找不到这样的路径，则返回 <code>-1</code>&nbsp;。</p>

 <p><strong>示例 1：</strong></p>
 <p><img src="https://pic.leetcode.cn/1700710956-kcxqcC-img_v3_025f_d55a658c-8f40-464b-800f-22ccd27cc9fg.jpg" style="width: 243px; height: 404px;" /></p>
 <pre>
 <strong>输入：</strong> grid = [[0,0,0],[1,1,0],[0,0,0],[0,1,1],[0,0,0]], k = 1
 <strong>输出：</strong>6
 <strong>解释：
 </strong>不消除任何障碍的最短路径是 10。
 消除位置 (3,2) 处的障碍后，最短路径是 6 。该路径是 <span><code>(0,0) -&gt; (0,1) -&gt; (0,2) -&gt; (1,2) -&gt; (2,2) -&gt; <strong>(3,2)</strong> -&gt; (4,2)</code></span>.
 </pre>

 <p><strong>示例 2：</strong></p>
 <p><img src="https://pic.leetcode.cn/1700710701-uPqkZe-img_v3_025f_0edd50fb-8a70-4a42-add0-f602caaad35g.jpg" style="width: 243px; height: 244px;" /></p>
 <pre>
 <strong>输入：</strong>grid = [[0,1,1],[1,1,1],[1,0,0]], k = 1
 <strong>输出：</strong>-1
 <strong>解释：</strong>我们至少需要消除两个障碍才能找到这样的路径。
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>grid.length&nbsp;== m</code></li>
 <li><code>grid[0].length&nbsp;== n</code></li>
 <li><code>1 &lt;= m, n &lt;= 40</code></li>
 <li><code>1 &lt;= k &lt;= m*n</code></li>
 <li><code>grid[i][j]</code>&nbsp;是&nbsp;<code>0</code>&nbsp;或<strong>&nbsp;</strong><code>1</code></li>
 <li><code>grid[0][0] == grid[m-1][n-1] == 0</code></li>
 </ul>
 */
public class ShortestPathInAGridWithObstaclesElimination {
    private static final int[][] dict = new int[][]{{1, 0}, {0, -1}, {-1, 0}, {0, 1}};
    private final Queue<int[]> queue = new LinkedList<>();

    private int[][] grid;
    private int[][] visited;
    private int n;
    private int m;
    private int k;
    private int total;
    private int res = 10000000;


    public int shortestPath(int[][] grid, int k) {
        this.grid = grid;
        this.k = k;
        this.n = grid.length;
        this.m = grid[0].length;
        this.total = n * m;
        this.visited = new int[n][m];

        for (int i = 0; i < n; i++) Arrays.fill(visited[i], res);
        visited[0][0] = 0;
        queue.add(new int[]{0, 0, 0});

        bfs();

        return res == 10000000 ? -1 : res;
    }

    private void bfs() {
        while (!queue.isEmpty()) {
            int[] pos = queue.poll();
            int i = pos[0], j = pos[1], x = pos[2] % total, z = pos[2] / total; //x 为 d(路径), z(消除 z 个障碍物额度)

            if (i == n - 1 && j == m - 1) res = Math.min(res, x);

            for (int[] d : dict) {
                int ni = i + d[0], nj = j + d[1];
                if (ni < 0 || ni >= n || nj < 0 || nj >= m) continue;
                if (grid[ni][nj] == 1 && z >= k) continue;

                int nx = x + 1, nz = z + (grid[ni][nj] == 1 ? 1 : 0);
                int temp = nz * total + nx;

                if (visited[ni][nj] > temp) {
                    visited[ni][nj] = temp;
                    queue.add(new int[]{ni, nj, temp});
                }
            }
        }
    }
}
