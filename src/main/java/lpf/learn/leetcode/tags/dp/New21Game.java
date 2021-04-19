package lpf.learn.leetcode.tags.dp;

/** [837]新21点
 * 爱丽丝参与一个大致基于纸牌游戏 “21点” 规则的游戏，描述如下：
 * 爱丽丝以 0 分开始，并在她的得分少于 K 分时抽取数字。 抽取时，她从 [1, W] 的范围中随机获得一个整数作为分数进行累计，其中 W 是整数。 每次
 * 抽取都是独立的，其结果具有相同的概率。
 * 当爱丽丝获得不少于 K 分时，她就停止抽取数字。 爱丽丝的分数不超过 N 的概率是多少？
 *
 * 示例 1：
 * 输入：N = 10, K = 1, W = 10
 * 输出：1.00000
 * 说明：爱丽丝得到一张卡，然后停止。
 *
 * 示例 2：
 * 输入：N = 6, K = 1, W = 10
 * 输出：0.60000
 * 说明：爱丽丝得到一张卡，然后停止。
 * 在 W = 10 的 6 种可能下，她的得分不超过 N = 6 分。
 *
 * 示例 3：
 * 输入：N = 21, K = 17, W = 10
 * 输出：0.73278
 *
 * 提示：
 * 0 <= K <= N <= 10000
 * 1 <= W <= 10000
 * 如果答案与正确答案的误差不超过 10^-5，则该答案将被视为正确答案通过。
 */
public class New21Game {


    public double new21Game(int N, int K, int W) {
        if (K == 0) {
            return 1.0;
        }
        // 令 dp[x] 表示从得分为 x 的情况开始游戏并且获胜的概率，目标是求 dp[0] 的值。
        double[] dp = new double[K + W];
        for (int i = K; i <= N && i < K + W; i++) {
            dp[i] = 1.0;
        }
        dp[K - 1] = 1.0 * Math.min(N - K + 1, W) / W;
        for (int i = K - 2; i >= 0; i--) {
            // 考虑对 dp 的相邻项计算差分，有如下结果：
            // dp[x] - dp[x+1]= (dp[x+1] - dp[x+W+1]) / W
            dp[i] = dp[i + 1] - (dp[i + W + 1] - dp[i + 1]) / W;
        }
        return dp[0];
    }


    // Time Limit Exceeded
    public double new21Game2(int N, int K, int W) {
        double[] dp = new double[N + 1];
        dp[0] = 1;
        for (int i = 0; i < K; i++) {
            double value = dp[i] / W;
            for (int j = 1; j <= W && i + j <= N; j++) {
                dp[i + j] += value;
            }
        }

        double result = 0;
        for (int i = K; i <= N; i++) {
            result += dp[i];
        }
        return result;
    }
}
