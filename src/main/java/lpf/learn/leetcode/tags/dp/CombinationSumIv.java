package lpf.learn.leetcode.tags.dp;

/** [377]组合总和 Ⅳ
 *
 * 给你一个由 不同 整数组成的数组 nums ，和一个目标整数 target 。请你从 nums 中找出并返回总和为 target 的元素组合的个数。
 * 题目数据保证答案符合 32 位整数范围。
 *
 * 示例 1：
 * 输入：nums = [1,2,3], target = 4
 * 输出：7
 * 解释：
 * 所有可能的组合为：
 * (1, 1, 1, 1)
 * (1, 1, 2)
 * (1, 2, 1)
 * (1, 3)
 * (2, 1, 1)
 * (2, 2)
 * (3, 1)
 * 请注意，顺序不同的序列被视作不同的组合。
 *
 * 示例 2：
 * 输入：nums = [9], target = 3
 * 输出：0
 *
 *  提示：
 *  1 <= nums.length <= 200
 *  1 <= nums[i] <= 1000
 *  nums 中的所有元素 互不相同
 *  1 <= target <= 1000
 *
 * @author liupf
 * @date 2021-04-24 12:57
 */
public class CombinationSumIv {
    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target + 1];
        dp[0] = 1;
        for (int i = 1; i <= target; i++) {
            for (int num : nums) {
                if (num <= i) {
                    dp[i] += dp[i - num];
                }
            }
        }
        return dp[target];
    }





    // 无顺序的答案
    public int combinationSum42(int[] nums, int target) {
        int length = nums.length;
        int[][] dp = new int[length + 1][target + 1];

        for (int i = 0; i < length; i++) {
            dp[i + 1][nums[i]] = 1;
            for (int j = 1; j <= target; j++) {
                dp[i + 1][j] += dp[i][j];
                if (j - nums[i] >= 0) {
                    dp[i + 1][j] += dp[i + 1][j - nums[i]];
                }
            }
        }
        return dp[length][target];
    }
}
