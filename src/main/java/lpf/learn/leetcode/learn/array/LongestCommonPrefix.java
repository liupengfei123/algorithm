package lpf.learn.leetcode.learn.array;

/** [14]最长公共前缀
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * 如果不存在公共前缀，返回空字符串 ""。
 *
 * 示例 1:
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 *
 * 示例 2:
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 *
 * 说明:
 * 所有输入只包含小写字母 a-z 。
 */
public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String first = strs[0];
        String result = "";

        out:
        for (int i = 0; i <= first.length(); i++) {
            String temp = first.substring(0, i);
            for (String str : strs) {
                if (!str.startsWith(temp)) {
                    break out;
                }
            }
            result = temp;
        }
        return result;
    }
}
