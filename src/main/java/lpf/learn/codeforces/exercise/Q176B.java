package lpf.learn.codeforces.exercise;

import java.io.*;
import java.util.*;

public class Q176B {
    private final static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    private final static int MOD = 1000_000_007;

    public static void main(String[] args) {
        String s = sc.next(), t = sc.next();
        int k = sc.nextInt(), n = s.length();
        out.println(solve(s, t, k, n));
        out.close();
    }

    private static int solve(String s, String t, int k, int n) {
        int cnt = 0;
        for (int i = 1; i < n; i++) {
            String temp = s.substring(i) + s.substring(0, i);
            if (temp.equals(t)) cnt++;
        }
        if (cnt == 0 && !s.equals(t)) return 0;

        long[] dp = new long[2];
        dp[0] = 1;

        for (int i = 0; i < k; i++) {
            long a = dp[0], b = dp[1];

            dp[0] = b * (n - 1) % MOD;
            dp[1] = (a + b * (n - 2)) % MOD;
        }
        long res = 0;
        if (s.equals(t)) res += dp[0];

        res += dp[1] * cnt % MOD;
        return (int) ((res % MOD + MOD) % MOD);
    }
}
