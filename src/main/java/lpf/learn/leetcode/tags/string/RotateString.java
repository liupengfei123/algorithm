package lpf.learn.leetcode.tags.string;

/** [796]旋转字符串
 * 给定两个字符串, s 和 goal。如果在若干次旋转操作之后，s 能变成 goal ，那么返回 true 。
 * s 的 旋转操作 就是将 s 最左边的字符移动到最右边。
 * 例如, 若 s = 'abcde'，在旋转一次之后结果就是'bcdea' 。
 *
 * 示例 1:
 * 输入: s = "abcde", goal = "cdeab"
 * 输出: true
 *
 * 示例 2:
 * 输入: s = "abcde", goal = "abced"
 * 输出: false
 *
 * 提示:
 * 1 <= s.length, goal.length <= 100
 * s 和 goal 由小写英文字母组成
 */
public class RotateString {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        int length = s.length();
        for (int i = 0; i < length; i++) {
            if (help(s, goal, i)) {
                return true;
            }
        }
        return false;
    }

    private boolean help(String s, String goal, int index) {
        int length = goal.length();

        for (int j = 0; j < length; j++) {
            if (s.charAt(index) != goal.charAt(j)) {
                return false;
            }
            index = ++index % length;
        }
        return true;
    }


}
