package lpf.learn.leetcode.tags.slidingwindow;


/** 395 至少有 K 个重复字符的最长子串
 <p>给你一个字符串 <code>s</code> 和一个整数 <code>k</code> ，请你找出 <code>s</code> 中的最长子串，&nbsp;要求该子串中的每一字符出现次数都不少于 <code>k</code> 。返回这一子串的长度。</p>
 <p data-pm-slice="1 1 []">如果不存在这样的子字符串，则返回 0。</p>

 <p><strong>示例 1：</strong></p>
 <pre>
 <strong>输入：</strong>s = "aaabb", k = 3
 <strong>输出：</strong>3
 <strong>解释：</strong>最长子串为 "aaa" ，其中 'a' 重复了 3 次。
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <strong>输入：</strong>s = "ababbc", k = 2
 <strong>输出：</strong>5
 <strong>解释：</strong>最长子串为 "ababb" ，其中 'a' 重复了 2 次， 'b' 重复了 3 次。</pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= s.length &lt;= 10<sup>4</sup></code></li>
 <li><code>s</code> 仅由小写英文字母组成</li>
 <li><code>1 &lt;= k &lt;= 10<sup>5</sup></code></li>
 </ul>
 */
public class LongestSubstringWithAtLeastKRepeatingCharacters {



    public int longestSubstring(String s, int k) {
        char[] chars = s.toCharArray();
        int n = s.length(), res = 0;

        for (int t = 1; t <= 26; t++) {
            int[] cnt = new int[26];
            int tot = 0, less = 0;

            for (int l = 0, r = 0; r < n; r++) {
                int i = chars[r] - 'a';
                cnt[i]++;
                if (cnt[i] == 1) {
                    tot++;
                    less++;
                }
                if (cnt[i] == k) less--;

                while (tot > t) {
                    int j = chars[l++] - 'a';
                    if (cnt[j] == 1) {
                        tot--;
                        less--;
                    }
                    if (cnt[j] == k) less++;

                    cnt[j]--;
                }
                if (less == 0) res = Math.max(res, r - l + 1);
            }
        }
        return res;
    }


    public int longestSubstring2(String s, int k) {
        return dfs(s.toCharArray(), k, 0, s.length() - 1);
    }
    private int dfs(char[] chars, int k, int l, int r) {
        if (l > r) return 0;

        int[] cnt = new int[26];
        for (int i = l; i <= r; i++) cnt[chars[i] - 'a']++;

        boolean flag = true;
        for (int v : cnt) if (v > 0 && v < k) flag = false;
        if (flag) return r - l + 1;

        int res = 0, i = l, j = i;
        for (; i <= r; i++) {
            int v = cnt[chars[i] - 'a'];
            if (v >= k) continue;

            res = Math.max(res, dfs(chars, k, j, i - 1));
            j = i + 1;
        }
        res = Math.max(res, dfs(chars, k, j, i - 1));

        return res;
    }

}
