package lpf.learn.leetcode.tags.twopoint;

/**
 * [977]有序数组的平方
 * 给定一个按非递减顺序排序的整数数组 A，返回每个数字的平方组成的新数组，要求也按非递减顺序排序。
 * <p>
 * 示例 1：
 * 输入：[-4,-1,0,3,10]
 * 输出：[0,1,9,16,100]
 * <p>
 * 示例 2：
 * 输入：[-7,-3,2,3,11]
 * 输出：[4,9,9,49,121]
 * <p>
 * 提示：
 * 1 <= A.length <= 10000
 * -10000 <= A[i] <= 10000
 * A 已按非递减顺序排序。
 */
public class SquaresOfASortedArray {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        int l = 0, r = n - 1, i = n - 1;
        while (l <= r) {
            int val1 = nums[l] * nums[l], val2 = nums[r] * nums[r];

            if (val1 < val2) {
                res[i--] = val2;
                r--;
            } else {
                res[i--] = val1;
                l++;
            }
        }
        return res;
    }


}
