package lpf.learn.leetcode.learn.array;

/**
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 *
 * 你可以假设数组中无重复元素。
 *
 * 示例 1:
 *
 * 输入: [1,3,5,6], 5
 * 输出: 2
 * 示例 2:
 *
 * 输入: [1,3,5,6], 2
 * 输出: 1
 */
public class SearchInsert {
    
    public int searchInsert(int[] nums, int target) {
        if (nums == null) {
            return -1;
        }
        int result = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > target || nums[i] == target) {
                result = i;
                break;
            }
        }

        if (result == -1) {
            result = nums.length;
        }
        return result;
    }

}
