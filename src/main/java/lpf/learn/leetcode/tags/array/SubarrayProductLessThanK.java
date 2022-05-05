package lpf.learn.leetcode.tags.array;

/**
 * [713]乘积小于 K 的子数组
 * 给你一个整数数组 nums 和一个整数 k ，请你返回子数组内所有元素的乘积严格小于 k 的连续子数组的数目。
 * <p>
 * 示例 1：
 * 输入：nums = [10,5,2,6], k = 100
 * 输出：8
 * 解释：8 个乘积小于 100 的子数组分别为：[10]、[5]、[2],、[6]、[10,5]、[5,2]、[2,6]、[5,2,6]。
 * 需要注意的是 [10,5,2] 并不是乘积小于 100 的子数组。
 * <p>
 * 示例 2：
 * 输入：nums = [1,2,3], k = 0
 * 输出：0
 * <p>
 * 提示:
 * 1 <= nums.length <= 3 * 10^4
 * 1 <= nums[i] <= 1000
 * 0 <= k <= 10^6
 */
public class SubarrayProductLessThanK {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k == 0) {
            return 0;
        }
        int count = 0;
        int result = 1;
        int left = 0, right = 0;

        while (right < nums.length) {
            result *= nums[right];

            while (result >= k && left < right) {
                result /= nums[left++];
            }

            if (result < k) {
                count += (right - left + 1);
            }
            right++;
        }
        return count;
    }

}
