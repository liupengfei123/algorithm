package lpf.learn.leetcode.tags.twopoint;

/** [424]替换后的最长重复字符
 * 给你一个仅由大写英文字母组成的字符串，你可以将任意位置上的字符替换成另外的字符，总共可最多替换 k 次。在执行上述操作后，找到包含重复字母的最长子串的长度。
 * 注意: 字符串长度 和 k 不会超过 104。
 *
 * 示例 1:
 * 输入: s = "ABAB", k = 2
 * 输出: 4
 * 解释:用两个'A'替换为两个'B',反之亦然。
 *
 * 示例 2:
 * 输入: s = "AABABBA", k = 1
 * 输出: 4
 * 解释: 将中间的一个'A'替换为'B',字符串变为 "AABBBBA"。子串 "BBBB" 有最长重复字母, 答案为 4。
 */
public class LongestRepeatingCharacterReplacement {

    public int characterReplacement(String s, int k) {
        int result = -1, charMax = 0;
        int[] array = new int[26];
        char[] chars = s.toCharArray();

        for (int left = 0, right = 0; right < s.length(); right++) {
            int index = chars[right] - 'A';
            array[index]++;
            // 历史内窗口中数量最多的字符个数
            charMax = Math.max(charMax, array[index]);
            // 当条件成立说明无法替换成功，或者没有超过 result 的值
            while (right - left + 1 > charMax + k) {
                array[chars[left++] - 'A']--;
            }
            result = Math.max(result, right - left);
        }
        return result + 1;
    }


}
