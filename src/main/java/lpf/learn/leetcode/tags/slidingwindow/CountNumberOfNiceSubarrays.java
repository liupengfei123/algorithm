package lpf.learn.leetcode.tags.slidingwindow;


/** 1248 统计「优美子数组」
 <p>给你一个整数数组&nbsp;<code>nums</code> 和一个整数 <code>k</code>。如果某个连续子数组中恰好有 <code>k</code> 个奇数数字，我们就认为这个子数组是「<strong>优美子数组</strong>」。</p>
 <p>请返回这个数组中 <strong>「优美子数组」</strong> 的数目。</p>

 <p><strong>示例 1：</strong></p>
 <pre>
 <strong>输入：</strong>nums = [1,1,2,1,1], k = 3
 <strong>输出：</strong>2
 <strong>解释：</strong>包含 3 个奇数的子数组是 [1,1,2,1] 和 [1,2,1,1] 。
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <strong>输入：</strong>nums = [2,4,6], k = 1
 <strong>输出：</strong>0
 <strong>解释：</strong>数列中不包含任何奇数，所以不存在优美子数组。
 </pre>

 <p><strong>示例 3：</strong></p>
 <pre>
 <strong>输入：</strong>nums = [2,2,2,1,2,2,1,2,2,2], k = 2
 <strong>输出：</strong>16
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= nums.length &lt;= 50000</code></li>
 <li><code>1 &lt;= nums[i] &lt;= 10^5</code></li>
 <li><code>1 &lt;= k &lt;= nums.length</code></li>
 </ul>
 */
public class CountNumberOfNiceSubarrays {
    public int numberOfSubarrays(int[] nums, int k) {
        return solve(nums, k) - solve(nums, k + 1);
    }

    private int solve(int[] nums, int k) {
        int n = nums.length, res = 0, cnt = 0;

        for (int l = 0, r = 0; r < n; r++) {
            if ((nums[r] & 1) == 1) cnt++;

            while (cnt >= k) {
                if ((nums[l++] & 1) == 1) cnt--;
            }

            res += l;
        }
        return res;
    }
}
