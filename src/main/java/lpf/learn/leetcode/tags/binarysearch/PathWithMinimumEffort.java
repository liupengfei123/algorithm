package lpf.learn.leetcode.tags.binarysearch;


/** 1631 最小体力消耗路径
 <p>你准备参加一场远足活动。给你一个二维&nbsp;<code>rows x columns</code>&nbsp;的地图&nbsp;<code>heights</code>&nbsp;，其中&nbsp;<code>heights[row][col]</code>&nbsp;表示格子&nbsp;<code>(row, col)</code>&nbsp;的高度。一开始你在最左上角的格子&nbsp;<code>(0, 0)</code>&nbsp;，且你希望去最右下角的格子&nbsp;<code>(rows-1, columns-1)</code>&nbsp;（注意下标从 <strong>0</strong> 开始编号）。你每次可以往 <strong>上</strong>，<strong>下</strong>，<strong>左</strong>，<strong>右</strong>&nbsp;四个方向之一移动，你想要找到耗费 <strong>体力</strong> 最小的一条路径。</p>
 <p>一条路径耗费的 <strong>体力值</strong>&nbsp;是路径上相邻格子之间 <strong>高度差绝对值</strong>&nbsp;的 <strong>最大值</strong>&nbsp;决定的。</p>
 <p>请你返回从左上角走到右下角的最小<strong>&nbsp;体力消耗值</strong>&nbsp;。</p>

 <p><strong>示例 1：</strong></p>
 <p><img alt="" src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/10/25/ex1.png" style="width: 300px; height: 300px;" /></p>
 <pre>
 <b>输入：</b>heights = [[1,2,2],[3,8,2],[5,3,5]]
 <b>输出：</b>2
 <b>解释：</b>路径 [1,3,5,3,5] 连续格子的差值绝对值最大为 2 。
 这条路径比路径 [1,2,2,2,5] 更优，因为另一条路径差值最大值为 3 。
 </pre>

 <p><strong>示例 2：</strong></p>
 <p><img alt="" src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/10/25/ex2.png" style="width: 300px; height: 300px;" /></p>
 <pre>
 <b>输入：</b>heights = [[1,2,3],[3,8,4],[5,3,5]]
 <b>输出：</b>1
 <b>解释：</b>路径 [1,2,3,4,5] 的相邻格子差值绝对值最大为 1 ，比路径 [1,3,5,3,5] 更优。
 </pre>

 <p><strong>示例 3：</strong></p>
 <img alt="" src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/10/25/ex3.png" style="width: 300px; height: 300px;" />
 <pre>
 <b>输入：</b>heights = [[1,2,1,1,1],[1,2,1,2,1],[1,2,1,2,1],[1,2,1,2,1],[1,1,1,2,1]]
 <b>输出：</b>0
 <b>解释：</b>上图所示路径不需要消耗任何体力。
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>rows == heights.length</code></li>
 <li><code>columns == heights[i].length</code></li>
 <li><code>1 &lt;= rows, columns &lt;= 100</code></li>
 <li><code>1 &lt;= heights[i][j] &lt;= 10<sup>6</sup></code></li>
 </ul>
 */
public class PathWithMinimumEffort {
    private static final int[][] dict = new int[][]{{1, 0}, {0, 1}, {-1, 0}, {0, -1}};

    private int n;
    private int m;

    public int minimumEffortPath(int[][] heights) {
        n = heights.length;
        m = heights[0].length;

        int l = 0, r = 1000001;
        while (l < r) {
            int mid = (l + r) / 2;
            if (dfs(heights, new boolean[n][m], 0, 0, mid)) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return r;
    }

    private boolean dfs(int[][] h, boolean[][] flag, int i, int j, int limit) {
        flag[i][j] = true;

        if (i == n - 1 && j == m - 1) return true;

        for (int[] d : dict) {
            int ni = i + d[0], nj = j + d[1];

            if (ni < 0 || ni >= n || nj < 0 || nj >= m || flag[ni][nj]) continue;

            if (Math.abs(h[i][j] - h[ni][nj]) > limit) continue;

            if (dfs(h, flag, ni, nj, limit)) return true;
        }
        return false;
    }
}
