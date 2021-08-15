package lpf.learn.leetcode.tags.twopoint;

/**[31]下一个排列
 *  实现获取 下一个排列 的函数，算法需要将给定数字序列重新排列成字典序中下一个更大的排列（即，组合出下一个更大的整数）。
 *  如果不存在下一个更大的排列，则将数字重新排列成最小的排列（即升序排列）。
 *  必须 原地 修改，只允许使用额外常数空间。
 *
 * 示例 1：
 * 输入：nums = [1,2,3]
 * 输出：[1,3,2]
 *
 * 示例 2：
 * 输入：nums = [3,2,1]
 * 输出：[1,2,3]
 *
 * 示例 3：
 * 输入：nums = [1,1,5]
 * 输出：[1,5,1]
 *
 * 示例 4：
 * 输入：nums = [1]
 * 输出：[1]
 *
 *  提示：
 *  1 <= nums.length <= 100
 *  0 <= nums[i] <= 100
 * @author liupf
 * @date 2021-08-15 15:38
 */
public class NextPermutation {
    public void nextPermutation(int[] nums) {
        int length = nums.length;
        int indexBegin = -1;
        int indexEnd = -1;

        out:
        // 从后往前，找到存在 大于当前位置的最小值 的一对
        for (int i = length - 1; i >= 0; i--) {
            for (int j = nums.length - 1; j >= i; j--) {
                if (nums[j] > nums[i]) {
                    indexBegin = i;
                    indexEnd = j;
                    break out;
                }
            }
        }

        if (indexBegin != -1) {
            sweep(nums, indexBegin, indexEnd);
        }
        sort(nums, indexBegin + 1);
    }

    private void sort(int[] nums, int begin) {
        for (int i = begin; i < nums.length; i++) {
            int min = nums[i];
            int minIndex = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (min > nums[j]) {
                    min = nums[j];
                    minIndex = j;
                }
            }
            sweep(nums, minIndex, i);
        }
    }


    private void sweep(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
