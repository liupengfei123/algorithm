package lpf.learn.leetcode.tags.tree;

import java.util.ArrayList;
import java.util.List;

/** [386]字典序排数
 * 给你一个整数 n ，按字典序返回范围 [1, n] 内所有整数。
 * 你必须设计一个时间复杂度为 O(n) 且使用 O(1) 额外空间的算法。
 *
 * 示例 1：
 * 输入：n = 13
 * 输出：[1,10,11,12,13,2,3,4,5,6,7,8,9]
 *
 * 示例 2：
 * 输入：n = 2
 * 输出：[1,2]
 *
 * 提示：
 * 1 <= n <= 5 * 10^4
 */
public class LexicographicalNumbers {



    public List<Integer> lexicalOrder(int n) {
        List<Integer> ret = new ArrayList<>();
        int number = 1;
        for (int i = 0; i < n; i++) {
            ret.add(number);
            if (number * 10 <= n) {
                number *= 10;
            } else {
                while (number % 10 == 9 || number + 1 > n) {
                    number /= 10;
                }
                number++;
            }
        }
        return ret;
    }






    private List<Integer> result;
    private int n;

    public List<Integer> lexicalOrder2(int n) {
        this.result = new ArrayList<>(n);
        this.n = n;

        int temp = n;
        int index = 0;
        while (temp > 0) {
            index++;
            temp /= 10;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 9; i++) {
            sb.append(i);

            help(sb, index - 1);

            sb.deleteCharAt(sb.length() - 1);
        }
        return result;
    }

    private void help(StringBuilder sb, int index) {
        if (index < 0) {
            return;
        }

        int value = Integer.parseInt(sb.toString());
        if (value <= n) {
            result.add(value);
        } else {
            return;
        }

        String[] numbers = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        for (String number : numbers) {
            sb.append(number);

            help(sb, index - 1);

            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
