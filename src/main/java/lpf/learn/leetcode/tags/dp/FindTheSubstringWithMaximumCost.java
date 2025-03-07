package lpf.learn.leetcode.tags.dp;

import java.util.HashMap;
import java.util.Map;

/** 2606 找到最大开销的子字符串
 <p>给你一个字符串&nbsp;<code>s</code>&nbsp;，一个字符&nbsp;<strong>互不相同</strong>&nbsp;的字符串&nbsp;<code>chars</code>&nbsp;和一个长度与 <code>chars</code>&nbsp;相同的整数数组&nbsp;<code>vals</code>&nbsp;。</p>
 <p><strong>子字符串的开销</strong>&nbsp;是一个子字符串中所有字符对应价值之和。空字符串的开销是 <code>0</code>&nbsp;。</p>
 <p><strong>字符的价值</strong>&nbsp;定义如下：</p>
 <ul>
 <li>如果字符不在字符串&nbsp;<code>chars</code>&nbsp;中，那么它的价值是它在字母表中的位置（下标从 <strong>1</strong>&nbsp;开始）。 </li>
 </ul>

 <ul>
 <li>比方说，<code>'a'</code>&nbsp;的价值为&nbsp;<code>1</code>&nbsp;，<code>'b'</code>&nbsp;的价值为&nbsp;<code>2</code>&nbsp;，以此类推，<code>'z'</code>&nbsp;的价值为&nbsp;<code>26</code>&nbsp;。</li>
 </ul>
 </li>
 <li>否则，如果这个字符在 <code>chars</code>&nbsp;中的位置为 <code>i</code>&nbsp;，那么它的价值就是&nbsp;<code>vals[i]</code>&nbsp;。</li>

 <p>请你返回字符串 <code>s</code>&nbsp;的所有子字符串中的最大开销。</p>

 <p><strong>示例 1：</strong></p>
 <pre><b>输入：</b>s = "adaa", chars = "d", vals = [-1000]
 <b>输出：</b>2
 <b>解释：</b>字符 "a" 和 "d" 的价值分别为 1 和 -1000 。
 最大开销子字符串是 "aa" ，它的开销为 1 + 1 = 2 。
 2 是最大开销。
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre><b>输入：</b>s = "abc", chars = "abc", vals = [-1,-1,-1]
 <b>输出：</b>0
 <b>解释：</b>字符 "a" ，"b" 和 "c" 的价值分别为 -1 ，-1 和 -1 。
 最大开销子字符串是 "" ，它的开销为 0 。
 0 是最大开销。
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= s.length &lt;= 10<sup>5</sup></code></li>
 <li><code>s</code>&nbsp;只包含小写英文字母。</li>
 <li><code>1 &lt;= chars.length &lt;= 26</code></li>
 <li><code>chars</code>&nbsp;只包含小写英文字母，且 <strong>互不相同</strong>&nbsp;。</li>
 <li><code>vals.length == chars.length</code></li>
 <li><code>-1000 &lt;= vals[i] &lt;= 1000</code></li>
 </ul>
 */
public class FindTheSubstringWithMaximumCost {
    public int maximumCostSubstring(String s, String chars, int[] vals) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < 26; i++) map.put((char) ('a' + i), i + 1);
        for (int i = 0; i < chars.length(); i++) map.put(chars.charAt(i), vals[i]);

        int n = s.length();
        int[] dp = new int[n];
        char[] sc = s.toCharArray();
        dp[0] = Math.max(0, map.get(sc[0]));
        int res = dp[0];

        for (int i = 1; i < n; i++) {
            dp[i] = Math.max(dp[i - 1], 0) + map.get(sc[i]);
            res = Math.max(res, dp[i]);
        }
        return res;
    }
}
