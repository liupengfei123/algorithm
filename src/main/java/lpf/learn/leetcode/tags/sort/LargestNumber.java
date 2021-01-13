package lpf.learn.leetcode.tags.sort;

/** [179]最大数
 * 给定一组非负整数 nums，重新排列它们每个数字的顺序（每个数字不可拆分）使之组成一个最大的整数。
 * 注意：输出结果可能非常大，所以你需要返回一个字符串而不是整数。
 *
 * 示例 1：
 * 输入：nums = [10,2]
 * 输出："210"
 *
 * 示例 2：
 * 输入：nums = [3,30,34,5,9]
 * 输出："9534330"
 *
 * 示例 3：
 * 输入：nums = [1]
 * 输出："1"
 *
 * 示例 4：
 * 输入：nums = [10]
 * 输出："10"
 *
 * 提示：
 * 1 <= nums.length <= 100
 * 0 <= nums[i] <= 109
 */
public class LargestNumber {

    public String largestNumber(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            for (int j = i; j > 0 && less(nums[j], nums[j - 1]); j--) {
                int value = nums[j];
                nums[j] = nums[j - 1];
                nums[j - 1] = value;
            }
        }
        if (nums[0] == 0) {
            return "0";
        }

        StringBuilder sb = new StringBuilder();
        for (int num : nums) {
            sb.append(num);
        }
        return sb.toString();
    }

    private boolean less(long value1, long value2) {
        long temp1 = value1 * help(value2) + value2;
        long temp2 = value2 * help(value1) + value1;
        return temp1 > temp2;
    }

    private int help(long source) {
        int result = 10;
        source /= 10;
        while (source > 0) {
            result *= 10;
            source /= 10;
        }
        return result;
    }


}
