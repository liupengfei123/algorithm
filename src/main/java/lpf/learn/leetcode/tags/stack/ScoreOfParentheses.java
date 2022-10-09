package lpf.learn.leetcode.tags.stack;

import java.util.Stack;

/** 856 括号的分数
 <p>给定一个平衡括号字符串&nbsp;<code>S</code>，按下述规则计算该字符串的分数：</p>
 <ul>
 <li><code>()</code> 得 1 分。</li>
 <li><code>AB</code> 得&nbsp;<code>A + B</code>&nbsp;分，其中 A 和 B 是平衡括号字符串。</li>
 <li><code>(A)</code> 得&nbsp;<code>2 * A</code>&nbsp;分，其中 A 是平衡括号字符串。</li>
 </ul>

 <p><strong>示例 1：</strong></p>
 <pre><strong>输入： </strong>&quot;()&quot;
 <strong>输出： </strong>1
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre><strong>输入： </strong>&quot;(())&quot;
 <strong>输出： </strong>2
 </pre>

 <p><strong>示例&nbsp;3：</strong></p>
 <pre><strong>输入： </strong>&quot;()()&quot;
 <strong>输出： </strong>2
 </pre>

 <p><strong>示例&nbsp;4：</strong></p>
 <pre><strong>输入： </strong>&quot;(()(()))&quot;
 <strong>输出： </strong>6
 </pre>

 <p><strong>提示：</strong></p>
 <ol>
 <li><code>S</code>&nbsp;是平衡括号字符串，且只含有&nbsp;<code>(</code>&nbsp;和&nbsp;<code>)</code>&nbsp;。</li>
 <li><code>2 &lt;= S.length &lt;= 50</code></li>
 </ol>
 */
public class ScoreOfParentheses {
    public int scoreOfParentheses(String S) {
        Stack<Character> stack = new Stack<>();
        Stack<Integer> valueStack = new Stack<>();
        char vC = 'V';

        for (char c : S.toCharArray()) {
            if (c == '(') {
                stack.push('(');
                continue;
            }

            int value = 0;
            while (!stack.isEmpty() && stack.peek() == vC) {
                stack.pop();
                value += valueStack.pop();
            }
            stack.pop();
            stack.push(vC);
            valueStack.push(value == 0 ? 1 : 2 * value);
        }

        int result = 0;
        while (!valueStack.isEmpty()) {
            result += valueStack.pop();
        }
        return result;
    }
}
