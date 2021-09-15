package lpf.learn.leetcode.tags.dp;

/** [1262]可被三整除的最大和
 * 给你一个整数数组 nums，请你找出并返回能被三整除的元素最大和。
 *
 * 示例 1：
 * 输入：nums = [3,6,5,1,8]
 * 输出：18
 * 解释：选出数字 3, 6, 1 和 8，它们的和是 18（可被 3 整除的最大和）。
 *
 * 示例 2：
 * 输入：nums = [4]
 * 输出：0
 * 解释：4 不能被 3 整除，所以无法选出数字，返回 0。
 *
 * 示例 3：
 * 输入：nums = [1,2,3,4,4]
 * 输出：12
 * 解释：选出数字 1, 3, 4 以及 4，它们的和是 12（可被 3 整除的最大和）。
 *
 * 提示：
 * 1 <= nums.length <= 4 * 10^4
 * 1 <= nums[i] <= 10^4
 */
public class GreatestSumDivisibleByThree {
    public int maxSumDivThree(int[] nums) {
        int length = nums.length;
        int[] dp = new int[3];

        for (int num : nums) {
            int a = dp[0] + num;
            int b = dp[1] + num;
            int c = dp[2] + num;

            dp[a % 3] = Math.max(dp[a % 3], a);
            dp[b % 3] = Math.max(dp[b % 3], b);
            dp[c % 3] = Math.max(dp[c % 3], c);
        }
        return dp[0];
    }

    public int maxSumDivThree2(int[] nums) {
        int length = nums.length;
        int[][] dp = new int[length + 1][3];
        dp[0][1] = Integer.MIN_VALUE;
        dp[0][2] = Integer.MIN_VALUE;

        for (int i = 0; i < length; i++) {
            int v = nums[i] % 3;

            if (v == 0) {
                dp[i + 1][0] = dp[i][0] + nums[i];
                dp[i + 1][1] = dp[i][1] + nums[i];
                dp[i + 1][2] = dp[i][2] + nums[i];
            } else if (v == 1) {
                dp[i + 1][0] = Math.max(dp[i][0], dp[i][2] + nums[i]);
                dp[i + 1][1] = Math.max(dp[i][1], dp[i][0] + nums[i]);
                dp[i + 1][2] = Math.max(dp[i][2], dp[i][1] + nums[i]);
            } else {
                dp[i + 1][0] = Math.max(dp[i][0], dp[i][1] + nums[i]);
                dp[i + 1][1] = Math.max(dp[i][1], dp[i][2] + nums[i]);
                dp[i + 1][2] = Math.max(dp[i][2], dp[i][0] + nums[i]);
            }
        }

        return dp[length][0];
    }
}
