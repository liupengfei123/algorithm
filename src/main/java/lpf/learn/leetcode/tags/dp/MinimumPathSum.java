package lpf.learn.leetcode.tags.dp;

import java.util.Arrays;

/** [64]最小路径和
 * 给定一个包含非负整数的 m x n 网格 grid ，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。
 * 说明：每次只能向下或者向右移动一步。
 *
 * 示例 1：
 * 输入：grid = [[1,3,1],[1,5,1],[4,2,1]]
 * 输出：7
 * 解释：因为路径 1→3→1→1→1 的总和最小。
 *
 * 示例 2：
 * 输入：grid = [[1,2,3],[4,5,6]]
 * 输出：12
 *
 * 提示：
 * m == grid.length
 * n == grid[i].length
 * 1 <= m, n <= 200
 * 0 <= grid[i][j] <= 100
 */
public class MinimumPathSum {

    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[] array = new int[n + 1];
        Arrays.fill(array, Integer.MAX_VALUE);
        array[n - 1] = 0;

        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                array[j] = grid[i][j] + Math.min(array[j + 1], array[j]);
            }
        }
        return array[0];
    }

    public int minPathSum2(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        for (int i = n - 2; i >= 0; i--) {
            grid[m - 1][i] = grid[m - 1][i] + grid[m - 1][i + 1];
        }
        for (int i = m - 2; i >= 0; i--) {
            grid[i][n - 1] = grid[i][n - 1] + grid[i + 1][n - 1];
        }

        for (int i = m - 2; i >= 0; i--) {
            for (int j = n - 2; j >= 0; j--) {
                grid[i][j] += Math.min(grid[i][j + 1], grid[i + 1][j]);
            }
        }
        return grid[0][0];
    }
}
