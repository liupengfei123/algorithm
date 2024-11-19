package lpf.learn.leetcode.tags.slidingwindow;


/** 1695 删除子数组的最大得分
 <p>给你一个正整数数组 <code>nums</code> ，请你从中删除一个含有 <strong>若干不同元素</strong> 的子数组<strong>。</strong>删除子数组的 <strong>得分</strong> 就是子数组各元素之 <strong>和</strong> 。</p>
 <p>返回 <strong>只删除一个</strong> 子数组可获得的 <strong>最大得分</strong><em> 。</em></p>
 <p>如果数组 <code>b</code> 是数组 <code>a</code> 的一个连续子序列，即如果它等于 <code>a[l],a[l+1],...,a[r]</code> ，那么它就是&nbsp;<code>a</code> 的一个子数组。</p>

 <p><strong>示例 1：</strong></p>
 <pre>
 <strong>输入：</strong>nums = [4,2,4,5,6]
 <strong>输出：</strong>17
 <strong>解释：</strong>最优子数组是 [2,4,5,6]
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <strong>输入：</strong>nums = [5,2,1,2,5,2,1,2,5]
 <strong>输出：</strong>8
 <strong>解释：</strong>最优子数组是 [5,2,1] 或 [1,2,5]
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= nums.length &lt;= 10<sup>5</sup></code></li>
 <li><code>1 &lt;= nums[i] &lt;= 10<sup>4</sup></code></li>
 </ul>
 */
public class MaximumErasureValue {
    public int maximumUniqueSubarray(int[] nums) {
        int[] cnt = new int[10001];
        int n = nums.length, res = 0, sum = 0;

        for (int l = 0, r = 0; r < n; r++) {
            cnt[nums[r]]++;
            sum += nums[r];

            while (cnt[nums[r]] > 1) {
                cnt[nums[l]]--;
                sum -= nums[l++];
            }

            res = Math.max(res, sum);
        }
        return res;
    }
}
