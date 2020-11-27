package lpf.learn.leetcode.tags.twopoint;

/** [345]反转字符串中的元音字母
 * 编写一个函数，以字符串作为输入，反转该字符串中的元音字母。
 *
 * 示例 1：
 * 输入："hello"
 * 输出："holle"
 *
 * 示例 2：
 * 输入："leetcode"
 * 输出："leotcede"
 *
 * 提示：
 * 元音字母不包含字母 "y" 。
 */
public class ReverseVowelsOfAString {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int left = 0, right = chars.length - 1;

        while (left < right) {
            if (isYuanYin(chars[left])) {
                left++;
                continue;
            }
            if (isYuanYin(chars[right])) {
                right--;
                continue;
            }
            chars[left] = (char) (chars[left] ^ chars[right]);
            chars[right] = (char) (chars[left] ^ chars[right]);
            chars[left] = (char) (chars[left] ^ chars[right]);
            left++;
            right--;
        }
        return String.valueOf(chars);
    }


    private boolean isYuanYin(char c) {
        switch(c) {
            case 'a' :
            case 'e' :
            case 'i' :
            case 'o' :
            case 'u' :
            case 'A' :
            case 'E' :
            case 'I' :
            case 'O' :
            case 'U' :
                return false;
            default:
                return true;
        }
    }
}
