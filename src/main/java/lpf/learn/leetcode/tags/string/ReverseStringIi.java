package lpf.learn.leetcode.tags.string;

/** [541]反转字符串 II
 * 给定一个字符串 s 和一个整数 k，从字符串开头算起，每 2k 个字符反转前 k 个字符。
 * 如果剩余字符少于 k 个，则将剩余字符全部反转。
 * 如果剩余字符小于 2k 但大于或等于 k 个，则反转前 k 个字符，其余字符保持原样。
 *
 * 示例 1：
 * 输入：s = "abcdefg", k = 2
 * 输出："bacdfeg"
 *
 * 示例 2：
 * 输入：s = "abcd", k = 2
 * 输出："bacd"
 *
 * 提示：
 * 1 <= s.length <= 10^4
 * s 仅由小写英文组成
 * 1 <= k <= 10^4
 */
public class ReverseStringIi {
    public String reverseStr(String s, int k) {
        int length = s.length();
        char[] chars = new char[length];
        System.arraycopy(s.toCharArray(), 0, chars, 0, length);

        for (int i = 0; i < length; i = i + 2 * k) {
           reverse(s, chars, i, k);
        }
        return new String(chars);
    }

    private int reverse(String s, char[] chars, int index, int k) {
        int left = index, right = Math.min(index + k - 1, s.length() - 1);

        while (right >= index) {
            chars[left++] = s.charAt(right--);
        }
        return left;
    }

}
