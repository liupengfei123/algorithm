package lpf.learn.leetcode.tags.bitoperation;

/** [371]两整数之和
 * 不使用运算符 + 和 - ，计算两整数 a 、b 之和。
 * 示例 1:
 * 输入: a = 1, b = 2
 * 输出: 3
 *
 * 示例 2:
 * 输入: a = -2, b = 3
 * 输出: 1
 */
public class SumOfTwoIntegers {
    public int getSum(int a, int b) {
        int result = 0;
        int temp1 = 0;
        int temp2;

        for (int i = 0; i < 32; i++) {
            temp2 = (a & 1) ^ (b & 1);
            result ^= ((temp2 ^ temp1) << i);

            temp1 = temp2 == 1 ? temp2 & temp1 : (a & 1) & (b & 1);

            a >>>= 1;
            b >>>= 1;
        }

        return result;
    }
}
