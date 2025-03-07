package lpf.learn.leetcode.tags.dp;


import java.util.Arrays;

/** 64 最小路径和
 <p>给定一个包含非负整数的 <code><em>m</em>&nbsp;x&nbsp;<em>n</em></code>&nbsp;网格&nbsp;<code>grid</code> ，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。</p>
 <p><strong>说明：</strong>每次只能向下或者向右移动一步。</p>

 <p><strong class="example">示例 1：</strong></p>
 <img alt="" src="https://assets.leetcode.com/uploads/2020/11/05/minpath.jpg" style="width: 242px; height: 242px;" />
 <pre>
 <strong>输入：</strong>grid = [[1,3,1],[1,5,1],[4,2,1]]
 <strong>输出：</strong>7
 <strong>解释：</strong>因为路径 1→3→1→1→1 的总和最小。
 </pre>

 <p><strong class="example">示例 2：</strong></p>
 <pre>
 <strong>输入：</strong>grid = [[1,2,3],[4,5,6]]
 <strong>输出：</strong>12
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>m == grid.length</code></li>
 <li><code>n == grid[i].length</code></li>
 <li><code>1 &lt;= m, n &lt;= 200</code></li>
 <li><code>0 &lt;= grid[i][j] &lt;= 200</code></li>
 </ul>
 */
public class MinimumPathSum {

    public int minPathSum(int[][] grid) {
        int n = grid.length, m = grid[0].length;

        int[] dp = new int[m + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[m - 1] = 0;

        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                dp[j] = grid[i][j] + Math.min(dp[j + 1], dp[j]);
            }
        }
        return dp[0];
    }
}
