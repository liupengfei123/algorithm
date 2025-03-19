package lpf.learn.leetcode.tags.dp;


/** 3393 统计异或值为给定值的路径数目
 <p>给你一个大小为 <code>m x n</code>&nbsp;的二维整数数组&nbsp;<code>grid</code>&nbsp;和一个整数&nbsp;<code>k</code>&nbsp;。</p>
 <p>你的任务是统计满足以下 <strong>条件</strong> 且从左上格子&nbsp;<code>(0, 0)</code>&nbsp;出发到达右下格子&nbsp;<code>(m - 1, n - 1)</code>&nbsp;的路径数目：</p>
 <ul>
 <li>每一步你可以向右或者向下走，也就是如果格子存在的话，可以从格子&nbsp;<code>(i, j)</code>&nbsp;走到格子&nbsp;<code>(i, j + 1)</code>&nbsp;或者格子&nbsp;<code>(i + 1, j)</code>&nbsp;。</li>
 <li>路径上经过的所有数字&nbsp;<code>XOR</code>&nbsp;异或值必须 <strong>等于</strong>&nbsp;<code>k</code>&nbsp;。</li>
 </ul>
 <p>请你返回满足上述条件的路径总数。</p>
 <p>由于答案可能很大，请你将答案对&nbsp;<code>10<sup>9</sup> + 7</code>&nbsp;<strong>取余</strong> 后返回。</p>

 <p><strong class="example">示例 1：</strong></p>
 <div class="example-block">
 <p><span class="example-io"><b>输入：</b>grid = [[2, 1, 5], [7, 10, 0], [12, 6, 4]], k = 11</span></p>
 </div>
 <p><span class="example-io"><b>输出：</b>3</span></p>
 <p><b>解释：</b></p>
 <p>3 条路径分别为：</p>
 <ul>
 <li><code>(0, 0) → (1, 0) → (2, 0) → (2, 1) → (2, 2)</code></li>
 <li><code>(0, 0) → (1, 0) → (1, 1) → (1, 2) → (2, 2)</code></li>
 <li><code>(0, 0) → (0, 1) → (1, 1) → (2, 1) → (2, 2)</code></li>
 </ul>

 <p><strong class="example">示例 2：</strong></p>
 <div class="example-block">
 <p><span class="example-io"><b>输入：</b>grid = [[1, 3, 3, 3], [0, 3, 3, 2], [3, 0, 1, 1]], k = 2</span></p>
 </div>
 <p><span class="example-io"><b>输出：</b>5</span></p>
 <p><b>解释：</b></p>
 <p>5 条路径分别为：</p>
 <ul>
 <li><code>(0, 0) → (1, 0) → (2, 0) → (2, 1) → (2, 2) → (2, 3)</code></li>
 <li><code>(0, 0) → (1, 0) → (1, 1) → (2, 1) → (2, 2) → (2, 3)</code></li>
 <li><code>(0, 0) → (1, 0) → (1, 1) → (1, 2) → (1, 3) → (2, 3)</code></li>
 <li><code>(0, 0) → (0, 1) → (1, 1) → (1, 2) → (2, 2) → (2, 3)</code></li>
 <li><code>(0, 0) → (0, 1) → (0, 2) → (1, 2) → (2, 2) → (2, 3)</code></li>
 </ul>

 <p><strong class="example">示例 3：</strong></p>
 <div class="example-block">
 <p><span class="example-io"><b>输入：</b>grid = [[1, 1, 1, 2], [3, 0, 3, 2], [3, 0, 2, 2]], k = 10</span></p>
 </div>
 <p><span class="example-io"><b>输出：</b>0</span></p>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= m == grid.length &lt;= 300</code></li>
 <li><code>1 &lt;= n == grid[r].length &lt;= 300</code></li>
 <li><code>0 &lt;= grid[r][c] &lt; 16</code></li>
 <li><code>0 &lt;= k &lt; 16</code></li>
 </ul>
 */
public class CountPathsWithTheGivenXorValue {
    public int countPathsWithXorValue(int[][] grid, int k) {
        int n = grid.length, m = grid[0].length;

        int[][][] dp = new int[n + 1][m + 1][16];
        dp[n - 1][m][k] = 1;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                int val = grid[i][j];
                for (int z = 0; z < 16; z++) {
                    dp[i][j][z] = (dp[i + 1][j][z ^ val] + dp[i][j + 1][z ^ val]) % 1000_000_007;
                }
            }
        }
        return dp[0][0][0];
    }
}
