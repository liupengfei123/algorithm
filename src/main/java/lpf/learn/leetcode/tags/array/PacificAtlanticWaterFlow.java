package lpf.learn.leetcode.tags.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** [417]太平洋大西洋水流问题
 * 有一个 m × n 的矩形岛屿，与 太平洋 和 大西洋 相邻。 “太平洋” 处于大陆的左边界和上边界，而 “大西洋” 处于大陆的右边界和下边界。
 * 这个岛被分割成一个由若干方形单元格组成的网格。给定一个 m x n 的整数矩阵 heights ， heights[r][c] 表示坐标 (r, c) 上单元格 高于海平面的高度 。
 * 岛上雨水较多，如果相邻单元格的高度 小于或等于 当前单元格的高度，雨水可以直接向北、南、东、西流向相邻单元格。水可以从海洋附近的任何单元格流入海洋。
 * 返回 网格坐标 result 的 2D列表 ，其中 result[i] = [ri, ci] 表示雨水可以从单元格 (ri, ci) 流向 太平洋和大西洋。
 *
 * 示例 1：
 * 输入: heights = [[1,2,2,3,5],[3,2,3,4,4],[2,4,5,3,1],[6,7,1,4,5],[5,1,1,2,4]]
 * 输出: [[0,4],[1,3],[1,4],[2,2],[3,0],[3,1],[4,0]]
 *
 * 示例 2：
 * 输入: heights = [[2,1],[1,2]]
 * 输出: [[0,0],[0,1],[1,0],[1,1]]
 *
 * 提示：
 * m == heights.length
 * n == heights[r].length
 * 1 <= m, n <= 200
 * 0 <= heights[r][c] <= 10^5
 */
public class PacificAtlanticWaterFlow {
    private int[][] heights;
    private int[][] dp;
    private int m;
    private int n;
    private int[][] arrarNext = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};


    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        this.heights = heights;
        this.m = heights.length;
        this.n = heights[0].length;
        this.dp = new int[m][n];

        for (int i = 0; i < m; i++) {
            dfs(1, i, 0);
            dfs(2, i, n - 1);
        }
        for (int i = 0; i < n; i++) {
            dfs(1, 0, i);
            dfs(2, m - 1, i);
        }

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (dp[i][j] == 3) {
                    result.add(Arrays.asList(i, j));
                }
            }
        }

        return result;
    }

    private void dfs(int cost, int x, int y) {
        // 已经走过了
        if ((dp[x][y] & cost) != 0) {
            return;
        }
        dp[x][y] += cost;

        for (int[] ints : arrarNext) {
            int nx = x + ints[0];
            int ny = y + ints[1];

            if (nx < 0 || nx >= m || ny < 0 || ny >= n) {
                continue;
            }
            if (heights[nx][ny] < heights[x][y]) {
                continue;
            }
            dfs(cost, nx, ny);
        }
    }
}
