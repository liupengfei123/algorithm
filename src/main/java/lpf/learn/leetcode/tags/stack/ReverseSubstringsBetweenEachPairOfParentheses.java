package lpf.learn.leetcode.tags.stack;

import java.util.Stack;

/** [1190]反转每对括号间的子串
 * 给出一个字符串 s（仅含有小写英文字母和括号）。
 * 请你按照从括号内到外的顺序，逐层反转每对匹配括号中的字符串，并返回最终的结果。
 * 注意，您的结果中 不应 包含任何括号。
 *
 * 示例 1：
 * 输入：s = "(abcd)"
 * 输出："dcba"
 *
 * 示例 2：
 * 输入：s = "(u(love)i)"
 * 输出："iloveu"
 *
 * 示例 3：
 * 输入：s = "(ed(et(oc))el)"
 * 输出："leetcode"
 *
 * 示例 4：
 * 输入：s = "a(bcdefghijkl(mno)p)q"
 * 输出："apmnolkjihgfedcbq"
 * 提示：
 *
 * 0 <= s.length <= 2000
 * s 中只有小写英文字母和括号
 * 我们确保所有括号都是成对出现的
 */
public class ReverseSubstringsBetweenEachPairOfParentheses {
    public String reverseParentheses(String s) {
        if (s == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder(s);
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '(') {
                stack.push(i);
            } else if (sb.charAt(i) == ')') {
                int lastIndex = stack.pop();
                for (int start = lastIndex, end = i; start <= end; start++, end--) {
                    char cStart = sb.charAt(start);
                    char cEnd = sb.charAt(end);
                    sb.setCharAt(start, cEnd);
                    sb.setCharAt(end, cStart);
                }
                sb.deleteCharAt(i);
                sb.deleteCharAt(lastIndex);
                i -= 2;
            }
        }
        return sb.toString();
    }
}
