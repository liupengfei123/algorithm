package lpf.learn.leetcode.game;

import java.util.Arrays;
import java.util.Stack;

/** 5752. 子数组最小乘积的最大值
 *
 * 一个数组的 最小乘积 定义为这个数组中 最小值 乘以 数组的 和 。
 * 比方说，数组 [3,2,5] （最小值是 2）的最小乘积为 2 * (3+2+5) = 2 * 10 = 20 。
 * 给你一个正整数数组 nums ，请你返回 nums 任意 非空子数组 的最小乘积 的 最大值 。由于答案可能很大，请你返回答案对  10^9 + 7 取余 的结果。
 * 请注意，最小乘积的最大值考虑的是取余操作 之前 的结果。题目保证最小乘积的最大值在 不取余 的情况下可以用 64 位有符号整数 保存。
 * 子数组 定义为一个数组的 连续 部分。
 *
 * 示例 1：
 * 输入：nums = [1,2,3,2]
 * 输出：14
 * 解释：最小乘积的最大值由子数组 [2,3,2] （最小值是 2）得到。
 * 2 * (2+3+2) = 2 * 7 = 14 。
 *
 * 示例 2：
 * 输入：nums = [2,3,3,1,2]
 * 输出：18
 * 解释：最小乘积的最大值由子数组 [3,3] （最小值是 3）得到。
 * 3 * (3+3) = 3 * 6 = 18 。
 *
 * 示例 3：
 * 输入：nums = [3,1,5,6,4,2]
 * 输出：60
 * 解释：最小乘积的最大值由子数组 [5,6,4] （最小值是 4）得到。
 * 4 * (5+6+4) = 4 * 15 = 60 。
 *
 * 提示：
 * 1 <= nums.length <= 10^5
 * 1 <= nums[i] <= 10^7
 * @author liupf
 * @date 2021-05-09 10:58
 */
public class MaximumSubarrayMinProduct {
    public int maxSumMinProduct(int[] nums) {
        int length = nums.length;
        long[] preSum = new long[length + 1];

        for (int i = 0; i < length; i++) {
            preSum[i + 1] += preSum[i] + nums[i];
        }

        int[] right = new int[length];
        int[] left = new int[length];
        Arrays.fill(right, length - 1);

        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < length; i++) {
            while (!st.isEmpty() && nums[st.peek()] > nums[i]) {
                right[st.pop()] = i - 1;
            }
            st.push(i);
        }

        st = new Stack<>();
        for (int i = length - 1; i >= 0; i--) {
            while (!st.isEmpty() && nums[st.peek()] > nums[i]) {
                left[st.pop()] = i + 1;
            }
            st.push(i);
        }

        long result = 0;
        for (int i = 0; i < length; i++) {
            result = Math.max(result, nums[i] * (preSum[right[i] + 1] - preSum[left[i]]));
        }
        return (int) (result % 1000_000_007);
    }
}
