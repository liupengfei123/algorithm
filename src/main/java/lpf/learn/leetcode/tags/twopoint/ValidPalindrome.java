package lpf.learn.leetcode.tags.twopoint;

/** [125]验证回文串
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 * 说明：本题中，我们将空字符串定义为有效的回文串。
 *
 * 示例 1:
 * 输入: "A man, a plan, a canal: Panama"
 * 输出: true
 *
 * 示例 2:
 * 输入: "race a car"
 * 输出: false
 */
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        char[] chars = s.toCharArray();
        int left = 0, right = chars.length - 1;

        while (left <= right) {
            if (ignoreChar(chars[left])) {
                left++;
                continue;
            }
            if (ignoreChar(chars[right])) {
                right--;
                continue;
            }
            if (Character.toLowerCase(chars[left]) != Character.toLowerCase(chars[right])) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    private boolean ignoreChar(char c) {
        return !(('0' <= c && c <= '9') || ('A' <= c && c <= 'Z')|| ('a' <= c && c <= 'z'));
    }
}
