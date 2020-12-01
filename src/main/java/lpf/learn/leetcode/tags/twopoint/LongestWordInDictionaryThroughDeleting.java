package lpf.learn.leetcode.tags.twopoint;

import java.util.List;

/** [524]通过删除字母匹配到字典里最长单词
 * 给定一个字符串和一个字符串字典，找到字典里面最长的字符串，该字符串可以通过删除给定字符串的某些字符来得到。如果答案不止一个，返回长度最长且字典顺序最小的字符
 * 串。如果答案不存在，则返回空字符串。
 *
 * 示例 1:
 * 输入: s = "abpcplea", d = ["ale","apple","monkey","plea"]
 * 输出:"apple"
 *
 * 示例 2:
 * 输入: s = "abpcplea", d = ["a","b","c"]
 * 输出: "a"
 *
 * 说明:
 * 所有输入的字符串只包含小写字母。
 * 字典的大小不会超过 1000。
 * 所有输入的字符串长度不会超过 1000。
 */
public class LongestWordInDictionaryThroughDeleting {

    public String findLongestWord(String s, List<String> d) {
        String result = "";

        for (String str : d) {
            if (isSubString(s, str)) {
                if ((result.length() < str.length()) || (result.length() == str.length() && result.compareTo(str) > 0)) {
                    result = str;
                }
            }
        }
        return result;
    }

    private boolean matchString(String source, String target) {
        int s = source.length() - 1, t = target.length() - 1;
        while (s >= t && t >= 0) {
            if (source.charAt(s--) == target.charAt(t)) {
                t--;
            }
        }
        return t == -1;
    }



    private boolean isSubString(String source, String sub) {
        int subLen = sub.length(), j = -1;
        for(int i = 0; i < subLen; i++) {
            j = source.indexOf(sub.charAt(i), j + 1);
            if(j == -1) return false;
        }
        return true;
    }
}
