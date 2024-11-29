package lpf.learn.leetcode.tags.slidingwindow;


import java.util.HashMap;
import java.util.Map;

/** 1156 单字符重复子串的最大长度
 <p>如果字符串中的所有字符都相同，那么这个字符串是单字符重复的字符串。</p>
 <p>给你一个字符串&nbsp;<code>text</code>，你只能交换其中两个字符一次或者什么都不做，然后得到一些单字符重复的子串。返回其中最长的子串的长度。</p>

 <p><strong>示例 1：</strong></p>
 <pre><strong>输入：</strong>text = "ababa"
 <strong>输出：</strong>3
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre><strong>输入：</strong>text = "aaabaaa"
 <strong>输出：</strong>6
 </pre>

 <p><strong>示例 3：</strong></p>
 <pre><strong>输入：</strong>text = "aaabbaaa"
 <strong>输出：</strong>4
 </pre>

 <p><strong>示例 4：</strong></p>
 <pre><strong>输入：</strong>text = "aaaaa"
 <strong>输出：</strong>5
 </pre>

 <p><strong>示例 5：</strong></p>
 <pre><strong>输入：</strong>text = "abcdef"
 <strong>输出：</strong>1
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= text.length &lt;= 20000</code></li>
 <li><code>text</code> 仅由小写英文字母组成。</li>
 </ul>
 */
public class SwapForLongestRepeatedCharacterSubstring {
    public int maxRepOpt1(String text) {
        char[] chars = text.toCharArray();
        int[] cnt = new int[26];
        for (char c : chars) cnt[c - 'a']++;

        int max = 0;
        for (int v : cnt) max = Math.max(v, max);
        if (max < 3) return max;

        Map<Character, Integer> map = new HashMap<>();
        int n = chars.length, res = 0;
        for (int l = 0, r = 0; r < n; r++) {
            map.merge(chars[r], 1, Integer::sum);

            while (check(map, cnt)) {
                map.merge(chars[l++], -1, (a, b) -> (a += b) == 0 ? null : a);
            }
            res = Math.max(res, r - l + 1);
        }
        return res;
    }

    private boolean check(Map<Character, Integer> map, int[] cnt) {
        if (map.size() == 1) return false;

        char c = 0;
        int sum = 0, max = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            Integer value = entry.getValue();
            sum += value;
            if (max < value) {
                c = entry.getKey();
                max = value;
            }
        }
        if (sum - max > 1) return true;

        return cnt[c - 'a'] == max;
    }
}
