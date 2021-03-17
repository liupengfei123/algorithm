package lpf.learn.leetcode.tags.dp;

/** [416]分割等和子集
 * 给定一个只包含正整数的非空数组。是否可以将这个数组分割成两个子集，使得两个子集的元素和相等。
 *
 * 示例 1:
 * 输入: [1, 5, 11, 5]
 * 输出: true
 * 解释: 数组可以分割成 [1, 5, 5] 和 [11].
 *
 * 示例 2:
 * 输入: [1, 2, 3, 5]
 * 输出: false
 * 解释: 数组不能分割成两个元素和相等的子集.
 *
 * 注意:
 * 每个数组中的元素不会超过 100
 * 数组的大小不会超过 200
 */
public class PartitionEqualSubsetSum {

    public boolean canPartition(int[] nums) {
        if (nums.length < 2) {
            return false;
        }

        int sum = 0;
        int max = 0;
        for (int num : nums) {
            sum += num;
            max = Math.max(max, num);
        }
        // 如果和为 奇数 不能等分
        if ((sum & 1) == 1) {
            return false;
        }

        int target = sum / 2;
        if (target < max) {
            return false;
        }

        boolean[] dp = new boolean[target + 1];
        dp[0] = true;
        for (int num : nums) {
            for (int j = target; j >= num; --j) {
                dp[j] |= dp[j - num];
            }
        }
        return dp[target];
    }




    // 回溯
    public boolean canPartition2(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        // 如果和为 奇数 不能等分
        if ((sum & 1) == 1) {
            return false;
        }
        return findTargetSum(nums,sum / 2);
    }

    private boolean findTargetSum(int[] nums, int target) {
        if (target == 0) {
            return true;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                nums[i] = -nums[i];
                if (findTargetSum(nums, target + nums[i])) {
                    return true;
                }
                nums[i] = -nums[i];
            }
        }
        return false;
    }
}
