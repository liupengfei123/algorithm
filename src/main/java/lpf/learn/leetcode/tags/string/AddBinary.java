package lpf.learn.leetcode.tags.string;

/** [67]二进制求和
 *  给你两个二进制字符串，返回它们的和（用二进制表示）。
 *  输入为 非空 字符串且只包含数字 1 和 0。
 *
 *  示例 1:
 *  输入: a = "11", b = "1"
 *  输出: "100"
 *
 *  示例 2:
 *  输入: a = "1010", b = "1011"
 *  输出: "10101"
 *
 *  提示：
 *  每个字符串仅由字符 '0' 或 '1' 组成。
 *  1 <= a.length, b.length <= 10^4
 *  字符串如果不是 "0" ，就都不含前导零。
 *
 * @author liupf
 * @date 2021-04-10 19:50
 */
public class AddBinary {
    public String addBinary(String a, String b) {
        int ai = a.length() - 1, bi = b.length() - 1;
        char[] value = new char[Math.max(a.length(), b.length()) + 1];
        int vi = value.length - 1;

        int temp = 0;
        while (ai >= 0 && bi >= 0) {
            int sum = a.charAt(ai--) - '0' + b.charAt(bi--) - '0' + temp;

            value[vi--] = (char) (sum % 2 + '0');
            temp = sum / 2;
        }
        while (ai >= 0) {
            int sum = a.charAt(ai--) - '0' + temp;

            value[vi--] = (char) (sum % 2 + '0');
            temp = sum / 2;
        }
        while (bi >= 0) {
            int sum = b.charAt(bi--) - '0' + temp;

            value[vi--] = (char) (sum % 2 + '0');
            temp = sum / 2;
        }
        if (temp != 0) {
            value[vi--] = (char) (temp + '0');
        }
        return new String(value, vi + 1, value.length - vi - 1);
    }

}
