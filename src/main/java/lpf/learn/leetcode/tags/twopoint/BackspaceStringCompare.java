package lpf.learn.leetcode.tags.twopoint;


/** 844 比较含退格的字符串
 <p>给定 <code>s</code> 和 <code>t</code> 两个字符串，当它们分别被输入到空白的文本编辑器后，如果两者相等，返回 <code>true</code> 。<code>#</code> 代表退格字符。</p>
 <p><strong>注意：</strong>如果对空文本输入退格字符，文本继续为空。</p>

 <p><strong>示例 1：</strong></p>
 <pre>
 <strong>输入：</strong>s = "ab#c", t = "ad#c"
 <strong>输出：</strong>true
 <strong>解释：</strong>s 和 t 都会变成 "ac"。
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <strong>输入：</strong>s = "ab##", t = "c#d#"
 <strong>输出：</strong>true
 <strong>解释：</strong>s 和 t 都会变成 ""。
 </pre>

 <p><strong>示例 3：</strong></p>
 <pre>
 <strong>输入：</strong>s = "a#c", t = "b"
 <strong>输出：</strong>false
 <strong>解释：</strong>s 会变成 "c"，但 t 仍然是 "b"。</pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= s.length, t.length &lt;= 200</code></li>
 <li><code>s</code> 和 <code>t</code> 只含有小写字母以及字符 <code>'#'</code></li>
 </ul>

 <p><strong>进阶：</strong></p>
 <ul>
 <li>你可以用 <code>O(n)</code> 的时间复杂度和 <code>O(1)</code> 的空间复杂度解决该问题吗？</li>
 </ul>
 */
public class BackspaceStringCompare {
    public boolean backspaceCompare(String s, String t) {
        char[] sc = s.toCharArray(), tc = t.toCharArray();

        int ls = s.length(), lt = t.length();
        int i = ls - 1, j = lt - 1, sz = 0, tz = 0;

        while (i >= 0 && j >= 0) {
            while (i >= 0 && (sz > 0 || sc[i] == '#') ) {
                if (sc[i--] == '#') sz++;
                else sz--;
            }

            while (j >= 0 && (tz > 0 || tc[j] == '#')) {
                if (tc[j--] == '#') tz++;
                else tz--;
            }
            if (i < 0 || j < 0) break;

            if (sc[i--] != tc[j--]) return false;
        }

        while (i >= 0 && (sz > 0 || sc[i] == '#') ) {
            if (sc[i--] == '#') sz++;
            else sz--;
        }
        while (j >= 0 && (tz > 0 || tc[j] == '#')) {
            if (tc[j--] == '#') tz++;
            else tz--;
        }
        return i < 0 && j < 0;
    }
}
