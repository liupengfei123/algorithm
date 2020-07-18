package lpf.learn.leetcode.tags.stack;

import java.util.Stack;

/** 1209. 删除字符串中的所有相邻重复项 II
 * 给你一个字符串 s，「k 倍重复项删除操作」将会从 s 中选择 k 个相邻且相等的字母，并删除它们，使被删去的字符串的左侧和右侧连在一起。
 * 你需要对 s 重复进行无限次这样的删除操作，直到无法继续为止。
 * 在执行完所有删除操作后，返回最终得到的字符串。
 *
 * 示例 1：
 * 输入：s = "abcd", k = 2
 * 输出："abcd"
 * 解释：没有要删除的内容。
 *
 * 示例 2：
 * 输入：s = "deeedbbcccbdaa", k = 3
 * 输出："aa"
 * 解释：
 * 先删除 "eee" 和 "ccc"，得到 "ddbbbdaa"
 * 再删除 "bbb"，得到 "dddaa"
 * 最后删除 "ddd"，得到 "aa"
 *
 * 示例 3：
 * 输入：s = "pbbcggttciiippooaais", k = 2
 * 输出："ps"
 *
 * 提示：
 *     1 <= s.length <= 10^5
 *     2 <= k <= 10^4
 *     s 中只含有小写英文字母。
 */
public class RemoveAllAdjacentDuplicatesInStringII {
    public String removeDuplicates(String s, int k) {
        StringBuilder sb = new StringBuilder(s);
        int[] array = new int[sb.length()];
        for (int i = 0; i < sb.length(); i++) {
            if (i == 0 || sb.charAt(i) != sb.charAt(i - 1)) {
                array[i] = 1;
            } else {
                array[i] = array[i - 1] + 1;
                if (array[i] == k) {
                    sb.delete(i - k + 1, i + 1);
                    i = i - k;
                }
            }
        }
        return sb.toString();
    }


    public String removeDuplicates2(String s, int k) {
        StringBuilder sb = new StringBuilder(s);
        Stack<Pair> stack = new Stack<>();
        for (int i = 0; i < sb.length(); i++) {
            if (stack.isEmpty() || stack.peek().ch != sb.charAt(i)) {
                stack.push(new Pair(1, sb.charAt(i)));
            } else {
                if (++stack.peek().cnt == k) {
                    stack.pop();
                }
            }
        }

        StringBuilder newsb = new StringBuilder();
        while (!stack.isEmpty()) {
            Pair pair = stack.pop();
            for (int i = 0; i < pair.cnt; i++) {
                newsb.append(pair.ch);
            }
        }
        return newsb.reverse().toString();
    }
    private static class Pair {
        int cnt;
        char ch;
        public Pair(int cnt, char ch) {
            this.ch = ch;
            this.cnt = cnt;
        }
    }
}
