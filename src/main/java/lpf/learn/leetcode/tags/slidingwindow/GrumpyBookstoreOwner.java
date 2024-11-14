package lpf.learn.leetcode.tags.slidingwindow;

/** 1052 爱生气的书店老板
 <p>有一个书店老板，他的书店开了&nbsp;<code>n</code>&nbsp;分钟。每分钟都有一些顾客进入这家商店。给定一个长度为 <code>n</code> 的整数数组 <code>customers</code> ，其中 <code>customers[i]</code> 是在第 <code>i</code> 分钟开始时进入商店的顾客数量，所有这些顾客在第 <code>i</code> 分钟结束后离开。</p>
 <p>在某些分钟内，书店老板会生气。 如果书店老板在第 <code>i</code> 分钟生气，那么 <code>grumpy[i] = 1</code>，否则 <code>grumpy[i] = 0</code>。</p>
 <p>当书店老板生气时，那一分钟的顾客就会不满意，若老板不生气则顾客是满意的。</p>
 <p>书店老板知道一个秘密技巧，能抑制自己的情绪，可以让自己连续&nbsp;<code>minutes</code>&nbsp;分钟不生气，但却只能使用一次。</p>
 <p>请你返回 <em>这一天营业下来，最多有多少客户能够感到满意</em> 。<br /> &nbsp;</p>

 <p><strong>示例 1：</strong></p>
 <pre>
 <strong>输入：</strong>customers = [1,0,1,2,1,1,7,5], grumpy = [0,1,0,1,0,1,0,1], minutes = 3
 <strong>输出：</strong>16
 <strong>解释：</strong>书店老板在最后 3 分钟保持冷静。
 感到满意的最大客户数量 = 1 + 1 + 1 + 1 + 7 + 5 = 16.
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <strong>输入：</strong>customers = [1], grumpy = [0], minutes = 1
 <strong>输出：</strong>1</pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>n == customers.length == grumpy.length</code></li>
 <li><code>1 &lt;= minutes &lt;= n &lt;= 2 * 10<sup>4</sup></code></li>
 <li><code>0 &lt;= customers[i] &lt;= 1000</code></li>
 <li><code>grumpy[i] == 0 or 1</code></li>
 </ul>
 */
public class GrumpyBookstoreOwner {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int n = customers.length;

        int[] preSum = new int[n + 1];
        for (int i = 0; i < n; i++) preSum[i + 1] = preSum[i] + (grumpy[i] == 0 ? customers[i] : 0);

        int temp = 0;
        for (int i = 0; i < minutes; i++) temp += customers[i];

        int res = temp + preSum[n] - preSum[minutes];

        for (int i = minutes; i < n; i++) {
            temp += customers[i];
            temp -= customers[i - minutes];

            res = Math.max(res, temp + preSum[n] - preSum[i + 1] + preSum[i - minutes + 1]);
        }
        return res;
    }
}
