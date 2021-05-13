package lpf.learn.leetcode.tags.dp;

/** [1269]停在原地的方案数
 * 有一个长度为 arrLen 的数组，开始有一个指针在索引 0 处。
 * 每一步操作中，你可以将指针向左或向右移动 1 步，或者停在原地（指针不能被移动到数组范围外）。
 * 给你两个整数 steps 和 arrLen ，请你计算并返回：在恰好执行 steps 次操作以后，指针仍然指向索引 0 处的方案数。
 * 由于答案可能会很大，请返回方案数 模 10^9 + 7 后的结果。
 *
 * 示例 1：
 * 输入：steps = 3, arrLen = 2
 * 输出：4
 * 解释：3 步后，总共有 4 种不同的方法可以停在索引 0 处。
 * 向右，向左，不动
 * 不动，向右，向左
 * 向右，不动，向左
 * 不动，不动，不动
 *
 * 示例 2：
 * 输入：steps = 2, arrLen = 4
 * 输出：2
 * 解释：2 步后，总共有 2 种不同的方法可以停在索引 0 处。
 * 向右，向左
 * 不动，不动
 *
 * 示例 3：
 * 输入：steps = 4, arrLen = 2
 * 输出：8
 *
 * 提示：
 * 1 <= steps <= 500
 * 1 <= arrLen <= 10^6
 */
public class NumberOfWaysToStayInTheSamePlaceAfterSomeSteps {
    public int numWays(int steps, int arrLen) {
        int mode = 1000_000_007;
        int lenth = Math.min(steps, arrLen) + 2;
        // 第i次 array 各个点的方案
        int[] dp = new int[lenth];
        dp[1] = 1;
        dp[2] = 1;
        for (int i = 1; i < steps; i++) {
            int[] ndp = new int[lenth];
            for (int j = 1; j < lenth - 1; j++) {
                ndp[j] = (dp[j - 1] + dp[j]) % mode;
                ndp[j] = (ndp[j] + dp[j + 1]) % mode;
            }
            dp = ndp;
        }
        return dp[1];
    }
}
