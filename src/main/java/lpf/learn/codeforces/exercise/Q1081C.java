package lpf.learn.codeforces.exercise;

import java.io.*;
import java.util.*;

/**
 * https://codeforces.com/problemset/problem/1081/C
 */
public class Q1081C {
    private final static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    private final static int MOD = 998244353;
    private final static int[][] dp = new int[2001][2001];

    static {
        dp[0][0] = 1;
        for (int i = 1; i <= 2000; i++) {
            dp[i][0] = 1;
            for (int j = 1; j <= i; j++) dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j]) % MOD;
        }
    }

    public static void main(String[] args) {
        int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt();
        long l = ((pow(m - 1, k) * m) % MOD) * dp[n - 1][k];
        out.println(((l % MOD) + MOD) % MOD);
        out.flush();
    }

    private static long pow(long base, int k) {
        long res = 1;
        while (k > 0) {
            if ((k & 1) != 0) res = (res * base) % MOD;

            k >>= 1;
            base = (base * base) % MOD;
        }
        return res % MOD;
    }
}
