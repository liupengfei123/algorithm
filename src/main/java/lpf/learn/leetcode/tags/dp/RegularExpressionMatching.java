package lpf.learn.leetcode.tags.dp;

import java.util.ArrayList;
import java.util.List;

/** [10]正则表达式匹配
 * 给你一个字符串 s 和一个字符规律 p，请你来实现一个支持 '.' 和 '*' 的正则表达式匹配。
 * '.' 匹配任意单个字符
 * '*' 匹配零个或多个前面的那一个元素
 * 所谓匹配，是要涵盖 整个 字符串 s的，而不是部分字符串。
 *
 * 示例 1：
 * 输入：s = "aa" p = "a"
 * 输出：false
 * 解释："a" 无法匹配 "aa" 整个字符串。
 *
 * 示例 2:
 * 输入：s = "aa" p = "a*"
 * 输出：true
 * 解释：因为 '*' 代表可以匹配零个或多个前面的那一个元素, 在这里前面的元素就是 'a'。因此，字符串 "aa" 可被视为 'a' 重复了一次。
 *
 * 示例 3：
 * 输入：s = "ab" p = ".*"
 * 输出：true
 * 解释：".*" 表示可匹配零个或多个（'*'）任意字符（'.'）。
 *
 * 示例 4：
 * 输入：s = "aab" p = "c*a*b"
 * 输出：true
 * 解释：因为 '*' 表示零个或多个，这里 'c' 为 0 个, 'a' 被重复一次。因此可以匹配字符串 "aab"。
 *
 * 示例 5：
 * 输入：s = "mississippi" p = "mis*is*p*."
 * 输出：false
 *
 * 提示：
 * 0 <= s.length <= 20
 * 0 <= p.length <= 30
 * s 可能为空，且只包含从 a-z 的小写字母。
 * p 可能为空，且只包含从 a-z 的小写字母，以及字符 . 和 *。
 * 保证每次出现字符 * 时，前面都匹配到有效的字符
 */
public class RegularExpressionMatching {


    public boolean isMatch(String s, String p) {
        int m = s.length();
        int n = p.length();

        boolean[][] f = new boolean[m + 1][n + 1];
        f[0][0] = true;
        for (int i = 0; i <= m; ++i) {
            for (int j = 1; j <= n; ++j) {
                if (p.charAt(j - 1) == '*') {
                    f[i][j] = f[i][j - 2];
                    if (matches(s, p, i, j - 1)) {
                        f[i][j] = f[i][j] || f[i - 1][j];
                    }
                } else {
                    if (matches(s, p, i, j)) {
                        f[i][j] = f[i - 1][j - 1];
                    }
                }
            }
        }
        return f[m][n];
    }

    public boolean matches(String s, String p, int i, int j) {
        if (i == 0) {
            return false;
        }
        if (p.charAt(j - 1) == '.') {
            return true;
        }
        return s.charAt(i - 1) == p.charAt(j - 1);
    }



    public boolean isMatch2(String s, String p) {
        int sl = s.length();
        int pl = p.length();

        List<Integer>[] dp = new ArrayList[pl + 1];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = new ArrayList();
        }
        dp[0].add(-1);

        for (int i = 0; i < pl; i++) {
            List<Integer> list = dp[i];

            for (Integer index : list) {
                int nextIndex = index + 1;
                if (charEquals(s, p, nextIndex, i)) {
                    dp[i + 1].add(nextIndex);
                    continue;
                }
                if (p.charAt(i) == '*') {
                    dp[i + 1].add(index - 1);
                    dp[i + 1].add(index);
                    while (charEquals(s, p, nextIndex, i - 1)) {
                        dp[i + 1].add(nextIndex);
                        if (++nextIndex >= sl) {
                            break;
                        }
                    }
                } else {
                    if (i + 1 < pl && p.charAt(i + 1) == '*') {
                        dp[i + 2].add(index);
                    }
                }
            }
        }

        int max = -1;
        for (Integer value : dp[pl]) {
            max = Math.max(value, max);
        }
        return max == sl - 1;
    }

    private boolean charEquals(String s, String p, int si, int pi) {
        if (si >= s.length()) {
            return false;
        }
        return (p.charAt(pi) == '.') || (p.charAt(pi) == s.charAt(si));
    }

}
