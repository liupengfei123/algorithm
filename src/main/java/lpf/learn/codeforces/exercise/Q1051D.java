package lpf.learn.codeforces.exercise;

import java.util.Scanner;

public class Q1051D {
    public static Scanner sc = new Scanner(System.in);
    public static int MOD = 998244353;

    public static void main(String[] args) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(run(n, k));
    }

    private static long run(int n, int k) {
        if (k == 1) {
            return 2;
        }
        long[][] dp = new long[k + 1][2];
        dp[1][0] = 2;
        dp[2][1] = 2;

        for (int i = 2; i <= n; i++) {
            for (int j = Math.min(k, i * 2); j > 1; j--) {
                dp[j][0] = (dp[j][0] + dp[j][1] * 2 + dp[j - 1][0]) % MOD;
                dp[j][1] = (dp[j][1] + dp[j - 1][0] * 2 + dp[j - 2][1]) % MOD;
            }
        }
        return (dp[k][0] + dp[k][1]) % MOD;
    }
}
