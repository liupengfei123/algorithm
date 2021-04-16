package lpf.learn.leetcode.tags.dp;

/** [808]分汤
 * 有 A 和 B 两种类型的汤。一开始每种类型的汤有 N 毫升。有四种分配操作：
 * 提供 100ml 的汤A 和 0ml 的汤B。
 * 提供 75ml 的汤A 和 25ml 的汤B。
 * 提供 50ml 的汤A 和 50ml 的汤B。
 * 提供 25ml 的汤A 和 75ml 的汤B。
 * 当我们把汤分配给某人之后，汤就没有了。每个回合，我们将从四种概率同为0.25的操作中进行分配选择。如果汤的剩余量不足以完成某次操作，我们将尽可能分配。当两
 * 种类型的汤都分配完时，停止操作。
 *
 * 注意不存在先分配100 ml汤B的操作。
 * 需要返回的值： 汤A先分配完的概率 + 汤A和汤B同时分配完的概率 / 2。
 *
 * 示例:
 * 输入: N = 50
 * 输出: 0.625
 * 解释:
 * 如果我们选择前两个操作，A将首先变为空。对于第三个操作，A和B会同时变为空。对于第四个操作，B将首先变为空。
 * 所以A变为空的总概率加上A和B同时变为空的概率的一半是 0.25 *(1 + 1 + 0.5 + 0)= 0.625。
 *
 * 注释:
 * 0 <= N <= 10^9。
 * 返回值在 10^-6 的范围将被认为是正确的。
 */
public class SoupServings {

    public double soupServings(int N) {
        N = (N + 24) / 25;
        if (N >= 500) {
            return 1.0;
        }
        double[][] dp = new double[N + 1][N + 1];
        dp[N][N] = 1;

        for (int i = N; i > 0; i--) {
            for (int j = N; j > 0; j--) {
                if (dp[i][j] <= 0) {
                    continue;
                }
                double probability = dp[i][j] / 4;
                addSum(dp, i - 4, j, probability);
                addSum(dp, i - 3, j - 1, probability);
                addSum(dp, i - 2, j - 2, probability);
                addSum(dp, i - 1, j - 3, probability);
            }
        }
        double result = 0;
        for (int i = N; i > 0; i--) {
            result += dp[0][i];
        }
        result += dp[0][0] / 2;
        return result;
    }

    private void addSum(double[][] dp, int i, int j, double probability) {
        if (i <= 0 && j > 0) {
            dp[0][j] += probability;
        } else if (i <= 0) {
            dp[0][0] += probability;
        } else if (j <= 0) {
            dp[i][0] += probability;
        } else {
            dp[i][j] += probability;
        }
    }



    // Memory Limit Exceeded
    public double soupServings2(int N) {
        N = (N + 24) / 25;

        double[][][] dp = new double[N + 1][N + 1][2];

        double[] result = help(dp, N, N, 1);

        return result[0] + result[1] / 2;
    }



    private double[] help(double[][][] dp, int a, int b, double probability) {
        if (a <= 0 && b > 0) {
            return new double[]{probability, 0};
        } else if (a <= 0) {
            return new double[]{0, probability};
        } else if (b <= 0) {
            return new double[]{0, 0};
        }
        if (dp[a][b] != null) {
            return dp[a][b];
        }
        double[] result = new double[2];

        sumTwoArray(result, help(dp, a - 4, b, probability / 4));
        sumTwoArray(result, help(dp, a - 3, b - 1, probability / 4));
        sumTwoArray(result, help(dp, a - 2, b - 2, probability / 4));
        sumTwoArray(result, help(dp, a - 1, b - 3, probability / 4));

        dp[a][b] = result;
        return result;
    }

    private void sumTwoArray(double[] result, double[] tar) {
        for (int i = 0; i < 2; i++) {
            result[i] += tar[i];
        }
    }

}
