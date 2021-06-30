package lpf.learn.leetcode.tags.number;

/**
 * [7]整数反转
 * 给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
 * 如果反转后整数超过 32 位的有符号整数的范围 [−231, 231 − 1] ，就返回 0。
 * 假设环境不允许存储 64 位整数（有符号或无符号）。
 * <p>
 * 示例 1：
 * 输入：x = 123
 * 输出：321
 * <p>
 * 示例 2：
 * 输入：x = -123
 * 输出：-321
 * <p>
 * 示例 3：
 * 输入：x = 120
 * 输出：21
 * <p>
 * 示例 4：
 * 输入：x = 0
 * 输出：0
 * <p>
 * 提示：-2^31 <= x <= 2^31 - 1
 */
public class ReverseInteger {
    public int reverse(int x) {
        int y = 0;
        while (x != 0) {
            //每次取末尾数字
            int tmp = x % 10;
            //判断是否 大于 最大32位整数
            if (y > Integer.MAX_VALUE / 10 || (y == Integer.MAX_VALUE / 10 && tmp > 7)) {
                return 0;
            }
            //判断是否 小于 最小32位整数
            if (y < Integer.MIN_VALUE / 10 || (y == Integer.MIN_VALUE / 10 && tmp < -8)) {
                return 0;
            }
            y = y * 10 + tmp;
            x /= 10;
        }
        return y;
    }
}
