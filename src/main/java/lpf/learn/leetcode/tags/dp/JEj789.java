package lpf.learn.leetcode.tags.dp;

/** [剑指 Offer II 091] 粉刷房子
 * <p>假如有一排房子，共 <code>n</code> 个，每个房子可以被粉刷成红色、蓝色或者绿色这三种颜色中的一种，你需要粉刷所有的房子并且使其相邻的两个房子颜色不能相同。</p>
 * <p>当然，因为市场上不同颜色油漆的价格不同，所以房子粉刷成不同颜色的花费成本也是不同的。每个房子粉刷成不同颜色的花费是以一个&nbsp;<code>n x 3</code><em>&nbsp;</em>的正整数矩阵 <code>costs</code> 来表示的。</p>
 * <p>例如，<code>costs[0][0]</code> 表示第 0 号房子粉刷成红色的成本花费；<code>costs[1][2]</code>&nbsp;表示第 1 号房子粉刷成绿色的花费，以此类推。</p>
 * <p>请计算出粉刷完所有房子最少的花费成本。</p>
 *
 * <p><strong>示例 1：</strong></p>
 * <pre>
 * <strong>输入: </strong>costs = [[17,2,17],[16,16,5],[14,3,19]]
 * <strong>输出: </strong>10
 * <strong>解释: </strong>将 0 号房子粉刷成蓝色，1 号房子粉刷成绿色，2 号房子粉刷成蓝色<strong>。</strong>
 * &nbsp;    最少花费: 2 + 5 + 3 = 10。
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 * <pre>
 * <strong>输入: </strong>costs = [[7,6,2]]
 * <strong>输出: 2</strong>
 * </pre>
 *
 * <p><strong>提示:</strong></p>
 * <ul>
 * 	<li><code>costs.length == n</code></li>
 * 	<li><code>costs[i].length == 3</code></li>
 * 	<li><code>1 &lt;= n &lt;= 100</code></li>
 * 	<li><code>1 &lt;= costs[i][j] &lt;= 20</code></li>
 * </ul>
 */
public class JEj789 {
    public int minCost(int[][] costs) {
        int[] dp = new int[3];
        System.arraycopy(costs[0], 0, dp, 0, 3);

        int length = costs.length;
        int[][] choose = new int[][]{{1, 2}, {0, 2}, {0, 1}};

        for (int i = 1; i < length; i++) {
            int[] ndp = new int[3];

            for (int j = 0; j < 3; j++) {
                ndp[j] = costs[i][j] + Math.min(dp[choose[j][0]], dp[choose[j][1]]);
            }

            dp = ndp;
        }
        int result = dp[0];
        for (int i = 0; i < 3; i++) {
            result = Math.min(result, dp[i]);
        }

        return result;
    }
}
