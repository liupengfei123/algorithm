package lpf.learn.leetcode.tags.array;

import java.util.ArrayList;
import java.util.List;

/**
 * [1380]矩阵中的幸运数
 * 给你一个 m * n 的矩阵，矩阵中的数字 各不相同 。请你按 任意 顺序返回矩阵中的所有幸运数。
 * 幸运数是指矩阵中满足同时下列两个条件的元素：
 * 在同一行的所有元素中最小
 * 在同一列的所有元素中最大
 * <p>
 * 示例 1：
 * 输入：matrix = [[3,7,8],[9,11,13],[15,16,17]]
 * 输出：[15]
 * 解释：15 是唯一的幸运数，因为它是其所在行中的最小值，也是所在列中的最大值。
 * <p>
 * 示例 2：
 * 输入：matrix = [[1,10,4,2],[9,3,8,7],[15,16,17,12]]
 * 输出：[12]
 * 解释：12 是唯一的幸运数，因为它是其所在行中的最小值，也是所在列中的最大值。
 * <p>
 * 示例 3：
 * 输入：matrix = [[7,8],[1,2]]
 * 输出：[7]
 * <p>
 * 提示：
 * m == mat.length
 * n == mat[i].length
 * 1 <= n, m <= 50
 * 1 <= matrix[i][j] <= 10^5
 * 矩阵中的所有元素都是不同的
 */
public class LuckyNumbersInAMatrix {

    public List<Integer> luckyNumbers(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        // 每一列最大值的索引值
        int[] maxColIndex = new int[n];
        for (int j = 0; j < n; j++) {
            int max = 0;
            for (int i = 0; i < m; i++) {
                if (max < matrix[i][j]) {
                    max = matrix[i][j];
                    maxColIndex[j] = i;
                }
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int minIndex = 0;
            for (int j = 0; j < n; j++) {
                if (matrix[i][minIndex] > matrix[i][j]) {
                    minIndex = j;
                }
            }

            if (maxColIndex[minIndex] == i) {
                result.add(matrix[i][minIndex]);
            }
        }
        return result;
    }

}
