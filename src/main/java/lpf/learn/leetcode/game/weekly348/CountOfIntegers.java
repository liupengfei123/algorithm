package lpf.learn.leetcode.game.weekly348;

import java.util.Arrays;


/** [2719] 统计整数数目
 <p>给你两个数字字符串&nbsp;<code>num1</code>&nbsp;和&nbsp;<code>num2</code>&nbsp;，以及两个整数&nbsp;<code>max_sum</code> 和&nbsp;<code>min_sum</code>&nbsp;。如果一个整数&nbsp;<code>x</code>&nbsp;满足以下条件，我们称它是一个好整数：</p>
 <ul>
 <li><code>num1 &lt;= x &lt;= num2</code></li>
 <li><code>min_sum &lt;= digit_sum(x) &lt;= max_sum</code>.</li>
 </ul>
 <p>请你返回好整数的数目。答案可能很大，请返回答案对&nbsp;<code>10<sup>9</sup> + 7</code>&nbsp;取余后的结果。</p>
 <p>注意，<code>digit_sum(x)</code>&nbsp;表示&nbsp;<code>x</code>&nbsp;各位数字之和。</p>

 <p><strong>示例 1：</strong></p>
 <pre>
 <b>输入：</b>num1 = "1", num2 = "12", min_num = 1, max_num = 8
 <b>输出：</b>11
 <b>解释：</b>总共有 11 个整数的数位和在 1 到 8 之间，分别是 1,2,3,4,5,6,7,8,10,11 和 12 。所以我们返回 11 。
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <b>输入：</b>num1 = "1", num2 = "5", min_num = 1, max_num = 5
 <b>输出：</b>5
 <b>解释：</b>数位和在 1 到 5 之间的 5 个整数分别为 1,2,3,4 和 5 。所以我们返回 5 。
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= num1 &lt;= num2 &lt;= 10<sup>22</sup></code></li>
 <li><code>1 &lt;= min_sum &lt;= max_sum &lt;= 400</code></li>
 </ul>
 */
public class CountOfIntegers {

    private static final int MOD = 1000_000_007;
    private int minSum, maxSum;

    public int count(String num1, String num2, int min_sum, int max_sum) {
        this.minSum = min_sum; this.maxSum = max_sum;

        int ans = count(num2) - count(num1) + MOD;

        int sum = 0;
        for (char c : num1.toCharArray()) sum += c - '0';
        if (minSum <= sum && sum <= maxSum) ans++; // x=num1 是合法的，补回来

        return ans % MOD;
    }

    private int count(String s) {
        char[] chars = s.toCharArray();

        int[][] dp = new int[s.length()][maxSum + 1];
        for (int[] ints : dp) Arrays.fill(ints, -1);

        return f(chars, dp, 0, 0, true);
    }

    private int f(char[] chars, int[][] dp, int i, int digitSum, boolean isLimit) {
        if (digitSum > maxSum) return 0;
        if (i == chars.length) return minSum <= digitSum ? 1 : 0;

        if (dp[i][digitSum] >= 0 && !isLimit) return dp[i][digitSum];

        int res = 0;
        int up = isLimit ? chars[i] - '0' : 9;
        for (int j = 0; j <= up; j++) {
            res += f(chars , dp, i + 1, digitSum + j, isLimit && j == up);
            res %= MOD;
        }
        res = (res % MOD + MOD) % MOD;

        if (!isLimit) dp[i][digitSum] = res;
        return res;
    }
}
