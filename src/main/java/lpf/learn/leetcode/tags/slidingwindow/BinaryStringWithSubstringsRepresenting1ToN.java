package lpf.learn.leetcode.tags.slidingwindow;

/** 1016 子串能表示从 1 到 N 数字的二进制串
 <p>给定一个二进制字符串&nbsp;<code>s</code>&nbsp;和一个正整数&nbsp;<code>n</code>，如果对于&nbsp;<code>[1, n]</code>&nbsp;范围内的每个整数，<em>其二进制表示都是&nbsp;<code>s</code> 的 <strong>子字符串</strong> ，就返回 <code>true</code>，否则返回 <code>false</code>&nbsp;</em>。</p>
 <p><strong>子字符串</strong>&nbsp;是字符串中连续的字符序列。</p>

 <p><strong>示例 1：</strong></p>
 <pre>
 <strong>输入：</strong>s = "0110", n = 3
 <strong>输出：</strong>true
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <strong>输入：</strong>s = "0110", n = 4
 <strong>输出：</strong>false
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= s.length &lt;= 1000</code></li>
 <li><code>s[i]</code>&nbsp;不是&nbsp;<code>'0'</code>&nbsp;就是&nbsp;<code>'1'</code></li>
 <li><code>1 &lt;= n &lt;= 10<sup>9</sup></code></li>
 </ul>
 */
public class BinaryStringWithSubstringsRepresenting1ToN {
    public boolean queryString(String s, int n) {
        int len = s.length();
        if (n > len) return false;

        char[] chars = s.toCharArray();
        boolean[] flags = new boolean[n + 1];
        flags[0] = true;

        int mag = Integer.SIZE - Integer.numberOfLeadingZeros(n);
        for (int i = 1; i <= mag; i++) {
            solve(chars, flags, len, n, i);
        }

        for (boolean flag : flags) {
            if (!flag) return false;
        }
        return true;
    }

    private void solve(char[] chars, boolean[] flags, int len, int n, int k) {
        int val = 0, mark = (1 << k) - 1;
        for (int i = 0; i < k; i++) val = (val << 1) + chars[i] - '0';

        if (val <= n) flags[val] = true;

        for (int i = k; i < len; i++) {
            val = (val << 1) + chars[i] - '0';
            val &= mark;

            if (val <= n) flags[val] = true;
        }
    }
}
