package lpf.learn.leetcode.tags.bitoperation;


/** 1009 十进制整数的反码
 <p>每个非负整数&nbsp;<code>N</code>&nbsp;都有其二进制表示。例如，&nbsp;<code>5</code>&nbsp;可以被表示为二进制&nbsp;<code>"101"</code>，<code>11</code> 可以用二进制&nbsp;<code>"1011"</code>&nbsp;表示，依此类推。注意，除&nbsp;<code>N = 0</code>&nbsp;外，任何二进制表示中都不含前导零。</p>
 <p>二进制的反码表示是将每个&nbsp;<code>1</code>&nbsp;改为&nbsp;<code>0</code>&nbsp;且每个&nbsp;<code>0</code>&nbsp;变为&nbsp;<code>1</code>。例如，二进制数&nbsp;<code>"101"</code>&nbsp;的二进制反码为&nbsp;<code>"010"</code>。</p>
 <p>给你一个十进制数&nbsp;<code>N</code>，请你返回其二进制表示的反码所对应的十进制整数。</p>

 <p><strong>示例 1：</strong></p>
 <pre><strong>输入：</strong>5
 <strong>输出：</strong>2
 <strong>解释：</strong>5 的二进制表示为 "101"，其二进制反码为 "010"，也就是十进制中的 2 。
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre><strong>输入：</strong>7
 <strong>输出：</strong>0
 <strong>解释：</strong>7 的二进制表示为 "111"，其二进制反码为 "000"，也就是十进制中的 0 。
 </pre>

 <p><strong>示例 3：</strong></p>
 <pre><strong>输入：</strong>10
 <strong>输出：</strong>5
 <strong>解释：</strong>10 的二进制表示为 "1010"，其二进制反码为 "0101"，也就是十进制中的 5 。
 </pre>

 <p><strong>提示：</strong></p>
 <ol>
 <li><code>0 &lt;= N &lt; 10^9</code></li>
 <li>本题与 476：<a href="https://leetcode-cn.com/problems/number-complement/">https://leetcode-cn.com/problems/number-complement/</a> 相同</li>
 </ol>
 */
public class ComplementOfBase10Integer {
    public int bitwiseComplement(int n) {
        if (n == 0) return 1;
        int mark = (1 << (32 - Integer.numberOfLeadingZeros(n))) - 1;
        return ~n & mark;
    }
}
