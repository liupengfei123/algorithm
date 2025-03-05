package lpf.learn.leetcode.tags.dp;


/** 740 删除并获得点数
 <p>给你一个整数数组&nbsp;<code>nums</code>&nbsp;，你可以对它进行一些操作。</p>
 <p>每次操作中，选择任意一个&nbsp;<code>nums[i]</code>&nbsp;，删除它并获得&nbsp;<code>nums[i]</code>&nbsp;的点数。之后，你必须删除 <strong>所有 </strong>等于&nbsp;<code>nums[i] - 1</code> 和 <code>nums[i] + 1</code>&nbsp;的元素。</p>
 <p>开始你拥有 <code>0</code> 个点数。返回你能通过这些操作获得的最大点数。</p>

 <p><strong>示例 1：</strong></p>
 <pre>
 <strong>输入：</strong>nums = [3,4,2]
 <strong>输出：</strong>6
 <strong>解释：</strong>
 删除 4 获得 4 个点数，因此 3 也被删除。
 之后，删除 2 获得 2 个点数。总共获得 6 个点数。
 </pre>

 <p><strong>示例&nbsp;2：</strong></p>
 <pre>
 <strong>输入：</strong>nums = [2,2,3,3,3,4]
 <strong>输出：</strong>9
 <strong>解释：</strong>
 删除 3 获得 3 个点数，接着要删除两个 2 和 4 。
 之后，再次删除 3 获得 3 个点数，再次删除 3 获得 3 个点数。
 总共获得 9 个点数。
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= nums.length &lt;= 2 * 10<sup>4</sup></code></li>
 <li><code>1 &lt;= nums[i] &lt;= 10<sup>4</sup></code></li>
 </ul>
 */
public class DeleteAndEarn {
    public int deleteAndEarn(int[] nums) {
        int[] cnt = new int[10001];
        for (int num : nums) cnt[num] += num;

        int[] dp = new int[2];
        for (int c : cnt) {
            int v1 = dp[0], v2 = dp[1];
            dp[0] = v2 + c;
            dp[1] = Math.max(v1, v2);
        }
        return Math.max(dp[0], dp[1]);
    }
}
