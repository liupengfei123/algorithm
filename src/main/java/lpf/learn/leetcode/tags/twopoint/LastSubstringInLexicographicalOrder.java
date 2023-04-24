package lpf.learn.leetcode.tags.twopoint;

/**
 * 1163 按字典序排在最后的子串
 * <p>给你一个字符串&nbsp;<code>s</code>&nbsp;，找出它的所有子串并按字典序排列，返回排在最后的那个子串。</p>
 *
 * <p><strong>示例 1：</strong></p>
 * <pre>
 * <strong>输入：</strong>s = "abab"
 * <strong>输出：</strong>"bab"
 * <strong>解释：</strong>我们可以找出 7 个子串 ["a", "ab", "aba", "abab", "b", "ba", "bab"]。按字典序排在最后的子串是 "bab"。
 * </pre>
 *
 * <p><strong>示例&nbsp;2：</strong></p>
 * <pre>
 * <strong>输入：</strong>s = "leetcode"
 * <strong>输出：</strong>"tcode"
 * </pre>
 *
 * <p><strong>提示：</strong></p>
 * <ul>
 * <li><code>1 &lt;= s.length &lt;= 4 * 10<sup>5</sup></code></li>
 * <li><code>s</code> 仅含有小写英文字符。</li>
 * </ul>
 */
public class LastSubstringInLexicographicalOrder {
    public String lastSubstring(String s) {
        int i = 0, j = 1, n = s.length();
        while (j < n) {
            int k = 0;
            while (j + k < n && s.charAt(i + k) == s.charAt(j + k)) {
                k++;
            }
            if (j + k < n && s.charAt(i + k) < s.charAt(j + k)) {
                int t = i;
                i = j;
                j = Math.max(j + 1, t + k + 1);
            } else {
                j = j + k + 1;
            }
        }
        return s.substring(i);
    }
}
