package lpf.learn.leetcode.tags.twopoint;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/** 1048 最长字符串链
 <p>给出一个单词数组&nbsp;<code>words</code>&nbsp;，其中每个单词都由小写英文字母组成。</p>
 <p>如果我们可以&nbsp;<strong>不改变其他字符的顺序&nbsp;</strong>，在 <code>word<sub>A</sub></code>&nbsp;的任何地方添加 <strong>恰好一个</strong> 字母使其变成&nbsp;<code>word<sub>B</sub></code>&nbsp;，那么我们认为&nbsp;<code>word<sub>A</sub></code>&nbsp;是&nbsp;<code>word<sub>B</sub></code>&nbsp;的 <strong>前身</strong> 。</p>
 <ul>
 <li>例如，<code>"abc"</code>&nbsp;是&nbsp;<code>"abac"</code>&nbsp;的 <strong>前身</strong>&nbsp;，而&nbsp;<code>"cba"</code>&nbsp;不是&nbsp;<code>"bcad"</code>&nbsp;的 <strong>前身</strong></li>
 </ul>
 <p><strong>词链</strong>是单词&nbsp;<code>[word_1, word_2, ..., word_k]</code>&nbsp;组成的序列，<code>k &gt;= 1</code>，其中&nbsp;<code>word<sub>1</sub></code>&nbsp;是&nbsp;<code>word<sub>2</sub></code>&nbsp;的前身，<code>word<sub>2</sub></code>&nbsp;是&nbsp;<code>word<sub>3</sub></code>&nbsp;的前身，依此类推。一个单词通常是 <code>k == 1</code> 的 <strong>单词链</strong>&nbsp;。</p>
 <p>从给定单词列表 <code>words</code> 中选择单词组成词链，返回 词链的&nbsp;<strong>最长可能长度</strong> 。<br />
 &nbsp;</p>
 <p><strong>示例 1：</strong></p>
 <pre>
 <strong>输入：</strong>words = ["a","b","ba","bca","bda","bdca"]
 <strong>输出：</strong>4
 <strong>解释：</strong>最长单词链之一为 ["a","<u>b</u>a","b<u>d</u>a","bd<u>c</u>a"]
 </pre>

 <p><strong>示例 2:</strong></p>
 <pre>
 <b>输入：</b>words = ["xbc","pcxbcf","xb","cxbc","pcxbc"]
 <b>输出：</b>5
 <b>解释：</b>所有的单词都可以放入单词链 ["xb", "xb<u>c</u>", "<u>c</u>xbc", "<u>p</u>cxbc", "pcxbc<u>f</u>"].
 </pre>

 <p><strong>示例&nbsp;3:</strong></p>
 <pre>
 <b>输入：</b>words = ["abcd","dbqca"]
 <strong>输出：</strong>1
 <b>解释：</b>字链["abcd"]是最长的字链之一。
 ["abcd"，"dbqca"]不是一个有效的单词链，因为字母的顺序被改变了。
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= words.length &lt;= 1000</code></li>
 <li><code>1 &lt;= words[i].length &lt;= 16</code></li>
 <li><code>words[i]</code>&nbsp;仅由小写英文字母组成。</li>
 </ul>
 */
public class LongestStringChain {

    public int longestStrChain(String[] words) {
        Map<String, Integer>[] maps = new Map[17];
        for (int i = 1; i < 17; i++) maps[i] = new HashMap<>();

        for (String word : words) maps[word.length()].put(word, 1);

        int res = 1;
        for (int i = 2; i < 17; i++) {
            for (Map.Entry<String, Integer> b : maps[i].entrySet()) {
                for (Map.Entry<String, Integer> a : maps[i - 1].entrySet()) {
                    if (isStrChain(a.getKey(), b.getKey())) {

                        int max = Math.max(a.getValue() + 1, b.getValue());
                        b.setValue(max);
                        res = Math.max(max, res);
                    }
                }
            }
        }
        return res;
    }

    public int longestStrChain2(String[] words) {
        Arrays.sort(words, Comparator.comparing(String::length));

        int n = words.length;
        int[] dp = new int[n];
        Arrays.fill(dp , 1);

        int res = 1;
        for (int i = 1; i < n; i++) {

            for (int j = i - 1; j >= 0; j--) {
                if (words[i].length() - words[j].length() > 1) break;

                if (isStrChain(words[j], words[i])) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                    res = Math.max(dp[i], res);
                }
            }
        }
        return res;
    }

    private boolean isStrChain(String a, String b) {
        if (b.length() - a.length() != 1) return false;

        int ai = 0, bi = 0;
        int count = 0;
        while (ai < a.length() && bi < b.length()) {
            if (count > 1) return false;

            if (a.charAt(ai) != b.charAt(bi)) count++;
            else ai++;

            bi++;
        }
        return count <= 1;
    }
}
