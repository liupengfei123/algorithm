package lpf.learn.leetcode.tags.dp;

/** 931 下降路径最小和
 <p>给你一个 <code>n x n</code> 的<strong> 方形 </strong>整数数组&nbsp;<code>matrix</code> ，请你找出并返回通过 <code>matrix</code> 的<strong>下降路径</strong><em> </em>的<strong> </strong><strong>最小和</strong> 。</p>

 <p><strong>下降路径</strong> 可以从第一行中的任何元素开始，并从每一行中选择一个元素。在下一行选择的元素和当前行所选元素最多相隔一列（即位于正下方或者沿对角线向左或者向右的第一个元素）。具体来说，位置 <code>(row, col)</code> 的下一个元素应当是 <code>(row + 1, col - 1)</code>、<code>(row + 1, col)</code> 或者 <code>(row + 1, col + 1)</code> 。</p>

 <p>&nbsp;</p>

 <p><strong>示例 1：</strong></p>

 <p><img alt="" src="https://assets.leetcode.com/uploads/2021/11/03/failing1-grid.jpg" style="height: 500px; width: 499px;" /></p>

 <pre>
 <strong>输入：</strong>matrix = [[2,1,3],[6,5,4],[7,8,9]]
 <strong>输出：</strong>13
 <strong>解释：</strong>如图所示，为和最小的两条下降路径
 </pre>

 <p><strong>示例 2：</strong></p>

 <p><img alt="" src="https://assets.leetcode.com/uploads/2021/11/03/failing2-grid.jpg" style="height: 365px; width: 164px;" /></p>

 <pre>
 <strong>输入：</strong>matrix = [[-19,57],[-40,-5]]
 <strong>输出：</strong>-59
 <strong>解释：</strong>如图所示，为和最小的下降路径
 </pre>

 <p>&nbsp;</p>

 <p><strong>提示：</strong></p>

 <ul>
 <li><code>n == matrix.length == matrix[i].length</code></li>
 <li><code>1 &lt;= n &lt;= 100</code></li>
 <li><code>-100 &lt;= matrix[i][j] &lt;= 100</code></li>
 </ul>
 */
public class MinimumFallingPathSum {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int[][] dp = new int[2][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                dp[(i + 1) & 1][j] = matrix[i][j] + Math.min(dp[i & 1][j],
                        Math.min((j > 0 ? dp[i & 1][j - 1] : 100000), (j < n - 1 ? dp[i & 1][j + 1] : 100000)));
        }
        int res = 100000;
        for (int j = 0; j < n; j++) res = Math.min(dp[n & 1][j], res);
        return res;
    }
}