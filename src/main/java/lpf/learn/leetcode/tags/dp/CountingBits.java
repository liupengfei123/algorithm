package lpf.learn.leetcode.tags.dp;

/** [338]比特位计数
 *  给定一个非负整数 num。对于 0 ≤ i ≤ num 范围中的每个数字 i ，计算其二进制数中的 1 的数目并将它们作为数组返回。
 *
 *  示例 1:
 *  输入: 2
 *  输出: [0,1,1]
 *
 *  示例 2:
 *  输入: 5
 *  输出: [0,1,1,2,1,2]
 *
 *  进阶:
 *  给出时间复杂度为O(n*sizeof(integer))的解答非常容易。但你可以在线性时间O(n)内用一趟扫描做到吗？
 *  要求算法的空间复杂度为O(n)。
 * @author liupf
 * @date 2021-03-13 13:56
 */
public class CountingBits {

    public int[] countBits(int num) {
        if (num == 0) {
            return new int[]{0};
        }
        int[] result = new int[num + 1];

        result[0] = 0;
        result[1] = 1;
        int copyIndex = 1;
        int addOneIndex = 1;
        int i = 2;
        while (i <= num) {
            int tempI = i;
            while (copyIndex < tempI && i <= num) {
                result[i++] = result[copyIndex++];
            }
            while (addOneIndex < tempI && i <= num) {
                result[i++] = result[addOneIndex++] + 1;
            }
        }
        return result;
    }
}
