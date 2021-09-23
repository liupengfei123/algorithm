package lpf.learn.leetcode.tags.number;

/** [326]3的幂
 * 给定一个整数，写一个函数来判断它是否是 3 的幂次方。如果是，返回 true ；否则，返回 false 。
 * 整数 n 是 3 的幂次方需满足：存在整数 x 使得 n == 3^x
 *
 * 示例 1：
 * 输入：n = 27
 * 输出：true
 *
 * 示例 2：
 * 输入：n = 0
 * 输出：false
 *
 * 示例 3：
 * 输入：n = 9
 * 输出：true
 *
 * 示例 4：
 * 输入：n = 45
 * 输出：false
 *
 * 提示：
 * -2^31 <= n <= 2^31 - 1
 *
 * 进阶：
 * 你能不使用循环或者递归来完成本题吗？
 */
public class PowerOfThree {

    public boolean isPowerOfThree2(int n) {
        //  32 位有符号整数的范围内，最大的 3 的幂为 3^{19} = 1162261467。我们只需要判断 n 是否是 3^{19} 的约数即可
        return n > 0 && 1162261467 % n == 0;
    }



    public boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }
        return help(n);
    }

    private boolean help(int n) {
        if (n == 1) {
            return true;
        }
        return n % 3 == 0 && help(n / 3);
    }
}
