package lpf.learn.leetcode.tags.binarysearch;

/** 2529 正整数和负整数的最大计数
 <p>给你一个按 <strong>非递减顺序</strong> 排列的数组 <code>nums</code> ，返回正整数数目和负整数数目中的最大值。</p>
 <ul>
 <li>换句话讲，如果 <code>nums</code> 中正整数的数目是 <code>pos</code> ，而负整数的数目是 <code>neg</code> ，返回 <code>pos</code> 和 <code>neg</code>二者中的最大值。</li>
 </ul>

 <p><strong>注意：</strong><code>0</code> 既不是正整数也不是负整数。</p>

 <p><strong>示例 1：</strong></p>
 <pre>
 <strong>输入：</strong>nums = [-2,-1,-1,1,2,3]
 <strong>输出：</strong>3
 <strong>解释：</strong>共有 3 个正整数和 3 个负整数。计数得到的最大值是 3 。
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <strong>输入：</strong>nums = [-3,-2,-1,0,0,1,2]
 <strong>输出：</strong>3
 <strong>解释：</strong>共有 2 个正整数和 3 个负整数。计数得到的最大值是 3 。
 </pre>

 <p><strong>示例 3：</strong></p>
 <pre>
 <strong>输入：</strong>nums = [5,20,66,1314]
 <strong>输出：</strong>4
 <strong>解释：</strong>共有 4 个正整数和 0 个负整数。计数得到的最大值是 4 。
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= nums.length &lt;= 2000</code></li>
 <li><code>-2000 &lt;= nums[i] &lt;= 2000</code></li>
 <li><code>nums</code> 按 <strong>非递减顺序</strong> 排列。</li>
 </ul>

 <p><strong>进阶：</strong>你可以设计并实现时间复杂度为 <code>O(log(n))</code> 的算法解决此问题吗？</p>
 */
public class MaximumCountOfPositiveIntegerAndNegativeInteger {
    public int maximumCount(int[] nums) {
        int v1 = solve(nums, -1);
        int v2 = nums.length - solve(nums, 0);
        return Math.max(v1, v2);
    }

    private int solve(int[] nums, int target) {
        int l = 0, r = nums.length;
        while (l < r) {
            int mid = (l + r) / 2;
            if (nums[mid] <= target)
                l = mid + 1;
            else
                r = mid;
        }
        return r;
    }
}
