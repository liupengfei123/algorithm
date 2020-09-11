package lpf.learn.leetcode.tags.array;

/** [581]最短无序连续子数组
 * 给定一个整数数组，你需要寻找一个连续的子数组，如果对这个子数组进行升序排序，那么整个数组都会变为升序排序。
 * 你找到的子数组应是最短的，请输出它的长度。
 *
 * 示例 1:
 * 输入: [2, 6, 4, 8, 10, 9, 15]
 * 输出: 5
 * 解释: 你只需要对 [6, 4, 8, 10, 9] 进行升序排序，那么整个表都会变为升序排序。
 *
 * 说明 :
 * 输入的数组长度范围在 [1, 10,000]。
 * 输入的数组可能包含重复元素 ，所以升序的意思是<=。
 */
public class ShortestUnsortedContinuousSubarray {
    public int findUnsortedSubarray(int[] nums) {
        int left = nums.length;
        int pre = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < pre) {
                for (int j = i - 1; j >= 0; j--) {
                    if (nums[j] > nums[i]) {
                        left = Math.min(j, left);
                    }
                }
            }
            pre = nums[i];
        }

        int right = 0;
        pre = nums[nums.length - 1];
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] > pre) {
                for (int j = i; j < nums.length; j++) {
                    if (nums[j] < nums[i]) {
                        right = Math.max(j, right);
                    }
                }
            }
            pre = nums[i];
        }
        return right > left ? right - left + 1 : 0;
    }
}
