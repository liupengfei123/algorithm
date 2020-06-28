package lpf.learn.leetcode.learn.queue_stack;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * 给定正整数 n，找到若干个完全平方数（比如 1, 4, 9, 16, ...）使得它们的和等于 n。你需要让组成和的完全平方数的个数最少。
 *
 * 示例 1:
 * 输入: n = 12
 * 输出: 3
 * 解释: 12 = 4 + 4 + 4.
 *
 * 示例 2:
 * 输入: n = 13
 * 输出: 2
 * 解释: 13 = 4 + 9.
 */
public class NumSquares {

    public int numSquaresBFS(int n) {
        Set<Integer> used = new HashSet<>();

        Queue<Integer> queue = new LinkedList<>();
        queue.add(n);

        int result = 0;
        out:
        while (!queue.isEmpty()) {
            result++;
            int length = queue.size();
            for (int i = 0; i < length; i++) {
                int value = queue.poll();

                int sqrt = (int) Math.sqrt(value) + 1;
                for (int j = 1; j < sqrt; j++) {
                    int diff = value - j * j;
                    if (diff == 0) {
                        break out;
                    }
                    if (!used.contains(diff)) {
                        used.add(diff);
                        queue.add(diff);
                    }
                }
            }
        }
        return result;
    }

    /**
     *  一个正整数 i 的组成和的完全平方数的个数最少 dp[i]
     *  dp[i] = min(dp[i - 1 * 1] + 1, ..., dp[i - j * j] + 1); j <= i 最大平方根
     *
     *  动态转移方程：dp[i] = min(dp[i], dp[i - j * j] + 1)
     */
    public int numSquaresDP(int n) {
        int[] dp = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        dp[0] = 0;
        for (int i = 1; i <= n; i++) {
            int sqrt = (int) Math.sqrt(i) + 1;
            for (int j = 1; j < sqrt; j++) {
                dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
            }
        }
        return dp[n];
    }

}
