package lpf.learn.leetcode.tags.dp;

import java.util.Arrays;
import java.util.Comparator;

/** [1048]最长字符串链
 * 给出一个单词列表，其中每个单词都由小写英文字母组成。
 * 如果我们可以在 word1 的任何地方添加一个字母使其变成 word2，那么我们认为 word1 是 word2 的前身。例如，"abc" 是 "abac" 的前身。
 * 词链是单词 [word_1, word_2, ..., word_k] 组成的序列，k >= 1，其中 word_1 是 word_2 的前身，word_2 是 word_3 的前身，依此类推。
 * 从给定单词列表 words 中选择单词组成词链，返回词链的最长可能长度。
 *
 * 示例：
 * 输入：["a","b","ba","bca","bda","bdca"]
 * 输出：4
 * 解释：最长单词链之一为 "a","ba","bda","bdca"。
 *
 * 提示：
 * 1 <= words.length <= 1000
 * 1 <= words[i].length <= 16
 * words[i] 仅由小写英文字母组成。
 */
public class LongestStringChain {
    public int longestStrChain(String[] words) {
        int length = words.length;
        Arrays.sort(words, Comparator.comparing(String::length));
        int[] dp = new int[length];
        Arrays.fill(dp, 1);
        int result = 0;
        for (int i = 1; i < length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (words[i].length() - words[j].length() > 1) {
                    break;
                }
                if (check(words[j], words[i])) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            result = Math.max(result, dp[i]);
        }
        return result;
    }


    private boolean check(String str1, String str2) {
        if (str2.length() - str1.length() != 1) {
            return false;
        }
        int count = 0;
        for (int i = 0, j = 0; i < str1.length() && j < str2.length(); i++, j++) {
            if (str1.charAt(i) != str2.charAt(j)) {
                i--;
                count++;
            }
            if (count > 1) {
                return false;
            }
        }
        return true;
    }

}
