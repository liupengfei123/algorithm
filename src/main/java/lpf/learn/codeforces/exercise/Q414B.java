package lpf.learn.codeforces.exercise;

import java.io.*;
import java.util.*;

/**
 * https://codeforces.com/contest/414/problem/B
 */
public class Q414B {
    private static final Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private static final PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    private static final int MOD = 1000_000_007 ;

    public static void main(String[] args) {
        int u = sc.nextInt(), n = sc.nextInt();

        int[] dp = new int[u + 1];
        Arrays.fill(dp, 1);

        for (int i = 1; i < n; i++) {
            for (int j = u; j > 0; j--) {
                for (int k = j + j; k <= u; k += j) dp[k] = (dp[k] + dp[j]) % MOD;
            }
        }
        int res = 0;
        for (int j = u; j > 0; j--) res = (res + dp[j]) % MOD;

        out.print((res + MOD) % MOD);
        out.flush();
    }
}
