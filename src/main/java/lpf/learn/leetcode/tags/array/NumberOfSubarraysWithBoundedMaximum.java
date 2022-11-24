package lpf.learn.leetcode.tags.array;


import java.util.LinkedList;

/**
 * 795 区间子数组个数
 * <p>给你一个整数数组 <code>nums</code> 和两个整数：<code>left</code> 及 <code>right</code> 。找出 <code>nums</code> 中连续、非空且其中最大元素在范围&nbsp;<code>[left, right]</code> 内的子数组，并返回满足条件的子数组的个数。</p>
 * <p>生成的测试用例保证结果符合 <strong>32-bit</strong> 整数范围。</p>
 *
 * <p><strong>示例 1：</strong></p>
 * <pre>
 * <strong>输入：</strong>nums = [2,1,4,3], left = 2, right = 3
 * <strong>输出：</strong>3
 * <strong>解释：</strong>满足条件的三个子数组：[2], [2, 1], [3]
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 * <pre>
 * <strong>输入：</strong>nums = [2,9,2,5,6], left = 2, right = 8
 * <strong>输出：</strong>7
 * </pre>
 *
 * <p><strong>提示：</strong></p>
 * <ul>
 * <li><code>1 &lt;= nums.length &lt;= 10<sup>5</sup></code></li>
 * <li><code>0 &lt;= nums[i] &lt;= 10<sup>9</sup></code></li>
 * <li><code>0 &lt;= left &lt;= right &lt;= 10<sup>9</sup></code></li>
 * </ul>
 */
public class NumberOfSubarraysWithBoundedMaximum {

    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        int res = 0, last1 = -1, last2 = -1;

        for (int i = 0; i < nums.length; i++) {
            if (left <= nums[i] && nums[i] <= right) {
                last1 = i;
            } else if (nums[i] > right){
                last2 = i;
                last1 = -1;
            }

            if (last1 != -1) res += last1 - last2;
        }
        return res;
    }

    public int numSubarrayBoundedMax2(int[] nums, int left, int right) {
        LinkedList<Integer> list = new LinkedList<>();

        int result = 0;
        int l = 0, r = 0, n = nums.length;

        while (r < n) {
            while (r < n && nums[r] <= right) {
                if (nums[r] >= left) list.add(r);

                r++;
            }
            while (l < r && !list.isEmpty()) {
                int temp = list.getFirst();

                result += r - temp;

                if (l++ == temp) list.removeFirst();
            }

            while (r < n && nums[r] > right) r++;

            l = r;
        }
        return result;
    }
}
