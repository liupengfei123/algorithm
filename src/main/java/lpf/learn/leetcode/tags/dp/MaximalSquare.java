package lpf.learn.leetcode.tags.dp;

/** [221]最大正方形
 * 在一个由 '0' 和 '1' 组成的二维矩阵内，找到只包含 '1' 的最大正方形，并返回其面积。
 *
 * 示例 1：
 * 输入：  matrix = [["1","0","1","0","0"],
 *                  ["1","0","1","1","1"],
 *                  ["1","1","1","1","1"],
 *                  ["1","0","0","1","0"]]
 * 输出：4
 *
 * 示例 2：
 * 输入：matrix = [["0","1"],["1","0"]]
 * 输出：1
 *
 * 示例 3：
 * 输入：matrix = [["0"]]
 * 输出：0
 *
 * 提示：
 * m == matrix.length
 * n == matrix[i].length
 * 1 <= m, n <= 300
 * matrix[i][j] 为 '0' 或 '1'
 */
public class MaximalSquare {


    /**
     *  f(i, j) 表示以 (i, j) 为左上角的正方形最大边长
     *  f(i, j) = min(f(i + 1, j), f(i + 1, j + 1), f(i, j + 1)) + 1  当 (i,j) 位置为 ‘1’ 时
     *  f(i, j) = 0  当 (i,j) 位置为 ‘0’ 时
     */
    public int maximalSquare(char[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int maxSide = 0;
        int[][] dp = new int[m + 1][n + 1];

        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                if (matrix[i][j] == '1') {
                    dp[i][j] = Math.min(dp[i + 1][j], Math.min(dp[i+1][j+1], dp[i][j+1])) + 1;
                    maxSide = Math.max(maxSide, dp[i][j]);
                }
            }
        }
        return maxSide * maxSide;
    }


}
