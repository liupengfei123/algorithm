package lpf.learn.leetcode.tags.array;

/** [80]删除排序数组中的重复项 II
 * 给定一个增序排列数组 nums ，你需要在 原地 删除重复出现的元素，使得每个元素最多出现两次，返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 *
 * 示例 1：
 * 输入：nums = [1,1,1,2,2,3]
 * 输出：5, nums = [1,1,2,2,3]
 * 解释：函数应返回新长度 length = 5, 并且原数组的前五个元素被修改为 1, 1, 2, 2, 3 。 你不需要考虑数组中超出新长度后面的元素。
 *
 * 示例 2：
 * 输入：nums = [0,0,1,1,1,1,2,3,3]
 * 输出：7, nums = [0,0,1,1,2,3,3]
 * 解释：函数应返回新长度 length = 7, 并且原数组的前五个元素被修改为 0, 0, 1, 1, 2, 3, 3 。 你不需要考虑数组中超出新长度后面
 * 的元素。
 *
 * 提示：
 * 0 <= nums.length <= 3 * 104
 * -104 <= nums[i] <= 104
 * nums 按递增顺序排列
 */
public class RemoveDuplicatesFromSortedArrayIi {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int left = 0, count = 1;
        for (int right = 1; right < nums.length; right++) {
            if (nums[left] != nums[right]) {
                nums[++left] = nums[right];
                count = 1;
            } else if (count < 2) {
                nums[++left] = nums[right];
                count++;
            }
        }
        return left + 1;
    }
}
