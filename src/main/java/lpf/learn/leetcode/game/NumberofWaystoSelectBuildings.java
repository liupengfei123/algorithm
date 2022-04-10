package lpf.learn.leetcode.game;

/** 6035. 选择建筑的方案数
 * 给你一个下标从 0 开始的二进制字符串 s ，它表示一条街沿途的建筑类型，其中：
 * s[i] = '0' 表示第 i 栋建筑是一栋办公楼，
 * s[i] = '1' 表示第 i 栋建筑是一间餐厅。
 * 作为市政厅的官员，你需要随机 选择 3 栋建筑。然而，为了确保多样性，选出来的 3 栋建筑 相邻 的两栋不能是同一类型。
 * 比方说，给你 s = "001101" ，我们不能选择第 1 ，3 和 5 栋建筑，因为得到的子序列是 "011" ，有相邻两栋建筑是同一类型，所以 不合 题意。
 * 请你返回可以选择 3 栋建筑的 有效方案数 。
 *
 * 示例 1：
 * 输入：s = "001101"
 * 输出：6
 * 解释：
 * 以下下标集合是合法的：
 * - [0,2,4] ，从 "001101" 得到 "010"
 * - [0,3,4] ，从 "001101" 得到 "010"
 * - [1,2,4] ，从 "001101" 得到 "010"
 * - [1,3,4] ，从 "001101" 得到 "010"
 * - [2,4,5] ，从 "001101" 得到 "101"
 * - [3,4,5] ，从 "001101" 得到 "101"
 * 没有别的合法选择，所以总共有 6 种方法。
 *
 * 示例 2：
 * 输入：s = "11100"
 * 输出：0
 * 解释：没有任何符合题意的选择。
 *
 * 提示：
 * 3 <= s.length <= 10^5
 * s[i] 要么是 '0' ，要么是 '1' 。
 */
public class NumberofWaystoSelectBuildings {
    public long numberOfWays(String s) {
        int length = s.length();

        long[][] dp = new long[2][length];
        int zeroCount = s.charAt(0) == '0' ? 1 : 0;
        int oneCount = s.charAt(0) == '1' ? 1 : 0;
        dp[0][0] = zeroCount;
        dp[1][0] = oneCount;
        for (int i = 1; i < length; i++) {
            if (s.charAt(i) == '0') {
                dp[0][i] = ++zeroCount;
                dp[1][i] = dp[1][i - 1];
            } else {
                dp[0][i] = dp[0][i - 1];
                dp[1][i] = ++oneCount;
            }
        }
        for (int c = 0; c < 2; c++) {
            long[][] ndp = new long[2][length];
            for (int i = 1; i < length; i++) {
                if (s.charAt(i) == '0') {
                    ndp[0][i] = ndp[0][i - 1] + dp[1][i - 1];
                    ndp[1][i] = ndp[1][i - 1];
                } else {
                    ndp[0][i] = ndp[0][i - 1];
                    ndp[1][i] = ndp[1][i - 1] + dp[0][i - 1];
                }
            }
            dp = ndp;
        }
        return dp[0][length - 1] + dp[1][length - 1];
    }

}
