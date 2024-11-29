package lpf.learn.leetcode.tags.slidingwindow;


/** 1712 将数组分成三个子数组的方案数
 <p>我们称一个分割整数数组的方案是 <strong>好的</strong>&nbsp;，当它满足：</p>
 <ul>
 <li>数组被分成三个 <strong>非空</strong>&nbsp;连续子数组，从左至右分别命名为&nbsp;<code>left</code>&nbsp;，&nbsp;<code>mid</code>&nbsp;，&nbsp;<code>right</code>&nbsp;。</li>
 <li><code>left</code>&nbsp;中元素和小于等于&nbsp;<code>mid</code>&nbsp;中元素和，<code>mid</code>&nbsp;中元素和小于等于&nbsp;<code>right</code>&nbsp;中元素和。</li>
 </ul>
 <p>给你一个 <strong>非负</strong> 整数数组&nbsp;<code>nums</code>&nbsp;，请你返回&nbsp;<strong>好的</strong> 分割 <code>nums</code>&nbsp;方案数目。由于答案可能会很大，请你将结果对 <code>10<sup>9&nbsp;</sup>+ 7</code>&nbsp;取余后返回。</p>

 <p><strong>示例 1：</strong></p>
 <pre>
 <b>输入：</b>nums = [1,1,1]
 <b>输出：</b>1
 <b>解释：</b>唯一一种好的分割方案是将 nums 分成 [1] [1] [1] 。</pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <b>输入：</b>nums = [1,2,2,2,5,0]
 <b>输出：</b>3
 <b>解释：</b>nums 总共有 3 种好的分割方案：
 [1] [2] [2,2,5,0]
 [1] [2,2] [2,5,0]
 [1,2] [2,2] [5,0]
 </pre>

 <p><strong>示例 3：</strong></p>
 <pre>
 <b>输入：</b>nums = [3,2,1]
 <b>输出：</b>0
 <b>解释：</b>没有好的分割方案。</pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>3 &lt;= nums.length &lt;= 10<sup>5</sup></code></li>
 <li><code>0 &lt;= nums[i] &lt;= 10<sup>4</sup></code></li>
 </ul>
 */
public class WaysToSplitArrayIntoThreeSubarrays {
    public int waysToSplit(int[] nums) {
        int n = nums.length, res = 0, mod = 1000_000_007;

        int[] suff = new int[n];
        suff[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) suff[i] = suff[i + 1] + nums[i];

        int sump = 0, sum1 = 0, sum2 = 0;
        for (int l = 0, r1 = 0, r2 = 0; l < n; l++) {
            sump += nums[l];
            sum1 -= nums[l];
            sum2 -= nums[l];

            while (r1 < n && sump > sum1 + nums[r1]) {
                sum1 += nums[r1++];
            }

            while (r2 < n && sum2 <= suff[r2]) sum2 += nums[r2++];

            if (r1 >= n || r1 >= r2) break;

            int temp = r2 - r1 + 1;
            if (r1 == l) temp--;
            if (r2 == n) temp--;

            res = (res + temp) % mod;
        }
        return res;
    }
}
