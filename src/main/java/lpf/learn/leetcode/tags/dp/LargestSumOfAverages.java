package lpf.learn.leetcode.tags.dp;

/**
 * [813]最大平均值和的分组
 * 我们将给定的数组 A 分成 K 个相邻的非空子数组 ，我们的分数由每个子数组内的平均值的总和构成。计算我们所能得到的最大分数是多少。
 * 注意我们必须使用 A 数组中的每一个数进行分组，并且分数不一定需要是整数。
 * <p>
 * 示例:
 * 输入:
 * A = [9,1,2,3,9]
 * K = 3
 * 输出: 20
 * 解释:
 * A 的最优分组是[9], [1, 2, 3], [9]. 得到的分数是 9 + (1 + 2 + 3) / 3 + 9 = 20.
 * 我们也可以把 A 分成[9, 1], [2], [3, 9].
 * 这样的分组得到的分数为 5 + 2 + 6 = 13, 但不是最大值.
 * <p>
 * 说明:
 * 1 <= A.length <= 100.
 * 1 <= A[i] <= 10000.
 * 1 <= K <= A.length.
 * 答案误差在 10^-6 内被视为是正确的。
 *
 * @author liupf
 * @date 2021-04-18 14:21
 */
public class LargestSumOfAverages {


    public double largestSumOfAverages(int[] A, int K) {
        int length = A.length;
        double[] preSum = new double[length + 1];
        for (int i = 0; i < length; i++) {
            preSum[i + 1] = preSum[i] + A[i];
        }
        // 设 dp(i, k) 表示数组 A 中从第 i 个元素到结尾 A[i:] 分成 k 个相邻的非空子数组，可以得到的最大分数
        double[] dp = new double[length];
        for (int i = 0; i < length; ++i){
            dp[i] = (preSum[length] - preSum[i]) / (length - i);
        }

        for (int k = 1; k < K; ++k) {
            for (int i = 0; i < length; ++i) {
                for (int j = i + 1; j < length; ++j) {
                    dp[i] = Math.max(dp[i], (preSum[j] - preSum[i]) / (j - i) + dp[j]);
                }
            }
        }

        return dp[0];
    }


    public double largestSumOfAverages2(int[] A, int K) {
        int length = A.length;

        double[] preSum = new double[length + 1];
        for (int i = 0; i < length; i++) {
            preSum[i + 1] = preSum[i] + A[i];
        }
        if (K == length) {
            return preSum[length];
        }
        if (K == 1) {
            return (preSum[length] - preSum[0]) / length;
        }

        double[][] dp = new double[length][length];
        double[][] zeroDp = dp;
        for (int i = 0; i < length; i++) {
            for (int j = i; j < length; j++) {
                dp[i][j] = (preSum[j + 1] - preSum[i]) / (j - i + 1);
            }
        }
        for (int k = 1; k < K; k++) {
            double[][] ndp = new double[length][length];
            for (int i = 0; i < length; i++) {
                for (int j = i + k; j < length; j++) {
                    double temp = 0;
                    for (int z = i; z <= j - k; z++) {
                        temp = Math.max(temp, zeroDp[i][z] + dp[z + 1][j]);
                    }
                    ndp[i][j] = temp;
                }
            }
            dp = ndp;
        }
        return dp[0][length - 1];
    }

}
