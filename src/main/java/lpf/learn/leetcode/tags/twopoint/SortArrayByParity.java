package lpf.learn.leetcode.tags.twopoint;


/** [905]按奇偶排序数组
 <p>给你一个整数数组 <code>nums</code>，将 <code>nums</code> 中的的所有偶数元素移动到数组的前面，后跟所有奇数元素。</p>
 <p>返回满足此条件的 <strong>任一数组</strong> 作为答案。</p>

 <p><strong>示例 1：</strong></p>
 <pre>
 <strong>输入：</strong>nums = [3,1,2,4]
 <strong>输出：</strong>[2,4,3,1]
 <strong>解释：</strong>[4,2,3,1]、[2,4,1,3] 和 [4,2,1,3] 也会被视作正确答案。
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <strong>输入：</strong>nums = [0]
 <strong>输出：</strong>[0]
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= nums.length &lt;= 5000</code></li>
 <li><code>0 &lt;= nums[i] &lt;= 5000</code></li>
 </ul>
 */
public class SortArrayByParity {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length, l = 0, r = n - 1;

        while (l < r) {
            while (l < r && (nums[l] & 1) == 0) l++;
            while (l < r && (nums[r] & 1) != 0) r--;

            if (l >= r) break;

            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
        }
        return nums;
    }
}
