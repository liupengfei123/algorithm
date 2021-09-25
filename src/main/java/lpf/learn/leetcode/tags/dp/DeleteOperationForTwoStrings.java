package lpf.learn.leetcode.tags.dp;

import java.util.stream.IntStream;

/** 583. 两个字符串的删除操作
 * 给定两个单词 word1 和 word2，找到使得 word1 和 word2 相同所需的最小步数，每步可以删除任意一个字符串中的一个字符。
 *
 * 示例：
 * 输入: "sea", "eat"
 * 输出: 2
 * 解释: 第一步将"sea"变为"ea"，第二步将"eat"变为"ea"
 *  
 * 提示：
 * 给定单词的长度不超过500。
 * 给定单词中的字符只含有小写字母。
 *
 * @author liupf
 * @date 2021-09-25 23:13
 */
public class DeleteOperationForTwoStrings {

    public int minDistance(String word1, String word2) {
        int m = word1.length(), n = word2.length();
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            dp[i][0] = i;
        }
        for (int j = 1; j <= n; j++) {
            dp[0][j] = j;
        }
        for (int i = 1; i <= m; i++) {
            char c1 = word1.charAt(i - 1);
            for (int j = 1; j <= n; j++) {
                char c2 = word2.charAt(j - 1);
                if (c1 == c2) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + 1;
                }
            }
        }
        return dp[m][n];
    }


    public int minDistance2(String word1, String word2) {
        int l1 = word1.length();
        int[] dp = new int[l1];

        int max;
        // 最长公共子序列
        for (char c : word2.toCharArray()) {
            max = 0;
            for (int i = 0; i < l1; i++) {
                int oldMax = Math.max(dp[i], max);
                if (word1.charAt(i) == c) {
                    dp[i] = Math.max(dp[i], max + 1);
                }
                max = oldMax;
            }
        }
        max = IntStream.of(dp).max().orElse(0);
        return l1 + word2.length() - max * 2;
    }
}
