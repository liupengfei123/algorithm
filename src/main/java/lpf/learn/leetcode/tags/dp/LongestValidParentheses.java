package lpf.learn.leetcode.tags.dp;

import java.util.Stack;

/** [32]最长有效括号
 *  给你一个只包含 '(' 和 ')' 的字符串，找出最长有效（格式正确且连续）括号子串的长度。
 *
 * 示例 1：
 * 输入：s = "(()"
 * 输出：2
 * 解释：最长有效括号子串是 "()"
 *
 * 示例 2：
 * 输入：s = ")()())"
 * 输出：4
 * 解释：最长有效括号子串是 "()()"
 *
 * 示例 3：
 * 输入：s = ""
 * 输出：0
 *
 * 提示：
 * 0 <= s.length <= 3 * 104
 * s[i] 为 '(' 或 ')'
 */
public class LongestValidParentheses {

    public int longestValidParentheses(String s) {
        char[] chars = s.toCharArray();
        int length = s.length();
        int[] dp = new int[length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') {
                stack.push(i);
            } else {
                if (!stack.isEmpty()) {
                    Integer index = stack.pop();
                    dp[index] = i - index + 1;
                }
            }
        }

        int result = 0;
        int tempValue = 0;
        for (int i = 0; i < dp.length;) {
            if (dp[i] != 0) {
                tempValue += dp[i];
                i += dp[i];
            } else {
                result = Math.max(result, tempValue);
                tempValue = 0;
                i++;
            }
        }
        result = Math.max(result, tempValue);
        return result;
    }

}
