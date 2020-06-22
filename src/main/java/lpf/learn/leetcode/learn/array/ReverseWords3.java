package lpf.learn.leetcode.learn.array;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
 *
 * 示例 1:
 * 输入: "Let's take LeetCode contest"
 * 输出: "s'teL ekat edoCteeL tsetnoc"
 * 注意：在字符串中，每个单词由单个空格分隔，并且字符串中不会有任何额外的空格。
 */
public class ReverseWords3 {

    public String reverseWords(String s) {
        String[] array = s.split(" ");

        List<String> list = new ArrayList<>(array.length);

        for (String s1 : array) {
            list.add(reverseString(s1));
        }

        return String.join(" ", list);
    }

    public String reverseString(String value) {

        char[] s = value.toCharArray();
        if (s.length == 0) {
            return "";
        }

        int i = 0, j = s.length - 1;
        while (i < j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;

            i++;
            j--;
        }
        return new String(s);
    }


}
