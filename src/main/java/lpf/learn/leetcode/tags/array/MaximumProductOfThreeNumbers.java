package lpf.learn.leetcode.tags.array;

import java.util.Arrays;

/**[628]三个数的最大乘积 <p>
 * 给定一个整型数组，在数组中找出由三个数组成的最大乘积，并输出这个乘积。
 * <p>
 * 示例 1:
 * 输入: [1,2,3]
 * 输出: 6
 * <p>
 * 示例 2:
 * 输入: [1,2,3,4]
 * 输出: 24
 * <p>
 * 注意:
 * 给定的整型数组长度范围是[3,104]，数组中所有的元素范围是[-1000, 1000]。
 * 输入的数组中任意三个数的乘积不会超出32位有符号整数的范围。
 */
public class MaximumProductOfThreeNumbers {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int size = nums.length;
        int result = nums[size - 1] * nums[size - 2] * nums[size - 3];
        result = Math.max(result, nums[size - 1] * nums[0] * nums[1]);
        return result;
    }
}
