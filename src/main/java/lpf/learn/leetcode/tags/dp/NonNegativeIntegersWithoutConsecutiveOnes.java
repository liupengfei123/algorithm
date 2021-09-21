package lpf.learn.leetcode.tags.dp;

/** 600. 不含连续1的非负整数
 * 给定一个正整数 n，找出小于或等于 n 的非负整数中，其二进制表示不包含 连续的1 的个数。
 *
 * 示例 1:
 * 输入: 5
 * 输出: 5
 * 解释:
 * 下面是带有相应二进制表示的非负整数<= 5：
 * 0 : 0
 * 1 : 1
 * 2 : 10
 * 3 : 11
 * 4 : 100
 * 5 : 101
 * 其中，只有整数3违反规则（有两个连续的1），其他5个满足规则。
 *
 * 说明: 1 <= n <= 10^9
 * @author liupf
 * @date 2021-09-21 15:38
 */
public class NonNegativeIntegersWithoutConsecutiveOnes {

    public int findIntegers(int n) {
        int[][] dp = new int[32][2];
        dp[0][0] = dp[0][1] = 1;

        for (int i = 1; i < 32; i++) {
            dp[i][0] = dp[i - 1][0] + dp[i - 1][1];
            dp[i][1] = dp[i - 1][0];
        }

        int pre = 0, result = 0;
        for (int i = 29; i >= 0; --i) {
            int val = 1 << i;
            if ((n & val) != 0) {
                result += dp[i][0];
                if (pre == 1) {
                    break;
                }
                pre = 1;
            } else {
                pre = 0;
            }

            if (i == 0) {
                ++result;
            }
        }
        return result;
    }
}
