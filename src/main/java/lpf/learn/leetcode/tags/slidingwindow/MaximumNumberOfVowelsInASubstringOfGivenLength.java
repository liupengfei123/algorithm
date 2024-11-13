package lpf.learn.leetcode.tags.slidingwindow;


/**
 *[1456]定长子串中元音的最大数目
 <p>给你字符串 <code>s</code> 和整数 <code>k</code> 。</p>

 <p>请返回字符串 <code>s</code> 中长度为 <code>k</code> 的单个子字符串中可能包含的最大元音字母数。</p>

 <p>英文中的 <strong>元音字母 </strong>为（<code>a</code>, <code>e</code>, <code>i</code>, <code>o</code>, <code>u</code>）。</p>

 <p><strong>示例 1：</strong></p>

 <pre><strong>输入：</strong>s = "abciiidef", k = 3
 <strong>输出：</strong>3
 <strong>解释：</strong>子字符串 "iii" 包含 3 个元音字母。
 </pre>

 <p><strong>示例 2：</strong></p>

 <pre><strong>输入：</strong>s = "aeiou", k = 2
 <strong>输出：</strong>2
 <strong>解释：</strong>任意长度为 2 的子字符串都包含 2 个元音字母。
 </pre>

 <p><strong>示例 3：</strong></p>

 <pre><strong>输入：</strong>s = "leetcode", k = 3
 <strong>输出：</strong>2
 <strong>解释：</strong>"lee"、"eet" 和 "ode" 都包含 2 个元音字母。
 </pre>

 <p><strong>示例 4：</strong></p>

 <pre><strong>输入：</strong>s = "rhythms", k = 4
 <strong>输出：</strong>0
 <strong>解释：</strong>字符串 s 中不含任何元音字母。
 </pre>

 <p><strong>示例 5：</strong></p>

 <pre><strong>输入：</strong>s = "tryhard", k = 4
 <strong>输出：</strong>1
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= s.length &lt;= 10^5</code></li>
 <li><code>s</code> 由小写英文字母组成</li>
 <li><code>1 &lt;= k &lt;= s.length</code></li>
 </ul>
 */
public class MaximumNumberOfVowelsInASubstringOfGivenLength {

    public int maxVowels(String s, int k) {
        char[] chars = s.toCharArray();
        int cnt = 0, n = s.length();

        for (int i = 0; i < k; i++) {
            if (isYuan(chars[i])) cnt++;
        }
        int res = cnt;

        for (int i = k; i < n; i++) {
            if (isYuan(chars[i])) cnt++;
            if (isYuan(chars[i - k])) cnt--;

            res = Math.max(res, cnt);
        }

        return res;
    }


    private boolean isYuan(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
