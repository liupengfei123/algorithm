package lpf.learn.leetcode.learn.array;

/**
 * 给定一个含有 n 个正整数的数组和一个正整数 s ，找出该数组中满足其和 ≥ s 的长度最小的连续子数组，并返回其长度。如果不存在符合条件的连续子数组，返回 0。
 *
 * 示例:
 * 输入: s = 7, nums = [2,3,1,2,4,3]
 * 输出: 2
 * 解释: 子数组 [4,3] 是该条件下的长度最小的连续子数组。
 *
 * 进阶:
 * 如果你已经完成了O(n) 时间复杂度的解法, 请尝试 O(n log n) 时间复杂度的解法。
 */
public class MinSubArrayLen {

    public int minSubArrayLen(int s, int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int result = Integer.MAX_VALUE, fast =  0, slow = 0;
        boolean haveValue = false;
        while (slow < nums.length && fast < nums.length) {
            if (rangeSum(nums, slow, fast) >= s) {
                result = Math.min(result, fast - slow);
                slow++;
                haveValue = true;
            } else {
                fast++;
            }
        }
        result = haveValue ? result + 1 : 0;
        return result;
    }
    private int rangeSum(int[] nums, int start, int end) {
        if (start == end) {
            return nums[end];
        }
        int result = 0;
        for (int i = start; i <= end; i++) {
            result += nums[i];
        }
        return result;
    }

}
