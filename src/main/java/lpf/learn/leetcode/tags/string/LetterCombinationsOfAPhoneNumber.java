package lpf.learn.leetcode.tags.string;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/** [17] 电话号码的字母组合
 * 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。答案可以按 任意顺序 返回。
 * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
 *
 * 示例 1：
 * 输入：digits = "23"
 * 输出：["ad","ae","af","bd","be","bf","cd","ce","cf"]
 *
 * 示例 2：
 * 输入：digits = ""
 * 输出：[]
 *
 * 示例 3：
 * 输入：digits = "2"
 * 输出：["a","b","c"]
 *
 * 提示：
 * 0 <= digits.length <= 4
 * digits[i] 是范围 ['2', '9'] 的一个数字。
 */
public class LetterCombinationsOfAPhoneNumber {

    private char[][] letters = new char[][]{
            {}, {},
            {'a', 'b', 'c'},
            {'d', 'e', 'f'},
            {'g', 'h', 'i'},
            {'j', 'k', 'l'},
            {'m', 'n', 'o'},
            {'p', 'q', 'r', 's'},
            {'t', 'u', 'v'},
            {'w', 'x', 'y', 'z'}};

    private int length;
    private String digits;
    private List<String> result;

    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) {
            return Collections.emptyList();
        }

        this.result = new LinkedList<>();
        this.digits = digits;
        this.length = digits.length();

        help(new StringBuilder(), 0);

        return result;
    }

    private void help(StringBuilder sb, int index) {
        if (index == length) {
            result.add(sb.toString());
            return;
        }

        int i = digits.charAt(index) - '0';

        for (char letter : letters[i]) {
            sb.append(letter);

            help(sb, index + 1);

            sb.deleteCharAt(index);
        }
    }


}
