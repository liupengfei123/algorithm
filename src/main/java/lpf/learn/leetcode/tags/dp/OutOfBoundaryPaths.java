package lpf.learn.leetcode.tags.dp;

import java.util.Arrays;

/**
 * [576]出界的路径数
 * 给定一个 m × n 的网格和一个球。球的起始坐标为 (i,j) ，你可以将球移到相邻的单元格内，或者往上、下、左、右四个方向上移动使球穿过网格边界。但是，
 * 你最多可以移动 N 次。找出可以将球移出边界的路径数量。答案可能非常大，返回 结果 mod 109 + 7 的值。
 * <p>
 * 示例 1：
 * 输入: m = 2, n = 2, N = 2, i = 0, j = 0
 * 输出: 6
 * 解释:
 * <p>
 * 示例 2：
 * 输入: m = 1, n = 3, N = 3, i = 0, j = 1
 * 输出: 12
 * 解释:
 * <p>
 * 说明:
 * 球一旦出界，就不能再被移动回网格内。
 * 网格的长度和高度在 [1,50] 的范围内。
 * N 在 [0,50] 的范围内。
 */
public class OutOfBoundaryPaths {
    private int m;
    private int n;
    private static final int MOD = 10_0000_0007;
    private int[][][] dp;


    public int findPaths(int m, int n, int N, int i, int j) {
        this.m = m;
        this.n = n;
        this.dp = new int[m][n][N + 1];

        for (int z = 0; z < m; z++) {
            for (int x = 0; x < n; x++) {
                Arrays.fill(dp[z][x], -1);
            }
        }

        return help(N, i, j) % MOD;
    }


    private int help(int N, int i, int j) {
        if (i >= m || i < 0 || j >= n || j < 0) {
            return 1;
        }
        if (N == 0) {
            return 0;
        }
        if (dp[i][j][N] != -1) {
            return dp[i][j][N];
        }

        int value = 0;
        value += help(N - 1, i - 1, j);
        value = value % MOD;
        value += help(N - 1, i + 1, j);
        value = value % MOD;
        value += help(N - 1, i, j - 1);
        value = value % MOD;
        value += help(N - 1, i, j + 1);
        value = value % MOD;
        dp[i][j][N] = value;
        return value;
    }
}
