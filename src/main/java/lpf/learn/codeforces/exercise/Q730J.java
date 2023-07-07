package lpf.learn.codeforces.exercise;

import java.io.*;
import java.util.*;

/**
 * https://codeforces.com/problemset/problem/730/J
 */
public class Q730J {
    private final static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        for (int i = 0; i < n; i++) b[i] = sc.nextInt();

        run(n, a, b);

        out.flush();
    }

    private static void run(int n, int[] a, int[] b) {
        int sum = 0;
        for (int i : a) sum += i;

        // dp 表示在装 x 水的所使用，最小dp[0][x]个桶，并且在最小桶的情况下 转移水的数量为 dp[1][x]
        int[][] dp = new int[2][sum + 1];
        Arrays.fill(dp[0], 200);
        Arrays.fill(dp[1], 20000);

        dp[0][0] = dp[1][0] = 0;

        for (int i = 0; i < n; i++) {
            // j 表示已经装了多少水
            for (int j = sum; j >= 0; j--) {
                int temp = Math.min(j + b[i], sum);

                if (dp[0][j] + 1 < dp[0][temp]) {
                    dp[0][temp] = dp[0][j] + 1;
                    // 取 剩余水 和 桶容量 的最小值
                    dp[1][temp] = dp[1][j] + Math.min(sum - j, b[i]) - a[i];
                } else if (dp[0][j] + 1 == dp[0][temp]) {
                    dp[1][temp] = Math.min(dp[1][temp], dp[1][j] + Math.min(sum - j, b[i]) - a[i]);
                }
            }

        }
        out.println(dp[0][sum] + " " + dp[1][sum]);
    }
}
