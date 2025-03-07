package lpf.learn.leetcode.tags.slidingwindow;


import java.util.HashMap;
import java.util.Map;

/** 1297 子串的最大出现次数
 <p>给你一个字符串&nbsp;<code>s</code> ，请你返回满足以下条件且出现次数最大的&nbsp;<strong>任意</strong>&nbsp;子串的出现次数：</p>
 <ul>
 <li>子串中不同字母的数目必须小于等于 <code>maxLetters</code> 。</li>
 <li>子串的长度必须大于等于&nbsp;<code>minSize</code> 且小于等于&nbsp;<code>maxSize</code> 。</li>
 </ul>

 <p><strong>示例 1：</strong></p>
 <pre><strong>输入：</strong>s = "aababcaab", maxLetters = 2, minSize = 3, maxSize = 4
 <strong>输出：</strong>2
 <strong>解释：</strong>子串 "aab" 在原字符串中出现了 2 次。
 它满足所有的要求：2 个不同的字母，长度为 3 （在 minSize 和 maxSize 范围内）。
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre><strong>输入：</strong>s = "aaaa", maxLetters = 1, minSize = 3, maxSize = 3
 <strong>输出：</strong>2
 <strong>解释：</strong>子串 "aaa" 在原字符串中出现了 2 次，且它们有重叠部分。
 </pre>

 <p><strong>示例 3：</strong></p>
 <pre><strong>输入：</strong>s = "aabcabcab", maxLetters = 2, minSize = 2, maxSize = 3
 <strong>输出：</strong>3
 </pre>

 <p><strong>示例 4：</strong></p>
 <pre><strong>输入：</strong>s = "abcde", maxLetters = 2, minSize = 3, maxSize = 3
 <strong>输出：</strong>0
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= s.length &lt;= 10^5</code></li>
 <li><code>1 &lt;= maxLetters &lt;= 26</code></li>
 <li><code>1 &lt;= minSize &lt;= maxSize &lt;= min(26, s.length)</code></li>
 <li><code>s</code>&nbsp;只包含小写英文字母。</li>
 </ul>
 */
public class MaximumNumberOfOccurrencesOfASubstring {
    public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
        Map<String, Integer> subStrCnt = new HashMap<>();
        Map<Character, Integer> charCnt = new HashMap<>();
        int n = s.length();

        for (int i = 0; i < minSize; i++) charCnt.merge(s.charAt(i), 1, Integer::sum);

        if (charCnt.size() <= maxLetters)
            subStrCnt.merge(s.substring(0, minSize), 1, Integer::sum);

        for (int i = minSize; i < n; i++) {
            charCnt.merge(s.charAt(i), 1, Integer::sum);
            charCnt.merge(s.charAt(i - minSize), -1, (a, b) -> (a += b) == 0 ? null : a);

            if (charCnt.size() <= maxLetters)
                subStrCnt.merge(s.substring(i - minSize + 1, i + 1), 1, Integer::sum);
        }

        int res = 0;
        for (Integer value : subStrCnt.values()) res = Math.max(res, value);

        return res;
    }
}
