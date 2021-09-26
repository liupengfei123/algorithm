package lpf.learn.leetcode.tags.twopoint;

/** [392]判断子序列
 * 给定字符串 s 和 t ，判断 s 是否为 t 的子序列。
 * 字符串的一个子序列是原始字符串删除一些（也可以不删除）字符而不改变剩余字符相对位置形成的新字符串。（例如，"ace"是"abcde"的一个子序列，而"aec"不是）。
 *
 * 示例 1：
 * 输入：s = "abc", t = "ahbgdc"
 * 输出：true
 *
 * 示例 2：
 * 输入：s = "axc", t = "ahbgdc"
 * 输出：false
 *
 * 提示：
 * 0 <= s.length <= 100
 * 0 <= t.length <= 10^4
 * 两个字符串都只由小写字符组成。
 */
public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int si = 0;

        for (char aChar : t.toCharArray()) {
            if (si == s.length()) {
                break;
            }
            if (s.charAt(si) == aChar) {
                si++;
            }
        }
        return si == s.length();
    }
}
