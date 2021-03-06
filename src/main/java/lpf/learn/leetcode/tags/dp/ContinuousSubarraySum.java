package lpf.learn.leetcode.tags.dp;

import java.util.HashMap;
import java.util.Map;

/** [523]连续的子数组和
 * 给定一个包含 非负数 的数组和一个目标 整数 k ，编写一个函数来判断该数组是否含有连续的子数组，其大小至少为 2，且总和为 k 的倍数，即总和为 n * k ，其中 n 也是一个整数。
 *
 * 示例 1：
 * 输入：[23,2,4,6,7], k = 6
 * 输出：True
 * 解释：[2,4] 是一个大小为 2 的子数组，并且和为 6。
 *
 * 示例 2：
 * 输入：[23,2,6,4,7], k = 6
 * 输出：True
 * 解释：[23,2,6,4,7]是大小为 5 的子数组，并且和为 42。
 *
 * 说明：
 * 数组的长度不会超过 10,000 。
 * 你可以认为所有数字总和在 32 位有符号整数范围内。
 */
public class ContinuousSubarraySum {

    public boolean checkSubarraySum(int[] nums, int k) {
        // key 为 [0,i]之间的和 除以 k 的余数
        Map<Integer, Integer> map = new HashMap<>();
        // 确保开头两个子数组成立 被检索到
        map.put(0, -1);

        int length = nums.length;
        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum += nums[i];
            if (k != 0) {
                sum = sum % k;
            }
            // 余数相同 说明 中间的和 可以被 k 整除
            if (map.containsKey(sum)) {
                // 前缀和 差值的范围 【j + 1, i】
                if (i - map.get(sum) > 1) {
                    return true;
                }
            } else {
                map.put(sum, i);
            }
        }
        return false;
    }


    public boolean checkSubarraySum2(int[] nums, int k) {
        if (nums == null || nums.length <= 1) {
            return false;
        }

        int length = nums.length;
        int[] preSum = new int[length + 1];
        int temp;
        for (int i = 0; i < length; i++) {
            preSum[i + 1] = preSum[i] + nums[i];
            for (int j = 0; j < i; j++) {
                temp = preSum[i + 1] - preSum[j];
                if (temp == k || (k != 0 && temp % k == 0)) {
                    return true;
                }
            }

        }
        return false;
    }


    public boolean checkSubarraySum3(int[] nums, int k) {
        if (nums == null || nums.length <= 1) {
            return false;
        }

        int length = nums.length;
        int[] dp = new int[length];
        int temp;
        for (int i = length - 1; i >= 0; i--) {
            dp[i] = nums[i];
            for (int j = i + 1; j < length; j++) {
                temp = dp[j - 1] + nums[j];
                if (temp == k || (k != 0 && temp % k == 0)) {
                    return true;
                }
                dp[j] = temp;
            }
        }
        return false;
    }
}
