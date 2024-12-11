package lpf.learn.leetcode.tags.twopoint;


/** 2565 最少得分子序列
 <p>给你两个字符串&nbsp;<code>s</code> 和&nbsp;<code>t</code>&nbsp;。</p>
 <p>你可以从字符串 <code>t</code>&nbsp;中删除任意数目的字符。</p>
 <p>如果没有从字符串&nbsp;<code>t</code>&nbsp;中删除字符，那么得分为&nbsp;<code>0</code>&nbsp;，否则：</p>
 <ul>
 <li>令&nbsp;<code>left</code>&nbsp;为删除字符中的最小下标。</li>
 <li>令&nbsp;<code>right</code>&nbsp;为删除字符中的最大下标。</li>
 </ul>
 <p>字符串的得分为&nbsp;<code>right - left + 1</code>&nbsp;。</p>
 <p>请你返回使<em>&nbsp;</em><code>t</code><em> </em>成为<em>&nbsp;</em><code>s</code>&nbsp;子序列的最小得分。</p>
 <p>一个字符串的 <strong>子序列</strong>&nbsp;是从原字符串中删除一些字符后（也可以一个也不删除），剩余字符不改变顺序得到的字符串。（比方说&nbsp;<code>"ace"</code> 是&nbsp;<code>"<strong><em>a</em></strong>b<strong><em>c</em></strong>d<strong><em>e</em></strong>"</code>&nbsp;的子序列，但是&nbsp;<code>"aec"</code>&nbsp;不是）。</p>

 <p><strong>示例 1：</strong></p>
 <pre>
 <b>输入：</b>s = "abacaba", t = "bzaa"
 <b>输出：</b>1
 <b>解释：</b>这个例子中，我们删除下标 1 处的字符 "z" （下标从 0 开始）。
 字符串 t 变为 "baa" ，它是字符串 "abacaba" 的子序列，得分为 1 - 1 + 1 = 1 。
 1 是能得到的最小得分。
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <b>输入：</b>s = "cde", t = "xyz"
 <b>输出：</b>3
 <b>解释：</b>这个例子中，我们将下标为 0， 1 和 2 处的字符 "x" ，"y" 和 "z" 删除（下标从 0 开始）。
 字符串变成 "" ，它是字符串 "cde" 的子序列，得分为 2 - 0 + 1 = 3 。
 3 是能得到的最小得分。
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= s.length, t.length &lt;= 10<sup>5</sup></code></li>
 <li><code>s</code> 和&nbsp;<code>t</code>&nbsp;都只包含小写英文字母。</li>
 </ul>
 */
public class SubsequenceWithTheMinimumScore {
    public int minimumScore(String s, String t) {
        char[] sc = s.toCharArray(), tc = t.toCharArray();
        int n = s.length(), m = t.length();
        int[] suf = new int[m];

        int i, j;
        for (i = n - 1, j = m - 1; i >= 0 && j >= 0 ; i--) {
            if (sc[i] == tc[j]) suf[j--] = i;
        }
        if (j < 1) return j + 1;

        int res = j + 1, z = 0;
        for (i = 0, j = 0; i < n && j < m ; i++) {
            if (sc[i] != tc[j]) continue;

            while (z < m && i >= suf[z]) z++;

            res = Math.min(res, z - j - 1);
            j++;
        }
        return res;
    }
}
