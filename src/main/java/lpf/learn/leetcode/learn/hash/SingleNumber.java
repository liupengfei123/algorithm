package lpf.learn.leetcode.learn.hash;

import java.util.Arrays;

/** [136]只出现一次的数字
 *  给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 *  说明：
 *  你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 *
 *  示例 1:
 *  输入: [2,2,1]
 *  输出: 1
 *
 *  示例 2:
 *  输入: [4,1,2,1,2]
 *  输出: 4
 * @author liupf
 * @date 2020-08-15 15:26
 */
public class SingleNumber {
    public int singleNumber(int[] nums) {
        //排序之后 只出现了一次的元素 一定处于奇数的索引上
        Arrays.sort(nums);
        int sum = 0;
        int value = 1;
        for (int num : nums) {
            sum += value * num;
            value *= -1;
        }
        return sum;
    }
}
