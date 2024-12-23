package lpf.learn.leetcode.tags.slidingwindow;


/** 1763 最长的美好子字符串
 <p>当一个字符串 <code>s</code>&nbsp;包含的每一种字母的大写和小写形式 <strong>同时</strong>&nbsp;出现在 <code>s</code>&nbsp;中，就称这个字符串&nbsp;<code>s</code>&nbsp;是 <strong>美好</strong> 字符串。比方说，<code>"abABB"</code>&nbsp;是美好字符串，因为&nbsp;<code>'A'</code> 和&nbsp;<code>'a'</code>&nbsp;同时出现了，且&nbsp;<code>'B'</code> 和&nbsp;<code>'b'</code>&nbsp;也同时出现了。然而，<code>"abA"</code>&nbsp;不是美好字符串因为&nbsp;<code>'b'</code>&nbsp;出现了，而&nbsp;<code>'B'</code>&nbsp;没有出现。</p>
 <p>给你一个字符串&nbsp;<code>s</code>&nbsp;，请你返回&nbsp;<code>s</code>&nbsp;最长的&nbsp;<strong>美好子字符串</strong>&nbsp;。如果有多个答案，请你返回&nbsp;<strong>最早</strong>&nbsp;出现的一个。如果不存在美好子字符串，请你返回一个空字符串。</p>

 <p><strong>示例 1：</strong></p>
 <pre>
 <b>输入：</b>s = "YazaAay"
 <b>输出：</b>"aAa"
 <strong>解释：</strong>"aAa" 是一个美好字符串，因为这个子串中仅含一种字母，其小写形式 'a' 和大写形式 'A' 也同时出现了。
 "aAa" 是最长的美好子字符串。
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <b>输入：</b>s = "Bb"
 <b>输出：</b>"Bb"
 <b>解释：</b>"Bb" 是美好字符串，因为 'B' 和 'b' 都出现了。整个字符串也是原字符串的子字符串。</pre>

 <p><strong>示例 3：</strong></p>
 <pre>
 <b>输入：</b>s = "c"
 <b>输出：</b>""
 <b>解释：</b>没有美好子字符串。</pre>

 <p><strong>示例 4：</strong></p>
 <pre>
 <b>输入：</b>s = "dDzeE"
 <b>输出：</b>"dD"
 <strong>解释：</strong>"dD" 和 "eE" 都是最长美好子字符串。
 由于有多个美好子字符串，返回 "dD" ，因为它出现得最早。</pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= s.length &lt;= 100</code></li>
 <li><code>s</code>&nbsp;只包含大写和小写英文字母。</li>
 </ul>
 */
public class LongestNiceSubstring {
    public String longestNiceSubstring(String s) {
        char[] chars = s.toCharArray();
        String res = "";

        for (int t = 1; t <= 26; t++) {
            int[] cnt = new int[123];
            int tot = 0, less = 0;

            for (int l = 0, r = 0; r < s.length(); r++) {
                cnt[chars[r]]++;
                int i = chars[r] > 'Z' ? chars[r] - 'a' : chars[r] - 'A';

                if (cnt[i + 'a'] + cnt[i + 'A'] == 1) {
                    tot++;
                    less++;
                }
                if (cnt[chars[r]] == 1 && cnt[i + 'A'] > 0 && cnt[i + 'a'] > 0) less--;

                while (tot > t) {
                    char c = chars[l++];
                    int j = c > 'Z' ? c - 'a' : c - 'A';

                    if (cnt[j + 'a'] + cnt[j + 'A'] == 1) {
                        tot--;
                        less--;
                    }
                    if (cnt[c] == 1 && cnt[j + 'A'] > 0 && cnt[j + 'a'] > 0) less++;
                    cnt[c]--;
                }
                if (less == 0 && res.length() < r - l + 1)
                    res = s.substring(l, r + 1);
            }
        }
        return res;
    }
}
