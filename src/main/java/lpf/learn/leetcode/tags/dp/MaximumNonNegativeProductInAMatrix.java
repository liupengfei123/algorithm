package lpf.learn.leetcode.tags.dp;


/**
 * 1594 矩阵的最大非负积
 * <p>给你一个大小为 <code>m x n</code> 的矩阵 <code>grid</code> 。最初，你位于左上角 <code>(0, 0)</code> ，每一步，你可以在矩阵中 <strong>向右</strong> 或 <strong>向下</strong> 移动。</p>
 * <p>在从左上角 <code>(0, 0)</code> 开始到右下角 <code>(m - 1, n - 1)</code> 结束的所有路径中，找出具有 <strong>最大非负积</strong> 的路径。路径的积是沿路径访问的单元格中所有整数的乘积。</p>
 * <p>返回 <strong>最大非负积 </strong>对<strong><em> </em><code>10<sup>9</sup>&nbsp;+ 7</code></strong> <strong>取余</strong> 的结果。如果最大积为 <strong>负数</strong> ，则返回<em> </em><code>-1</code> 。</p>
 * <p><strong>注意，</strong>取余是在得到最大积之后执行的。</p>
 *
 * <p><strong>示例 1：</strong></p>
 * <img alt="" src="https://assets.leetcode.com/uploads/2021/12/23/product1.jpg" style="width: 244px; height: 245px;" />
 * <pre>
 * <strong>输入：</strong>grid = [[-1,-2,-3],[-2,-3,-3],[-3,-3,-2]]
 * <strong>输出：</strong>-1
 * <strong>解释：</strong>从 (0, 0) 到 (2, 2) 的路径中无法得到非负积，所以返回 -1 。</pre>
 *
 * <p><strong>示例 2：</strong></p>
 * <img alt="" src="https://assets.leetcode.com/uploads/2021/12/23/product2.jpg" style="width: 244px; height: 245px;" />
 * <pre>
 * <strong>输入：</strong>grid = [[1,-2,1],[1,-2,1],[3,-4,1]]
 * <strong>输出：</strong>8
 * <strong>解释：</strong>最大非负积对应的路径如图所示 (1 * 1 * -2 * -4 * 1 = 8)
 * </pre>
 *
 * <p><strong>示例 3：</strong></p>
 * <img alt="" src="https://assets.leetcode.com/uploads/2021/12/23/product3.jpg" style="width: 164px; height: 165px;" />
 * <pre>
 * <strong>输入：</strong>grid = [[1,3],[0,-4]]
 * <strong>输出：</strong>0
 * <strong>解释：</strong>最大非负积对应的路径如图所示 (1 * 0 * -4 = 0)
 * </pre>
 *
 * <p><strong>提示：</strong></p>
 * <ul>
 * <li><code>m == grid.length</code></li>
 * <li><code>n == grid[i].length</code></li>
 * <li><code>1 &lt;= m, n &lt;= 15</code></li>
 * <li><code>-4 &lt;= grid[i][j] &lt;= 4</code></li>
 * </ul>
 */
public class MaximumNonNegativeProductInAMatrix {
    public int maxProductPath(int[][] grid) {
        int n = grid.length, m = grid[0].length;

        long[][] dp = new long[m][2], ndp;// 0:min, 1:max
        dp[0][0] = dp[0][1] = grid[0][0];
        for (int j = 1; j < m; j++) {
            dp[j][0] = dp[j - 1][0] * grid[0][j];
            dp[j][1] = dp[j - 1][1] * grid[0][j];
        }

        for (int i = 1; i < n; i++) {
            ndp = new long[m][2];
            ndp[0][0] = dp[0][0] * grid[i][0];
            ndp[0][1] = dp[0][1] * grid[i][0];
            for (int j = 1; j < m; j++) {
                int val = grid[i][j];
                if (val >= 0) {
                    ndp[j][0] = Math.min(ndp[j - 1][0], dp[j][0]) * val;
                    ndp[j][1] = Math.max(ndp[j - 1][1], dp[j][1]) * val;
                } else {
                    ndp[j][1] = Math.min(ndp[j - 1][0], dp[j][0]) * val;
                    ndp[j][0] = Math.max(ndp[j - 1][1], dp[j][1]) * val;
                }
            }
            dp = ndp;
        }
        return dp[m - 1][1] < 0 ? -1 : (int) (dp[m - 1][1] % 1000_000_007);
    }
}
