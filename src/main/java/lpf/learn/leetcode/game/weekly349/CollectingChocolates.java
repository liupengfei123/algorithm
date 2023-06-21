package lpf.learn.leetcode.game.weekly349;

/** [2735] 收集巧克力
 <p>给你一个长度为 <code>n</code> 、下标从 <strong>0</strong> 开始的整数数组 <code>nums</code> ，表示收集不同巧克力的成本。每个巧克力都对应一个不同的类型，最初，位于下标 <code>i</code> 的巧克力就对应第 <code>i</code> 个类型。</p>
 <p>在一步操作中，你可以用成本 <code>x</code> 执行下述行为：</p>
 <ul>
 <li>同时修改所有巧克力的类型，将巧克力的类型&nbsp;<code>i<sup>th</sup></code>&nbsp;修改为类型&nbsp;<code>((i + 1) mod n)<sup>th</sup></code>。</li>
 </ul>
 <p>假设你可以执行任意次操作，请返回收集所有类型巧克力所需的最小成本。</p>

 <p><strong>示例 1：</strong></p>
 <pre>
 <strong>输入：</strong>nums = [20,1,15], x = 5
 <strong>输出：</strong>13
 <strong>解释：</strong>最开始，巧克力的类型分别是 [0,1,2] 。我们可以用成本 1 购买第 1 个类型的巧克力。
 接着，我们用成本 5 执行一次操作，巧克力的类型变更为 [1,2,0] 。我们可以用成本 1 购买第 2 个类型的巧克力。
 然后，我们用成本 5 执行一次操作，巧克力的类型变更为 [2,0,1] 。我们可以用成本 1 购买第 0 个类型的巧克力。
 因此，收集所有类型的巧克力需要的总成本是 (1 + 5 + 1 + 5 + 1) = 13 。可以证明这是一种最优方案。
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <strong>输入：</strong>nums = [1,2,3], x = 4
 <strong>输出：</strong>6
 <strong>解释：</strong>我们将会按最初的成本收集全部三个类型的巧克力，而不需执行任何操作。因此，收集所有类型的巧克力需要的总成本是 1 + 2 + 3 = 6 。
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= nums.length &lt;= 1000</code></li>
 <li><code>1 &lt;= nums[i] &lt;= 10<sup>9</sup></code></li>
 <li><code>1 &lt;= x &lt;= 10<sup>9</sup></code></li>
 </ul>
 */
public class CollectingChocolates {
    public long minCost(int[] nums, int x) {
        int n = nums.length;
        long res = 0;

        long[] dp = new long[n];
        for (int i = 0; i < n; i++) {
            dp[i] = nums[i];
            res += nums[i];
        }


        for (int j = 1; j < n; j++) {
            long sum = 0;
            for (int i = 0; i < n; i++) {
                dp[i] = Math.min(dp[i], nums[(i + j) % n]);
                sum += dp[i];
            }
            res = Math.min(res, sum + 1L * j * x);
        }


        return res;
    }
}
