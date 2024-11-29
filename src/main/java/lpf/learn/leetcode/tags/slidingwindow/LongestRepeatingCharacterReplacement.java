package lpf.learn.leetcode.tags.slidingwindow;


/** 424 替换后的最长重复字符
 <p>给你一个字符串 <code>s</code> 和一个整数 <code>k</code> 。你可以选择字符串中的任一字符，并将其更改为任何其他大写英文字符。该操作最多可执行 <code>k</code> 次。</p>
 <p>在执行上述操作后，返回 <em>包含相同字母的最长子字符串的长度。</em></p>

 <p><strong>示例 1：</strong></p>
 <pre>
 <strong>输入：</strong>s = "ABAB", k = 2
 <strong>输出：</strong>4
 <strong>解释：</strong>用两个'A'替换为两个'B',反之亦然。
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <strong>输入：</strong>s = "AABABBA", k = 1
 <strong>输出：</strong>4
 <strong>解释：</strong>
 将中间的一个'A'替换为'B',字符串变为 "AABBBBA"。
 子串 "BBBB" 有最长重复字母, 答案为 4。
 可能存在其他的方法来得到同样的结果。
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= s.length &lt;= 10<sup>5</sup></code></li>
 <li><code>s</code> 仅由大写英文字母组成</li>
 <li><code>0 &lt;= k &lt;= s.length</code></li>
 </ul>
 */
public class LongestRepeatingCharacterReplacement {


    public int characterReplacement(String s, int k) {
        char[] chars = s.toCharArray();

        int[] cnt = new int[26];
        int res = -1, cmax = 0;
        for (int l = 0, r = 0; r < s.length(); r++) {
            // 历史内窗口中数量最多的字符个数
            cmax = Math.max(cmax, ++cnt[chars[r] - 'A']);
            // 当条件成立说明无法替换成功，或者没有超过 res 的值
            while (r - l + 1 > cmax + k) {
                cnt[chars[l++] - 'A']--;
            }
            res = Math.max(res, r - l + 1);
        }
        return res;
    }
}
