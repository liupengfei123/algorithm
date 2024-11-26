package lpf.learn.leetcode.tags.slidingwindow;


import java.util.HashMap;
import java.util.Map;

/** 76 最小覆盖子串
 <p>给你一个字符串 <code>s</code> 、一个字符串 <code>t</code> 。返回 <code>s</code> 中涵盖 <code>t</code> 所有字符的最小子串。如果 <code>s</code> 中不存在涵盖 <code>t</code> 所有字符的子串，则返回空字符串 <code>""</code> 。</p>

 <p><strong>注意：</strong></p>
 <ul>
 <li>对于 <code>t</code> 中重复字符，我们寻找的子字符串中该字符数量必须不少于 <code>t</code> 中该字符数量。</li>
 <li>如果 <code>s</code> 中存在这样的子串，我们保证它是唯一的答案。</li>
 </ul>

 <p><strong>示例 1：</strong></p>
 <pre>
 <strong>输入：</strong>s = "ADOBECODEBANC", t = "ABC"
 <strong>输出：</strong>"BANC"
 <strong>解释：</strong>最小覆盖子串 "BANC" 包含来自字符串 t 的 'A'、'B' 和 'C'。
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <strong>输入：</strong>s = "a", t = "a"
 <strong>输出：</strong>"a"
 <strong>解释：</strong>整个字符串 s 是最小覆盖子串。
 </pre>

 <p><strong>示例 3:</strong></p>
 <pre>
 <strong>输入:</strong> s = "a", t = "aa"
 <strong>输出:</strong> ""
 <strong>解释:</strong> t 中两个字符 'a' 均应包含在 s 的子串中，
 因此没有符合条件的子字符串，返回空字符串。</pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code><sup>m == s.length</sup></code></li>
 <li><code><sup>n == t.length</sup></code></li>
 <li><code>1 &lt;= m, n &lt;= 10<sup>5</sup></code></li>
 <li><code>s</code> 和 <code>t</code> 由英文字母组成</li>
 </ul>
 <strong>进阶：</strong>你能设计一个在
 <code>o(m+n)</code> 时间内解决此问题的算法吗？
 */
public class MinimumWindowSubstring {
    public String minWindow(String s, String t) {
        Map<Character, Integer> tCnt = new HashMap<>(), sCnt = new HashMap<>();
        for (char c : t.toCharArray()) tCnt.merge(c, 1, Integer::sum);

        char[] chars = s.toCharArray();
        int n = s.length();
        String res = null;

        for (int l = 0, r = 0; r < n; r++) {
            sCnt.merge(chars[r], 1, Integer::sum);

            while (check(sCnt, tCnt)) {
                String sub = s.substring(l, r + 1);
                if (res == null || res.length() > sub.length()) res = sub;

                sCnt.merge(chars[l++], -1, Integer::sum);
            }
        }
        return res == null ? "" : res;
    }

    private boolean check(Map<Character, Integer> sCnt, Map<Character, Integer> tCnt) {
        for (Map.Entry<Character, Integer> entry : tCnt.entrySet()) {
            Integer v = sCnt.get(entry.getKey());
            if (v == null || v < entry.getValue()) {
                return false;
            }
        }
        return true;
    }
}
