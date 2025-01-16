package lpf.learn.leetcode.tags.graph;

import java.util.LinkedList;
import java.util.Queue;

/** 1091 二进制矩阵中的最短路径
 <p>给你一个 <code>n x n</code> 的二进制矩阵 <code>grid</code> 中，返回矩阵中最短 <strong>畅通路径</strong> 的长度。如果不存在这样的路径，返回 <code>-1</code> 。</p>
 <p>二进制矩阵中的 畅通路径 是一条从 <strong>左上角</strong> 单元格（即，<code>(0, 0)</code>）到 右下角 单元格（即，<code>(n - 1, n - 1)</code>）的路径，该路径同时满足下述要求：</p>
 <ul>
 <li>路径途经的所有单元格都的值都是 <code>0</code> 。</li>
 <li>路径中所有相邻的单元格应当在 <strong>8 个方向之一</strong> 上连通（即，相邻两单元之间彼此不同且共享一条边或者一个角）。</li>
 </ul>
 <p><strong>畅通路径的长度</strong> 是该路径途经的单元格总数。</p>

 <p><strong>示例 1：</strong></p>
 <img alt="" src="https://assets.leetcode.com/uploads/2021/02/18/example1_1.png" style="width: 500px; height: 234px;" />
 <pre>
 <strong>输入：</strong>grid = [[0,1],[1,0]]
 <strong>输出：</strong>2
 </pre>

 <p><strong>示例 2：</strong></p>
 <img alt="" src="https://assets.leetcode.com/uploads/2021/02/18/example2_1.png" style="height: 216px; width: 500px;" />
 <pre>
 <strong>输入：</strong>grid = [[0,0,0],[1,1,0],[1,1,0]]
 <strong>输出：</strong>4
 </pre>

 <p><strong>示例 3：</strong></p>
 <pre>
 <strong>输入：</strong>grid = [[1,0,0],[1,1,0],[1,1,0]]
 <strong>输出：</strong>-1
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>n == grid.length</code></li>
 <li><code>n == grid[i].length</code></li>
 <li><code>1 <= n <= 100</code></li>
 <li><code>grid[i][j]</code> 为 <code>0</code> 或 <code>1</code></li>
 </ul>
 */
public class ShortestPathInBinaryMatrix {
    private final static int[][] dict = new int[][]{{1, 0}, {0, -1}, {-1, 0}, {0, 1}, {1,1},{1,-1},{-1,1},{-1,-1}};
    private final Queue<int[]> queue = new LinkedList<>();

    private int[][] grid;
    private boolean[][] visited;
    private int n;
    private int m;

    public int shortestPathBinaryMatrix(int[][] grid) {
        this.grid = grid;
        this.n = grid.length;
        this.m = grid[0].length;
        this.visited = new boolean[n][m];

        if (grid[0][0] == 1) return -1;

        queue.add(new int[]{0, 0, 1});
        return bfs();
    }

    private int bfs() {
        while (!queue.isEmpty()) {
            int[] pos = queue.poll();
            int i = pos[0], j = pos[1], x = pos[2];

            if (i == n - 1 && j == m - 1) return x;

            for (int[] d : dict) {
                int ni = i + d[0], nj = j + d[1];
                if (ni < 0 || ni >= n || nj < 0 || nj >= m || grid[ni][nj] == 1 || visited[ni][nj]) continue;

                visited[ni][nj] = true;
                queue.add(new int[]{ni, nj, x + 1});
            }
        }
        return -1;
    }
}
