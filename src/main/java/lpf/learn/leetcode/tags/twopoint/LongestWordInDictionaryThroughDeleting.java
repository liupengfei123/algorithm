package lpf.learn.leetcode.tags.twopoint;

import java.util.Collections;
import java.util.List;


/** 524 通过删除字母匹配到字典里最长单词
 <p>给你一个字符串 <code>s</code> 和一个字符串数组 <code>dictionary</code> ，找出并返回&nbsp;<code>dictionary</code> 中最长的字符串，该字符串可以通过删除 <code>s</code> 中的某些字符得到。</p>
 <p>如果答案不止一个，返回长度最长且字母序最小的字符串。如果答案不存在，则返回空字符串。</p>

 <p><strong>示例 1：</strong></p>
 <pre>
 <strong>输入：</strong>s = "abpcplea", dictionary = ["ale","apple","monkey","plea"]
 <strong>输出：</strong>"apple"
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <strong>输入：</strong>s = "abpcplea", dictionary = ["a","b","c"]
 <strong>输出：</strong>"a"
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= s.length &lt;= 1000</code></li>
 <li><code>1 &lt;= dictionary.length &lt;= 1000</code></li>
 <li><code>1 &lt;= dictionary[i].length &lt;= 1000</code></li>
 <li><code>s</code> 和 <code>dictionary[i]</code> 仅由小写英文字母组成</li>
 </ul>
 */
public class LongestWordInDictionaryThroughDeleting {

    public String findLongestWord(String s, List<String> dictionary) {
        Collections.sort(dictionary);

        String res = "";
        for (String t : dictionary) {
            if (solve(s, t) && t.length() > res.length()) {
                res = t;
            }
        }
        return res;
    }

    private boolean solve(String s, String t) {
        char[] sc = s.toCharArray(), tc = t.toCharArray();
        int n = s.length(), m = t.length();
        int i = 0, j = 0;

        while (i < n && j < m) {
            if (sc[i] == tc[j]) j++;

            i++;
        }
        return j >= m;
    }

}
