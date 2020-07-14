package lpf.learn.leetcode.problems;

import java.util.List;

/**120. 三角形最小路径和
 *
 * 给定一个三角形，找出自顶向下的最小路径和。每一步只能移动到下一行中相邻的结点上。
 * 相邻的结点 在这里指的是 下标 与 上一层结点下标 相同或者等于 上一层结点下标 + 1 的两个结点。
 *
 * 例如，给定三角形：
 * [
 *      [2],
 *     [3,4],
 *    [6,5,7],
 *   [4,1,8,3]
 * ]
 * 自顶向下的最小路径和为 11（即，2 + 3 + 5 + 1 = 11）。
 *  
 * 说明：
 * 如果你可以只使用 O(n) 的额外空间（n 为三角形的总行数）来解决这个问题，那么你的算法会很加分。
 */
public class Triangle {
    /**
     * 动态规划  假设dp[i][j] 为到第i行第j列的最小路径和。
     * 则 动态方程为 dp[i][j] = arr[i][j] + min(dp[i - 1][j - 1], dp[i - 1][j])
     */
    public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle == null || triangle.size() == 0) {
            return 0;
        }
        int n = triangle.size();
        int[] dp = new int[n];
        dp[0] = triangle.get(0).get(0);
        for (int i = 1; i < n; i++) {
            for (int j = triangle.get(i).size() - 1; j >= 0 ; j--) {
                int value = triangle.get(i).get(j);

                int lastValeLeft = Integer.MAX_VALUE;
                if (j > 0) {
                    lastValeLeft = dp[j - 1];
                }

                int lastValeRight = Integer.MAX_VALUE;
                if (j < i) {
                    lastValeRight = dp[j];
                }
                dp[j] = value + Math.min(lastValeLeft, lastValeRight);
            }
        }

        int result = Integer.MAX_VALUE;
        for (int i : dp) {
            result = Math.min(result, i);
        }
        return result;
    }
}
