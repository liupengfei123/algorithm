package lpf.learn.leetcode.tags.array;

import java.util.Arrays;

/**899 有序队列
 <p>给定一个字符串 <code>s</code> 和一个整数 <code>k</code>&nbsp;。你可以从 <code>s</code> 的前 <code>k</code> 个字母中选择一个，并把它加到字符串的末尾。</p>
 <p>返回 <em>在应用上述步骤的任意数量的移动后，字典上最小的字符串&nbsp;</em>。</p>

 <p><strong>示例 1：</strong></p>
 <pre>
 <strong>输入：</strong>s = "cba", k = 1
 <strong>输出：</strong>"acb"
 <strong>解释：</strong>
 在第一步中，我们将第一个字符（“c”）移动到最后，获得字符串 “bac”。
 在第二步中，我们将第一个字符（“b”）移动到最后，获得最终结果 “acb”。
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <strong>输入：</strong>s = "baaca", k = 3
 <strong>输出：</strong>"aaabc"
 <strong>解释：
 </strong>在第一步中，我们将第一个字符（“b”）移动到最后，获得字符串 “aacab”。
 在第二步中，我们将第三个字符（“c”）移动到最后，获得最终结果 “aaabc”。
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= k&nbsp;&lt;= S.length&nbsp;&lt;= 1000</code></li>
 <li><code>s</code>&nbsp;只由小写字母组成。</li>
 </ul>
 */
public class OrderlyQueue {
    public String orderlyQueue(String s, int k) {
        char[] chars = s.toCharArray();
        if (k > 1) {
            Arrays.sort(chars);
            return new String(chars);
        }

        String result = s;
        for (int i = 1; i < s.length(); i++) {
            String temp = s.substring(i) + s.substring(0, i);
            if (temp.compareTo(result) < 0) {
                result = temp;
            }
        }
        return result;
    }
}
