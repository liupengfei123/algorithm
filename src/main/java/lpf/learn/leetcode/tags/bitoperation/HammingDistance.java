package lpf.learn.leetcode.tags.bitoperation;

/** [461]汉明距离
 * 两个整数之间的汉明距离指的是这两个数字对应二进制位不同的位置的数目。给出两个整数 x 和 y，计算它们之间的汉明距离。
 * 注意： 0 ≤ x, y < 231.
 *
 * 示例:
 * 输入: x = 1, y = 4
 * 输出: 2
 * 解释:
 * 1   (0 0 0 1)
 * 4   (0 1 0 0)
 *       ↑   ↑
 * 上面的箭头指出了对应二进制位不同的位置。
 */
public class HammingDistance {
    public int hammingDistance(int x, int y) {
        int value = x ^ y;
        int result = 0;
        while (value != 0) {
            if ((value & 1) == 1) {
                result++;
            }
            value = value >>> 1;
        }
        return result;
    }
}
