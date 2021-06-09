package lpf.learn.leetcode.tags.dp;

import java.util.Arrays;

/** [879]盈利计划
 * 集团里有 n 名员工，他们可以完成各种各样的工作创造利润。
 * 第 i 种工作会产生 profit[i] 的利润，它要求 group[i] 名成员共同参与。如果成员参与了其中一项工作，就不能参与另一项工作。
 * 工作的任何至少产生 minProfit 利润的子集称为 盈利计划 。并且工作的成员总数最多为 n 。
 * 有多少种计划可以选择？因为答案很大，所以 返回结果模 10^9 + 7 的值。
 *
 * 示例 1：
 * 输入：n = 5, minProfit = 3, group = [2,2], profit = [2,3]
 * 输出：2
 * 解释：至少产生 3 的利润，该集团可以完成工作 0 和工作 1 ，或仅完成工作 1 。
 * 总的来说，有两种计划。
 *
 * 示例 2：
 * 输入：n = 10, minProfit = 5, group = [2,3,5], profit = [6,7,8]
 * 输出：7
 * 解释：至少产生 5 的利润，只要完成其中一种工作就行，所以该集团可以完成任何工作。
 * 有 7 种可能的计划：(0)，(1)，(2)，(0,1)，(0,2)，(1,2)，以及 (0,1,2) 。
 *
 * 提示：
 * 1 <= n <= 100
 * 0 <= minProfit <= 100
 * 1 <= group.length <= 100
 * 1 <= group[i] <= 100
 * profit.length == group.length
 * 0 <= profit[i] <= 100
 */
public class ProfitableSchemes {



    public int profitableSchemes(int n, int minProfit, int[] group, int[] profit) {
        int MOD = 1000_000_007;
        int length = profit.length;
        this.dp = new int[length + 1][n + 1][minProfit + 1];

        dp[0][0][0] = 1;
        for (int i = 1; i <= length; i++) {
            int members = group[i - 1], earn = profit[i - 1];

            for (int j = 0; j <= n; j++) {
                for (int k = 0; k <= minProfit; k++) {
                    if (j < members) {
                        dp[i][j][k] = dp[i - 1][j][k];
                    } else {
                        dp[i][j][k] = (dp[i - 1][j][k] + dp[i - 1][j - members][Math.max(0, k - earn)]) % MOD;
                    }
                }
            }
        }

        // 满足小于 n 人数的方案累加
        int result = 0;
        for (int i = 0; i <= n; i++) {
            result = (result + dp[length][i][minProfit]) % MOD;
        }
        return result;
    }





    private int mod = 1000_000_007;
    private int[] group;
    private int[] profit;
    private int length;
    private int[][][] dp;

    public int profitableSchemes2(int n, int minProfit, int[] group, int[] profit) {
        this.group = group;
        this.profit = profit;
        this.length = profit.length;
        this.dp = new int[length][n + 1][minProfit + 1];

        for (int i = 0; i < length; i++) {
            for (int j = 0; j <= n; j++) {
                Arrays.fill(this.dp[i][j], -1);
            }
        }
        int result = help(n, minProfit, length - 1);
        if (minProfit == 0) {
            result++;
        }
        return result % mod;
    }


    private int help(int n, int minProfit, int index) {
        if (index < 0) {
            return 0;
        }
        if (dp[index][n][minProfit] != -1) {
            return dp[index][n][minProfit];
        }
        int value = 0;
        if (profit[index] >= minProfit && group[index] <= n) {
            value++;
        }

        int tempN = n - group[index];
        int tempMinProfit = Math.max(0, minProfit - profit[index]);
        value = value + help(n, minProfit, index - 1);

        if (tempN >= 0) {
            value = (value + help(tempN, tempMinProfit, index - 1)) % mod;
        }
        dp[index][n][minProfit] = value;
        return value;
    }
}
