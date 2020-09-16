package lpf.learn.leetcode.tags.array;

import java.util.HashMap;
import java.util.Map;

/** [766]托普利茨矩阵
 * 如果矩阵上每一条由左上到右下的对角线上的元素都相同，那么这个矩阵是 托普利茨矩阵 。
 * 给定一个 M x N 的矩阵，当且仅当它是托普利茨矩阵时返回 True。
 *
 * 示例 1:
 * 输入:
 * matrix = [
 *   [1,2,3,4],
 *   [5,1,2,3],
 *   [9,5,1,2]
 * ]
 * 输出: True
 * 解释:
 * 在上述矩阵中, 其对角线为:
 * "[9]", "[5, 5]", "[1, 1, 1]", "[2, 2, 2]", "[3, 3]", "[4]"。
 * 各条对角线上的所有元素均相同, 因此答案是True。
 *
 * 示例 2:
 * 输入:
 * matrix = [
 *   [1,2],
 *   [2,2]
 * ]
 * 输出: False
 * 解释:
 * 对角线"[1, 2]"上的元素不同。
 *
 * 说明:
 * matrix 是一个包含整数的二维数组。
 * matrix 的行数和列数均在 [1, 20]范围内。
 * matrix[i][j] 包含的整数在 [0, 99]范围内。
 *
 * 进阶:
 * 如果矩阵存储在磁盘上，并且磁盘内存是有限的，因此一次最多只能将一行矩阵加载到内存中，该怎么办？
 * 如果矩阵太大以至于只能一次将部分行加载到内存中，该怎么办？
 */
public class ToeplitzMatrix {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int row = matrix.length, col = matrix[0].length;

        for (int i = 0; i < row; i++) {
            int r = i, c = 0;
            int v = matrix[r][c];
            while (r < row && c < col) {
                if (v != matrix[r++][c++]) {
                    return false;
                }
            }
        }

        for (int i = 1; i < col; i++) {
            int r = 0, c = i;
            int v = matrix[r][c];
            while (r < row && c < col) {
                if (v != matrix[r++][c++]) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isToeplitzMatrix2(int[][] matrix) {
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < matrix.length; i++) {
            if (!help(matrix[i], i , map)) {
                return false;
            }
        }
        return true;
    }

    private boolean help(int[] rows, int i, Map<String, Integer> map) {
        for (int j = 0; j < rows.length; j++) {
            int min = Math.min(i, j), x = i - min, y = j - min;
            Integer value = map.putIfAbsent(x + "," + y, rows[j]);
            if (value != null && value != rows[j]) {
                return false;
            }
        }
        return true;
    }
}
