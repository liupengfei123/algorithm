package lpf.learn.leetcode.tags.string;

/** 1147 段式回文
 <p>你会得到一个字符串&nbsp;<code>text</code>&nbsp;。你应该把它分成 <code>k</code>&nbsp;个子字符串&nbsp;<code>(subtext1, subtext2，…， subtextk)</code>&nbsp;，要求满足:</p>
 <ul>
 <li><code>subtext<sub>i</sub></code><sub>&nbsp;</sub>是 <strong>非空&nbsp;</strong>字符串</li>
 <li>所有子字符串的连接等于 <code>text</code> ( 即<code>subtext<sub>1</sub>&nbsp;+ subtext<sub>2</sub>&nbsp;+ ... + subtext<sub>k</sub>&nbsp;== text</code>&nbsp;)</li>
 <li>对于所有 <font color="#c7254e"><font face="Menlo, Monaco, Consolas, Courier New, monospace"><span style="font-size:12.6px"><span style="background-color:#f9f2f4">i</span></span></font></font>&nbsp;的有效值( 即&nbsp;<code>1 &lt;= i&nbsp;&lt;= k</code> ) ，<code>subtext<sub>i</sub>&nbsp;== subtext<sub>k - i + 1</sub></code> 均成立</li>
 </ul>
 <p>返回<code>k</code>可能最大值。</p>

 <p><strong>示例 1：</strong></p>
 <pre>
 <strong>输入：</strong>text = "ghiabcdefhelloadamhelloabcdefghi"
 <strong>输出：</strong>7
 <strong>解释：</strong>我们可以把字符串拆分成 "(ghi)(abcdef)(hello)(adam)(hello)(abcdef)(ghi)"。
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <strong>输入：</strong>text = "merchant"
 <strong>输出：</strong>1
 <strong>解释：</strong>我们可以把字符串拆分成 "(merchant)"。
 </pre>

 <p><strong>示例 3：</strong></p>
 <pre>
 <strong>输入：</strong>text = "antaprezatepzapreanta"
 <strong>输出：</strong>11
 <strong>解释：</strong>我们可以把字符串拆分成 "(a)(nt)(a)(pre)(za)(tpe)(za)(pre)(a)(nt)(a)"。
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= text.length &lt;= 1000</code></li>
 <li><code>text</code>&nbsp;仅由小写英文字符组成</li>
 </ul>
 */
public class LongestChunkedPalindromeDecomposition {
    public int longestDecomposition(String text) {
        int l = 0, r = text.length() - 1;
        int res = 0;
        while (l <= r) {
            int len = 1;
            while (l + len - 1 < r - len + 1) {
                if (judge(text, l, r - len + 1, len)) {
                    res += 2;
                    break;
                }
                len++;
            }

            if (l + len - 1 >= r - len + 1) res++;

            l += len;
            r -= len;
        }
        return res;
    }
    private boolean judge(String text, int l1, int l2, int len) {
        while (len-- > 0) {
            if (text.charAt(l1++) != text.charAt(l2++)) return false;
        }
        return true;
    }
}
