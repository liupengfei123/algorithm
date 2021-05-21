package lpf.learn.leetcode.tags.dp;

/** [1139]最大的以 1 为边界的正方形
 * 给你一个由若干 0 和 1 组成的二维网格 grid，请你找出边界全部由 1 组成的最大 正方形 子网格，并返回该子网格中的元素数量。如果不存在，则返回 0。
 *
 * 示例 1：
 * 输入：grid = [[1,1,1],[1,0,1],[1,1,1]]
 * 输出：9
 *
 * 示例 2：
 * 输入：grid = [[1,1,0,0]]
 * 输出：1
 *
 * 提示：
 * 1 <= grid.length <= 100
 * 1 <= grid[0].length <= 100
 * grid[i][j] 为 0 或 1
 */
public class Largest1BorderedSquare {

    public int largest1BorderedSquare(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[][] left = new int[m][n];
        int count;
        for (int i = 0; i < m; i++) {
            count = 1;
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    left[i][j] = count++;
                } else {
                    count = 1;
                }
            }
        }
        int[][] right = new int[m][n];
        for (int i = 0; i < m; i++) {
            count = 1;
            for (int j = n - 1; j >= 0; j--) {
                if (grid[i][j] == 1) {
                    right[i][j] = count++;
                } else {
                    count = 1;
                }
            }
        }
        int[][] down = new int[m][n];
        for (int j = 0; j < n; j++) {
            count = 1;
            for (int i = 0; i < m; i++) {
                if (grid[i][j] == 1) {
                    down[i][j] = count++;
                } else {
                    count = 1;
                }
            }
        }
        int[][] up = new int[m][n];
        for (int j = 0; j < n; j++) {
            count = 1;
            for (int i = m - 1; i >= 0; i--) {
                if (grid[i][j] == 1) {
                    up[i][j] = count++;
                } else {
                    count = 1;
                }
            }
        }

        int result = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = Math.min(right[i][j], up[i][j]); k > result; k--) {
                    int row = i + k - 1;
                    int col = j + k - 1;
                    if (row >= m || col >= n) {
                        continue;
                    }
                    if (down[row][col] < k || left[row][col] < k) {
                        continue;
                    }
                    result = k;
                    break;
                }
            }
        }
        return result * result;
    }
}
