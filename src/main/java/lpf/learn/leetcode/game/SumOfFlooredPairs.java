package lpf.learn.leetcode.game;

import java.util.stream.IntStream;

/** 5212. 向下取整数对和
 * 给你一个整数数组 nums ，请你返回所有下标对 0 <= i, j < nums.length 的 floor(nums[i] / nums[j]) 结果之和。由于答案可能会很大，请你返回答案对109 + 7 取余 的结果。
 * 函数 floor() 返回输入数字的整数部分。
 *
 * 示例 1：
 * 输入：nums = [2,5,9]
 * 输出：10
 * 解释：
 * floor(2 / 5) = floor(2 / 9) = floor(5 / 9) = 0
 * floor(2 / 2) = floor(5 / 5) = floor(9 / 9) = 1
 * floor(5 / 2) = 2
 * floor(9 / 2) = 4
 * floor(9 / 5) = 1
 * 我们计算每一个数对商向下取整的结果并求和得到 10 。
 *
 * 示例 2：
 * 输入：nums = [7,7,7,7,7,7,7]
 * 输出：49
 *
 * 提示：
 * 1 <= nums.length <= 105
 * 1 <= nums[i] <= 105
 * @author liupf
 * @date 2021-05-15 23:26
 */
public class SumOfFlooredPairs {
    public int sumOfFlooredPairs(int[] nums) {
        int mod = 1000_000_007;
        int max = IntStream.of(nums).max().getAsInt();
        int length = max + 1;
        int[] counts = new int[length];
        for (int num : nums) {
            counts[num] ++;
        }
        int[] preSum = new int[length];
        for (int i = 1; i < length; i++) {
            preSum[i] = preSum[i - 1] + counts[i];
        }

        int result = 0;
        for (int i = 1; i < length; i++) {
            if (counts[i] == 0) {
                continue;
            }
            int j = i, value;
            for (; j < length; j += i) {
                value = ((preSum[Math.min(j + i, length) - 1] - preSum[j - 1]) * (j / i)  * counts[i]) % mod;
                result = (result + value) % mod;
            }
        }
        return result;
    }
}
