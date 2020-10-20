package lpf.learn.leetcode.tags.array;

/**
 * [977]有序数组的平方
 * 给定一个按非递减顺序排序的整数数组 A，返回每个数字的平方组成的新数组，要求也按非递减顺序排序。
 * <p>
 * 示例 1：
 * 输入：[-4,-1,0,3,10]
 * 输出：[0,1,9,16,100]
 * <p>
 * 示例 2：
 * 输入：[-7,-3,2,3,11]
 * 输出：[4,9,9,49,121]
 * <p>
 * 提示：
 * 1 <= A.length <= 10000
 * -10000 <= A[i] <= 10000
 * A 已按非递减顺序排序。
 */
public class SquaresOfASortedArray {
    public int[] sortedSquares(int[] A) {
        int left = findZero(A) - 1, right = left + 1;

        int[] result = new int[A.length];
        int index = 0;
        while (left >= 0 && right < A.length) {
            int value1 = Math.abs(A[left]);
            int value2 = A[right];

            if (value1 > value2) {
                result[index++] = value2 * value2;
                right++;
            } else {
                result[index++] = value1 * value1;
                left--;
            }
        }
        while (left >= 0) {
            result[index++] = A[left] * A[left];
            left--;
        }
        while (right < A.length) {
            result[index++] = A[right] * A[right];
            right++;
        }
        return result;
    }

    private int findZero(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) {
                return i;
            }
        }
        return array.length - 1;
    }

}
