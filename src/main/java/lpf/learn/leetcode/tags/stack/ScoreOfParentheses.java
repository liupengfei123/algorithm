package lpf.learn.leetcode.tags.stack;

import java.util.Stack;

/** [856]括号的分数
 * 给定一个平衡括号字符串 S，按下述规则计算该字符串的分数：
 * () 得 1 分。
 * AB 得 A + B 分，其中 A 和 B 是平衡括号字符串。
 * (A) 得 2 * A 分，其中 A 是平衡括号字符串。
 *
 * 示例 1：
 * 输入： "()"
 * 输出： 1
 *
 * 示例 2：
 * 输入： "(())"
 * 输出： 2
 *
 * 示例 3：
 * 输入： "()()"
 * 输出： 2
 *
 * 示例 4：
 * 输入： "(()(()))"
 * 输出： 6
 *
 * 提示：
 * S 是平衡括号字符串，且只含有 ( 和 ) 。
 * 2 <= S.length <= 50
 */
public class ScoreOfParentheses {
    public int scoreOfParentheses(String S) {
        Stack<Character> stack = new Stack<>();
        Stack<Integer> valueStack = new Stack<>();

        for (char c : S.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else {
                int value = 0;
                while (!stack.isEmpty() && stack.peek() == 'v') {
                    stack.pop();
                    value += valueStack.pop();
                }
                stack.pop();
                stack.push('v');
                value = value == 0 ? 1 : value * 2;
                valueStack.push(value);
            }
        }
        int result = 0;
        while (!valueStack.isEmpty()) {
            result += valueStack.pop();
        }
        return result;
    }
}
