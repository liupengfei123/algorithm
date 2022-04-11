package lpf.learn.leetcode.tags.number;

/** [357]统计各位数字都不同的数字个数
 * 给你一个整数 n ，统计并返回各位数字都不同的数字 x 的个数，其中 0 <= x < 10n 。
 *
 * 示例 1：
 * 输入：n = 2
 * 输出：91
 * 解释：答案应为除去 11、22、33、44、55、66、77、88、99 外，在 0 ≤ x < 100 范围内的所有数字。
 *
 * 示例 2：
 * 输入：n = 0
 * 输出：1
 *
 * 提示：
 * 0 <= n <= 8
 */
public class CountNumbersWithUniqueDigits {

    public int countNumbersWithUniqueDigits(int n) {

        int result = 1;
        while (n >= 1) {
            result += help(n);
            n--;
        }
        return result;
    }


    private int help(int i) {
        int sum = 1; // 九个数字选一个
        for (int j = 9; i > 1; i--, j--) {
            sum *= j;
        }
        return 9 * sum;
    }
}
