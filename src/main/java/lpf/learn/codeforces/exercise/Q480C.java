package lpf.learn.codeforces.exercise;

import java.io.*;
import java.util.*;

public class Q480C {
    private static final Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private static final PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
    private static final int MOD = 1000_000_007;

    public static void main(String[] args) {
        int n = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt(), k = sc.nextInt();
        int[][] dp = new int[2][n + 1], preSum = new int[2][n + 2];

        int c = 0;
        Arrays.fill(dp[c], 1);
        for (int i = 1; i <= n; i++) preSum[c][i + 1] = preSum[c][i] + dp[c][i];

        for (int i = 1; i <= k; i++) {
            int nc = (c + 1) % 2;
            preSum[nc][1] = preSum[nc][0] = 0;

            for (int x = 1; x <= n; x++) {
                int abs = Math.abs(x - b), l = Math.max(1, x - abs + 1), r = Math.min(n, x + abs - 1);

                dp[nc][x] = (((preSum[c][r + 1] - preSum[c][l]) % MOD) - dp[c][x]) % MOD;
                preSum[nc][x + 1] = (preSum[nc][x] + dp[nc][x]) % MOD;
            }
            c = nc;
        }
        out.println((dp[c][a] + MOD) % MOD);
        out.close();
    }
}
