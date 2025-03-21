package lpf.learn.leetcode.tags.dp;


import java.util.Arrays;

/** 1289 下降路径最小和  II
 <p>给你一个&nbsp;<code>n x n</code> 整数矩阵&nbsp;<code>grid</code>&nbsp;，请你返回 <strong>非零偏移下降路径</strong> 数字和的最小值。</p>
 <p><strong>非零偏移下降路径</strong> 定义为：从&nbsp;<code>grid</code> 数组中的每一行选择一个数字，且按顺序选出来的数字中，相邻数字不在原数组的同一列。</p>

 <p><strong class="example">示例 1：</strong></p>
 <p><img alt="" src="https://assets.leetcode.com/uploads/2021/08/10/falling-grid.jpg" style="width: 244px; height: 245px;" /></p>
 <pre>
 <strong>输入：</strong>grid = [[1,2,3],[4,5,6],[7,8,9]]
 <strong>输出：</strong>13
 <strong>解释：</strong>
 所有非零偏移下降路径包括：
 [1,5,9], [1,5,7], [1,6,7], [1,6,8],
 [2,4,8], [2,4,9], [2,6,7], [2,6,8],
 [3,4,8], [3,4,9], [3,5,7], [3,5,9]
 下降路径中数字和最小的是&nbsp;[1,5,7] ，所以答案是&nbsp;13 。
 </pre>

 <p><strong class="example">示例 2：</strong></p>
 <pre>
 <strong>输入：</strong>grid = [[7]]
 <strong>输出：</strong>7
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>n == grid.length == grid[i].length</code></li>
 <li><code>1 &lt;= n &lt;= 200</code></li>
 <li><code>-99 &lt;= grid[i][j] &lt;= 99</code></li>
 </ul>
 */
public class MinimumFallingPathSumIi {

    public int minFallingPathSum(int[][] grid) {
        int n = grid.length;
        int[] dp = new int[3], ndp;

        for (int[] ints : grid) {
            ndp = new int[3];
            Arrays.fill(ndp, 50000000);
            for (int j = 0; j < n; j++) {
                int val = ints[j] + (j != dp[1] ? dp[0] : dp[2]);
                if (val <= ndp[0]) {
                    ndp[2] = ndp[0];
                    ndp[0] = val;
                    ndp[1] = j;
                } else if (val < ndp[2]) {
                    ndp[2] = val;
                }
            }
            dp = ndp;
        }
        return dp[0];
    }
}
