package lpf.learn.leetcode.tags.slidingwindow;


/** 1358 包含所有三种字符的子字符串数目
 <p>给你一个字符串 <code>s</code>&nbsp;，它只包含三种字符 a, b 和 c 。</p>
 <p>请你返回 a，b 和 c 都&nbsp;<strong>至少&nbsp;</strong>出现过一次的子字符串数目。</p>

 <p><strong>示例 1：</strong></p>
 <pre><strong>输入：</strong>s = "abcabc"
 <strong>输出：</strong>10
 <strong>解释：</strong>包含 a，b 和 c 各至少一次的子字符串为<em> "</em>abc<em>", "</em>abca<em>", "</em>abcab<em>", "</em>abcabc<em>", "</em>bca<em>", "</em>bcab<em>", "</em>bcabc<em>", "</em>cab<em>", "</em>cabc<em>" </em>和<em> "</em>abc<em>" </em>(<strong>相同</strong><strong>字符串算多次</strong>)<em>。</em>
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre><strong>输入：</strong>s = "aaacb"
 <strong>输出：</strong>3
 <strong>解释：</strong>包含 a，b 和 c 各至少一次的子字符串为<em> "</em>aaacb<em>", "</em>aacb<em>" </em>和<em> "</em>acb<em>" 。</em>
 </pre>

 <p><strong>示例 3：</strong></p>
 <pre><strong>输入：</strong>s = "abc"
 <strong>输出：</strong>1
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>3 &lt;= s.length &lt;= 5 x 10^4</code></li>
 <li><code>s</code>&nbsp;只包含字符 a，b 和 c 。</li>
 </ul>
 */
public class NumberOfSubstringsContainingAllThreeCharacters {
    public int numberOfSubstrings(String s) {
        char[] chars = s.toCharArray();
        int n = s.length(), res = 0;
        int[] cnt = new int[3];

        for (int l = 0, r = 0; r < n; r++) {
            cnt[chars[r] - 'a']++;

            if (!check(cnt)) continue;

            while (check(cnt)) cnt[chars[l++] - 'a']--;

            res += l;
            cnt[chars[--l] - 'a']++;
        }
        return res;
    }

    private boolean check(int[] cnt) {
        return cnt[0] > 0 && cnt[1] > 0 && cnt[2] > 0;
    }
}
