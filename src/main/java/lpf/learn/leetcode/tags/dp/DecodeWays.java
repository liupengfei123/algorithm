package lpf.learn.leetcode.tags.dp;

import java.util.HashMap;
import java.util.Map;

/** [91]解码方法
 * 一条包含字母 A-Z 的消息通过以下映射进行了 编码 ：
 * 'A' -> 1
 * 'B' -> 2
 * ...
 * 'Z' -> 26
 * 要 解码 已编码的消息，所有数字必须基于上述映射的方法，反向映射回字母（可能有多种方法）。例如，"111" 可以将 "1" 中的每个 "1" 映射为 "A
 * " ，从而得到 "AAA" ，或者可以将 "11" 和 "1"（分别为 "K" 和 "A" ）映射为 "KA" 。注意，"06" 不能映射为 "F" ，因为 "
 * 6" 和 "06" 不同。
 *
 * 给你一个只含数字的 非空 字符串 num ，请计算并返回 解码 方法的 总数 。
 * 题目数据保证答案肯定是一个 32 位 的整数。
 *
 * 示例 1：
 * 输入：s = "12"
 * 输出：2
 * 解释：它可以解码为 "AB"（1 2）或者 "L"（12）。
 *
 * 示例 2：
 * 输入：s = "226"
 * 输出：3
 * 解释：它可以解码为 "BZ" (2 26), "VF" (22 6), 或者 "BBF" (2 2 6) 。
 *
 * 示例 3：
 * 输入：s = "0"
 * 输出：0
 * 解释：没有字符映射到以 0 开头的数字。含有 0 的有效映射是 'J' -> "10" 和 'T'-> "20" 。由于没有字符，因此没有有效的方法对此进行
 * 解码，因为所有数字都需要映射。
 *
 * 示例 4：
 * 输入：s = "06"
 * 输出：0
 * 解释："06" 不能映射到 "F" ，因为字符串开头的 0 无法指向一个有效的字符。 
 *
 * 提示：
 * 1 <= s.length <= 100
 * s 只包含数字，并且可能包含前导零。
 */
public class DecodeWays {


    public int numDecodings(String s) {
        char[] chars = s.toCharArray();
        int[] array = new int[s.length() + 1];
        array[array.length - 1] = 1;
        array[array.length - 2] = check2(chars, s.length() - 1, true);

        for (int i = s.length() - 2; i >= 0; i--) {
            array[i] = check2(chars, i, true) * array[i + 1] + check2(chars, i, false) * array[i + 2];
        }
        return array[0];
    }

    private int check2(char[] chars, int start, boolean single){
        if (chars[start] == '0') {
            return 0;
        }
        if (single) {
            return 1;
        }
        if (chars[start] > '2') {
            return 0;
        }
        if (chars[start] == '2') {
            if (chars[start + 1] <= '6') {
                return 1;
            } else {
                return 0;
            }
        }
        return 1;
    }



    /**
     * f(i, x) = f(i, i) * f(i+1, x) + f(i, i+1) * f(i+2, x)
     */
    public int numDecodings2(String s) {
        Map<Integer, Integer> map = new HashMap<>();

        return help(s.toCharArray(), 0, map);
    }


    private int help(char[] chars, int start, Map<Integer, Integer> map) {
        if (chars.length - start <= 2) {
            if (check(chars, start, true)) {
                if (chars.length - 1 == start) {
                    return 1;
                } else {
                    int result = check(chars, start, false) ? 1 : 0;
                    result += check(chars, start + 1, true) ? 1 : 0;
                    return result;
                }
            } else {
                return 0;
            }
        }
        int temp1 = 0;
        if (check(chars, start, true)) {
            if (map.containsKey(start + 1)) {
                temp1 = map.get(start + 1);
            } else {
                temp1 = help(chars, start + 1, map);
                map.put(start + 1, temp1);
            }
        }
        int temp2 = 0;
        if (check(chars, start, false)) {
            if (map.containsKey(start + 2)) {
                temp2 = map.get(start + 2);
            } else {
                temp2 = help(chars, start + 2, map);
                map.put(start + 2, temp2);
            }
        }
        return temp1 + temp2;
    }

    private boolean check(char[] chars, int start, boolean single){
        if (chars[start] == '0') {
            return false;
        }
        if (single) {
            return true;
        }
        if (chars[start] > '2') {
            return false;
        }
        if (chars[start] == '2') {
            return chars[start + 1] <= '6';
        }
        return true;
    }
}
