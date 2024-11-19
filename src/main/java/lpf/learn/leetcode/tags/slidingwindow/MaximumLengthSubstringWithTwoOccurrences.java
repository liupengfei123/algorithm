package lpf.learn.leetcode.tags.slidingwindow;


/** 3090 每个字符最多出现两次的最长子字符串
 <p>给你一个字符串 <code>s</code> ，请找出满足每个字符最多出现两次的最长子字符串，并返回该<span data-keyword="substring">子字符串</span>的<strong> 最大 </strong>长度。</p>

 <p><strong class="example">示例 1：</strong></p>
 <div class="example-block">
 <p><strong>输入：</strong> <span class="example-io">s = "bcbbbcba"</span></p>
 </div>
 <p><strong>输出：</strong> <span class="example-io">4</span></p>
 <p><strong>解释：</strong></p>
 <p>以下子字符串长度为 4，并且每个字符最多出现两次：<code>"bcbb<u>bcba</u>"</code>。</p>

 <p><strong class="example">示例 2：</strong></p>
 <div class="example-block">
 <p><strong>输入：</strong> <span class="example-io">s = "aaaa"</span></p>
 </div>
 <p><strong>输出：</strong> <span class="example-io">2</span></p>
 <p><strong>解释：</strong></p>
 <p>以下子字符串长度为 2，并且每个字符最多出现两次：<code>"<u>aa</u>aa"</code>。</p>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>2 &lt;= s.length &lt;= 100</code></li>
 <li><code>s</code> 仅由小写英文字母组成。</li>
 </ul>
 */
public class MaximumLengthSubstringWithTwoOccurrences {
    public int maximumLengthSubstring(String s) {
        char[] chars = s.toCharArray();
        int n = s.length(), res = 0;
        char[] cnt = new char[26];

        for (int l = 0, r = 0; r < n; r++) {
            cnt[chars[r] - 'a']++;
            while (cnt[chars[r] - 'a'] > 2) cnt[chars[l++] - 'a']--;

            res = Math.max(res, r - l + 1);
        }

        return res;
    }
}
