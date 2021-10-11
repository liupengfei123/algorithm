package lpf.learn.leetcode.tags.number;

import java.util.Arrays;

/** [273]整数转换英文表示
 * 将非负整数 num 转换为其对应的英文表示。
 *
 * 示例 1：
 * 输入：num = 123
 * 输出："One Hundred Twenty Three"
 *
 * 示例 2：
 * 输入：num = 12345
 * 输出："Twelve Thousand Three Hundred Forty Five"
 *
 * 示例 3：
 * 输入：num = 1234567
 * 输出："One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven"
 *
 * 示例 4：
 * 输入：num = 1234567891
 * 输出："One Billion Two Hundred Thirty Four Million Five Hundred Sixty Seven Thous
 * and Eight Hundred Ninety One"
 *
 * 提示：
 * 0 <= num <= 2^31 - 1
 */
public class IntegerToEnglishWords {
    private String[] singlesAndTeens = {"", "One ", "Two ", "Three ", "Four ", "Five ", "Six ", "Seven ", "Eight ", "Nine ",
            "Ten ", "Eleven ", "Twelve ", "Thirteen ", "Fourteen ", "Fifteen ", "Sixteen ", "Seventeen ", "Eighteen ", "Nineteen ", "Twenty "};
    private String[] tens = {"", "Ten ", "Twenty ", "Thirty ", "Forty ", "Fifty ", "Sixty ", "Seventy ", "Eighty ", "Ninety "};
    private String[] thousands = {"", "Thousand ", "Million ", "Billion "};


    public String numberToWords(int num) {
        if (num == 0) {
            return "Zero";
        }
        String[] strings = new String[4];
        Arrays.fill(strings, "");
        int count = 0;
        while (num > 0) {
            strings[3 - count] = help(num % 1000);

            if (strings[3 - count].length() > 0) {
                strings[3 - count] += thousands[count];
            }

            num = num / 1000;
            count++;
        }
        return String.join("", strings).trim();
    }

    private String help(int value) {
        StringBuilder sb = new StringBuilder();

        int hundred = value / 100;
        value = value % 100;
        if (hundred > 0) {
            sb.append(singlesAndTeens[hundred]).append("Hundred ");
        }

        if (value <= 20) {
            sb.append(singlesAndTeens[value]);
        } else {
            sb.append(tens[value / 10]);
            sb.append(singlesAndTeens[value % 10]);
        }
        return sb.toString();
    }
}
