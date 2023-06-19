package lpf.learn.leetcode.tags.dp;

/** 1262 可被三整除的最大和
 <p>给你一个整数数组&nbsp;<code>nums</code>，请你找出并返回能被三整除的元素最大和。</p>

 <p><strong>示例 1：</strong></p>
 <pre><strong>输入：</strong>nums = [3,6,5,1,8]
 <strong>输出：</strong>18
 <strong>解释：</strong>选出数字 3, 6, 1 和 8，它们的和是 18（可被 3 整除的最大和）。</pre>

 <p><strong>示例 2：</strong></p>
 <pre><strong>输入：</strong>nums = [4]
 <strong>输出：</strong>0
 <strong>解释：</strong>4 不能被 3 整除，所以无法选出数字，返回 0。
 </pre>

 <p><strong>示例 3：</strong></p>
 <pre><strong>输入：</strong>nums = [1,2,3,4,4]
 <strong>输出：</strong>12
 <strong>解释：</strong>选出数字 1, 3, 4 以及 4，它们的和是 12（可被 3 整除的最大和）。
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= nums.length &lt;= 4 * 10^4</code></li>
 <li><code>1 &lt;= nums[i] &lt;= 10^4</code></li>
 </ul>
 */
public class GreatestSumDivisibleByThree {
    public int maxSumDivThree(int[] nums) {
        int[] dp = new int[3];
        for (int num : nums) {
            int a = dp[0] + num, b = dp[1] + num, c = dp[2] + num;

            dp[a % 3] = Math.max(dp[a % 3], a);
            dp[b % 3] = Math.max(dp[b % 3], b);
            dp[c % 3] = Math.max(dp[c % 3], c);
        }
        return dp[0];
    }
}
