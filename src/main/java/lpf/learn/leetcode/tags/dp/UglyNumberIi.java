package lpf.learn.leetcode.tags.dp;

/** [264]丑数 II
 * 给你一个整数 n ，请你找出并返回第 n 个 丑数 。
 * 丑数 就是只包含质因数 2、3 和/或 5 的正整数。
 *
 * 示例 1：
 * 输入：n = 10
 * 输出：12
 * 解释：[1, 2, 3, 4, 5, 6, 8, 9, 10, 12] 是由前 10 个丑数组成的序列。
 *
 * 示例 2：
 * 输入：n = 1
 * 输出：1
 * 解释：1 通常被视为丑数。
 *
 * 提示：
 * 1 <= n <= 1690
 */
public class UglyNumberIi {
    public int nthUglyNumber(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 1;

        int[] nums = new int[]{2, 3, 5};
        int[] values = new int[]{2, 3, 5};
        int[] points = new int[]{1, 1, 1};

        for (int i = 2; i <= n; i++) {
            int minValue = Integer.MAX_VALUE;
            for (int value : values) {
                minValue = Math.min(minValue, value);
            }
            dp[i] = minValue;

            for (int j = 0; j < 3; j++) {
                if (values[j] == minValue) {
                    points[j]++;
                    values[j] = nums[j] * dp[points[j]];
                }
            }
        }
        return dp[n];
    }
}
