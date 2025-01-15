package lpf.learn.leetcode.tags.graph;


import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/** 827 最大人工岛
 <p>给你一个大小为 <code>n x n</code> 二进制矩阵 <code>grid</code> 。<strong>最多</strong> 只能将一格&nbsp;<code>0</code> 变成&nbsp;<code>1</code> 。</p>
 <p>返回执行此操作后，<code>grid</code> 中最大的岛屿面积是多少？</p>
 <p><strong>岛屿</strong> 由一组上、下、左、右四个方向相连的&nbsp;<code>1</code> 形成。</p>

 <p><strong class="example">示例 1:</strong></p>
 <pre>
 <strong>输入: </strong>grid = [[1, 0], [0, 1]]
 <strong>输出:</strong> 3
 <strong>解释:</strong> 将一格0变成1，最终连通两个小岛得到面积为 3 的岛屿。
 </pre>

 <p><strong class="example">示例 2:</strong></p>
 <pre>
 <strong>输入: </strong>grid =<strong> </strong>[[1, 1], [1, 0]]
 <strong>输出:</strong> 4
 <strong>解释:</strong> 将一格0变成1，岛屿的面积扩大为 4。</pre>

 <p><strong class="example">示例 3:</strong></p>
 <pre>
 <strong>输入: </strong>grid = [[1, 1], [1, 1]]
 <strong>输出:</strong> 4
 <strong>解释:</strong> 没有0可以让我们变成1，面积依然为 4。</pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>n == grid.length</code></li>
 <li><code>n == grid[i].length</code></li>
 <li><code>1 &lt;= n &lt;= 500</code></li>
 <li><code>grid[i][j]</code> 为 <code>0</code> 或 <code>1</code></li>
 </ul>
 */
public class MakingALargeIsland {
    private final static int[][] dict = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    private int[][] grid;
    private boolean[][] visited;
    private int n;
    private int m;

    public int largestIsland(int[][] grid) {
        this.grid = grid;
        this.n = grid.length;
        this.m = grid[0].length;
        this.visited = new boolean[n][m];

        int res = 0;
        Map<Integer, int[]> map = new HashMap<>();
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (visited[i][j] || grid[i][j] == 0) continue;

                int c = dfs(i, j, queue);
                int[] a = {c};
                res = Math.max(res, c);
                while (!queue.isEmpty()) {
                    int[] poll = queue.poll();
                    map.put(poll[0] * m + poll[1], a);
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] != 0) continue;

                Set<int[]> set = new HashSet<>();
                for (int[] d : dict) {
                    int ni = i + d[0], nj = j + d[1];
                    if (ni < 0 || ni >= n || nj < 0 || nj >= m) continue;
                    set.add(map.getOrDefault(ni * m + nj, new int[]{0}));
                }
                int sum = 1;
                for (int[] a : set) sum += a[0];

                res = Math.max(res, sum);
            }
        }
        return res;
    }

    private int dfs(int i, int j, Queue<int[]> queue) {
        visited[i][j] = true;
        queue.add(new int[]{i, j});
        int c = 0;
        for (int[] d : dict) {
            int ni = i + d[0], nj = j + d[1];
            if (ni < 0 || ni >= n || nj < 0 || nj >= m || visited[ni][nj] || grid[ni][nj] == 0) continue;

            c += dfs(ni, nj, queue);
        }
        return c + 1;
    }
}
