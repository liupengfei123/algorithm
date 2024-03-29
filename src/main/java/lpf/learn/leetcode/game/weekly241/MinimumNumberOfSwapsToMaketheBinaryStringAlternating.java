package lpf.learn.leetcode.game.weekly241;

/** 5760. 构成交替字符串需要的最小交换次数
 * 给你一个二进制字符串 s ，现需要将其转化为一个 交替字符串 。请你计算并返回转化所需的 最小 字符交换次数，如果无法完成转化，返回 -1 。
 * 交替字符串 是指：相邻字符之间不存在相等情况的字符串。例如，字符串 "010" 和 "1010" 属于交替字符串，但 "0100" 不是。
 * 任意两个字符都可以进行交换，不必相邻 。
 *
 * 示例 1：
 * 输入：s = "111000"
 * 输出：1
 * 解释：交换位置 1 和 4："111000" -> "101010" ，字符串变为交替字符串。
 *
 * 示例 2：
 * 输入：s = "010"
 * 输出：0
 * 解释：字符串已经是交替字符串了，不需要交换。
 *
 * 示例 3：
 * 输入：s = "1110"
 * 输出：-1
 *
 * 提示：
 * 1 <= s.length <= 1000
 * s[i] 的值为 '0' 或 '1'
 *
 * @author liupf
 * @date 2021-05-16 10:43
 */
public class MinimumNumberOfSwapsToMaketheBinaryStringAlternating {
    public int minSwaps(String s) {
        int value1 = help(s.toCharArray(), '0');
        int value2 = help(s.toCharArray(), '1');
        if (value1 == -1 || value2 == -1) {
            return Math.max(value1, value2);
        } else {
            return Math.min(value1, value2);
        }
    }

    private int help(char[] chars, char c) {
        boolean swich = true;
        int count1 = 0;
        int count2 = 0;
        for (char aChar : chars) {
            if (swich) {
                if (aChar != c) {
                    count1++;
                }
            } else {
                if (aChar == c) {
                    count2++;
                }
            }
            swich = !swich;
        }
        return count1 == count2 ? count1 : -1;
    }

}
