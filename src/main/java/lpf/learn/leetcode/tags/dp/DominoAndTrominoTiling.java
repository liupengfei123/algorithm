package lpf.learn.leetcode.tags.dp;

/** [790]多米诺和托米诺平铺
 * 有两种形状的瓷砖：一种是 2x1 的多米诺形，另一种是形如 "L" 的托米诺形。两种形状都可以旋转。
 * XX  <- 多米诺
 *
 * XX  <- "L" 托米诺
 * X
 *
 * 给定 N 的值，有多少种方法可以平铺 2 x N 的面板？返回值 mod 10^9 + 7。
 * （平铺指的是每个正方形都必须有瓷砖覆盖。两个平铺不同，当且仅当面板上有四个方向上的相邻单元中的两个，使得恰好有一个平铺有一个瓷砖占据两个正方形。）
 *
 * 示例:
 * 输入: 3
 * 输出: 5
 * 解释:
 * 下面列出了五种不同的方法，不同字母代表不同瓷砖：
 * XYZ    XXZ    XYY    XXY     XYY
 * XYZ    YYZ    XZZ    XYY     XXY
 *
 * 提示：
 * N 的范围是 [1, 1000]
 */
public class DominoAndTrominoTiling {
    public int numTilings(int N) {
        long MOD =  1_000_000_007;
        long[] dp = new long[]{1, 0, 0, 0};
        for (int i = 0; i < N; ++i) {
            long[] ndp = new long[4];
            ndp[0] = (dp[0] + dp[3]) % MOD;
            ndp[1] = (dp[0] + dp[2]) % MOD;
            ndp[2] = (dp[0] + dp[1]) % MOD;
            ndp[3] = (dp[0] + dp[1] + dp[2]) % MOD;
            dp = ndp;
        }
        return (int) dp[0];
    }


    public int numTilings2(int N) {
        long MOD =  1_000_000_007;
        long[] dp = new long[]{1, 0, 0, 1};
        for (int i = 1; i < N; ++i) {
            long[] ndp = new long[4];
            ndp[0] = dp[3];
            ndp[1] = (dp[0] + dp[2]) % MOD;
            ndp[2] = (dp[0] + dp[1]) % MOD;
            ndp[3] = (dp[0] + dp[1] + dp[2] + dp[3]) % MOD;
            dp = ndp;
        }
        return (int) dp[3];
    }
}
