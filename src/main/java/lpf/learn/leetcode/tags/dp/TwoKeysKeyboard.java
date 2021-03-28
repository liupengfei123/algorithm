package lpf.learn.leetcode.tags.dp;

/** [650]只有两个键的键盘
 *
 *  最初在一个记事本上只有一个字符 'A'。你每次可以对这个记事本进行两种操作：
 *  Copy All (复制全部) : 你可以复制这个记事本中的所有字符(部分的复制是不允许的)。
 *  Paste (粘贴) : 你可以粘贴你上一次复制的字符。
 *
 *  给定一个数字 n 。你需要使用最少的操作次数，在记事本中打印出恰好 n 个 'A'。输出能够打印出 n 个 'A' 的最少操作次数。
 *
 *  示例 1:
 *  输入: 3
 *  输出: 3
 *  解释:
 *  最初, 我们只有一个字符 'A'。
 *  第 1 步, 我们使用 Copy All 操作。
 *  第 2 步, 我们使用 Paste 操作来获得 'AA'。
 *  第 3 步, 我们使用 Paste 操作来获得 'AAA'。
 *
 *  说明:
 *  n 的取值范围是 [1, 1000] 。
 *
 * @author liupf
 * @date 2021-03-28 13:06
 */
public class TwoKeysKeyboard {


    public int minSteps(int n) {
        int ans = 0, d = 2;
        while (n > 1) {
            while (n % d == 0) {
                ans += d;
                n /= d;
            }
            d++;
        }
        return ans;
    }




    private int N = 0;
    private int[][] dp;

    public int minSteps2(int n) {
        if (n == 1) {
            return 0;
        }
        dp = new int[n + 1][n + 1];
        N = n;
        return help(1, 1) + 1;
    }


    private int help(int n, int copyCount) {
        if (n > N) {
            return Integer.MIN_VALUE;
        }
        if (n == N) {
            return 0;
        }
        if (dp[n][copyCount] != 0) {
            return dp[n][copyCount];
        }

        int temp1 = help(2 * n, n) + 2;
        int temp2 = help(n + copyCount, copyCount) + 1;

        int value = Math.min(temp1, temp2);
        if ((temp1 < 0 || temp2 < 0)) {
            value = Math.max(temp1, temp2);
        }
        dp[n][copyCount] = value;
        return value;
    }
}
