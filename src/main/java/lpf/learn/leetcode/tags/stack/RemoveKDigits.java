package lpf.learn.leetcode.tags.stack;

import java.util.ArrayDeque;
import java.util.Deque;

/** [402]移掉 K 位数字
 <p>给你一个以字符串表示的非负整数&nbsp;<code>num</code> 和一个整数 <code>k</code> ，移除这个数中的 <code>k</code><em> </em>位数字，使得剩下的数字最小。请你以字符串形式返回这个最小的数字。</p> &nbsp;

 <p><strong>示例 1 ：</strong></p>
 <pre>
 <strong>输入：</strong>num = "1432219", k = 3
 <strong>输出：</strong>"1219"
 <strong>解释：</strong>移除掉三个数字 4, 3, 和 2 形成一个新的最小的数字 1219 。
 </pre>

 <p><strong>示例 2 ：</strong></p>
 <pre>
 <strong>输入：</strong>num = "10200", k = 1
 <strong>输出：</strong>"200"
 <strong>解释：</strong>移掉首位的 1 剩下的数字为 200. 注意输出不能有任何前导零。
 </pre>

 <p><strong>示例 3 ：</strong></p>
 <pre>
 <strong>输入：</strong>num = "10", k = 2
 <strong>输出：</strong>"0"
 <strong>解释：</strong>从原数字移除所有的数字，剩余为空就是 0 。
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= k &lt;= num.length &lt;= 10<sup>5</sup></code></li>
 <li><code>num</code> 仅由若干位数字（0 - 9）组成</li>
 <li>除了 <strong>0</strong> 本身之外，<code>num</code> 不含任何前导零</li>
 </ul>
 */
public class RemoveKDigits {
    public String removeKdigits(String num, int k) {
        if (k >= num.length()) return "0";

        char[] chars = num.toCharArray();
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : chars) {
            while (k > 0 && !stack.isEmpty() && stack.peek() > c ) {
                k--;
                stack.pop();
            }
            stack.push(c);
        }
        while (!stack.isEmpty() && k > 0) {
            stack.pop();
            k--;
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) sb.append(stack.removeLast());
        while (sb.length() > 0 && sb.charAt(0) == '0') sb.deleteCharAt(0);

        return sb.length() > 0 ? sb.toString() : "0";
    }
}
