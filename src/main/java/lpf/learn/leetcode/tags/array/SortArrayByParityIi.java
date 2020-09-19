package lpf.learn.leetcode.tags.array;

/** [922]按奇偶排序数组 II
 *  给定一个非负整数数组 A， A 中一半整数是奇数，一半整数是偶数。
 *  对数组进行排序，以便当 A[i] 为奇数时，i 也是奇数；当 A[i] 为偶数时， i 也是偶数。
 *  你可以返回任何满足上述条件的数组作为答案。
 *
 *  示例：
 *  输入：[4,2,5,7]
 *  输出：[4,5,2,7]
 *  解释：[4,7,2,5]，[2,5,4,7]，[2,7,4,5] 也会被接受。
 *
 *  提示：
 *  2 <= A.length <= 20000
 *  A.length % 2 == 0
 *  0 <= A[i] <= 1000
 * @author liupf
 * @date 2020-09-19 21:34
 */
public class SortArrayByParityIi {
    public int[] sortArrayByParityII(int[] A) {
        int[] result = new int[A.length];
        int oddindex = 1, evenIndex = 0;
        for (int value : A) {
            if (value % 2 == 0) {
                result[evenIndex] = value;
                evenIndex += 2;
            } else {
                result[oddindex] = value;
                oddindex += 2;
            }
        }
        return result;
    }
}
