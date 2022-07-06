package lpf.learn.leetcode.game.weekly300;

/** [2328] 网格图中递增路径的数目
 * <p>给你一个&nbsp;<code>m x n</code>&nbsp;的整数网格图&nbsp;<code>grid</code>&nbsp;，你可以从一个格子移动到&nbsp;<code>4</code>&nbsp;个方向相邻的任意一个格子。</p>
 * <p>请你返回在网格图中从 <strong>任意</strong>&nbsp;格子出发，达到 <strong>任意</strong>&nbsp;格子，且路径中的数字是 <strong>严格递增</strong>&nbsp;的路径数目。由于答案可能会很大，请将结果对&nbsp;<code>10<sup>9</sup> + 7</code>&nbsp;<strong>取余</strong>&nbsp;后返回。</p>
 * <p>如果两条路径中访问过的格子不是完全相同的，那么它们视为两条不同的路径。</p>
 *
 * <p><strong>示例 1：</strong></p>
 * <p><img alt="" src="https://assets.leetcode.com/uploads/2022/05/10/griddrawio-4.png" style="width: 181px; height: 121px;"></p>
 *
 * <pre><b>输入：</b>grid = [[1,1],[3,4]]
 * <b>输出：</b>8
 * <b>解释：</b>严格递增路径包括：
 * - 长度为 1 的路径：[1]，[1]，[3]，[4] 。
 * - 长度为 2 的路径：[1 -&gt; 3]，[1 -&gt; 4]，[3 -&gt; 4] 。
 * - 长度为 3 的路径：[1 -&gt; 3 -&gt; 4] 。
 * 路径数目为 4 + 3 + 1 = 8 。
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 * <pre><b>输入：</b>grid = [[1],[2]]
 * <b>输出：</b>3
 * <b>解释：</b>严格递增路径包括：
 * - 长度为 1 的路径：[1]，[2] 。
 * - 长度为 2 的路径：[1 -&gt; 2] 。
 * 路径数目为 2 + 1 = 3 。
 * </pre>
 *
 * <p><strong>提示：</strong></p>
 * <ul>
 * 	<li><code>m == grid.length</code></li>
 * 	<li><code>n == grid[i].length</code></li>
 * 	<li><code>1 &lt;= m, n &lt;= 1000</code></li>
 * 	<li><code>1 &lt;= m * n &lt;= 10<sup>5</sup></code></li>
 * 	<li><code>1 &lt;= grid[i][j] &lt;= 10<sup>5</sup></code></li>
 * </ul>
 */
public class NumberOfIncreasingPathsInAGrid {
    int mod = 1000_000_007;
    int m;
    int n;
    int[][] grid;
    int[][] go = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    int[][] dp;

    public int countPaths(int[][] grid) {
        this.m = grid.length;
        this.n = grid[0].length;
        this.grid = grid;
        this.dp = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dfs(i, j);
            }
        }

        int result = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result = (dp[i][j] + result) % mod;
            }
        }
        return result;
    }

    private int dfs(int i, int j) {
        if (dp[i][j] != 0) {
            return dp[i][j];
        }
        dp[i][j] = 1;

        for (int[] ints : go) {
            int newX = i + ints[0];
            int newY = j + ints[1];
            if (newX < 0 || newX >= m || newY < 0 || newY >= n) {
                continue;
            }
            if (grid[newX][newY] > grid[i][j]) {
                dp[i][j] = (dp[i][j] + dfs(newX, newY)) % mod;
            }
        }
        return dp[i][j];
    }
}
