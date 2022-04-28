package lpf.learn.leetcode.game.weekly289;

/** 6072. 转角路径的乘积中最多能有几个尾随零
 * 给你一个二维整数数组 grid ，大小为 m x n，其中每个单元格都含一个正整数。
 * 转角路径 定义为：包含至多一个弯的一组相邻单元。具体而言，路径应该完全 向水平方向 或者 向竖直方向 移动过弯（如果存在弯），而不能访问之前访问过的单元格。在过弯之后，路径应当完全朝 另一个 方向行进：如果之前是向水平方向，那么就应该变为向竖直方向；反之亦然。当然，同样不能访问之前已经访问过的单元格。
 * 一条路径的 乘积 定义为：路径上所有值的乘积。
 * 请你从 grid 中找出一条乘积中尾随零数目最多的转角路径，并返回该路径中尾随零的数目。
 * 注意：
 * 水平 移动是指向左或右移动。
 * 竖直 移动是指向上或下移动。
 *
 * 示例 1：
 * 输入：grid = [[23,17,15,3,20],[8,1,20,27,11],[9,4,6,2,21],[40,9,1,10,6],[22,7,4,5,3]]
 * 输出：3
 * 解释：左侧的图展示了一条有效的转角路径。
 * 其乘积为 15 * 20 * 6 * 1 * 10 = 18000 ，共计 3 个尾随零。
 * 可以证明在这条转角路径的乘积中尾随零数目最多。
 * 中间的图不是一条有效的转角路径，因为它有不止一个弯。
 * 右侧的图也不是一条有效的转角路径，因为它需要重复访问已经访问过的单元格。
 *
 * 示例 2：
 * 输入：grid = [[4,3,2],[7,6,1],[8,8,8]]
 * 输出：0
 * 解释：网格如上图所示。
 * 不存在乘积含尾随零的转角路径。
 *
 * 提示：
 * m == grid.length
 * n == grid[i].length
 * 1 <= m, n <= 10^5
 * 1 <= m * n <= 10^5
 * 1 <= grid[i][j] <= 1000
 */
public class MaximumTrailingZerosInACorneredPath {

    public int maxTrailingZeros(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[][][] preN = new int[m][n + 1][2];
        int[][][] preM = new int[n][m + 1][2];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int code2 = getCodeCount(grid[i][j], 2);
                int code5 = getCodeCount(grid[i][j], 5);

                preN[i][j + 1][0] = preN[i][j][0] + code2;
                preM[j][i + 1][0] = preM[j][i][0] + code2;

                preN[i][j + 1][1] = preN[i][j][1] + code5;
                preM[j][i + 1][1] = preM[j][i][1] + code5;
            }
        }

        int maxZeroCount = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                maxZeroCount = Math.max(maxZeroCount,
                        Math.min(
                                (preN[i][n][0] - preN[i][j + 1][0]) + (preM[j][m][0] - preM[j][i][0]),
                                (preN[i][n][1] - preN[i][j + 1][1]) + (preM[j][m][1] - preM[j][i][1])
                                ));

                maxZeroCount = Math.max(maxZeroCount,
                        Math.min(
                                ((preN[i][n][0] - preN[i][j][0]) + preM[j][i][0]),
                                ((preN[i][n][1] - preN[i][j][1]) + preM[j][i][1])
                        ));

                maxZeroCount = Math.max(maxZeroCount,
                        Math.min(
                                (preN[i][j][0] + preM[j][i + 1][0]),
                                (preN[i][j][1] + preM[j][i + 1][1])
                        ));

                maxZeroCount = Math.max(maxZeroCount,
                        Math.min(
                                (preN[i][j][0] + (preM[j][m][0] - preM[j][i][0])),
                                (preN[i][j][1] + (preM[j][m][1] - preM[j][i][1]))
                        ));
            }
        }

        return maxZeroCount;
    }

    private int getCodeCount(long value, int code) {
        int count = 0;
        while (value % code == 0) {
            count++;
            value /= code;
        }
        return count;
    }


}
