package lpf.learn.leetcode.learn.array;

/**
 * 假设按照升序排序的数组在预先未知的某个点上进行了旋转。
 * ( 例如，数组 [0,1,2,4,5,6,7] 可能变为 [4,5,6,7,0,1,2] )。
 * 请找出其中最小的元素。
 * 你可以假设数组中不存在重复元素。
 *
 * 示例 1:
 * 输入: [3,4,5,1,2]
 * 输出: 1
 *
 * 示例 2:
 * 输入: [4,5,6,7,0,1,2]
 * 输出: 0
 */
public class FindMin {
    public int findMin(int[] nums) {
        if (nums == null || nums.length <= 0) {
            return -1;
        }
        int start = 0, end = nums.length - 1, result = Integer.MIN_VALUE;

        while (start <= end) {
            if (nums[start] <= nums[end]) {
                result = nums[start];
                break;
            } else {
                int middle = start + (end - start + 1) / 2;
                if (nums[end] <= nums[middle]) {
                    start = middle;
                } else {
                    end = middle;
                }
            }
        }
        return result;
    }
}
