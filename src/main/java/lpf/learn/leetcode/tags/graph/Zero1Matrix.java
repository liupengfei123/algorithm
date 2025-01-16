package lpf.learn.leetcode.tags.graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/** 542 01 矩阵
 <p>给定一个由 <code>0</code> 和 <code>1</code> 组成的矩阵 <code>mat</code>&nbsp;，请输出一个大小相同的矩阵，其中每一个格子是 <code>mat</code> 中对应位置元素到最近的 <code>0</code> 的距离。</p>
 <p>两个相邻元素间的距离为 <code>1</code> 。</p>

 <p><b>示例 1：</b></p>
 <p><img alt="" src="https://pic.leetcode-cn.com/1626667201-NCWmuP-image.png" style="width: 150px; " /></p>
 <pre>
 <strong>输入：</strong>mat =<strong> </strong>[[0,0,0],[0,1,0],[0,0,0]]
 <strong>输出：</strong>[[0,0,0],[0,1,0],[0,0,0]]
 </pre>

 <p><b>示例 2：</b></p>
 <p><img alt="" src="https://pic.leetcode-cn.com/1626667205-xFxIeK-image.png" style="width: 150px; " /></p>
 <pre>
 <b>输入：</b>mat =<b> </b>[[0,0,0],[0,1,0],[1,1,1]]
 <strong>输出：</strong>[[0,0,0],[0,1,0],[1,2,1]]
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>m == mat.length</code></li>
 <li><code>n == mat[i].length</code></li>
 <li><code>1 &lt;= m, n &lt;= 10<sup>4</sup></code></li>
 <li><code>1 &lt;= m * n &lt;= 10<sup>4</sup></code></li>
 <li><code>mat[i][j] is either 0 or 1.</code></li>
 <li><code>mat</code> 中至少有一个 <code>0&nbsp;</code></li>
 </ul>
 */
public class Zero1Matrix {
    private final static int[][] dict = new int[][]{{1, 0}, {0, -1}, {-1, 0}, {0, 1}};
    private final Queue<int[]> queue = new LinkedList<>();

    private int[][] visited;
    private int n;
    private int m;

    public int[][] updateMatrix(int[][] mat) {
        this.n = mat.length;
        this.m = mat[0].length;
        this.visited = new int[n][m];

        for (int i = 0; i < n; i++) {
            Arrays.fill(visited[i], 100000);
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 0) {
                    visited[i][j] = 0;
                    queue.add(new int[]{i, j});
                }
            }
        }
        bfs();

        return visited;
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
