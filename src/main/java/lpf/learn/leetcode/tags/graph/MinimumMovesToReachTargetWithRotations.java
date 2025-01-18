package lpf.learn.leetcode.tags.graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/** 1210 穿过迷宫的最少移动次数
 <p>你还记得那条风靡全球的贪吃蛇吗？</p>
 <p>我们在一个&nbsp;<code>n*n</code>&nbsp;的网格上构建了新的迷宫地图，蛇的长度为 2，也就是说它会占去两个单元格。蛇会从左上角（<code>(0, 0)</code>&nbsp;和&nbsp;<code>(0, 1)</code>）开始移动。我们用 <code>0</code> 表示空单元格，用 1 表示障碍物。蛇需要移动到迷宫的右下角（<code>(n-1, n-2)</code>&nbsp;和&nbsp;<code>(n-1, n-1)</code>）。</p>
 <p>每次移动，蛇可以这样走：</p>
 <ul>
 <li>如果没有障碍，则向右移动一个单元格。并仍然保持身体的水平／竖直状态。</li>
 <li>如果没有障碍，则向下移动一个单元格。并仍然保持身体的水平／竖直状态。</li>
 <li>如果它处于水平状态并且其下面的两个单元都是空的，就顺时针旋转 90 度。蛇从（<code>(r, c)</code>、<code>(r, c+1)</code>）移动到 （<code>(r, c)</code>、<code>(r+1, c)</code>）。<br> <img alt="" src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2019/09/28/image-2.png" style="height: 134px; width: 300px;" /></br></li>
 <li>如果它处于竖直状态并且其右面的两个单元都是空的，就逆时针旋转 90 度。蛇从（<code>(r, c)</code>、<code>(r+1, c)</code>）移动到（<code>(r, c)</code>、<code>(r, c+1)</code>）。<br> <img alt="" src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2019/09/28/image-1.png" style="height: 121px; width: 300px;" /></br></li>
 </ul>
 <p>返回蛇抵达目的地所需的最少移动次数。</p>
 <p>如果无法到达目的地，请返回&nbsp;<code>-1</code>。</p>

 <p><strong>示例 1：</strong></p>
 <p><strong><img alt="" src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2019/09/28/image.png" style="height: 439px; width: 400px;" /></strong></p>
 <pre><strong>输入：</strong>grid = [[0,0,0,0,0,1],
 [1,1,0,0,1,0],
 &nbsp;              [0,0,0,0,1,1],
 &nbsp;              [0,0,1,0,1,0],
 &nbsp;              [0,1,1,0,0,0],
 &nbsp;              [0,1,1,0,0,0]]
 <strong>输出：</strong>11
 <strong>解释：
 </strong>一种可能的解决方案是 [右, 右, 顺时针旋转, 右, 下, 下, 下, 下, 逆时针旋转, 右, 下]。
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre><strong>输入：</strong>grid = [[0,0,1,1,1,1],
 &nbsp;              [0,0,0,0,1,1],
 &nbsp;              [1,1,0,0,0,1],
 &nbsp;              [1,1,1,0,0,1],
 &nbsp;              [1,1,1,0,0,1],
 &nbsp;              [1,1,1,0,0,0]]
 <strong>输出：</strong>9
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>2 &lt;= n &lt;= 100</code></li>
 <li><code>0 &lt;= grid[i][j] &lt;= 1</code></li>
 <li>蛇保证从空单元格开始出发。</li>
 </ul>
 */
public class MinimumMovesToReachTargetWithRotations {

    private static final int[][] dict1 = new int[][]{{0,1}, {1,0}};
    private final Queue<int[]> queue = new LinkedList<>();

    private int[][] grid;
    private int[][] visited;
    private int n;
    private int total;

    public int minimumMoves(int[][] grid) {
        this.grid = grid;
        this.n = grid.length;
        this.total = n * n;
        this.visited = new int[2][total];

        if (grid[n - 1][n - 2] != 0 || grid[n - 1][n - 1] != 0) return -1;

        Arrays.fill(visited[0], 10000000);
        Arrays.fill(visited[1], 10000000);
        visited[0][0] = 0;

        queue.add(new int[]{0, 0, 0, 1, 0, 0});

        bfs();

        return visited[0][total - 1] == 10000000 ? -1 : visited[0][total - 1] ;
    }

    private void bfs() {
        while (!queue.isEmpty()) {
            int[] poll = queue.poll();
            int i1 = poll[0], j1 = poll[1], i2 = poll[2], j2 = poll[3], t = poll[4], x = poll[5]; // [x1,y1] [x2,y2]  type  d

            for (int[] d : dict1) {
                int ni1 = i1 + d[0], nj1 = j1 + d[1], ni2 = i2 + d[0], nj2 = j2 + d[1];

                if (ni1 < 0 || ni1 >= n || nj1 < 0 || nj1 >= n || ni2 < 0 || ni2 >= n || nj2 < 0 || nj2 >= n) continue;
                if (grid[ni1][nj1] != 0 || grid[ni2][nj2] != 0) continue;

                if (visited[t][ni2 * n + nj2] > x + 1) {
                    visited[t][ni2 * n + nj2] = x + 1;
                    queue.add(new int[]{ni1, nj1, ni2, nj2, t, x + 1});
                }
            }
            if (t == 0 && i1 < n - 1 && grid[i1 + 1][j1] == 0 && grid[i2 + 1][j2] == 0) {
                int ni2 = i2 + 1, nj2 = j2 - 1;
                if (visited[1][ni2 * n + nj2] > x + 1) {
                    visited[1][ni2 * n + nj2] = x + 1;
                    queue.add(new int[]{i1, j1, ni2, nj2, 1, x + 1});
                }
            }
            if (t == 1 && j1 < n - 1 && grid[i1][j1 + 1] == 0 && grid[i2][j2 + 1] == 0) {
                int ni2 = i2 - 1, nj2 = j2 + 1;
                if (visited[0][ni2 * n + nj2] > x + 1) {
                    visited[0][ni2 * n + nj2] = x + 1;
                    queue.add(new int[]{i1, j1, ni2, nj2, 0, x + 1});
                }
            }
        }
    }
}
