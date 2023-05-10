package lpf.learn.leetcode.tags.number;

/** 1015 可被 K 整除的最小整数
 <p>给定正整数 <code>k</code>&nbsp;，你需要找出可以被 <code>k</code>&nbsp;整除的、仅包含数字 <code><strong>1</strong></code> 的最 <strong>小</strong> 正整数 <code>n</code>&nbsp;的长度。</p>
 <p>返回 <code>n</code>&nbsp;的长度。如果不存在这样的 <code>n</code>&nbsp;，就返回-1。</p>
 <p><strong>注意：</strong> <code>n</code>&nbsp;不符合 64 位带符号整数。</p>

 <p><strong>示例 1：</strong></p>
 <pre>
 <strong>输入：</strong>k = 1
 <strong>输出：</strong>1
 <strong>解释：</strong>最小的答案是 n = 1，其长度为 1。</pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <strong>输入：</strong>k = 2
 <strong>输出：</strong>-1
 <strong>解释：</strong>不存在可被 2 整除的正整数 n 。</pre>

 <p><strong>示例 3：</strong></p>
 <pre>
 <strong>输入：</strong>k = 3
 <strong>输出：</strong>3
 <strong>解释：</strong>最小的答案是 n = 111，其长度为 3。</pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= k &lt;= 10<sup>5</sup></code></li>
 </ul>
 */
public class SmallestIntegerDivisibleByK {
    public int smallestRepunitDivByK(int k) {
        if (k % 2 == 0 || k % 5 == 0) return -1;

        int res = 1;
        int v = 1, temp = 1;

        while (true) {
            v %= k;
            if (v == 0) break;

            temp = (temp * 10) % k;
            v += temp;
            res++;
        }

        return res;
    }
}
