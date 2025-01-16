package lpf.learn.leetcode.tags.graph;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/** 994 腐烂的橘子
 <p>在给定的&nbsp;<code>m x n</code>&nbsp;网格
 <meta charset="UTF-8" />&nbsp;<code>grid</code>&nbsp;中，每个单元格可以有以下三个值之一：</p>
 <ul>
 <li>值&nbsp;<code>0</code>&nbsp;代表空单元格；</li>
 <li>值&nbsp;<code>1</code>&nbsp;代表新鲜橘子；</li>
 <li>值&nbsp;<code>2</code>&nbsp;代表腐烂的橘子。</li>
 </ul>
 <p>每分钟，腐烂的橘子&nbsp;<strong>周围&nbsp;4 个方向上相邻</strong> 的新鲜橘子都会腐烂。</p>
 <p>返回 <em>直到单元格中没有新鲜橘子为止所必须经过的最小分钟数。如果不可能，返回&nbsp;<code>-1</code></em>&nbsp;。</p>

 <p><strong>示例 1：</strong></p>
 <p><strong><img alt="" src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2019/02/16/oranges.png" style="height: 137px; width: 650px;" /></strong></p>
 <pre>
 <strong>输入：</strong>grid = [[2,1,1],[1,1,0],[0,1,1]]
 <strong>输出：</strong>4
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <strong>输入：</strong>grid = [[2,1,1],[0,1,1],[1,0,1]]
 <strong>输出：</strong>-1
 <strong>解释：</strong>左下角的橘子（第 2 行， 第 0 列）永远不会腐烂，因为腐烂只会发生在 4 个方向上。
 </pre>

 <p><strong>示例 3：</strong></p>
 <pre>
 <strong>输入：</strong>grid = [[0,2]]
 <strong>输出：</strong>0
 <strong>解释：</strong>因为 0 分钟时已经没有新鲜橘子了，所以答案就是 0 。
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>m == grid.length</code></li>
 <li><code>n == grid[i].length</code></li>
 <li><code>1 &lt;= m, n &lt;= 10</code></li>
 <li><code>grid[i][j]</code> 仅为&nbsp;<code>0</code>、<code>1</code>&nbsp;或&nbsp;<code>2</code></li>
 </ul>
 */
public class RottingOranges {
    private final static int[][] dict = new int[][]{{1, 0}, {0, -1}, {-1, 0}, {0, 1}};
    private final Queue<int[]> queue = new LinkedList<>();

    private int[][] visited;
    private int n;
    private int m;

    public int orangesRotting(int[][] grid) {
        this.n = grid.length;
        this.m = grid[0].length;
        this.visited = new int[n][m];

        for (int i = 0; i < n; i++) {
            Arrays.fill(visited[i], 100000);
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) continue;
                visited[i][j] = 0;
                if (grid[i][j] == 2) queue.add(new int[]{i, j});
            }
        }

        bfs();

        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) res = Math.max(res, visited[i][j]);
        }
        return res == 100000 ? -1 : res;
    }

    private void bfs() {
        while (!queue.isEmpty()) {
            int[] pos = queue.poll();
            int i = pos[0], j = pos[1];

            for (int[] d : dict) {
                int ni = i + d[0], nj = j + d[1];
                if (ni < 0 || ni >= n || nj < 0 || nj >= m || visited[ni][nj] <= visited[i][j] + 1) continue;

                visited[ni][nj] = visited[i][j] + 1;
                queue.add(new int[]{ni, nj});
            }
        }
    }

}
