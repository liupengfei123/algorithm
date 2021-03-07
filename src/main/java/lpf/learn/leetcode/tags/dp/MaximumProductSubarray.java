package lpf.learn.leetcode.tags.dp;

/** [152]乘积最大子数组
 *  给你一个整数数组 nums ，请你找出数组中乘积最大的连续子数组（该子数组中至少包含一个数字），并返回该子数组所对应的乘积。
 *
 *  示例 1:
 *  输入: [2,3,-2,4]
 *  输出: 6
 *  解释: 子数组 [2,3] 有最大乘积 6。
 *
 *
 *  示例 2:
 *  输入: [-2,0,-1]
 *  输出: 0
 *  解释: 结果不能为 2, 因为 [-2,-1] 不是子数组。
 *
 * @author liupf
 * @date 2021-03-07 15:52
 */
public class MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        int maxV = nums[0], minV = nums[0], result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int mx = maxV, mn = minV;
            maxV = Math.max(nums[i], Math.max(mx * nums[i], mn * nums[i]));
            minV = Math.min(nums[i], Math.min(mx * nums[i], mn * nums[i]));

            result = Math.max(result, maxV);
        }

        return result;
    }

    public int maxProduct2(int[] nums) {
        int length = nums.length;
        int[] maxArrays = new int[length];
        int[] minArrays = new int[length];
        System.arraycopy(nums, 0, maxArrays, 0, length);
        System.arraycopy(nums, 0, minArrays, 0, length);

        for (int i = 1; i < length; i++) {
            maxArrays[i] = Math.max(nums[i], Math.max(maxArrays[i - 1] * nums[i], minArrays[i - 1] * nums[i]));
            minArrays[i] = Math.min(nums[i], Math.min(maxArrays[i - 1] * nums[i], minArrays[i - 1] * nums[i]));
        }

        int result = maxArrays[0];
        for (int i = 1; i < maxArrays.length; i++) {
            result = Math.max(result, maxArrays[i]);
        }
        return result;
    }

}
