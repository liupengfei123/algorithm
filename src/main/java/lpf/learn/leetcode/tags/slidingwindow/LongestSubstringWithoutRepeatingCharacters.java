package lpf.learn.leetcode.tags.slidingwindow;

import java.util.HashSet;
import java.util.Set;

/** 3 无重复字符的最长子串
 <p>给定一个字符串 <code>s</code> ，请你找出其中不含有重复字符的&nbsp;<strong>最长 <span data-keyword="substring-nonempty">子串</span></strong><strong>&nbsp;</strong>的长度。</p>

 <p><strong>示例&nbsp;1:</strong></p>
 <pre>
 <strong>输入: </strong>s = "abcabcbb"
 <strong>输出: </strong>3
 <strong>解释:</strong> 因为无重复字符的最长子串是 <span><code>"abc"</code></span>，所以其长度为 3。
 </pre>

 <p><strong>示例 2:</strong></p>
 <pre>
 <strong>输入: </strong>s = "bbbbb"
 <strong>输出: </strong>1
 <strong>解释: </strong>因为无重复字符的最长子串是 <span><code>"b"</code></span>，所以其长度为 1。
 </pre>

 <p><strong>示例 3:</strong></p>
 <pre>
 <strong>输入: </strong>s = "pwwkew"
 <strong>输出: </strong>3
 <strong>解释: </strong>因为无重复字符的最长子串是&nbsp;<span><code>"wke"</code></span>，所以其长度为 3。
 &nbsp;    请注意，你的答案必须是 <strong>子串 </strong>的长度，<span><code>"pwke"</code></span>&nbsp;是一个<em>子序列，</em>不是子串。
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>0 &lt;= s.length &lt;= 5 * 10<sup>4</sup></code></li>
 <li><code>s</code>&nbsp;由英文字母、数字、符号和空格组成</li>
 </ul>
 */

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> map = new HashSet<>();

        char[] chars = s.toCharArray();
        int n = s.length(), res = 0;

        for (int l = 0, r = 0; r < n; r++) {
            while (map.contains(chars[r])) {
                map.remove(chars[l++]);
            }
            map.add(chars[r]);
            res = Math.max(res, map.size());
        }
        return res;
    }
}
