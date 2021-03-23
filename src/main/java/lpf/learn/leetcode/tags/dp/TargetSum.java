package lpf.learn.leetcode.tags.dp;

/**
 * 494. 目标和
 *
 * 给定一个非负整数数组，a1, a2, ..., an, 和一个目标数，S。现在你有两个符号 + 和 -。对于数组中的任意一个整数，你都可以从 + 或 -中选择一个符号添加在前面。
 * 返回可以使最终数组和为目标数 S 的所有添加符号的方法数。
 *
 * 示例：
 * 输入：nums: [1, 1, 1, 1, 1], S: 3
 * 输出：5
 * 解释：
 * -1+1+1+1+1 = 3
 * +1-1+1+1+1 = 3
 * +1+1-1+1+1 = 3
 * +1+1+1-1+1 = 3
 * +1+1+1+1-1 = 3
 * 一共有5种方法让最终目标和为3。
 *
 * 提示：
 * 数组非空，且长度不会超过 20 。
 * 初始的数组的和不会超过 1000 。
 * 保证返回的最终结果能被 32 位整数存下。
 */
public class TargetSum {
    public int findTargetSumWays(int[] nums, int S) {
        //我们用 dp[i][j] 表示用数组中的前 i 个元素，组成和为 j 的方案数。考虑第 i 个数 nums[i]，它可以被添加 + 或 -，因此状态转移方程如下
        // dp[i][j] = dp[i - 1][j - nums[i]] + dp[i - 1][j + nums[i]]
        int[][] dp = new int[nums.length][2001];

        dp[0][1000 + nums[0]] += 1;
        dp[0][1000 - nums[0]] += 1;

        for (int i = 1; i < nums.length; i++) {
            for (int sum = -1000; sum <= 1000; sum++) {
                if (dp[i - 1][sum + 1000] > 0) {
                    /*
                    如果我们 j 正序遍历，把dp数组初始化为0.
                    则上面公式可以转化为：dp[i][j] == 0(计算前)
                    dp[i][j] = dp[i][j] + dp[i - 1][j - nums[i]]
                    dp[i][j] = dp[i][j] + dp[i - 1][j + nums[i]] ==>
                    遍历j时，我们利用上一次dp[i- 1][x]的计算结果，可以每次更新两个dp[i][x]的结果：
                    dp[i][j + nums[i]] = dp[i][j + nums[i]] + dp[i - 1][j]; 此时dp[i][j + nums[i]] = 0
                    dp[i][j - nums[i]] = dp[i][j - nums[i]] + dp[i - 1][j]; 此时dp[i][j - nums[i]] = 0 =>
                    编程如下形式：
                    dp[i][j + nums[i]] += dp[i - 1][j]
                    dp[i][j - nums[i]] += dp[i - 1][j]
                    这样，每次遍历j时，我们不计算dp[i][j]的值，而是利用dp[i - 1][j]的值，更新两个相关dp节点的值，会加速计算。
                     */
                    dp[i][sum + nums[i] + 1000] += dp[i - 1][sum + 1000];
                    dp[i][sum - nums[i] + 1000] += dp[i - 1][sum + 1000];
                }
            }
        }

        return S > 1000 ? 0 : S < -1000 ? 0 : dp[nums.length - 1][S + 1000];
    }
}
