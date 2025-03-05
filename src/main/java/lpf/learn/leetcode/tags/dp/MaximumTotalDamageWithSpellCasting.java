package lpf.learn.leetcode.tags.dp;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** 3186 施咒的最大总伤害
 <p>一个魔法师有许多不同的咒语。</p>
 <p>给你一个数组&nbsp;<code>power</code>&nbsp;，其中每个元素表示一个咒语的伤害值，可能会有多个咒语有相同的伤害值。</p>
 <p>已知魔法师使用伤害值为&nbsp;<code>power[i]</code>&nbsp;的咒语时，他们就&nbsp;<strong>不能</strong>&nbsp;使用伤害为&nbsp;<code>power[i] - 2</code>&nbsp;，<code>power[i] - 1</code>&nbsp;，<code>power[i] + 1</code>&nbsp;或者&nbsp;<code>power[i] + 2</code>&nbsp;的咒语。</p>
 <p>每个咒语最多只能被使用 <strong>一次</strong>&nbsp;。</p>
 <p>请你返回这个魔法师可以达到的伤害值之和的 <strong>最大值</strong>&nbsp;。</p>

 <p><strong class="example">示例 1：</strong></p>
 <div class="example-block">
 <p><span class="example-io"><b>输入：</b>power = [1,1,3,4]</span></p>
 </div>
 <p><span class="example-io"><b>输出：</b>6</span></p>
 <p><strong>解释：</strong></p>
 <p>可以使用咒语 0，1，3，伤害值分别为 1，1，4，总伤害值为 6 。</p>

 <p><strong class="example">示例 2：</strong></p>
 <div class="example-block">
 <p><span class="example-io"><b>输入：</b>power = [7,1,6,6]</span></p>
 </div>
 <p><span class="example-io"><b>输出：</b>13</span></p>
 <p><strong>解释：</strong></p>
 <p>可以使用咒语 1，2，3，伤害值分别为 1，6，6，总伤害值为 13 。</p>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= power.length &lt;= 10<sup>5</sup></code></li>
 <li><code>1 &lt;= power[i] &lt;= 10<sup>9</sup></code></li>
 </ul>
 */
public class MaximumTotalDamageWithSpellCasting {
    public long maximumTotalDamage(int[] power) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int v : power) map.merge(v, 1, Integer::sum);

        int n = map.size();
        int[] a = new int[n];
        int k = 0;
        for (Integer x : map.keySet()) a[k++] = x;

        Arrays.sort(a);

        long[] dp = new long[n + 1];
        for (int i = 0, j = 0; i < n; i++) {
            int x = a[i];
            while (a[j] < x - 2) j++;

            dp[i + 1] = Math.max(dp[i], dp[j] + (long) x * map.get(x));
        }
        return dp[n];
    }
}
