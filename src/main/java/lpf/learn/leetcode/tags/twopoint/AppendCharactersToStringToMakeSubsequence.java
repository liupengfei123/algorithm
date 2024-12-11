package lpf.learn.leetcode.tags.twopoint;


/** 2486 追加字符以获得子序列
 <p>给你两个仅由小写英文字母组成的字符串 <code>s</code> 和 <code>t</code> 。</p>
 <p>现在需要通过向 <code>s</code> 末尾追加字符的方式使 <code>t</code> 变成 <code>s</code> 的一个 <strong>子序列</strong> ，返回需要追加的最少字符数。</p>
 <p>子序列是一个可以由其他字符串删除部分（或不删除）字符但不改变剩下字符顺序得到的字符串。</p>

 <p><strong>示例 1：</strong></p>
 <pre>
 <strong>输入：</strong>s = "coaching", t = "coding"
 <strong>输出：</strong>4
 <strong>解释：</strong>向 s 末尾追加字符串 "ding" ，s = "coachingding" 。
 现在，t 是 s ("<em><strong>co</strong></em>aching<em><strong>ding</strong></em>") 的一个子序列。
 可以证明向 s 末尾追加任何 3 个字符都无法使 t 成为 s 的一个子序列。
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <strong>输入：</strong>s = "abcde", t = "a"
 <strong>输出：</strong>0
 <strong>解释：</strong>t 已经是 s ("<em><strong>a</strong></em>bcde") 的一个子序列。
 </pre>

 <p><strong>示例 3：</strong></p>
 <pre>
 <strong>输入：</strong>s = "z", t = "abcde"
 <strong>输出：</strong>5
 <strong>解释：</strong>向 s 末尾追加字符串 "abcde" ，s = "zabcde" 。
 现在，t 是 s ("z<em><strong>abcde</strong></em>") 的一个子序列。
 可以证明向 s 末尾追加任何 4 个字符都无法使 t 成为 s 的一个子序列。
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= s.length, t.length &lt;= 10<sup>5</sup></code></li>
 <li><code>s</code> 和 <code>t</code> 仅由小写英文字母组成</li>
 </ul>
 */
public class AppendCharactersToStringToMakeSubsequence {
    public int appendCharacters(String s, String t) {
        char[] sc = s.toCharArray(), tc = t.toCharArray();
        int n = s.length(), m = t.length();
        int i = 0, j = 0;

        while (i < n && j < m) {
            if (sc[i] == tc[j]) j++;

            i++;
        }
        return Math.max(0, m - j);
    }
}
