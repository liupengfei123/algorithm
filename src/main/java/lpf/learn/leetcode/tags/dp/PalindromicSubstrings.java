package lpf.learn.leetcode.tags.dp;

/** [647]回文子串
 *  给定一个字符串，你的任务是计算这个字符串中有多少个回文子串。
 *  具有不同开始位置或结束位置的子串，即使是由相同的字符组成，也会被视作不同的子串。
 *
 *  示例 1：
 *  输入："abc"
 *  输出：3
 *  解释：三个回文子串: "a", "b", "c"
 *
 *  示例 2：
 *  输入："aaa"
 *  输出：6
 *  解释：6个回文子串: "a", "a", "a", "aa", "aa", "aaa"
 *
 *  提示：
 *  输入的字符串长度不会超过 1000 。
 * @author liupf
 * @date 2021-03-27 13:59
 */
public class PalindromicSubstrings {

    public int countSubstrings(String s) {
        int length = s.length();
        boolean[] dp = new boolean[length];
        int result = 0;
        for (int i = 0; i < length; i++) {
            dp[i] = true;
            result++;

            for (int j = 0; j <= i - 2; j++) {
                if (dp[j] = dp[j + 1] && s.charAt(i) == s.charAt(j)) {
                    result++;
                }
            }
            if (i > 0) {
                if (dp[i - 1] = s.charAt(i) == s.charAt(i - 1)) {
                    result++;
                }
            }
        }
        return result;
    }
}
