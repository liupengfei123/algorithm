package lpf.learn.leetcode.game.weekly238;

/** 5740. 所有元音按顺序排布的最长子字符串
 * 当一个字符串满足如下条件时，我们称它是 美丽的 ：
 * 所有 5 个英文元音字母（'a' ，'e' ，'i' ，'o' ，'u'）都必须 至少 出现一次。
 * 这些元音字母的顺序都必须按照 字典序 升序排布（也就是说所有的 'a' 都在 'e' 前面，所有的 'e' 都在 'i' 前面，以此类推）
 * 比方说，字符串 "aeiou" 和 "aaaaaaeiiiioou" 都是 美丽的 ，但是 "uaeio" ，"aeoiu" 和 "aaaeeeooo" 不是美丽的 。
 * 给你一个只包含英文元音字母的字符串 word ，请你返回 word 中 最长美丽子字符串的长度 。如果不存在这样的子字符串，请返回 0 。
 * 子字符串 是字符串中一个连续的字符序列。
 *
 * 示例 1：
 * 输入：word = "aeiaaioaaaaeiiiiouuuooaauuaeiu"
 * 输出：13
 * 解释：最长子字符串是 "aaaaeiiiiouuu" ，长度为 13 。
 *
 * 示例 2：
 * 输入：word = "aeeeiiiioooauuuaeiou"
 * 输出：5
 * 解释：最长子字符串是 "aeiou" ，长度为 5 。
 *
 * 示例 3：
 * 输入：word = "a"
 * 输出：0
 * 解释：没有美丽子字符串，所以返回 0 。
 *
 * 提示：
 * 1 <= word.length <= 5 * 10^5
 * word 只包含字符 'a'，'e'，'i'，'o' 和 'u' 。
 */
public class LongestSubstringOfAllVowelsinOrder {
    public int longestBeautifulSubstring(String word) {
        int afindex = word.indexOf('a');
        if (afindex < 0) {
            return 0;
        }
        char[] zimu = new char[]{'a','e','i','o','u','z'};
        int curr = 0;
        int result = 0;
        int length = 0;

        char[] chars = word.toCharArray();
        for (int i = afindex; i < chars.length; i++) {
            if (chars[i] == zimu[curr]) {
                length++;
            } else if (chars[i] == zimu[curr + 1] && length > 0) {
                length++;
                curr++;
            } else {
                if (curr == 4) {
                    result = Math.max(length, result);
                }
                if (length > 0) {
                    i--;
                }
                length = 0;
                curr = 0;
            }
        }
        if (curr == 4) {
            result = Math.max(length, result);
        }
        return result;
    }
}
