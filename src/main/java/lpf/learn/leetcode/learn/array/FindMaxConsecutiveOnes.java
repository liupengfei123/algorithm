package lpf.learn.leetcode.learn.array;

/**
 * 给定一个二进制数组， 计算其中最大连续1的个数。
 *
 * 示例 1:
 * 输入: [1,1,0,1,1,1]
 * 输出: 3
 * 解释: 开头的两位和最后的三位都是连续1，所以最大连续1的个数是 3.
 *
 * 注意：
 * 输入的数组只包含 0 和1。
 * 输入数组的长度是正整数，且不超过 10,000。
 */
public class FindMaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int slow = 0, beforeValue = 0;
        int result = 0;
        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] == 1) {
                if (beforeValue != 1) {
                    slow = fast;
                }
                result = Math.max(result, fast - slow + 1);
            }
            beforeValue = nums[fast];
        }
        return result;
    }
}
